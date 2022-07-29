package com.bootcampexcersise.module10;

public class CustomException extends Exception{
    @Override
    public String getMessage(){
        return "Invalid input";
    }
}
