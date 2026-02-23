package com.example.OrderEx.classExample;

public class User2 {
    private User_Name userName;
    private String password;

    public User2(User_Name userName,String password){
        this.userName=userName;
        this.password=password;
    }

    public static void main(String[]args){
        User_Name user=new User_Name("Jeevitha","Selvaraj",(long)12345678,"coimbatore");

    }
}
