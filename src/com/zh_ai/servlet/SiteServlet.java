package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.Site;
import com.zh_ai.service.SiteService;
import com.zh_ai.service.impl.SiteServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 收货地址的Servlet
 */
@WebServlet("/site")
public class SiteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action =request.getParameter("action");
        PrintWriter out = response.getWriter();
        HttpSession session =request.getSession();
        SiteService ss=new SiteServiceImpl();
        if("getSiteInfo".equals(action)){//加载收货地址
            List<Site> list=ss.getUidSite("123");
            String json= JSON.toJSONString(list);
            System.out.println(json);
            out.print(json);
        }
    }
}
