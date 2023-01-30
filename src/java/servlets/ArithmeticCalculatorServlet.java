/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author samhu
 */
public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_num = request.getParameter("firstnum");
        String second_num = request.getParameter("secondnum");
        String operand = request.getParameter("operand");
        String return_message = "";
        
        int first, second, value = -1;
            
        System.out.println("Operand: " + operand);
         try {
            first = Integer.parseInt(first_num);
            second = Integer.parseInt(second_num);
            if(operand.equals("+"))
                value = first + second;
            else if(operand.equals("-"))
                value = first - second;
            else if(operand.equals("*"))
                value = first * second;
            else if(operand.equals("%"))
                value = first % second;
            return_message = "" + value;    
        }
        catch (Exception e)
        {
            return_message = "invalid";
        }
        
        // set the attributes for the JSP
        request.setAttribute("message", return_message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }
}
