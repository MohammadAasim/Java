package InterLocal;

import java.util.Locale;

public class LocaleLangChange {
    public static void main(String[] args) {
        Locale en = new Locale("en","US");
        Locale fr = new Locale("fr","FR");
        Locale es = new Locale("es","ES");
        Locale no = new Locale("no","NO");
        Locale sv = new Locale("sv","SE");
        Locale ch = new Locale("zh","CN");

        System.out.println("English lang is represented in USA : "+en.getDisplayLanguage());
        System.out.println("English lang is represented in France : "+en.getDisplayLanguage(fr));
        System.out.println("English lang is represented in Spain : "+en.getDisplayLanguage(es));
        System.out.println("English lang is represented in Norway : "+en.getDisplayLanguage(no));
        System.out.println("English lang is represented in Sweden : "+en.getDisplayLanguage(sv));
        System.out.println("English lang is represented in CHINA : "+en.getDisplayLanguage(ch));
    }
}
