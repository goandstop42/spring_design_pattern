package me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
