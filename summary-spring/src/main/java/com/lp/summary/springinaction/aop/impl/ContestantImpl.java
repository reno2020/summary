package com.lp.summary.springinaction.aop.impl;

import com.lp.summary.springinaction.aop.Contestant;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/8.
 */
@Component
public class ContestantImpl implements Contestant {
    public void receiveAward() {
        System.out.println("演员开始领奖");
    }
}
