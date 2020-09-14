package com.zh_ai.servlet;

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
 * 处理登录注册的servlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action=req.getParameter("action");
        //创建一个输出流对象
        PrintWriter out = resp.getWriter();
        //创建一个会话对象
        HttpSession session=req.getSession();
        UserService us=new UserServiceImpl();
        if("login".equals(action)){//登录
            String userName=req.getParameter("userName");
            String pwd=req.getParameter("pwd");
            User user=us.getUserId(userName,pwd);
            System.out.println(user.toString());
            if(user!=null){
                System.out.println(user.toString());
                session.setAttribute(user.getId(),user);
                out.print("true");
            }else{
                out.print("false");
            }
        }else if("reg".equals(action)){//注册
            String userName=req.getParameter("userName");
            String userID=req.getParameter("userID");
            String pwd=req.getParameter("pwd");
            User user=new User();
            user.setName(userName);
            user.setId(userID);
            user.setPwd(pwd);
            if(us.addUser(user)>0){
                System.out.println("我进来过！");
                out.print("true");
            }else{
                System.out.println("输入失败了");
                out.print("false");
            }

        }else if("getUser".equals(action)){//判断账号是否重复
            String userSID=req.getParameter("userSID");
            if(us.getUserInfo(userSID)!=null){
                out.print("true");
            }
        }
        out.close();
    }
}

