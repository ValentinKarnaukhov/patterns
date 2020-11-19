package com.github.valentinkarnaukhov.brige;

/**
 * @author Valentin Karnaukhov
 */
public class Interface {

    public static void main(String[] args) {
        Protocol httpProtocol = new HttpProtocol();
        Protocol httpsProtocol = new HttpsProtocol();
        BasicApi restApi = new BasicApi(httpProtocol);
        BasicApi secureRestApi = new BasicApi(httpsProtocol);

        restApi.get();
        restApi.post("HELLO");
        restApi.put("BYE");
        restApi.delete();

        secureRestApi.get();
        secureRestApi.post("HELLO");
        secureRestApi.put("BYE");
        secureRestApi.delete();
    }

}
