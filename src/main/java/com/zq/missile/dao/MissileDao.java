package com.zq.missile.dao;

import com.zq.missile.pojo.Missile;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
@Repository
public interface MissileDao extends Neo4jRepository<Missile,Long>{
//    Missile findByName(@Param("name") String name);
    @Query("create(n:Missile{age:{age},name:{name}}) return n ")
    List<Missile> addMissileList(@Param("name") String name,@Param("age")int age);
    @Query("match(n:Missile)where n.name={name} return n")
    List<Missile> getMissile(@Param("name")String name);

}
