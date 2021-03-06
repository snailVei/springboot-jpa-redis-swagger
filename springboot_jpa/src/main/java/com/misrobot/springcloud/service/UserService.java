package com.misrobot.springcloud.service;

import com.misrobot.springcloud.dao.UserDao;
import com.misrobot.springcloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by weihuanbo on 2018/7/10.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userRepository;

    public User findUserByName(String username){

        return userRepository.findByUsername(username);
    }

    public List<User> findAll(){
       return userRepository.findAll();
    }

    public User saveUser(User user){
      return  userRepository.save(user);
    }

    //public User findUserById(long id){
    //    return userRepository.findOne(id);
    //}
    public User updateUser(User user){
       return userRepository.saveAndFlush(user);
    }
    //public void deleteUser(long id){
    //    userRepository.delete(id);
    //}
}

