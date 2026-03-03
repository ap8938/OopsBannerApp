
public class OopsBannerApp {

    public static void main(String[] args) {

        String[] lines = {
            String.join("   ",
                "  *****  ",   
                "  *****  ",   
                " ******  ",   
                "  *****  "    
            ),

            String.join("   ",
                " **   ** ",   
                " **   ** ",   
                " **   ** ",   
                " **      "    
            ),

            String.join("   ",
                " **   ** ",   
                " **   ** ",   
                " ******  ",   
                "  *****  "    
            ),

            String.join("   ",
                " **   ** ",   
                " **   ** ",   
                " **      ",   
                "       ** "   
            ),

            String.join("   ",
                " **   ** ",   
                " **   ** ",   
                " **      ",   
                " **   ** "    
            ),

            String.join("   ",
                "  *****  ",   // O
                "  *****  ",   // O
                " **      ",   // P
                "  *****  "    // S
            ),

            String.join("   ",
                "          ",
                "          ",
                "          ",
                "          "
            )
        };
        
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
