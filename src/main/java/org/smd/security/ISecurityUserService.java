package org.smd.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
