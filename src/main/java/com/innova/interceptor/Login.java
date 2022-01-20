package com.innova.interceptor;

// Bu method'da kesmeler meydana gelecek
@YolKesiciInterface
public class Login {
	
	public String isLogin(String data) {
		return "çalışıyor" + data;
	}
}
