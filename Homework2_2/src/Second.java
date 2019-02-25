public class Second {
    public static void main(String[] args) {

        for(int i=6-1; i>=0;i--){
            for(int j=0;j<6-1-i;j++){
                System.out.print("  ");

            }
        for(int j=6-i-1;j<6;j++){
            System.out.print(" *");
        }
            System.out.println();
        }
    }
}
