package com.Leo.demo1;

import com.Leo.util.SSOCheck;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Leo
 * @Date: 2018/8/30 18:31
 * @Description:
 */
public class Demo1Action extends ActionSupport{
    private String gotoUrl;
    public String main(){
        HttpServletRequest request = ServletActionContext.getRequest();
        if(SSOCheck.checkCookie(request)){
            return SUCCESS;
        }
        gotoUrl="/demo1/main.action";
        return LOGIN;
    }

    public String getGotoUrl() {
        return gotoUrl;
    }

    public void setGotoUrl(String gotoUrl) {
        this.gotoUrl = gotoUrl;
    }
}
