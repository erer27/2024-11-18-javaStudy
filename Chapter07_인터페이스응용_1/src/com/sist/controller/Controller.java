package com.sist.controller;
/*
 * 		=> 화면 View
 * 		사용자 요청 ===> Controller <=====> Model
 * 										BoardList
 * 										BoardDelete
 * 										BoardDetail
 * 										BoardUpdate
 * 										BoardFind
 * 		=> 처리 
 */

import com.sist.model.*;
import java.util.*;
public class Controller {
	public void service(String cmd)
	{
		Map map=new HashMap();
		map.put("list", new BoardList());
		map.put("write", new BoardWrite());
		map.put("update", new BoardUpdate());
		map.put("delete", new BoardDelete());
		map.put("find", new BoardList());
		map.put("detail", new BoardList());
		
		Model model=(Model)map.get(cmd);
		model.execute();
//		if(cmd.equals("list")) {
//			BoardList b=new BoardList();
//			b.execute();
//		}
//		else if(cmd.equals("detail"))
//		{
//			BoardDetail b=new BoardDetail();
//			b.execute();
//		}
//		else if(cmd.equals("update"))
//		{
//			BoardDelete b=new BoardDelete();
//			b.execute();
//		}
//		else if(cmd.equals("delete"))
//		{
//			BoardFind b=new BoardFind();
//			b.execute();
//		}
//		else if(cmd.equals("write"))
//		{
//			BoardWrite b=new BoardWrite();
//			b.execute();
//		}
	}
}
