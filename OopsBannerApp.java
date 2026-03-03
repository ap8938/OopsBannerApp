/*public class OopsBannerApp
{
    public static void main(String[] args)
    {
        String[] lines = new String[7];

        lines[0]=String.join(" ","   ***  "  , "   ***  " ,  " *******  " , "  *****");
        lines[1]=String.join(" ","  ** ** "  , "  ** ** " ,  " **     **" , " **");
        lines[2]=String.join(" "," **   **"  , " **   **" ,  " **     **" , " **");
        lines[3]=String.join(" "," **   **"  , " **   **" ,  " *******  " , " *****");
        lines[4]=String.join(" "," **   **"  , " **   **" ,  " **       " , "      **");
        lines[5]=String.join(" ","  ** ** "  , "  ** ** " ,  " **       " , "      **");
        lines[6]=String.join(" ","   ***  "  , "   ***  " ,  " **       " , "  *****");

        for (String line:lines)
        {
            System.out.println(line);
        }
    }
}*/

public class OopsBannerApp {

    public static String[] getOPattern() {
        return new String[]{
            "  *****  ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "  *****  ",
            "         "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
            " ******  ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      ",
            "         "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
            "  *****  ",
            " **      ",
            "  *****  ",
            "       **",
            " **   ** ",
            "  *****  ",
            "         "
        };
    }

    public static void main(String[] args) {
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ", o1[i], o2[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}