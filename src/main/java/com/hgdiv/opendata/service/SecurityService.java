package com.hgdiv.opendata.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
