package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.Goods_Type;
import com.zh_ai.service.GType1Service;
import com.zh_ai.service.impl.GType1ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/type")
public class GetGoodsType extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GType1Service gType1Service = new GType1ServiceImpl();
        List<Goods_Type> typeList = gType1Service.getAllInfo();
        String json = JSON.toJSONString(typeList);
        resp.getWriter().print(json);
    }
}
