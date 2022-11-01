package com.example.Lab1.Inversion.of.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@MyBean
@Component
public class A {


//    @MyAutowired
    @Autowired
    private B b;

}
