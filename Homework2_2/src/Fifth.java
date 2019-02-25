public class Fifth {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++)
        {
            for (int j = i; j < 7; j++)
                System.out.print("  ");
                for (int k = 1; k < (i * 2); k++)
                    System.out.print(" *");
                    System.out.print("\n");


        }

        for (int l = 1; l <= 7; l++)
        {
            for (int m = l; m < 7; m++)
                System.out.print("  ");
            for (int n = 1; n < (l * 2); n++)
                System.out.print(" *");
            System.out.print("\n");

        }

//        for (var i = 0; i < 8; i++)
//        {
//            for (var j = 0; j < 7; j++)
//            {
//                int m = 3;
//                var ii = i < 4 ? i + 1 : i + 1 - 4;
//                Console.Write(j > m - ii && j < m + ii ? "*" : " ");
//            }
//            Console.WriteLine();
//        }



    }
}
