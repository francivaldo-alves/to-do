package com.f3pro.todo.resources.exceptions;

import java.io.Serializable;

public class StanderError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long timestamp;
    private Integer Status;
    private String messege;

    public StanderError() {

    }

    public StanderError(Long timestamp, Integer status, String messege) {
        this.timestamp = timestamp;
        Status = status;
        this.messege = messege;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }
}
