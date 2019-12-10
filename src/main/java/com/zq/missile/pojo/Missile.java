package com.zq.missile.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity(label = "Missile22")
@Component
public class Missile {
//    private int id;
//    private String name;
//    private String country;
//    private String introduction;
//    private String date;
//    private String category;
//    private String distance;
//    private String lenth;
//    private String radius;
    @Id
    @GeneratedValue
    private Long nodeId;
    @Property
    private String name;
    @Property
    private int age;
}
