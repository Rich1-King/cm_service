package com.cm.controller;

import com.cm.model.enums.CmError;
import com.cm.model.vo.Captacha;
import com.cm.model.vo.JsonResponse;
import com.cm.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rich1 on 12/25/16.
 */
@RestController
@RequestMapping("/login")
public class LoginController{
    private Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    @RequestMapping(name = "获取验证码", value = "captacha", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public JsonResponse<Captacha> getCaptacha(){
        try{
            Captacha captacha = loginService.findCaptacha();
            return new JsonResponse<>(captacha);
        }catch (Exception e){
            logger.error("获取图片验证码失败",e);
            return JsonResponse.createError(CmError.CM_GET_DATA_FAIL);
        }
    }

}
