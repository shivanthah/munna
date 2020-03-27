package sample.design.a;

import sample.design.Parser;

public class ParserA implements Parser {
    @Override
    public String covertRequest(String request) {
        System.out.println("Parse request from our format to vender A format");
        return request.toUpperCase();
    }

    @Override
    public String covertResponse(String response) {
        System.out.println("Parse response from vender A format to our format");
        return response.toLowerCase();
    }
}
