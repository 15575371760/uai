package com.zh_ai.servlet;

import com.zh_ai.entity.Goods;
import com.zh_ai.entity.Goods_Type;
import com.zh_ai.service.GoodsService;
import com.zh_ai.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add")
public class AddProduct extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("sh_name");
        String price = req.getParameter("sh_price");
        String comment = req.getParameter("sh_comment");
        String cityDanXuan = req.getParameter("cityDanXuan");
        String count = req.getParameter("sh_count");

        GoodsService goodsService = new GoodsServiceImpl();
        Goods_Type gt = new Goods_Type();
        gt.setId(Integer.parseInt(cityDanXuan));
        Goods goods = new Goods();
        goods.setCount(Integer.parseInt(count));
        goods.setName(name);
        goods.setPrice(Double.parseDouble(price));
        goods.setTypeId1(gt);
        if(goodsService.addInfo(goods) > 0) {
            resp.getWriter().print(goods.getId());
        }else {
            resp.getWriter().print(0);
        }
    }
}
