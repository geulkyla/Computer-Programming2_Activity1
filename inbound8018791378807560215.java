package GeulRemovingWhiteSpaceFromAString;

public class RemovingWhiteSpaceFromAString {


public static void main(String[] args)
    {
        String str = "        w h i t e s p a c e      ";
       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);
    }
}