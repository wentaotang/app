package com.hgcode.vo;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by wentao_tang on 2015/11/19.
 * 该类采用构建式(Build)的方式
 */
public class BuildDemo<T> {
    /**
     * required(必须有对的construct)
     */
    private final  String code;
    /**
     * optional
     */
    private final T data;

    public String getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    private BuildDemo(Builder<T> builder) {
        this.data = builder.data;
        this.code = builder.code;
    }

    public static class Builder<T> {
        private  T data;
        private  String  code;

        public Builder(){

        }

        public Builder(String code){
            this.code=code;
        }

        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

        public Builder<T> code(String code) {
            this.code = code;
            return this;
        }

        public BuildDemo<T> build() {
            return new BuildDemo<T>(this);
        }
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
