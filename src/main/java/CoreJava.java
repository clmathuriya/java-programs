
public class CoreJava {

    public static void main(String[] args) {

        System.out.print(numberOfDigits(12345));



    }

public static int numberOfDigits(int n) {
    if (n==0) return 0;
    return 1+ numberOfDigits(n/10);
}


public static int factorial(int n) {
    if(n==1) return 1;

    return n*factorial(n-1);
}

    public static int max(int a, int b) {

        if(a>b) return a;
        System.out.println("A is smaller");
        return b;
    }

    public static int round(double n) {

        int l =(int) n;  //7.4 >> 7
        int h= (int)(n+0.5); // 7.9 >> 7
        if(l==h) return l;
        return h;

    }

    public void An2DArray() {
        int[][] a = { { 1, 2 }, { 2, 3, 4 }, { 3, 4, 5, 6 } };
        int x=5; int y=6;

        for (int i = 0; i < a.length; i++) {

            for(int j=0;j<a[i].length;j++) {

                if(a[i][j]==x || a[i][j]==y)
                System.out.println(a[i][j]);


            }

        }
    }

}
