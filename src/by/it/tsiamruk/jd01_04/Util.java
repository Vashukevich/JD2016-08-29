package by.it.tsiamruk.jd01_04;


public class Util {

    public  static double[] findroot(double[][]a,double[]y){

        double x[]= new double[y.length];

        int n=a.length;
        double[][] m=new double[n][n+1];
        for (int i = 0; i <n ; i++){
            for (int j = 0; j <n ; j++) {
                m[i][j] = a[i][j];
            }
        m[i][n]=y[i];

        }
        InOut.arrayPrint2D(m);
        //прямой ход gauss
        for (int diag = 0; diag <n-1 ; diag++) {

            for (int row = diag+1; row < n; row++) {

                double k = m[row][diag] / m[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;
                }
            }
        }
        InOut.arrayPrint2D(m);
        //обратный ход gauss
        for (int diag = n-1; diag >0 ; diag--) {

            for (int row = diag-1; row >=0; row--) {

                double k = m[row][diag] / m[diag][diag];
                for (int col = 0; col < n + 1; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;
                }
            }
        }
        InOut.arrayPrint2D(m);

        //решение системы
        for (int i = 0; i <n ; i++) {
            double div=m[i][i];
            for (int j = 0; j <n+1 ; j++) {
                m[i][j]=m[i][j]/div;

            }
        }
        for (int i = 0; i <n ; i++) {
            x[i]=m[i][n];
        }
        InOut.arrayPrint2D(m);


        return x;
    }

    static double det(double[][] m){
        int n=m.length;

        for (int diag = 0; diag <n-1 ; diag++) {
            for (int row = diag+1; row < n; row++) {
                double k = m[row][diag] / m[diag][diag];
                for (int col = 0; col < n ; col++) {
                    m[row][col] = m[row][col] - m[diag][col] * k;
                }
            }
        }
         // InOut.arrayPrint2D(m);
        double res = 1;
        for (int i = 0; i < n; i++) {
            res=res*m[i][i];
        }
        return res;
    }


    static double[] mulArrVac(double a[][],double x[]){
        double y[]=new double[a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <x.length ; j++) {
                y[i]=y[i]+a[i][j]*x[j];
            }
        }
        return y;
    }

}
