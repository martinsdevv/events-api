package com.martins.eventapi.Eventos_API.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private final String role;
    UserRole(String role) {
        this.role = role;
    }

}
