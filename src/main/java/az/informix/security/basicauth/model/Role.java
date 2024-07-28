package az.informix.security.basicauth.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;

public enum Role implements GrantedAuthority {
    ROLE_USER("USER"),
    ROLE_ADMIN("ADMIN"),
    ROLE_MOD("MOD"),
    ROLE_FSK("FSK");
    public String value;

    Role(String value) {
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

    @Override
    public String getAuthority(){
        return name();
    }
}
