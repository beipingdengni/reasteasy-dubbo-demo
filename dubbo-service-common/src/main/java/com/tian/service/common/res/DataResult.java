package com.tian.service.common.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataResult<T> {
    private int code;

    private String msg;

    private T data;

}
