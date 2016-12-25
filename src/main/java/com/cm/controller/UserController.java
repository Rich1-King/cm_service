package com.cm.controller;

import com.cm.model.po.User;
import com.cm.model.vo.JsonResponse;
import com.cm.model.vo.UserVo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rich1 on 12/25/16.
 */
@RestController
@RequestMapping(value = "/usr")
public class UserController{

    @RequestMapping(name = "添加用户", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public JsonResponse<UserVo> addUser(@RequestBody User user){
        return null;
    }

}
