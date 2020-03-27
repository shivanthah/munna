package sample.design.a;

import sample.design.Vender;

public class VenderA implements Vender {

    @Override
    public String createProfile(String name) {
        String s = name + " > A";
        System.out.println("call vender api create()");
        return s;
    }
}
