package com.taotao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lining on 17/3/9.
 */
@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;

    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        
       return this.girlRepository.findAll();
    }
    @GetMapping(value="/girl")
    public String addGirl(String name,Integer cpuSize){
        Girl girl=new Girl();
        girl.setName(name);
        girl.setCpuSize(cpuSize);
        Girl g=this.girlRepository.save(girl);
      return g.toString();
    }

}
