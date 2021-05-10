package com.shiju.mapper;

import com.shiju.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.awt.*;
import java.util.List;

/**
 * 持久层接口
 * @author shiju
 * @date 2021/05/10 09:00
 */
public interface StudentMapper {
    //查询全部
    List<Student> selectAll();
    //根据sid查询
    Student selectById(Integer sid);
    //新增数据
    Integer insert(Student stu);
    //修改数据
    Integer update(Student stu);
    //删除数据
    Integer delete(Integer sid);
    //根据用户名或密码查询
    List<Student> selectByNameOrAge(@Param("p1") String name, @Param("p2") Integer age);
    //动态SQL查询
    List<Student> selectCondition(Student stu);
    //根据多个sid查询
    List<Student> selectByIds(List<Integer> sids);
}
