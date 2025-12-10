package com.tight.coupling;

public class TightCouplingExample {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(new UserDatabase());
        System.out.println(userManager.getUserDetail());
    }
}
