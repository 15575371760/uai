package com.zh_ai.servlet;


import com.zh_ai.entity.ZhGoodsImage;
import com.zh_ai.util.FileLoadUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/11 21:26
 */
@WebServlet("/upload")
public class UploadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileLoadUtil fileLoadUtil = new FileLoadUtil("/image");
        try {
            List<String> list = fileLoadUtil.defUpload(req);
            if(list != null) {
                for(String string : list) {
                    System.out.println(string+"已成功上传...");
                }
            }else {
                System.out.println("没有文件上传成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
