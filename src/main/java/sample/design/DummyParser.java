package sample.design;

public class DummyParser implements Parser {
    @Override
    public String covertRequest(String request) {
        return request;
    }

    @Override
    public String covertResponse(String response) {
        return response;
    }
}
