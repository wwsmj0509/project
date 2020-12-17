package com.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.board.dao.imgBoard_dao;
import com.board.entity.imgBoard_entity;
import com.login.entity.login_entity;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import controller.CommandAction;

public class imgModifyService implements CommandAction{


	@Override
	public String requestPro_action(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("modify enter");
		
		 int seq = Integer.parseInt(request.getParameter("seq"));
		 int pg = Integer.parseInt(request.getParameter("pg"));

		 imgBoard_dao dao = new imgBoard_dao();
		 imgBoard_entity entity = dao.getBoard(seq);
		    
		 request.setAttribute("entity", entity);
		 request.setAttribute("seq", seq);
		 request.setAttribute("pg", pg);
		    
		 return "write/modify.jsp";
	}

}
