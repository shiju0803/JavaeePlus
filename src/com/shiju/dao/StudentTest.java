package com.shiju.dao;

import com.shiju.bean.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author shiju
 * @date 2021/05/09 14:32
 */
public class StudentTest {
    @Test
    public void selectAll() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过SqlSession工厂对象获取SQL Session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射文件中的sql语句,并接收结果
        List<Student> list = sqlSession.selectList("selectAll");

        //5.处理结果
        for (Student stu : list) {
            System.out.println(stu);
        }

        //6.释放资源
        sqlSession.close();
        is.close();
    }

    /**
     * 根据sid查询
     * @throws Exception
     */
    @Test
    public void selectById() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过SqlSession工厂对象获取SQL Session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射文件中的sql语句,并接收结果
        Student stu = sqlSession.selectOne("selectById",3);

        //5.处理结果
        System.out.println(stu);

        //6.释放资源
        sqlSession.close();
        is.close();
    }

    /**
     * 添加学生信息
     * @throws Exception
     */
    @Test
    public void insert() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");

        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

        //3.通过SqlSession工厂对象获取SQL Session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射文件中的sql语句,并接收结果
        Student stu = new Student(6,"吴邪",30);
        int result = sqlSession.insert("insert", stu);
        //5.提交事务
        sqlSession.commit();
        //6.处理结果
        if(result != 0){
            System.out.println("添加成功!");
        }else {
            System.out.println("添加失败!");
        }

        //7.释放资源
        sqlSession.close();
        is.close();
    }

    /**
     * 修改学生信息
     */
    @Test
    public void update() throws Exception{
        //1.加载核心配置文件
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.通过SqlSession工厂对象获取SQL Session对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4.执行映射文件中的sql语句,并接收结果
        Student stu = new Student(5,"张起灵",180);
        int result = sqlSession.update("update", stu);

        //5.提交事务
        sqlSession.commit();

        //6.处理结果
        if(result != 0){
            System.out.println("修改成功!");
        }else {
            System.out.println("修改失败!");
        }
        //7.释放资源
        sqlSession.close();
        is.close();
    }

    /**
     * 删除学生信息
     */
    @Test
    public void delete() throws Exception{
        //1.加载核心配置文件信息
        InputStream is = Resources.getResourceAsStream("MybatisConfig.xml");
        //2.获取SqlSession工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //3.通过sqlSession工厂对象获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行映射文件中的sql语句,并接收结果
        int result = sqlSession.delete("delete", 8);
        //5.提交事务
        sqlSession.commit();
        //6.处理结果
        if(result != 0){
            System.out.println("删除成功!");
        }else {
            System.out.println("删除失败!");
        }
        //7.释放资源
        sqlSession.close();;
        is.close();
    }
}
