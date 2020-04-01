package sample.design.a;

import sample.design.Validator;
import sample.design.ValidatorDecorator;

public class AProfileCreateValidator extends ValidatorDecorator {
    public AProfileCreateValidator(Validator validator) {
        super(validator);
    }

    @Override
    public boolean validate(String request) {
        //Vender A additional validate + basic validate
        System.out.println("Addtional Vender A validation ");
        return super.validate(request) && request.length() > 3;
    }
}
