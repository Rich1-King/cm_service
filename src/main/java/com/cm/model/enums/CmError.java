package com.cm.model.enums;

/**
 * Created by rich1 on 12/25/16.
 */
public enum CmError{

    CM_GET_DATA_FAIL("数据获取异常");

    CmError(String codeDescription){
        this.codeDescription = codeDescription;
    }

    private String codeDescription;

    public String getCodeDescription(){
        return codeDescription;
    }

    public void setCodeDescription(String codeDescription){
        this.codeDescription = codeDescription;
    }
}
