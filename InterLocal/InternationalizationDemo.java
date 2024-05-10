package InterLocal;
import java.util.Locale;
import java.util.ResourceBundle;  
class InternationalizationDemo {  
 public static void main(String[] args) {  
  
Locale l = new Locale("zh", "CN");
  ResourceBundle bundle = ResourceBundle.getBundle("Welcome", l);  
  System.out.println("Message in "+bundle.getString("greeting"));  
  
Locale l1=new Locale("es","ES");
ResourceBundle bun1=ResourceBundle.getBundle("Welcom",l1);
  System.out.println("Message in "+bun1.getString("greeting"));  
 }  
}  