
public class FifthTask {
    public static void main(String[] args) {
        int k=0;
        int repeat=2;
        while (k < repeat) {
            int size = 18;
            String star = "*";
            String empty = "                ";
            int i = 0;
            int strLength = 1;
            int halfSize=size/2;
            String strAdd = "**";
            while (i < halfSize) {
                System.out.print(empty + star + empty);
                if (i <= halfSize) {
                    empty = empty.substring(strLength);
                }
                star += strAdd;
                System.out.println();
                i++;
            }
            k++;
        }
    }
}
