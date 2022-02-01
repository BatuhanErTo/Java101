import java.util.Scanner;
public class Example16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,r;
        long ntotal=1,rtotal=1,nrtotal=1;
        System.out.print("N--> ");
        n = inp.nextInt();
        System.out.print("r--> ");
        r = inp.nextInt();
        for (int i=1;i<=n;i++) {
            ntotal = ntotal * i;
        }
        for (int i=1;i<=r;i++) {
            rtotal = rtotal * i;
        }
        for (int i=1;i<=(n-r);i++) {
            nrtotal = nrtotal * i;
        }
        long result = ntotal / (rtotal*nrtotal);
        System.out.println(result);

    }
}
/* C(n,r) = n! / (r! * (n-r)!)*/
