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
    //��������������SqlSession����
    static SqlSessionFactory factory = null;
    //��̬�����
    static {
        try {
            //�������ļ�ת����һ��������
            InputStream is =
                    Resources.getResourceAsStream("com/zh_ai/config/mybatis-config.xml");
            //����������������������Ϊ����ֻ��Ҫһ�����������ɵ���ģʽ
            factory =  new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //�������һ���������ܹ���ȡ��SqlSession����
    public static SqlSession getSqlSession() {
        return factory.openSession();
    }
}
