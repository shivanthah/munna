package sample.design;

/*
The Adapter pattern is used for connecting two incompatible interfaces that otherwise cannot be connected directly.
 */
public interface Adapter {

    String createProfile(String name) throws Exception;

}
