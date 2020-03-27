package sample.design;

public class AdapterImpl implements Adapter {

    Vender vender;
    Parser parser;
    Validator validator;

    public void setVender(Vender vender) {
        this.vender = vender;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    @Override
    public String createProfile(String name) throws Exception {
        if (validator.validate(name)) {
            String covertRequest = parser.covertRequest(name);
            String response = vender.createProfile(covertRequest);
            return parser.covertResponse(response);
        } else {
            throw new Exception("validation failed");
        }
    }


}
