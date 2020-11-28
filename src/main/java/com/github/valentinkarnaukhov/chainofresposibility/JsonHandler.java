package com.github.valentinkarnaukhov.chainofresposibility;

/**
 * @author Valentin Karnaukhov
 */
public class JsonHandler extends Handler<Item> {

    @Override
    Item handle(String body) {
        if (body == null) {
            return null;
        } else if (body.startsWith("{") && body.endsWith("}")) {
            return new Item(body.replaceAll("\\{\"name\" : \"", "").replaceFirst("\"}", ""));
        }
        return super.handleNext(body);
    }
}
