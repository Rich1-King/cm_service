package com.cm.service;

import com.cm.model.vo.Captacha;

/**
 * Created by rich1 on 12/25/16.
 */
public interface LoginService{

    Captacha findCaptacha() throws Exception;
}
