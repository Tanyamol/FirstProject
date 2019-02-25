public class Fourth {
    public static void main(String[] args) {

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("  ");
            }
                for (int j = i; j > 0; j--) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        for(int i=6-1; i>=0;i--){
            for(int j=0;j<6-1-i;j++){
                System.out.print("  ");
            }
        for(int j=6-i-1;j<6;j++){
            System.out.print(" *");
        }
            System.out.println();
        }


//        for (var i = 0; i < 7; i++)
//        {
//            for (var j = 0; j < 4; j++)
//            {
//                var ii = i < 4 ? 3 - i : i - 3;
//                Console.Write(j >= ii ? "*" : " ");
//            }
//            Console.WriteLine();
//        }
    }
}
