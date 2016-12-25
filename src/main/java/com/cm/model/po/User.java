package com.cm.model.po;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Calendar;
import java.util.UUID;

/**
 * Created by rich1 on 12/25/16.
 */
public class User{
    private String id = UUID.randomUUID().toString().replace("-","");
    private String account;
    private String password;
    private String name;
    private Integer age;
    private String phone;
    private String email;
    private String address;
    private Calendar createTime = Calendar.getInstance();
    private Calendar lastLoginTime;
    private Boolean isDel;
    private Long version;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public Calendar getCreateTime(){
        return createTime;
    }

    public void setCreateTime(Calendar createTime){
        this.createTime = createTime;
    }

    public Calendar getLastLoginTime(){
        return lastLoginTime;
    }

    public void setLastLoginTime(Calendar lastLoginTime){
        this.lastLoginTime = lastLoginTime;
    }

    public Boolean getDel(){
        return isDel;
    }

    public void setDel(Boolean del){
        isDel = del;
    }

    public Long getVersion(){
        return version;
    }

    public void setVersion(Long version){
        this.version = version;
    }

    @Override
    public String toString(){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            String jsonStr = objectMapper.writeValueAsString(this);
            return jsonStr;
        }catch (JsonProcessingException e){
            e.printStackTrace();
            return null;
        }
    }
}
