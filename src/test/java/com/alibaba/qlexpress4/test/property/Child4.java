package com.alibaba.qlexpress4.test.property;

import com.alibaba.qlexpress4.runtime.Value;

/**
 * @Author TaoKan
 * @Date 2022/7/10 下午6:53
 */
public class Child4 extends Parent implements Value {
    private final long result;
    public Child4(){
        this.result = 0L;
    }
    public Child4(int t){
        this.result = 0L;
    }

    public int getMethod7(int t){
        return t;
    }

}