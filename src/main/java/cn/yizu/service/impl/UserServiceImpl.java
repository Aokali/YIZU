package cn.yizu.service.impl;

import cn.yizu.dao.UserMapper;
import cn.yizu.pojo.User;
import cn.yizu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> selectUser(Map<String,Object> map) {
        return userMapper.selectUser(map);
    }
}

