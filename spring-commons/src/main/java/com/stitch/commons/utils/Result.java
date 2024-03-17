package com.stitch.commons.utils;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author:Stitch Chen
 * @create: 2023-09-17 21:05
 * @Description: 统一结果返回
 */
@Getter
@Setter
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private int resultCode;
    private String message;
    private T data;

    public Result(){

    }

    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
    }

    // 服务器处理失败
    public Result failure(){
        return new Result(SystemCode.RESULT_CODE_SERVER_ERROR, "服务器错误");
    }

}
