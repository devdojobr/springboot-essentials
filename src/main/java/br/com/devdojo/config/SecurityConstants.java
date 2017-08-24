package br.com.devdojo.config;

import java.util.concurrent.TimeUnit;

/**
 * @author William Suane for DevDojo on 8/24/17.
 */
public class SecurityConstants {
    // Authorization Bearer uheauhehgy3u231uh
    static final String SECRET = "DevDojoFoda";
    static final String TOKEN_PREFIX = "Bearer ";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/users/sign-up";
    static final long EXPIRATION_TIME = 86400000L;

//    public static void main(String[] args) {
//        System.out.println(TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS));
//    }
}
