package com.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
        System.out.println("Into MyFilter");
		chain.doFilter(request, response);
		System.out.println("Outside MyFilter");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
