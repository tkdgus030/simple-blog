package com.example.blog.vo;

import lombok.Data;

@Data
public class HelloWorlBean {
    private String message;

    public HelloWorlBean(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorlBean{message='%s'}",message);
        /*StringBuilder sb = new StringBuilder();
        sb.append("HelloWorldBean");
        sb.append("message='");
        sb.append(message);
        sb.append('\'');
        sb.append('}');
*/
        return "HelloWorlBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
