package com.example.mvp.model;

import com.example.mvp.bean.UserBean;

public interface IUserModel {  
    void setID(int id);  
 
    void setFirstName(String firstName);  
 
    void setLastName(String lastName);  
 
    //int getID();  
 
    UserBean load(int id);// ͨ��id��ȡuser��Ϣ,����һ��UserBean  
}  