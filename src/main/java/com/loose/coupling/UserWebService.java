package com.loose.coupling;

public class UserWebService implements UserDataprovider {
    @Override
    public String getUserDetail(){
        return "User information from web service";
    }
}
