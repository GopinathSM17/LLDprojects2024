package com.assignment.question;

import org.springframework.boot.logging.LogLevel;

public class LoggerImpl implements Logger {

    private  LoggerImpl(){

    }

    public static  LoggerImpl getInstance(){
        return null;
    }
    @Override
    public void log(LogLevel level, String message) {

    }


    @Override
    public void setLogFile(String filePath) {

    }

    @Override
    public String getLogFile() {

        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() {

    }
}