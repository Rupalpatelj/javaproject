package SingleArray;

public class MultiDimention {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{3,4,5}};
        int b[][]={{5,6,7},{8,5,2}};
        int c[][]=new int [2][3];
        for (int i =0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]);
            }
            System.out.println("\n");
        }
        }
}
