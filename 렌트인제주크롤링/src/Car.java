

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Random;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CarDAO dao=CarDAO.newInstance();
			Document doc=Jsoup.connect("https://rentinjeju.com/search_car").get();
			Elements carUrls = doc.select(".col-5.col-md-12");
			for(int i=0;i<carUrls.size();i++)
			{
				String carUrl = "https://rentinjeju.com"+carUrls.get(i).select("a").attr("href");
				if(carUrl.split("sscid=").length>1)
				{
					Document carDoc=Jsoup.connect(carUrl).get();
					
					String carImage = "https://rentinjeju.com"+carDoc.selectFirst(".col-3.col-md-3.p-0.ml-4.ml-sm-0").select("img").attr("src");
					String name = carDoc.selectFirst(".col-3.col-md-3.p-0.ml-4.ml-sm-0").select("img").attr("alt");
					
					
					String[] carInfos = carDoc.selectFirst(".pt-1.pb-0.pl-0").text().split(", ");
					carInfos[0]=carInfos[0].replace(",", "/");
					carInfos[5]=carInfos[5].replace(",","");
					
					String car_class = carInfos[0];
					int seat = Integer.parseInt(carInfos[2].replace("인승", ""));
					String fuel = carInfos[4];
					String manufacturer = carInfos[1];
					
					Elements ins = carDoc.select(".table.table-borderless.Select_InnerCheckBox.m-0");
					
					String non_ins_qual = ins.get(0).select(".bolder.ml-2").text();
					int non_ins_price = Integer.parseInt(ins.get(0).select(".text-primary.bolder.text-nowrap").text().replaceAll("[,원]", "")); 
					
					String normal_ins_qual = ins.get(1).select(".bolder.ml-2").text();
					String normal_ins_desc = ins.get(1).select(".mb-2").text();
					int normal_ins_price = Integer.parseInt(ins.get(1).select(".text-primary.bolder.text-nowrap").text().replaceAll("[,원]", ""));
					
					String premium_ins_qual = ins.get(2).select(".bolder.ml-2").text();
					String premium_ins_desc = ins.get(2).select(".mb-2").text();
					int premium_ins_price = Integer.parseInt(ins.get(2).select(".text-primary.bold.text-nowrap").text().replaceAll("[,원]", ""));
					
					
					String[] detail_optionAndyear = ins.get(0).select(".small").get(1).html().replace("\n", "").split("<br>");
					String detail_option = detail_optionAndyear[1].replace(" ㆍ", "").trim();
					int car_year = Integer.parseInt(detail_optionAndyear[0].replaceAll("[^0-9]", "").substring(0, 4));
					
					CarVO vo = new CarVO();
					vo.setPoster(carImage);
					vo.setName(name);
					vo.setCar_class(car_class);
					vo.setSeat(seat);
					vo.setFuel(fuel);
					vo.setManufacturer(manufacturer);
					vo.setNon_ins_qual(non_ins_qual);
					vo.setNon_int_price(non_ins_price);
					vo.setNormal_ins_qual(normal_ins_qual);
					vo.setNormal_inst_desc(normal_ins_desc);
					vo.setNormal_ins_price(normal_ins_price);
					vo.setPremium_inst_qual(premium_ins_qual);
					vo.setPremium_ins_desc(premium_ins_desc);
					vo.setPremium_ins_price(premium_ins_price);
					vo.setDetail_option(detail_option);
					vo.setCar_year(car_year);
					dao.Insert(vo);
					
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
	}

}

class CarVO{
	String poster,name,car_class,fuel,manufacturer,
		non_ins_qual,normal_ins_qual,normal_inst_desc,premium_inst_qual,premium_ins_desc,detail_option;
	int no,seat,non_int_price,normal_ins_price,premium_ins_price,car_year;

	
	
	public int getNon_int_price() {
		return non_int_price;
	}
	public void setNon_int_price(int non_int_price) {
		this.non_int_price = non_int_price;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCar_class() {
		return car_class;
	}
	public void setCar_class(String car_class) {
		this.car_class = car_class;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getNon_ins_qual() {
		return non_ins_qual;
	}
	public void setNon_ins_qual(String non_ins_qual) {
		this.non_ins_qual = non_ins_qual;
	}
	public String getNormal_ins_qual() {
		return normal_ins_qual;
	}
	public void setNormal_ins_qual(String normal_ins_qual) {
		this.normal_ins_qual = normal_ins_qual;
	}
	public String getNormal_inst_desc() {
		return normal_inst_desc;
	}
	public void setNormal_inst_desc(String normal_inst_desc) {
		this.normal_inst_desc = normal_inst_desc;
	}
	public String getPremium_inst_qual() {
		return premium_inst_qual;
	}
	public void setPremium_inst_qual(String premium_inst_qual) {
		this.premium_inst_qual = premium_inst_qual;
	}
	public String getPremium_ins_desc() {
		return premium_ins_desc;
	}
	public void setPremium_ins_desc(String premium_ins_desc) {
		this.premium_ins_desc = premium_ins_desc;
	}
	public String getDetail_option() {
		return detail_option;
	}
	public void setDetail_option(String detail_option) {
		this.detail_option = detail_option;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getNormal_ins_price() {
		return normal_ins_price;
	}
	public void setNormal_ins_price(int normal_ins_price) {
		this.normal_ins_price = normal_ins_price;
	}
	public int getPremium_ins_price() {
		return premium_ins_price;
	}
	public void setPremium_ins_price(int premium_ins_price) {
		this.premium_ins_price = premium_ins_price;
	}
	public int getCar_year() {
		return car_year;
	}
	public void setCar_year(int car_year) {
		this.car_year = car_year;
	}
	
}
class CarDAO {
	  private Connection conn;
	  private PreparedStatement ps;
	  private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
	  private static CarDAO dao;
	  // genie/melon
	  public CarDAO()
	  {
		  try
		  {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
		  }catch(Exception ex) {}
	  }
	  public static CarDAO newInstance()
	  {
		  if(dao==null)
			  dao=new CarDAO();
		  return dao;
	  }
	  public void getConnection()
	  {
		  try
		  {
			  conn=DriverManager.getConnection(URL,"hr_1","happy");
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
	  public void Insert(CarVO vo)
	  {
		  try
		  {
			  // 연결
			  getConnection();
			  String sql="INSERT INTO car "
					    +"VALUES((SELECT NVL(MAX(no)+1,1) FROM car),"
					    +"?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			  ps=conn.prepareStatement(sql);
			  //? 값을 채운다 
			  ps.setString(1, vo.getName());
			  ps.setString(2, vo.getPoster());
			  ps.setString(3, vo.getCar_class());
			  ps.setInt(4, vo.getSeat());
			  ps.setString(5, vo.getManufacturer());
			  ps.setString(6, vo.getFuel());
			  ps.setString(7, vo.getNon_ins_qual());
			  ps.setInt(8, vo.getNon_int_price());
			  ps.setString(9, vo.getNormal_ins_qual());
			  ps.setString(10, vo.getNormal_inst_desc());
			  ps.setInt(11, vo.getNormal_ins_price());
			  ps.setString(12, vo.getPremium_inst_qual());
			  ps.setString(13, vo.getPremium_ins_desc());
			  ps.setInt(14, vo.getPremium_ins_price());
			  ps.setInt(15, vo.getCar_year());
			  ps.setString(16, vo.getDetail_option());
			  
			  Random random = new Random();
			  int randomBranchNo = random.nextInt(7) + 1;  // 1 ~ 7
			  ps.setInt(17, randomBranchNo);
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