package com.stitch.commons.utils;

import org.springframework.util.StringUtils;

/**
 * @author:Stitch Chen
 * @create: 2023-09-17 21:25
 * @Description: result返回生成类
 */
public class ResultGenerator {

    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";


    public static Result genSuccessResult(){
        Result result = new Result();
        result.setResultCode(SystemCode.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_FAIL_MESSAGE);
        return result;
    }


    public static Result genSuccessResult(String message){
        Result result = new Result();
        result.setResultCode(SystemCode.RESULT_CODE_SUCCESS);
        result.setMessage(message);
        return result;
    }

    public static Result genSuccessResult(Object data){
        Result result = new Result();
        result.setResultCode(SystemCode.RESULT_CODE_SUCCESS);
        result.setMessage(DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static Result genFailResult(String message){
        Result result = new Result();
        result.setResultCode(SystemCode.RESULT_CODE_SERVER_ERROR);
        if(TypeChecker.isEmpty(message)){
            result.setMessage(DEFAULT_FAIL_MESSAGE);
        }else{
            result.setMessage(message);
        }
        return result;
    }

    public static Result genNullResult(String message){
        Result result = new Result();
        result.setResultCode(SystemCode.RESULT_CODE_BAD_REQUEST);
        result.setMessage(message);
        return result;
    }

    public static Result genErrorResult(int code, String message){
        Result result = new Result();
        result.setResultCode(code);
        result.setMessage(message);
        return result;
    }

}
