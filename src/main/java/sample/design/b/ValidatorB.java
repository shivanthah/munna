package sample.design.b;

import sample.design.Validator;
import sample.design.ValidatorDecorator;

public class ValidatorB extends ValidatorDecorator {
    public ValidatorB(Validator validator) {
        super(validator);
    }

    @Override
    public boolean validate(String request) {
        //Vender A additional validate + basic validate
        System.out.println("Addtional Vender B validation ");
        return super.validate(request) && request.length() > 5;
    }
}
