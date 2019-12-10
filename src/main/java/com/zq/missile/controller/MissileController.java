package com.zq.missile.controller;

import com.zq.missile.dao.MissileDao;
import com.zq.missile.pojo.Missile;
import com.zq.missile.service.MissileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/missile")
//public class MissileController {
//    @Autowired
//    MissileService missileService;
//    @GetMapping("/all")
//    public Iterable<Missile> findAll() {
//        return (Iterable<Missile>) missileService.findByfirstName("M7战术弹道导弹");
//    }
//    @GetMapping("/test")
//    public String test(){
//        return "hello";
//    }
//
//}
@Controller
public class MissileController{
    @Autowired
    private MissileService missileService;
    @Autowired
    Missile missile;
    @RequestMapping("/all")
    @ResponseBody
    public String saveMissile(){
        missile.setNodeId((long) 11);
        missile.setName("美国队长");
        missile.setAge(25);
        missileService.addMissile(missile);
        return "success";
    }
}

