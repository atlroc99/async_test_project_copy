package com.async.test.asynctestproject.filter;
/*
import static org.assertj.core.api.Assertions.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.GenericFilterBean;

public class CORSFilter extends GenericFilterBean implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {

		HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");

		// You can specifically allow access for for one or more spefiic http methods
		// httpServletResponse.setHeader("Access-Control-Allow-Methods",
		// "GET,POST,PUT,DELETE");

		// allowing access for which specifc header or all headers
		// httpResponse.setHeader("Access-Control-Allow-Headers",
		// "Origin, X-Requested-With, Content-Type, Accept, X-Auth-Token, X-Csrf-Token,
		// Authorization");

		httpServletResponse.setHeader("Access-Control-Allow-Headers", "*");
		httpServletResponse.setHeader("Access-Control-Allow-Credentials", "false");
		httpServletResponse.setHeader("Access-Control-Max-Age", "3600");

		System.out.println("********** CORS Configuration Completed **********");

		filterChain.doFilter(request, response);
	}
}*/
