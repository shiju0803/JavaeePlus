package com.shiju.service;

import com.shiju.bean.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 业务层接口
 * @author shiju
 * @date 2021/05/10 09:26
 */
public interface StudentService {
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
    List<Student> selectByNameOrAge(String name,Integer age);
    //动态SQL查询
    List<Student> selectCondition(Student stu);
    //根据多个sid查询
    List<Student> selectByIds(List<Integer> sids);
}
