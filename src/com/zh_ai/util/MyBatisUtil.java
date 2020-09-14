package com.zh_ai.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: LiWenJie
 * @time: 2020/9/7 10:15
 */
public class MyBatisUtil {
    //工厂，可以生产SqlSession对象
    static SqlSessionFactory factory = null;
    //静态代码块
    static {
        try {
            //把配置文件转换成一个输入流
            InputStream is =
                    Resources.getResourceAsStream("com/zh_ai/config/mybatis-config.xml");
            //根据流来创建工厂对象，因为工厂只需要一个，所以做成单例模式
            factory =  new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //向个公开一个方法，能够获取到SqlSession对象
    public static SqlSession getSqlSession() {
        return factory.openSession();
    }
}
