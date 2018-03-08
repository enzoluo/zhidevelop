package com.zhidevelop.core;

/**
 * description
 * author enzoluo
 * time 2018-03-06 10:26
 * version v1.0
 **/
public class HqlInfo {
    private String selectBlock;
    private String fromBlock;
    private String whereBlock;
    private String paramter;

    public String getSelectBlock() {
        return selectBlock;
    }

    public void setSelectBlock(String selectBlock) {
        this.selectBlock = selectBlock;
    }

    public String getFromBlock() {
        return fromBlock;
    }

    public void setFromBlock(String fromBlock) {
        this.fromBlock = fromBlock;
    }

    public String getWhereBlock() {
        return whereBlock;
    }

    public void setWhereBlock(String whereBlock) {
        this.whereBlock = whereBlock;
    }

    public String getParamter() {
        return paramter;
    }

    public void setParamter(String paramter) {
        this.paramter = paramter;
    }
}
