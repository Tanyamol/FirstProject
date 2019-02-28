public class FourthTask {
    public static void main(String[] args) {

        int size=8;
        String star="*";
        String empty="                 ";
        int i=0;
        int strLength=2;
        String strAdd="  ";
        while(i<size){
            System.out.print(empty+star);
           // System.out.print(star);
            empty=empty.substring(strLength);
            star+="**";
            System.out.println();
            i++;
        }
        empty+="  ";
        star=star.substring(2);
        while(size-1>0){
            empty+=strAdd;
            star=star.substring(strLength);
            System.out.print(empty+star);
            System.out.println();
            size--;
        }
    }
}
