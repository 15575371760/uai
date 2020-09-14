package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.TradeTable;
import com.zh_ai.entity.User;
import com.zh_ai.service.OrderService;
import com.zh_ai.service.TradeTableService;
import com.zh_ai.service.impl.OrderServiceImpl;
import com.zh_ai.service.impl.TradeTableServiceImpl;
import com.zh_ai.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        PrintWriter out=response.getWriter();
        HttpSession session = request.getSession();
        User user=new UserServiceImpl().getUserId("123","123");
        OrderService os=new OrderServiceImpl();
        TradeTableService tts=new TradeTableServiceImpl();
        session.setAttribute("user",user);
        if("getNoCount".equals(action)){//mygxin.html
            User id=(User)session.getAttribute("user");
            List myxin=new ArrayList();
            myxin.add(id.getName());//�û�����
            myxin.add(id.getSex());//�û��Ա�
            myxin.add(id.getMailbox());//�û�����
            myxin.add(os.getStatusInfo(0).size());//����������
            myxin.add(os.getStatusInfo(1).size());//�������ջ�
            myxin.add(os.getStatusInfo(2).size());//����������
            myxin.add(tts.getTradeTableInfo(id.getId()).size());//���ﳵ����
            String json= JSON.toJSONString(myxin);
            System.out.println(json);
            out.print(json);
        }
        out.close();
    }
}
