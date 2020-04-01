package sample.design;

public class AdapterBuilder {
    Vender vender;
    ParserFactory parserFactory;
    ValidatorFactory validatorFactory;

    public AdapterBuilder withVender(Vender vender) {
        this.vender = vender;
        return this;
    }

    public AdapterBuilder withParserFactory(ParserFactory parserFactory) {
        this.parserFactory = parserFactory;
        return this;
    }

    public AdapterBuilder withValidatorFactory(ValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
        return this;
    }

    public Adapter build() {
        AdapterImpl adapter = new AdapterImpl();
        adapter.setParserFactory(parserFactory);
        adapter.setValidatorFactory(validatorFactory);
        adapter.setVender(vender);
        return adapter;
    }
}
