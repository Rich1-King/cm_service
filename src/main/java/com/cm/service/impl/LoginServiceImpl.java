package com.cm.service.impl;

import com.cm.model.vo.Captacha;
import com.cm.service.LoginService;
import com.cm.utils.CaptachaUtil;
import org.springframework.stereotype.Service;

/**
 * Created by rich1 on 12/25/16.
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Override
    public Captacha findCaptacha() throws Exception{
        CaptachaUtil captachaUtil = new CaptachaUtil();
        captachaUtil.createCaptha();
        return captachaUtil.getCaptacha();
    }
}
