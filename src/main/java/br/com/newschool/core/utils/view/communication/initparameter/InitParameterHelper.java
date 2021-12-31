package br.com.newschool.core.utils.view.communication.initparameter;

import javax.faces.context.FacesContext;

public class InitParameterHelper {
	
	// Return Init parameter of the web.xml
	public static String getInitParameterHelper(String keyName) {
		String result = FacesContext.getCurrentInstance().getExternalContext().getInitParameter(keyName);
		
		if (!result.isEmpty() & result != null ) {
			return result;
		}
		
		return null;
	}
	
}