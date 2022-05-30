package com.springboot.intro.springboot.aop.data;

import com.springboot.intro.springboot.aop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {
    // track time for this dao method
    @TrackTime
    public String retrieveSomething(){
        return "Dao1";
    }
}
