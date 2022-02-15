public class oefening3 {
    public static String keerOm(String str)
    {
        if(str.length()==1)
            return str;
        else
        {
            char c = str.charAt(str.length()-1);

            return c+keerOm(str.substring(0,str.length()-1));
        }


    }
    public static void main(String[] args)
    {
        System.out.println(keerOm("abcd"));
    }
}
