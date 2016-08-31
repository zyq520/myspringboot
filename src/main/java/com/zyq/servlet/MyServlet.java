package com.zyq.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyServlet
 * @Description: TODO(自定义servlet)
 * @author 庄友权
 * @date 2016年8月26日 上午11:11:59
 * 
 */

public class MyServlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doGet()<<<<<<<<<<<");
        doPost(req, resp);
    }
 
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(">>>>>>>>>>doPost()<<<<<<<<<<<");
        resp.setContentType("text/html"); 
        PrintWriter out = resp.getWriter(); 
        out.println("<html>"); 
        out.println("<head>"); 
        out.println("<title>Hello World</title>"); 
        out.println("</head>"); 
        out.println("<body>"); 
        out.println("<h1>这是：MyServlet</h1>"); 
        out.println("</body>"); 
        out.println("</html>");
    }
}
