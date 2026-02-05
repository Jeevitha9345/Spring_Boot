package com.example.happyapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HappyController {
    @GetMapping("/display")
    public String display(){
//        method 1 using triple quotes
        return """
                <h1>Welcome to happy API</h1> <br>
                 <img src="https://t3.ftcdn.net/jpg/01/09/05/26/360_F_109052681_ihUqGPwj3LnaderClaUE9pVy43OxzS7X.jpg">
""";
//        method 2 using html
//        return "<html>"+"<body>"+"<img src=https://t3.ftcdn.net/jpg/01/09/05/26/360_F_109052681_ihUqGPwj3LnaderClaUE9pVy43OxzS7X.jpg>"+"<h1>Welcome</h1>"+"</body>"+"</html>";
    }

    @GetMapping("/displaywithname/{name}")
    public String displaywithname(@PathVariable String name){
        return "<html>"+"<body>"+"<img src=https://t3.ftcdn.net/jpg/01/09/05/26/360_F_109052681_ihUqGPwj3LnaderClaUE9pVy43OxzS7X.jpg>"+"<h1>Welcome to happy API "+"<marquee>"+name+"</marquee>"+" </h1>"+"</body>"+"</html>";
    }

    @GetMapping("/myamstrongnumber/{n}")
    public String myamstrongnum(@PathVariable int n){
        return amstrong(n);
    }

    public int nodig(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }return count;
    }
    public String amstrong(int n){
        int dig=nodig(n);
        int num=n,res=0;
        for(int i=0;i<dig;i++){
            if(num>0){
                res+=Math.pow(num%10,dig);
                num/=10;
            }
        }if(res==n){
            return "It's an amstrong number";
        }return "It's not an amstrong number";
    }
    @GetMapping("/allinone/{name}/{n}")
    public String whole(@PathVariable String name,@PathVariable int n){
        return "<html>"+"<body>"+"<img src=https://t3.ftcdn.net/jpg/01/09/05/26/360_F_109052681_ihUqGPwj3LnaderClaUE9pVy43OxzS7X.jpg>"+"<h1>Welcome to happy API "+"<marquee>"+name+"</marquee>"+" </h1>"+"</body>"+"</html>"+"<br>"+amstrong(n);
    }

    @GetMapping("/printint/{num1}/{num2}/{num3}")
    public Object sumint(@PathVariable Float num1,
                         @PathVariable Float num2,
                         @PathVariable Float num3){

        if(num1+num2+num3>100){
            float x=num1+num2+num3;
            return x;
        }
        return "the numbers are :"+num1+" ,"+num2+" ,"+num3;
    }
//    by using array for integer
//    @GetMapping("/printint/{n1}/{n2}/{n3}")
//    public float[] printInt(@PathVariable float n1,@PathVariable float n2,@PathVariable float n3){
//        float sum=n1+n2+n3;
//        float[]arr;
//        if(sum>100){
//            arr=new float[1];
//            arr[0]=sum;
//        }else{
//            arr=new float[3];
//            arr[0]=n1;
//            arr[1]=n2;
//            arr[2]=n3;
//        }return arr;
//    }

    @GetMapping("printstr/{n1}/{n2}/{n3}")
    public String printString(@PathVariable float n1,@PathVariable float n2,@PathVariable float n3){
        float sum=n1+n2+n3;
        if(sum>100){
            return String.valueOf(sum);
        }else{
            StringBuilder s=new StringBuilder();
            s.append(String.valueOf(n1));
            s.append(String.valueOf(n2));
            s.append(String.valueOf(n3));
            return s.toString();
        }
    }
}