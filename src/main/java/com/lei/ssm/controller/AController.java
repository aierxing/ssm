package com.lei.ssm.controller;

import com.lei.ssm.entity.User;
import com.lei.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ssm
 *
 * @author: leiwe
 * @date 2020-08-16 8:27
 */
@RestController
public class AController {

    @Autowired
    UserMapper userMapper;

    @GetMapping(value = "all")
    List<User> get(){
        return userMapper.findAll();
    }

    @GetMapping(value = "ins")
    String ins(String u,String p,String pe){
        userMapper.insert(u,p,pe);
        return "插入成功";
    }

    @GetMapping(value = "del")
    String del(String u){
        userMapper.delete(u);
        return "删除成功";
    }
    @GetMapping(value = "upd")
    String update(String u,int i){
        userMapper.update(u,i);
        return "修改成功";
    }
}
