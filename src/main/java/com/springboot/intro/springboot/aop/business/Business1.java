package com.springboot.intro.springboot.aop.business;

import com.springboot.intro.springboot.aop.aspect.TrackTime;
import com.springboot.intro.springboot.aop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething(){
        return dao1.retrieveSomething();
    }
}
