package com.liguofu.dagger2_dome;

import javax.inject.Inject;

/**
 * Created by my on 2016/8/22.
 */
public class Person {

    @Inject
    public Person() {
    }

    public String getName(){
        return "赵六";
    }
}
