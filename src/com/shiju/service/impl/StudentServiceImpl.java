package com.shiju.service.impl;

import com.shiju.bean.Student;
import com.shiju.mapper.StudentMapper;
import com.shiju.mapper.impl.StudentMapperImpl;
import com.shiju.service.StudentService;
import com.shiju.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * 业务层实现类
 * @author shiju
 * @date 2021/05/10 09:27
 */
public class StudentServiceImpl implements StudentService {
    /**
     * 传统方式实现Dao层
     */
    //创建持久层对象
    //private StudentMapper mapper = new StudentMapperImpl();

    /**
     * 接口代理方式实现Dao层
     */
    private static StudentMapper mapper;
    static {
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //获取StudentMapper接口实现类对象
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    //查询全部
    @Override
    public List<Student> selectAll() {
        return mapper.selectAll();
    }
    //根据sid查询
    @Override
    public Student selectById(Integer sid) {
        return mapper.selectById(sid);
    }
    //新增数据
    @Override
    public Integer insert(Student stu) {
        return mapper.insert(stu);
    }
    //修改数据
    @Override
    public Integer update(Student stu) {
        return mapper.update(stu);
    }
    //删除数据
    @Override
    public Integer delete(Integer sid) {
        return mapper.delete(sid);
    }
    //根据用户名或密码查询
    @Override
    public List<Student> selectByNameOrAge(String name, Integer age) {
        return mapper.selectByNameOrAge(name,age);
    }
    //动态SQL查询
    @Override
    public List<Student> selectCondition(Student stu) {
        return mapper.selectCondition(stu);
    }
    //根据多个sid查询
    @Override
    public List<Student> selectByIds(List<Integer> sids) {
        return mapper.selectByIds(sids);
    }

}
