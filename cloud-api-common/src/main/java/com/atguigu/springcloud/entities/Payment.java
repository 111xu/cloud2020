package com.atguigu.springcloud.entities;




import java.io.Serializable;

/**
 * @author shkstart
 * @project cloud2020
 * @create 2022 09 29 17:09
 */

public class Payment implements Serializable {
    private Long id;

    private String serial;

    public Payment(Long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Payment() {
    }
}
