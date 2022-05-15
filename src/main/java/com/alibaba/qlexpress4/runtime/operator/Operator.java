package com.alibaba.qlexpress4.runtime.operator;

import com.alibaba.qlexpress4.exception.ErrorReporter;
import com.alibaba.qlexpress4.runtime.Value;

/**
 * Author: DQinYuan
 * date 2022/1/12 2:34 下午
 */
public interface Operator {

    Object execute(Value left, Value right, ErrorReporter errorReporter);

    int getPrecedence();

}