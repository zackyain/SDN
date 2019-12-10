package com.zq.missile;

import com.zq.missile.pojo.Missile;
import com.zq.missile.service.MissileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MissileApplicationTests {
    @Autowired
    MissileService missileService;
    @Test
    void contextLoads() {
        System.out.println(missileService.getMissile("美国队长"));

    }

}
