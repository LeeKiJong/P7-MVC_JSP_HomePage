package com.javalec.jsp_homepage.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalec.jsp_homepage.Dao.BDao;
import com.javalec.jsp_homepage.Dto.BDto;

public class BReplyViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		BDto dto = dao.reply_view(bId);

		request.setAttribute("reply_view", dto);

	}

}