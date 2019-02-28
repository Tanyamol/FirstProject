public class ThirdTask {
    public static void main(String[] args) {
        int size=8;
        String star="*";
        String empty="                 ";
        int i=0;
        int strLength=2;
        String strAdd="**";
        while(i<size){
            System.out.print(empty+star);
            empty=empty.substring(strLength);
            star+=strAdd;
            System.out.println();
            i++;
        }
    }
}
