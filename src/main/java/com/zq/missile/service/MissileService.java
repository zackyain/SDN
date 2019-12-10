package com.zq.missile.service;

import com.zq.missile.dao.MissileDao;
import com.zq.missile.pojo.Missile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//@Service
//public class MissileService {
//    private final static Logger LOG = LoggerFactory.getLogger(MissileService.class);
//    private final MissileDao missileDao;
//
//    public MissileService(MissileDao missileDao) {
//        this.missileDao = missileDao;
//    }
//    @Transactional(readOnly = true)
//    public Missile findByfirstName(String name) {
//        Missile result = missileDao.findByName(name);
//        return result;
//    }
//
//
//}
@Service
public class MissileService{
    @Autowired
    private MissileDao missileDao;
    public void addMissile(Missile missile){
        missileDao.addMissileList(missile.getName(),missile.getAge());
    }
    public List<Missile> getMissile(String name){
        return  missileDao.getMissile(name);
    }

}