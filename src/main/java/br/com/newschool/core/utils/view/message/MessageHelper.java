package br.com.newschool.core.utils.view.message;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 * @author guilherme.pacheco
 * @version 1.0 Date: 22/12/2021
 */

public class MessageHelper {

	// Add message customized
	public static void addMessage(String clientId, Severity severity, String summary, String detail) {
		FacesContext.getCurrentInstance().addMessage(clientId, new FacesMessage(severity, summary, detail));
	}

	// Add message without clientId
	public static void addMessage(Severity severity, String summary, String detail) {
		addMessage(null, severity, summary, detail);
	}

	// Add info message
	public static void addInfoMessage(String summary) {
		addMessage(null, FacesMessage.SEVERITY_INFO, summary, null);
	}

	// Add info message with detail
	public static void addInfoMessage(String summary, String detail) {
		addMessage(null, FacesMessage.SEVERITY_INFO, summary, detail);
	}

	// Add warn message
	public static void addWarnMessage(String summary) {
		addMessage(null, FacesMessage.SEVERITY_WARN, summary, null);
	}

	// Add warn message with detail
	public static void addWarnMessage(String summary, String detail) {
		addMessage(null, FacesMessage.SEVERITY_WARN, summary, detail);
	}

	// Add error message
	public static void addErrorMessage(String summary) {
		addMessage(null, FacesMessage.SEVERITY_ERROR, summary, null);
	}

	// Add error message with detail
	public static void addErrorMessage(String summary, String detail) {
		addMessage(null, FacesMessage.SEVERITY_ERROR, summary, detail);
	}

	// Add fatal message
	public static void addFatalMessage(String summary) {
		addMessage(null, FacesMessage.SEVERITY_FATAL, summary, null);
	}

	// Add fatal message with detail
	public static void addFatalMessage(String summary, String detail) {
		addMessage(null, FacesMessage.SEVERITY_FATAL, summary, detail);
	}

	// Get Faces Message
	public static FacesMessage getFacesMessage(Severity severity, String summary, String detail) {
		return new FacesMessage(severity, summary, detail);
	}

	// Get Info Faces Message
	public static FacesMessage getInfoFacesMessage(String summary) {
		return getFacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
	}

	// Get Info Faces Message with detail
	public static FacesMessage getInfoFacesMessage(String summary, String detail) {
		return getFacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
	}

	// Get Warn Faces Message
	public static FacesMessage getWarnFacesMessage(String summary) {
		return getFacesMessage(FacesMessage.SEVERITY_WARN, summary, null);
	}

	// Get Warn Faces Message with detail
	public static FacesMessage getWarnFacesMessage(String summary, String detail) {
		return getFacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);
	}

	// Get Error Faces Message
	public static FacesMessage getErrorFacesMessage(String summary) {
		return getFacesMessage(FacesMessage.SEVERITY_ERROR, summary, null);
	}

	// Get Error Faces Message with detail
	public static FacesMessage getErrorFacesMessage(String summary, String detail) {
		return getFacesMessage(FacesMessage.SEVERITY_ERROR, summary, detail);
	}

	// Get Fatal Faces Message
	public static FacesMessage getFatalFacesMessage(String summary) {
		return getFacesMessage(FacesMessage.SEVERITY_FATAL, summary, null);
	}

	// Get Fatal Faces Message with detail
	public static FacesMessage getFatalFacesMessage(String summary, String detail) {
		return getFacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail);
	}
}
