package InterLocal;

import java.util.Locale;

public class LocaleArray {
    public static void main(String[] args) {
        Locale[] lc = {new Locale("en","US"),new Locale("no","NO"),
        new Locale("sv","SE"),new Locale("fr","FR")};
        for(int i=0;i<lc.length;i++){
            String displayLanguage = lc[i].getDisplayLanguage(lc[i]);
            System.out.println(lc[i].toString()+" : "+displayLanguage);
        }
    }
}
