package br.com.newschool.core.utils.view.communication.flash;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;

/**
 * @author guilherme.pacheco
 * @version 1.0
 * Date: 21/12/2021
 * */

public class FlashHelper {

	// Set Flash Value of the Faces Context    
	public static void setFlashValue (String Key, Object value) {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		flash.put(Key, value);
	} 
	
	// get Flash Value of the Faces Context  
	public static Object getFlashValue(String Key) {
		Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		return (Object) flash.get(Key);
	}
}
