package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.Sys;
import com.zh_ai.service.SystemService;
import com.zh_ai.service.impl.SystemServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SystemService systemService = new SystemServiceImpl();
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        HttpSession session = req.getSession();

        Sys sys = null;
        if(name != null && pwd != null) {
            sys = systemService.getInfo(name, pwd);
            if (sys != null) {
                resp.getWriter().print(JSON.toJSONString(sys));
                session.setAttribute("user", sys);
                System.out.println(JSON.toJSONString(sys));
            } else {
                resp.getWriter().print("null");
            }
        }

        if("userInit".equals(req.getParameter("action"))){
               resp.getWriter().println(JSON.toJSONString(session.getAttribute("user")));
                System.out.println(JSON.toJSONString(session.getAttribute("user")));
        }
    }
}
