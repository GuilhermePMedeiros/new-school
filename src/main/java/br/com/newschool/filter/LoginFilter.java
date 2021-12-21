package br.com.newschool.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {

		// Cast to HTTP protocol
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String url = request.getRequestURI().toString();
		System.out.println(url);
		// Validation
//		if (url.contains("/restricted")) {
//			response.sendRedirect(request.getServletContext().getContextPath() + "/login.xhtml");
//		}else{
//			arg2.doFilter(request, response);
//		}	 

		arg2.doFilter(request, response);
	}

//	private <T> T getBean(String beanName) {
//
//		return (T) FacesContext.getCurrentInstance().getApplication().getELResolver()
//				.getValue(FacesContext.getCurrentInstance().getELContext(), null, beanName);
//
//	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public  void destroy() {}

}
