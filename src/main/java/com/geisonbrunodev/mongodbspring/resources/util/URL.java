package com.geisonbrunodev.mongodbspring.resources.util;

public class URL {

    public static String decodeParam(String text) {
        try {
            return java.net.URLDecoder.decode(text, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            return "";
        }
    }

}

