package com.eazybytes.eazyschool.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {
    @NotBlank(message = "name should not be empty")
    @Size(min = 3, message = "Name should be at least 3 characters long")
    private String name;

    @NotBlank(message = "Mobile number should not be empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNum;

    @NotBlank(message = "Email should not be Empty")
    @Email
    private String email;

    @NotBlank(message="Subject Shoulf not be empty")
    @Size(min=5, message="Subject must be at least 5 characters long")
    private String subject;

    @NotBlank(message = "message should not be empty")
    @Size(min=10, message="Message must be at least 10 characters long")
    private String message;


    public String toString() {
        return "Contact [name=" + name + ", mobileNum=" + mobileNum + ", email=" + email + ", subject=" + subject
                + ", message=" + message + "]";
    }
}
