package com.martins.eventapi.Eventos_API.repository;

import com.martins.eventapi.Eventos_API.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {

    UserDetails findByLogin(String login);

}
