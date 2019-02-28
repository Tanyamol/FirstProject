public class SecondTask {
    public static void main(String[] args) {
        int size=8;
        String star="*****************";
        String empty=" ";
        int i=0;
        int strLength=2;
        String strAdd="  ";
        while(i<size+1){
            System.out.print(empty+star);
            empty+=strAdd;
            if(i==size){
                break;
            }
            star=star.substring(strLength);
            System.out.println();
            i++;
        }
    }
}
