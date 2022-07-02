package com.alibaba.qlexpress4.runtime;

import com.alibaba.qlexpress4.QLOptions;
import com.alibaba.qlexpress4.runtime.instruction.QLInstruction;

import java.util.List;

/**
 * Author: DQinYuan
 */
public class QLambdaDefinitionInner implements QLambdaDefinition {

    /**
     * function name
     */
    private final String name;

    private final List<QLInstruction> instructionList;

    private final List<Param> paramsType;

    private final int maxStackSize;

    public QLambdaDefinitionInner(String name, List<QLInstruction> instructionList, List<Param> paramsType,
                                  int maxStackSize) {
        this.name = name;
        this.instructionList = instructionList;
        this.paramsType = paramsType;
        this.maxStackSize = maxStackSize;
    }

    public String getName() {
        return name;
    }

    public List<QLInstruction> getInstructionList() {
        return instructionList;
    }

    public List<Param> getParamsType() {
        return paramsType;
    }

    public int getMaxStackSize() {
        return maxStackSize;
    }

    @Override
    public QLambda toLambda(QRuntime qRuntime, QLOptions qlOptions,
                            boolean newEnv) {
        return new QLambdaInner(this, qRuntime, qlOptions, newEnv);
    }

    public static class Param {
        private final String name;
        private final Class<?> clazz;

        public Param(String name, Class<?> clazz) {
            this.name = name;
            this.clazz = clazz;
        }

        public String getName() {
            return name;
        }

        public Class<?> getClazz() {
            return clazz;
        }
    }
}
