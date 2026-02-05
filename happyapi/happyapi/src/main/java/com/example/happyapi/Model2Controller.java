package com.example.happyapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Model2Controller {

//    @GetMapping("model2")
//    public Model2 sample(){
//        Model2 m=new Model2();
//        m.setColor("Blue");
//        m.setName("Mounika");
//        return m;
//    }

//    @PostMapping("/mod2")
//    public Model2 mod2(@RequestBody Model2 model2){
//        return model2;
//    }

    //    here arrayList is like a database
    private List<Model2> store=new ArrayList<>();
    //    add one data
    @PostMapping("/add")
    public Model2 mod2(@RequestBody Model2 data){
        store.add(data); //save in memory
        return data;
    }

    //    add more data at a time
    @PostMapping("/addAll")
    public List<Model2> addData(@RequestBody List<Model2> data){
        store.addAll(data);
        return data;
    }
    @GetMapping("/get")
    public List<Model2> getAll(){
        return store;
    }

    //    put
    @PutMapping("/update/{ind}")
    public Model2 update(@PathVariable int ind,@RequestBody Model2 newData){
        if(ind>=0 && ind<store.size()){
            store.set(ind,newData);
        }else{
            throw new RuntimeException("Invalid index");
        }
        return null;
    }

    //    delete
    @DeleteMapping("delete/{ind}")
    public String deleteData(@PathVariable int ind){
        if(ind>=0 && ind<store.size()){
            store.remove(ind);
            return "Deleted successfully at index "+ind;
        }else{
            return "Invalid index: "+ind;
        }
    }
}