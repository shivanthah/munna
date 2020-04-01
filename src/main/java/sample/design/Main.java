package sample.design;

import sample.design.a.*;
import sample.design.b.ParserB;
import sample.design.b.ValidatorB;
import sample.design.b.VenderB;

public class Main {
    public static void main(String[] args) throws Exception {
        //When Vender A
        Adapter build1 = new AdapterBuilder().withParserFactory(new ParserFactoryA())
                .withValidatorFactory(new ValidatorFactoryA())
                .withVender(new VenderA()).build();
        String result1 = build1.createProfile("SHIVA");
        System.out.println(result1);
        //When Vender B
       /* Adapter build2 = new AdapterBuilder().withParser(new ParserB())
                .withValidator(new ValidatorB(new BasicValidator()))
                .withVender(new VenderB()).build();
        String result2 = build2.createProfile("SHIVANTHA");
        System.out.println(result2);*/
    }
}
