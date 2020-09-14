package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.User;
import com.zh_ai.service.UserService;
import com.zh_ai.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 操作一些用户信息的Servlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        PrintWriter out=response.getWriter();
        HttpSession session=request.getSession();
        UserService us=new UserServiceImpl();
        if("getUserInfo".equals(action)){//查看用户信息
            User user=(User)session.getAttribute("user");
            String json= JSON.toJSONString(user);
            System.out.println(json);
            out.print(json);
        }
    }
}
