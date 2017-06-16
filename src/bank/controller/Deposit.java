package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.db.Customer;
import bank.model.CustomerService;

/**
 * Servlet implementation class Deposit
 */
@WebServlet("/bank.controller.Deposit")
public class Deposit extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
				
			int actno = Integer.parseInt(request.getParameter("actno"));
			int amount =Integer.parseInt(request.getParameter("amount"));
			
			//Set in POJO
			
				Customer c = new Customer();
					c.setActno(actno);
						c.setAmount(amount);
						
							
			int status = CustomerService.updateDeposit(c);
			
				if (status > 0) 
					out.println("<h1>Updated Successfully...............</h1>");
				else if(status == -1)
					out.println("<h1>Acount not Exists...............</h1>");
				else 
					out.println("<h1>Not Updated...............</h1>");
				
						
				}
			
			
	}


