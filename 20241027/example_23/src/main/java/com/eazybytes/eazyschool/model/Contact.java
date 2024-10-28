package com.eazybytes.eazyschool.model;

import lombok.Data;

@Data
public class Contact {
    private String name;
    private String mobileNum;
    private String email;

    private String subject;
    private String message;


    public String toString() {
        return "Contact [name=" + name + ", mobileNum=" + mobileNum + ", email=" + email + ", subject=" + subject
                + ", message=" + message + "]";
    }
}
