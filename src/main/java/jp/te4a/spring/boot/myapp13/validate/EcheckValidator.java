package jp.te4a.spring.boot.myapp13.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EcheckValidator implements ConstraintValidator<EcheckValid,String>{
	String param;
	@Override
	public void initialize(EcheckValid nv) {
		 param =  nv.param();
	}
	
	@Override
	public boolean isValid(String in, ConstraintValidatorContext cxt) {
		if(in == null) {
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
	}

}
