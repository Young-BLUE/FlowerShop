package com.youngblue.common;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JsonResult<T> {

    private boolean success;

    private T data;

    private ZonedDateTime responseDateTime;

    public JsonResult(boolean success, T data) {
        this.success = success;
        this.data = data;
        this.responseDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
    }

}
