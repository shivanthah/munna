package sample.design;

import sample.design.a.ParserFactoryA;

public class AdapterImpl implements Adapter {

    Vender vender;
    ParserFactory parserFactory;
    ValidatorFactory validatorFactory;

    public void setVender(Vender vender) {
        this.vender = vender;
    }

    public void setParserFactory(ParserFactory parserFactory) {
        this.parserFactory = parserFactory;
    }

    public void setValidatorFactory(ValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
    }

    @Override
    public String createProfile(String name) throws Exception {
        Validator validator = validatorFactory.create("createProfile");
        Parser parser = parserFactory.create("createProfile");
        if (validator.validate(name)) {
            String covertRequest = parser.covertRequest(name);
            String response = vender.createProfile(covertRequest);
            return parser.covertResponse(response);
        } else {
            throw new Exception("validation failed");
        }
    }

    @Override
    public void submitDoc(String doc) throws Exception {
        Validator validator = validatorFactory.create("submitDoc");
        Parser parser = parserFactory.create("submitDoc");
        if (validator.validate(doc)) {
            String covertRequest = parser.covertRequest(doc);
            String response = vender.submitDoc(covertRequest);
        } else {
            throw new Exception("validation failed");
        }
    }
}
