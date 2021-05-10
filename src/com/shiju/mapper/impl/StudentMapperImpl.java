package com.shiju.mapper.impl;

import com.shiju.bean.Student;
import com.shiju.mapper.StudentMapper;
import com.shiju.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 持久层实现类
 * @author shiju
 * @date 2021/05/10 09:04
 */
public class StudentMapperImpl/* implements StudentMapper*/ {

    /*//查询全部
    @Override
    public List<Student> selectAll() {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句
        List<Student> list = sqlSession.selectList("selectAll");
        //释放资源
        sqlSession.close();
        //返回结果
        return list;
    }
    //根据sid查询
    @Override
    public Student selectById(Integer sid) {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句
        Student stu = sqlSession.selectOne("selectById",sid);
        //释放资源
        sqlSession.close();
        //返回结果
        return stu;
    }
    //新增数据
    @Override
    public Integer insert(Student stu) {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句
        int result = sqlSession.insert("insert",stu);
        //释放资源
        sqlSession.close();
        //返回结果
        return result;
    }
    //修改数据
    @Override
    public Integer update(Student stu) {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句
        int result = sqlSession.update("update",stu);
        //释放资源
        sqlSession.close();
        //返回结果
        return result;
    }
    //删除数据
    @Override
    public Integer delete(Integer sid) {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句
        int result = sqlSession.delete("delete",sid);
        //释放资源
        sqlSession.close();
        //返回结果
        return result;
    }

    @Override
    public List<Student> selectByNameOrAge(String name, Integer age) {
        return null;
    }*/
}
