package InterLocal;


import java.util.*;

public class Welcome extends ListResourceBundle
{
      static Object [][] data = {
 		    {"hello", "Default"},
		    {"bye", "byeeeeeeeeeee"}
		};
      public Object[][] getContents()
      {
	    return data;
      }
public static void main(String args[])
{
    //Welcome.getContents();
}
}