package sample.design.a;

import sample.design.Validator;
import sample.design.ValidatorFactory;

public class ValidatorFactoryA implements ValidatorFactory {

    @Override
    public Validator create(String type) {
        //same as parse implementation
        return null;
    }
}
