

import java.io.File;
import java.nio.file.DirectoryStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.*;

public class Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MovieDAO dao=MovieDAO.newInstance();
			
			File input = new File("C://cinne.html");

            // HTML 파일을 읽고 Document 객체로 파싱
            Document doc = Jsoup.parse(input, "UTF-8");
            List<String> hrefList = new ArrayList<>();

            Elements items = doc.select("div.list_with_upthumb_item a");

            for (Element item : items) {
                String href = item.attr("href");
                //System.out.println("링크: " + href);
                hrefList.add(href);
            }
            
            for(int i=0;i<hrefList.size();i++)
            {
            	if(!"javascript:;".equals(hrefList.get(i)))
            	{
            		Document MovieDoc = Jsoup.connect(hrefList.get(i)).get();

                    // 첫 번째 movie_title 클래스 요소 선택
                    Element titleElement = MovieDoc.selectFirst(".movie_title");
                    MovieVO movie = new MovieVO();

                    Elements paragraphs = titleElement.select("p");
                    
                    String title="";
                    String originalTitle = "";
                    String releaseData = "";
                    String rating ="";
                    String runtime ="";
                    String genre = "";
                    String director = "";
                    String cast = "";
                    String synopsis = "";
                    
                    String poster = "";
                    try {
                        title = paragraphs.get(0).text();
                        originalTitle = paragraphs.get(1).text();
                        
                        Elements infoElements = MovieDoc.select(".info_list > li");
                        
                        releaseData = infoElements.get(0).text().substring(3);
                        rating = infoElements.get(1).text().substring(3);
                        runtime = infoElements.get(2).text().substring(3);
                        genre = infoElements.get(4).text().substring(3);
                        
                        Elements directors = infoElements.get(5).select("a");
                        director = "";
                        for(Element e:directors) {
                        	director+=e.text()+",";
                        }
                        director = director.replaceAll(",$", "");
                        Elements casts = infoElements.get(6).select("a");
                        cast = "";
                        for(Element e:casts) {
                        	cast+=e.text()+",";
                        }
                        cast = cast.replaceAll(",$", "");
                        
                        
                        
                        synopsis = MovieDoc.selectFirst(".more_less").text();
                        
                        poster = MovieDoc.selectFirst(".poster img").attr("src");
                        
                    }catch(Exception e)
                    {
                    	e.printStackTrace();
                    }
                    
                    System.out.println("===== 영화 정보 =====");
                    System.out.println(poster);
                    
                    movie.setTitle(title);
                    movie.setOriginalTitle(originalTitle);
                    movie.setReleaseDate(releaseData);
                    movie.setRating(rating);
                    movie.setRuntime(runtime);
                    movie.setGenre(genre);
                    movie.setDirector(director);
                    movie.setCast(cast);
                    movie.setSynopsis(synopsis);
                    movie.setPoster(poster);
                    dao.Insert(movie);

            	}
            	
            	
            }


		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}

class MovieVO{
    private String title;           // 영화 제목
    private String originalTitle;   // 원제
    private String releaseDate;     // 개봉일자
    private String rating;          // 등급 (예: 15세 이상 관람가)
    private String runtime;         // 상영시간 (예: 120분)
    private String genre;           // 장르 (예: 액션, 드라마)
    private String director;        // 감독 이름
    private String cast;            // 출연 배우 (콤마로 구분된 문자열 등)
    private String synopsis;
    private String poster;
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}

	
	
	
}
class MovieDAO {
	  private Connection conn;
	  private PreparedStatement ps;
	  private final String URL="jdbc:mysql://localhost:3306/mydb?autoReconnection=true";
	  private static MovieDAO dao;
	  // genie/melon
	  public MovieDAO()
	  {
		  try
		  {
			  Class.forName("com.mysql.cj.jdbc.Driver");
		  }catch(Exception ex) {}
	  }
	  public static MovieDAO newInstance()
	  {
		  if(dao==null)
			  dao=new MovieDAO();
		  return dao;
	  }
	  public void getConnection()
	  {
		  try
		  {
			  conn=DriverManager.getConnection(URL,"root","happy");
		  }catch(Exception ex) {}
	  }
	  public void disConnection()
	  {
		  try
		  {
			  if(ps!=null) ps.close();
			  if(conn!=null) conn.close();
		  }catch(Exception ex) {}
	  }
	  // 크롤링 데이터 추가 
	  public void Insert(MovieVO movie)
	  {
		  try
		  {
			  // 연결
			  getConnection();
	        String sql = "INSERT INTO movie_info " +
                     "(title, original_title, release_date, rating, runtime, genre, director, cast, synopsis,poster) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?)";
			  ps=conn.prepareStatement(sql);
			  //? 값을 채운다 
	        ps.setString(1, movie.getTitle());
	        ps.setString(2, movie.getOriginalTitle());
	        ps.setString(3, movie.getReleaseDate());  // yyyy-MM-dd 문자열
	        ps.setString(4, movie.getRating());
	        ps.setString(5, movie.getRuntime());
	        ps.setString(6, movie.getGenre());
	        ps.setString(7, movie.getDirector());
	        ps.setString(8, movie.getCast());
	        ps.setString(9, movie.getSynopsis());
	        ps.setString(10, movie.getPoster());
			  ps.executeUpdate();
		  }catch(Exception ex)
		  {
			  ex.printStackTrace();
		  }
		  finally
		  {
			  disConnection();
		  }
	  }
	}