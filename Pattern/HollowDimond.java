package Pattern;

public class HollowDimond {

    public static void main(String[] args) {
        solve();
    }
    public static void solve()
    {
        int line = 9;
        int space = -1;

        for(int i=1;i<=line;i++)
        {
            if(i == 1 || i== line)
            {
                for(int k=1;k<=line;k++)
                    System.out.print("*");
            }
            else
            {
                //if line no is less the or equal half of line increment space by 2
                if(i <= (line + 1) / 2)
                {
                    space = space + 2;
                }
                //if line no is less the or equal half of line decrement space by 2
                if(i > (line + 1) / 2)
                {
                    space = space - 2;
                }
                int star = line - space;

                for(int k=1;k<= star;k++)
                {
                    System.out.print("*");
                    if(k == star/2)
                    {
                        for(int s = 1;s<=space;s++)
                        {
                            System.out.print(" ");
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}
//output
//----------------
//        *********
//        **** ****
//        ***   ***
//        **     **
//        *       *
//        **     **
//        ***   ***
//        **** ****
//        *********
