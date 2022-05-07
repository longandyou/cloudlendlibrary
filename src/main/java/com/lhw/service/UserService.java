package com.lhw.service;
import com.lhw.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *用户接口
 */
@Mapper
public interface UserService{
    //通过User的用户账号和用户密码查询用户信息
    User login(User user);
}
