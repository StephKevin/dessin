//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nL, numL;
        int nEsp;
        char et = '*';
        int j;
        System.out.print("entrez nombre de ligne: ");
        Scanner lectureClavier = new Scanner(System.in);
        nL = lectureClavier.nextInt();
        for (numL=0; numL<nL; numL++){
            nEsp = nL - numL - 1 ;
            for (j=0;j<=nEsp;j++){
                System.out.println(' ');
            }
            for (j=0;j<2*numL+1;j++){
                System.out.print(et);
            }
        }
    }
}