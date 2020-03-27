package sample.design;

public class DummyValidator implements Validator {
    @Override
    public boolean validate(String request) {
        return true;
    }
}
