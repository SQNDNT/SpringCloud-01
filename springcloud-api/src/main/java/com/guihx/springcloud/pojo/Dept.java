package com.guihx.springcloud.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long id;
    private String name;
    private String dbSource;
}
