package sample.design.a;

import sample.design.BasicValidator;
import sample.design.ParserFactory;
import sample.design.Validator;
import sample.design.a.AProfileCreateValidator;

public class ParserFactoryA implements ParserFactory {

   public Validator createValidate(String type) {
        switch (type) {
            case "createProfile":
                return new AProfileCreateValidator(new BasicValidator());
            case "submitDoc":
                return new ASubmitDocValidator(new BasicValidator());
            default:
                return new BasicValidator();
        }
    }
}
