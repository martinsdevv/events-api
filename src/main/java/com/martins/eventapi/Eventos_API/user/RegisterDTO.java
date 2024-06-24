package com.martins.eventapi.Eventos_API.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
