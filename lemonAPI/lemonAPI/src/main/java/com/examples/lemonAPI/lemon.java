package com.examples.lemonAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class lemon {
    @GetMapping("/lem/{num}")
    public String lemons(@PathVariable int num){
        String s="";
        if(num<0){
            s="Invalid input";
        }else if(num==0){
            s="God 1: need 7<br>God 2: need 7<br>God 3: need 7<br>Shortage:21<br>God Bless You:)";
        }else if(num>21){
            s="God 1: offered 7 <br>God 2:offered 7<br>God 3:offered 7<br>Surplus: "+(num-21)+"<br>God Bless You:)";
        }else if(num==21){
            s="God 1: offered 7 <br>God 2:offered 7<br>God 3:offered 7<br>Satisfied...<br>God Bless You:)";
        }else if(num<21){
            if(num<7){
                s="God 1: have "+num+" need "+(7-num)+"<br>God 2: need 7<br>God 3: need 7";
            }else if(num<14){
                s="God 1: 7 offered <br>God 2: have "+(num-7)+" need "+(14-num)+"<br>God 3: need 7";
            }else if(num==14){
                s="God 1: offered 7<br>God 2: offered 7<br>God 3: need 7";
            }else if(num<21){
                s="God 1: 7 offered<br>God 2: 7 offered<br>God 3: have "+(num-14)+" need "+(21-num);
            }s+="<br>Shortage: "+(21-num)+"<br>God Bless You:)";
        }
        return s;
    }
}
