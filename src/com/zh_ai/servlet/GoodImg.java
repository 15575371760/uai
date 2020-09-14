package com.zh_ai.servlet;

import com.zh_ai.entity.Goods;
import com.zh_ai.entity.ZhGoodsImage;
import com.zh_ai.service.ZhGoodsImageService;
import com.zh_ai.service.impl.ZhGoodsImageServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/imgs")
public class GoodImg extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String[] arrImg = req.getParameterValues("arrImg");
            String[] imgPath = req.getParameterValues("imgPath");
            String goodId = req.getParameter("goodId");
            ZhGoodsImageService zhGoodsImageService = new ZhGoodsImageServiceImpl();
            Goods goods = new Goods();
            goods.setId(Integer.parseInt(goodId));
            boolean flags = true;
            for(int i = 0; i < arrImg.length; i++){
                ZhGoodsImage zhGoodsImage = new ZhGoodsImage();
                zhGoodsImage.setType(arrImg[i]);
                zhGoodsImage.setImageImage(imgPath[i]);
                zhGoodsImage.setImageGid(goods);
                if(! (zhGoodsImageService.addInfo(zhGoodsImage) > 0)){
                    flags = false;
                }
            }
            if(flags){
                resp.getWriter().print(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("..");
        }
     }
}
