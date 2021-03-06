package message.request;

import message.MessageTag;

/**
 * 登陆请求
 * @author zsg
 *
 */
public class LoginRequest extends Request{
	public String username;
	public String password;
	public boolean  isAuto=false;	//是否是自动登录  自动登录则不需输入密码
	public LoginRequest() {
		tag=MessageTag.LOGIN_REQ;
	}
	
	public LoginRequest(String username,String password){
		this.username=username;
		this.password=password;
		tag=MessageTag.LOGIN_REQ;
	}
	
	public LoginRequest(String username){
		this.username=username;
		tag=MessageTag.LOGIN_REQ;
		isAuto=true;
	}
}
