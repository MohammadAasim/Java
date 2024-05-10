package InterLocal;

import java.util.Locale;

public class Localization {
    public static void main(String[] args) {
        // Locale l = Locale.getDefault();
        // Locale l = new Locale("fr","FR");
        // Locale l = Locale.CHINA;
        Locale l = Locale.KOREA;
        System.out.println(l.getDisplayCountry());
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getDisplayName());

        System.out.println(l.getISO3Country());
        System.out.println(l.getISO3Language());

        System.out.println(l.getCountry());
        System.out.println(l.getLanguage());
    }
}
