package jp.te4a.spring.boot.myapp13.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<Writter,String>{
	String ok;
	@Override
	public void initialize(Writter wo) {
		ok = wo.ok();
	}
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return false;
		}
		System.out.println(!ok.equals(ok));
		return value.equals(ok);
	}
}
