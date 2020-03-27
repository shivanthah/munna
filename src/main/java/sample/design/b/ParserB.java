package sample.design.b;

import sample.design.Parser;

public class ParserB implements Parser {
    @Override
    public String covertRequest(String request) {
        System.out.println("Parse request from our format to vender A format");
        return request.concat("!");
    }

    @Override
    public String covertResponse(String response) {
        System.out.println("Parse response from vender B format to our format");
        return response.replace("!", "");
    }
}
