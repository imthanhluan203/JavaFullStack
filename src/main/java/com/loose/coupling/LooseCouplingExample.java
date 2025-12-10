package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataprovider userDataprovider = new UserDatabase();
        UserManager userManager = new UserManager(userDataprovider);
        System.out.println(userManager.getUserDetail());


        UserDataprovider userDataproviderw = new UserWebService();
        UserManager userManagerw = new UserManager(userDataproviderw);
        System.out.println(userManagerw.getUserDetail());
    }
}
