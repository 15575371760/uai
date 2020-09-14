package com.zh_ai.servlet;

import com.alibaba.fastjson.JSON;
import com.zh_ai.entity.Goods;
import com.zh_ai.service.GoodsService;
import com.zh_ai.service.impl.GoodsServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/goods")
public class GoodsServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action =request.getParameter("action");
        PrintWriter out =response.getWriter();
        GoodsService gs=new GoodsServiceImpl();
        if("get6Goods".equals(action)){//index.html摆件，花艺
            List<Goods> list=gs.getInfo("摆件.花艺",6);
            String json = JSON.toJSONString(list);
            System.out.println(json);
            out.println(json);
        }else if("get12Goods".equals(action)){//index.html挂壁.北欧
            List<Goods> listOu=gs.getInfo("挂壁.北欧",12);
            String json=JSON.toJSONString(listOu);
            out.println(json);
        }else if("jianYue".equals(action)){//paint.html简约.现代
            List<Goods> jianYue=gs.getInfo("简约.现代",6);
            String json=JSON.toJSONString(jianYue);
            out.print(json);
        } else if ("onoqin".equals(action)) {//paint.html的浓情.欧式
            List<Goods> onoqin = gs.getInfo("浓情.欧式", 6);
            String json = JSON.toJSONString(onoqin);
            out.print(json);
        }else if("meiShi1".equals(action)){//paint.html的浪漫.美式1
            List<Goods> meiShi1 = gs.getInfo("浪漫.美式", 4);
            String json = JSON.toJSONString(meiShi1);
            out.print(json);
        }else if ("meiShi2".equals(action)){//paint.html的浪漫.美式2
            List<Goods> meiShi2 = gs.getInfo("浪漫.美式2", 7);
            String json = JSON.toJSONString(meiShi2);
            out.print(json);
        }else if("baiJian".equals(action)){//flowerDer.html的装饰摆件
            List<Goods> baiJian = gs.getInfo("装饰摆件", 27);
            String json = JSON.toJSONString(baiJian);
            out.print(json);
        }else if("qhuayi".equals(action)){//proList.html的千花花艺
            List<Goods> qhuayi = gs.getInfo("千花花艺", 16);
            String json = JSON.toJSONString(qhuayi);
            out.print(json);
        }else if("hphq".equals(action)){//vase_proList.html的花瓶花器
            List<Goods> hphq = gs.getInfo("花瓶花器", 16);
            String json = JSON.toJSONString(hphq);
            out.print(json);
        }else if("buyiShi".equals(action)){//decoration.html的布艺软饰
            List<Goods> buyiShi = gs.getInfo("布艺软饰", 28);
            String json = JSON.toJSONString(buyiShi);
            out.print(json);
        }else if("zuobu".equals(action)){//zbproList.html的桌布
            List<Goods> zuobu = gs.getInfo("桌布", 16);
            String json = JSON.toJSONString(zuobu);
            out.print(json);
        }else if("baozhen".equals(action)){//bzproList.html的抱枕
            List<Goods> baozhen = gs.getInfo("桌布", 16);
            String json = JSON.toJSONString(baozhen);
            out.print(json);
        }else if ("xuejou".equals(action)){//perfume.html的香薰.精油
            List<Goods> xuejou = gs.getInfo("香薰.精油", 6);
            String json = JSON.toJSONString(xuejou);
            out.print(json);
        }else if ("fugux".equals(action)){//perfume.html的复古.香薰炉
            List<Goods> fugux = gs.getInfo("复古.香薰炉", 6);
            String json = JSON.toJSONString(fugux);
            out.print(json);
        }else if ("chaunyi".equals(action)){//idea.html的创意.时尚
            List<Goods> chaunyi = gs.getInfo("创意.时尚", 9);
            String json = JSON.toJSONString(chaunyi);
            out.print(json);
        }else if ("shixyin".equals(action)){//idea.html的时尚.新颖
            List<Goods> shixyin = gs.getInfo("时尚.新颖", 8);
            String json = JSON.toJSONString(shixyin);
            System.out.println(json);
            out.print(json);
        }else if ("cshengh".equals(action)){//idea.html的创意.生活
            List<Goods> cshengh = gs.getInfo("创意.生活", 8);
            String json = JSON.toJSONString(cshengh);
            out.print(json);
        }

        out.close();
    }
}
