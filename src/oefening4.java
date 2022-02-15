public class oefening4 {
    public static int countX(String str)
    {
        if(str.length()==1)
        {
            if(str.charAt(0) == 'x') return 1;
            else
                return 0;
        }
        else
        {
            if(str.charAt(0) =='x')
                return 1+countX(str.substring(1));
            else
                return 0 + countX(str.substring(1));
        }
    }
    public static void main(String []args)
    {
        System.out.println(countX("xsxx"));
    }
}
