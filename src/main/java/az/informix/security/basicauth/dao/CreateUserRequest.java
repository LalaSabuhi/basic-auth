package az.informix.security.basicauth.dao;

import az.informix.security.basicauth.model.Role;
import lombok.Builder;

import java.util.Set;
@Builder
public record CreateUserRequest(
    String name,
    String username,
    String password,
    Set<Role> authorities
) {
}
