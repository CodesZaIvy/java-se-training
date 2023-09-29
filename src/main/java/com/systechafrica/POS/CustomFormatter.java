package com.systechafrica.POS;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomFormatter extends Formatter {
    @Override

        public String format(LogRecord record) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

           String method = record.getSourceMethodName();
           String level = record.getLevel().getName();
           String message  =  record.getMessage();
           //time when method was executed
           Instant instant = record.getInstant();
           LocalDateTime now =LocalDateTime.ofInstant(instant,ZoneId.systemDefault());

           

           //concatenation
            return pattern.format(now)+ " | "+ method+ " | "+ level+" | "+message;
        
        }

    }
    




