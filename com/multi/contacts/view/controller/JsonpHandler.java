package com.multi.contacts.view.controller;

import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class JsonpHandler extends HandlerInterceptorAdapter  {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String callback = request.getParameter("callback");
		String method = request.getMethod().toLowerCase();
		if (callback != null && method.equals("get")) {
			OutputStream out = response.getOutputStream();
			out.write((callback + "(").getBytes());
			//out.close();
		}
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String callback = request.getParameter("callback");
		String method = request.getMethod().toLowerCase();
		if (callback != null && method.equals("get")) {
			OutputStream out = response.getOutputStream();
			out.write(")".getBytes());
			out.close();
		}

	}
	
	
	
}
