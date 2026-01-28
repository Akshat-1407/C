public class String_Methods {

    public static void main(String[] args) {
    
    // String = a reference data type that can store one or more characters
    //          reference data types have access to useful methods
    
    String name = "Bro";
     
    boolean result_1  =   name.equalsIgnoreCase("bro");  //  check whether string is equal or not. Not case sensitive. returns a boolean value.
    boolean result_2  =   name.equals("bro");                 //  check whether string is equal or not. Case sensitive. returns a boolean value.
    int result_3      =   name.length();                               //  gives the length of a string. retruns an integer.
    char result_4     =   name.charAt(0);                        //  gives the character at a certain index.
    int result_5      =   name.indexOf("o");                       //  gives the index of a certain character.
    boolean result_6  =   name.isEmpty();                              //  checks whether the string is empty or not.
    String result_7   =   name.toUpperCase();                          //  Convert string to uppercase.
    String result_8   =   name.toLowerCase();                          //  Convert string to lowercase.
    String result_9   =   name.trim();                                 //  remove trailing spaces.
    String result_10  =   name.replace('o', 'a');      //  replace a char with another char.
    Boolean result_11 =   name.endsWith("ro");                  //  Check whether the string ends with a certain string of char. returns a boolean value.
    

    System.out.println(result_1);
    System.out.println(result_2);
    System.out.println(result_3);
    System.out.println(result_4);
    System.out.println(result_5);
    System.out.println(result_6);
    System.out.println(result_7);
    System.out.println(result_8);
    System.out.println(result_9);
    System.out.println(result_10);
    System.out.println(result_11);

 }
 
}

