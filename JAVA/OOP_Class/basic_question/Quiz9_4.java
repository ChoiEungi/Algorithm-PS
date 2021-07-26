public class Quiz9_4 {
    public static void main(String[] args){
        int[][] arr = { { 3, 5, 9 }, { 2, 11, 5 }, { 8, 30, 10 }, { 22, 5, 1 } };
        int i,j,sum=0;
        for (i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];

            }
            System.out.println("");
        }
        System.out.println(sum);






    }
}
