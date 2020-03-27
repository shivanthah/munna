package sample.design;

public class AdapterBuilder {
    Vender vender;
    Parser parser;
    Validator validator;

    public AdapterBuilder withVender(Vender vender){
        this.vender = vender;
        return this;
    }

    public AdapterBuilder withParser(Parser parser){
        this.parser = parser;
        return this;
    }

    public AdapterBuilder withValidator(Validator validator){
        this.validator = validator;
        return this;
    }
    public Adapter build(){
        AdapterImpl adapter = new AdapterImpl();
        if ((parser != null)) {
            adapter.setParser(parser);
        } else {
            adapter.setParser(new DummyParser());
        }
        if ((validator != null)) {
            adapter.setValidator(validator);
        } else {
            adapter.setValidator(new DummyValidator());
        }
        adapter.setValidator(validator);
        adapter.setVender(vender);
        return adapter;
    }
}
