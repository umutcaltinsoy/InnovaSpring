package com.innova.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

// Interceptor binding oluştur(JSR-365 9.2)
@YolKesiciInterface
@Interceptor
public class YolKesiciMethod {
	
	@AroundInvoke
	public Object aroundInvoke(InvocationContext context) throws Exception {
		
		System.out.println("önceki durumum" + context.getMethod().getName());
		
		// yol kesici nerde?
		// db session sorgulaması
		boolean isLogin = true;
		Object isContinue = null;
		if (isLogin) {
			System.out.println("Önce üye olunuz");
			return null;
		} else {
			try {
				isContinue = context.proceed();
				System.out.println("Login olduktan sonra: Yönlendirme yapılıyor...");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return isContinue;
	}
	
}
