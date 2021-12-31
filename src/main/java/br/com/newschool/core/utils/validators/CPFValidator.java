package br.com.newschool.core.utils.validators;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.ValidatorException;

import br.com.newschool.core.base.view.validators.ValidatorBase;
import br.com.newschool.core.utils.model.cpf.CPFValidation;
import br.com.newschool.core.utils.view.message.MessageHelper;

@FacesValidator(value = "cpfValidator")
public class CPFValidator implements ValidatorBase {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

		String cpf = (String) value;
		if(!CPFValidation.isCPF(cpf)) {
			throw new ValidatorException(MessageHelper.getErrorFacesMessage("(Validator) CPF inválido!", "Por favor, tente novamente!"));
		}
		
	}

}
