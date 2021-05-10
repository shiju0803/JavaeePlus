package com.shiju.controller;

import com.shiju.bean.Student;
import com.shiju.service.StudentService;
import com.shiju.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 控制层测试类
 * @author shiju
 * @date 2021/05/10 09:09
 */
public class StudentController {
    //创建业务层对象
    private StudentService service = new StudentServiceImpl();

    //查询全部功能测试
    @Test
    public void selectAll(){
        List<Student> list = service.selectAll();
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
    //根据sid查询功能测试
    @Test
    public void selectById(){
        Student stu = service.selectById(6);
        System.out.println(stu);
    }

    //新增功能测试
    @Test
    public void insert(){
        Student stu = new Student(4,"吴三省",27);
        int result = service.insert(stu);
        if(result != 0){
            System.out.println("添加成功!");
        }else {
            System.out.println("添加失败!");
        }
    }

    //修改功能测试
    @Test
    public void update(){
        Student stu = new Student(4,"阿宁",25);
        int result = service.update(stu);
        if(result != 0){
            System.out.println("修改成功!");
        }else {
            System.out.println("修改失败!");
        }
    }

    //删除功能测试
    @Test
    public void delete(){
        int result = service.delete(4);
        if(result != 0){
            System.out.println("删除成功!");
        }else {
            System.out.println("删除失败!");
        }
    }
    //根据用户名或密码查询
    @Test
    public void selectByNameOrAge(){
        List<Student> list = service.selectByNameOrAge("吴邪",180);
        list.forEach(stu -> System.out.println(stu));
    }
    //动态SQL查询
    @Test
    public void selectCondition(){
        Student stu = new Student();
        //stu.setSid(5);
        //stu.setName("张起灵");
        //stu.setAge(180);
        List<Student> list = service.selectCondition(stu);
        list.forEach(s -> System.out.println(s));
    }

    //根据多个sid查询
    @Test
    public void selectByIds(){
        List<Integer> sids = new ArrayList<>();
        sids.add(5);
        sids.add(6);
        sids.add(7);
        List<Student> list = service.selectByIds(sids);
        list.forEach(s -> System.out.println(s));
    }

}
