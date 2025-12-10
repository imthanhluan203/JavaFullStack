package com.tight.coupling;

public class UserManager {
    private UserDatabase userDatabase;
    public UserManager(UserDatabase userDatabase){
        this.userDatabase = userDatabase;
    }
    public String getUserDetail(){
        return userDatabase.getUserDetail();
    }
}
