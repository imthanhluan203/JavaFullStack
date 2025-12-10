package com.loose.coupling;

public class UserManager {
    private UserDataprovider userDatabase;
    public UserManager(UserDataprovider userDatabase){
        this.userDatabase = userDatabase;
    }
    public String getUserDetail(){
        return userDatabase.getUserDetail();
    }
}
