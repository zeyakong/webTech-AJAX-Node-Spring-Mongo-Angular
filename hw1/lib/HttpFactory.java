package hw1.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class HttpFactory {
    public static HttpRequest createRequest() {
        // TO-DO: implement this method.  This method is almost certainly one line of code.
        return null;
    }

    public static HttpResponse createResponse() {
        // TO-DO: implement this method.  This method is almost certainly one line of code.
        return null;
    }

    public static HttpHandler createHandler() {
        // TO-DO: implement this method.  This method is almost certainly one line of code.    s
        return null;
    }

    public static void convertRawToRequestObject(BufferedReader rawRequest, HttpRequest request ) throws IOException, URISyntaxException {
        // TO-DO: implement this method.  This method will be longer.  It takes a valid HTTP request "string" (contained in the rawRequest object), parses it, and puts the data into the request
    }

    public static String convertResponseToHttp( HttpResponse response ) {
        // TO-DO: implement this method.  This method takes a response object and generates a valid HTTP Response string.
        return null;
    }
}