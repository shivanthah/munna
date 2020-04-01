package sample.design;

public interface ValidatorFactory {
    Validator create(String type);
}
