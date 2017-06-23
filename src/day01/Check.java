package day01;

import java.util.UUID;

public class Check {
	public String usn(String username){
		if(username.equals("张三")){
			return "该用户名被占用";
		}else if(username.equals("")){
			return "请输入用户名";
		}else{
			return "该用户名可以使用";
		}
	}
	public String psw1(String password1,String username){
		int length1=password1.length();
		if(length1==0||password1==null){
			return "密码不能为空";
		}
		if(length1>=1&length1<7){
			return "密码不能少于七位";
		}else{
			boolean flag1=false;	//是否有数字
			boolean flag2=false;	//是否有字母
			for(int i=0;i<length1;i++){
				if(String.valueOf(password1.charAt(i)).matches("[0-9]")){
					flag1=true;
				}
				if(String.valueOf(password1.charAt(i)).matches("[a-zA-Z]")){
					flag2=true;
				}
			}
			if(!flag1&!flag2)
				return "密码必须由数字和字母组成";
			if(flag1&!flag2)
				return "密码中必须含有字母";
			if(!flag1&flag2)
				return "密码中必须含有数字";
			if(flag1&flag2){
				if(password1.equals(username))
					return "用户名和密码不能相同";
			}
			return "密码创建成功";
		}
	}
	public String psw2(String password1,String password2){
		if(password1.equals(password2)){
			return "确认密码输入正确";
		}else  {
			return "确认密码错误，请重输";
		}
	}
	public String num(String number1,String number2){
		if(number1.equalsIgnoreCase(number2)){
			return "验证码正确";
		}else if(number1.equals("")){
			return "请输入验证码";
		}else{
			return "验证码错误";
		}
	}
}
