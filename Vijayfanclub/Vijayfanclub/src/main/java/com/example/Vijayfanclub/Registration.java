package com.example.Vijayfanclub;

public class Registration {
    private String name;
    private String email;
    private long cont_num;
    private String pass;
    private String city;
    private int pin;

    public Registration(){

    }
    public Registration(String name,String email,long cont_num,String pass,String city,int pin){
        this.name=name;
        this.email=email;
        this.cont_num=cont_num;
        this.pass=pass;
        this.city=city;
        this.pin=pin;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public long getContact_num(){
        return cont_num;
    }
    public void setCont_num(long cont_num){
        this.cont_num=cont_num;
    }
    public String getPassword(){
        return pass;
    }
    public void setPassword(String pass){
        this.pass=pass;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public int getPincode(){
        return pin;
    }
    public void setPincode(int pin){
        this.pin=pin;
    }
}
