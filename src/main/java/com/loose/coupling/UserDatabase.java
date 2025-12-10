package com.loose.coupling;

public class UserDatabase implements UserDataprovider {
    @Override
    public String getUserDetail(){
        return "Name of user in database";
    }
}
