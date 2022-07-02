package com.alibaba.qlexpress4.runtime.instruction;

import com.alibaba.qlexpress4.QLOptions;
import com.alibaba.qlexpress4.exception.ErrorReporter;
import com.alibaba.qlexpress4.runtime.*;
import com.alibaba.qlexpress4.runtime.data.DataValue;

/**
 * @Operation: instantiate lambda definition on stack
 * @Input: 0
 * @Output: 1 lambda instance
 *
 * Author: DQinYuan
 */
public class LoadLambdaInstruction extends QLInstruction {

    private final QLambdaDefinition lambdaDefinition;

    public LoadLambdaInstruction(ErrorReporter errorReporter, QLambdaDefinition lambdaDefinition) {
        super(errorReporter);
        this.lambdaDefinition = lambdaDefinition;
    }

    @Override
    public QResult execute(QRuntime qRuntime, QLOptions qlOptions) {
        QLambda lambdaInstance = lambdaDefinition.toLambda(qRuntime, qlOptions, true);
        qRuntime.push(new DataValue(lambdaInstance));
        return QResult.CONTINUE_RESULT;
    }

    @Override
    public int stackInput() {
        return 0;
    }

    @Override
    public int stackOutput() {
        return 1;
    }
}
