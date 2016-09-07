package com.liguofu.dagger2_dome;

import java.net.BindException;

import dagger.Component;

/**
 * Created by my on 2016/8/22.
 */

@Component
public interface PersonComponent {
    void bind(MainActivity activity);
}
