package sample.design;

public abstract class ValidatorDecorator implements Validator {
    Validator validator;

    public ValidatorDecorator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public boolean validate(String request) {
        return validator.validate(request);
    }
}
