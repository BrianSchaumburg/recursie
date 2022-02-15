public class oefening7 {
    public static String changePI(String str)
    {   if(str.length()==1)
    {
        return str;
    }
        else if(str.length()==2)
    {
        if(str.equals("pi"))
        {
            return "3.14";

        }
        else
            return "";
    }
        else
        {
            if(str.substring(0,2).equals("pi"))
            {

                return "3.14"+changePI(str.substring(2));
            }
            else
            {
                return str.charAt(0) + changePI(str.substring(1));

            }
        }
    }
    public static void main(String[]args)
    {
        System.out.println( changePI("pip"));
    }
}
