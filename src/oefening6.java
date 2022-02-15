public class oefening6 {
    public static String changeXY(String str)
    {
        if(str.length()==1)
        {
            if(str.charAt(0) == 'x') return "y";
            else
                return str;
        }
        else
        {
            if(str.charAt(0) =='x')
                return 'y'+ changeXY(str.substring(1));
            else
                return str.charAt(0) + changeXY(str.substring(1));
        }
    }
    public static void main(String []args)
    {
        System.out.println(changeXY("xsxx"));
    }
}
