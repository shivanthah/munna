package sample.design;

public class BasicValidator implements Validator {

    @Override
    public boolean validate(String request) {
        return !request.isEmpty();
    }
}
