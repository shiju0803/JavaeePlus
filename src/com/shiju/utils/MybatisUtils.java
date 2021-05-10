package com.shiju.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author shiju
 * @date 2021/05/10 09:10
 */
public class MybatisUtils {
    //私有构造方法
    private MybatisUtils(){}

    //声明工厂对象
    private static SqlSessionFactory sqlSessionFactory;

    //提供静态代码块,读取核心配置文件,并给工厂对象赋值
    static {
        try{
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("MybatisConfig.xml"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //提供静态方法,获取SqlSession对象
    public static SqlSession getSqlSession(){
        //true 自动提交事务
        return sqlSessionFactory.openSession(true);
    }
}
