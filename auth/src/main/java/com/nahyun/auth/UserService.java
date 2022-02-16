package com.nahyun.auth;

public interface UserService {
    UserVO login(UserVO userVO);

    UserVO createUser(UserVO userVO);

    UserVO findUserByUserEmail(String userEmail);
}
