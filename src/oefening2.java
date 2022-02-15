public class oefening2 {
    public static  int somCijfers(int getal)
    {   int lengte =String.valueOf(getal).toCharArray().length;
        int deling = 1;
        for(int i = 0; i < lengte-1; i ++ )
        {
            deling*=10;
        }
        if(getal%deling==0)
            return getal;
        else

            return getal/deling+somCijfers(getal%deling);
    }
    public static void main(String[]ags)
    {
        System.out.println(somCijfers(234));


    }
}
