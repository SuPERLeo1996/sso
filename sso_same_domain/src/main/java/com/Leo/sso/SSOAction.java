package com.Leo.sso;

import com.Leo.util.SSOCheck;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: Leo
 * @Date: 2018/8/30 16:53
 * @Description:
 */
public class SSOAction extends ActionSupport {
    private String username;
    private String password;
    private String gotoUrl;

    public String doLogin(){
        boolean ok = SSOCheck.checkLogin(username,password);
        if(ok){
            Cookie cookie = new Cookie("ssoCookie","sso");
            cookie.setPath("/");
            HttpServletResponse response = ServletActionContext.getResponse();
            response.addCookie(cookie);
            return SUCCESS;
        }
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGotoUrl() {
        return gotoUrl;
    }

    public void setGotoUrl(String gotoUrl) {
        this.gotoUrl = gotoUrl;
    }
}
