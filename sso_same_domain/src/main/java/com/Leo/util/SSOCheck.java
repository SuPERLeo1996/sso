package com.Leo.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Leo
 * @Date: 2018/8/30 16:55
 * @Description:
 */
public class SSOCheck {
    public static final String USERNAME = "user";
    public static final  String PASSWORD = "123";
    public static boolean checkLogin(String username,String password){
        if(username.equals(USERNAME)&&password.equals(PASSWORD)){
            return true;
        }
        return false;
    }


    public static boolean checkCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("ssocookies")&&cookie.getValue().equals("sso")){
                    return true;
                }
            }
        }
        return false;
    }
}
