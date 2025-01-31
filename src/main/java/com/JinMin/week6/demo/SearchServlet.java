package com.JinMin.week6.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SearchServlet", value = "/search")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String txt = request.getParameter("txt");
        String search = request.getParameter("search");

        if (txt == null) {
            response.sendRedirect("index.jsp");
        } else {
            if (search.equals("baidu")) {
                response.sendRedirect("https://www.baidu.com/s?wd=1" + txt);
            } else if (search.equals("bing")) {
                response.sendRedirect("http://cn.bing.com/search?q=" + txt);
            } else if (search.equals("google")) {
                response.sendRedirect("http://cn.google.com/search?q=" + txt);
            }
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
