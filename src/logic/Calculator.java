package logic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "PereServlet")
public class Calculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        Calc calc = (Calc) httpSession.getAttribute("calc");
        int firsNum = Integer.parseInt(request.getParameter("firstNum"));
        int secondNum = Integer.parseInt(request.getParameter("secondNum"));
        String action = request.getParameter("action");
        calc = new Calc();
        calc.setAction(action);
        calc.setA(firsNum);
        calc.setB(secondNum);
        httpSession.setAttribute("calc", calc);
        getServletContext().getRequestDispatcher("/Calculator.jsp").forward(request, response);
    }
}
