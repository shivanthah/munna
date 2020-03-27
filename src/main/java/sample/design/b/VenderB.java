package sample.design.b;

import sample.design.Vender;

public class VenderB implements Vender {

    @Override
    public String createProfile(String name) {
        String s = name + " > B";
        System.out.println("Call vender api newProfile()");
        return s;
    }
}
