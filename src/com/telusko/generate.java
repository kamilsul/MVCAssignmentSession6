package com.telusko;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class generate
 */
@WebServlet("/generate")
public class generate extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		AlienModel model = new AlienModel();
		model.setName(name);
		model.setAge(age);
		model.setAddress(address);
		model.generateUserId();
		request.setAttribute("model", model);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowAlienId.jsp");
		dispatcher.forward(request, response);
	}

}
