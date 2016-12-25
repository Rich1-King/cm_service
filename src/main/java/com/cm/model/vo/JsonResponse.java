package com.cm.model.vo;

import com.cm.model.enums.CmError;

/**
 * Created by rich1 on 12/25/16.
 */
public class JsonResponse<T>{
    private String code = "SUCCESS";
    private String codeDescription="调用成功";
    private T data;

    public JsonResponse(){}
    public JsonResponse(T data){
        this.data = data;
    }

    public static JsonResponse createError(CmError cmError){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.code = cmError.name();
        jsonResponse.codeDescription = cmError.getCodeDescription();
        return jsonResponse;
    }


    public String getCodeDescription(){
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription){
        this.codeDescription = codeDescription;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
}
