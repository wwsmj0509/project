package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandAction {
	public String requestPro_action(HttpServletRequest request, 
			                 HttpServletResponse response) throws Throwable;
}
