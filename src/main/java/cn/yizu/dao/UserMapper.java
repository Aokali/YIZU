package cn.yizu.dao;

import cn.yizu.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> selectUser(Map<String,Object> map);
}
