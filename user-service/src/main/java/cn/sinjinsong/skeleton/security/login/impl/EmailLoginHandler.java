package cn.sinjinsong.skeleton.security.login.impl;

import cn.sinjinsong.skeleton.domain.entity.UserDO;
import cn.sinjinsong.skeleton.security.login.LoginHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by SinjinSong on 2017/5/6.
 */
@Component("LoginHandler.email")
public class EmailLoginHandler implements LoginHandler {
    @Autowired
    private UserService service;
    
    @Override
    public UserDO handle(LoginDTO loginDTO) {
        return service.findByEmail(loginDTO.getEmail());
    }
}