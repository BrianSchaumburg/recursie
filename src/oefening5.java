public class oefening5 {
    public static int countHI(String str)
    {
        if(str.length()==2)
        {
            return str.equals("hi") ? 1:0;
        }
        else
        {
            if(str.substring(0,2).equals("hi"))
                return 1+countHI(str.substring(1));
            else
            {
                return 0+countHI(str.substring(1));
            }
        }
    }
    public static void main(String[]arg)
    {
        System.out.println(countHI("hiahibhihi"));
    }
}
