package br.com.devdojo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author William Suane for DevDojo on 6/27/17.
 */
public class PasswordEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("devdojo"));
    }
}

