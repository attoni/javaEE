package com.example.demo.web;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.actuate.endpoint.annotation.FilteredEndpoint;

@WebFilter("/testServlet")
public class TestFilter extends HttpFilter {

	public TestFilter() {
		super();
	}

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	response.getWriter().write("before");
		// TODO Auto-generated method stub
		super.doFilter(request, response, chain);
		response.getWriter().write("after");
	}

}
