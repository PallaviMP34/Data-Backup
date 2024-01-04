class MultiArray{
    public static void main(String [] args){
        int [][] matrix={{1,5,6},{8,0,3},{4,9,2}};
        for(int[] row: matrix){
            for(int value:row){
                System.out.print("\t" +value);
            }
            System.out.println();
        }
    }
}
/* for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
         System.out.print(matrix[i][j]);
            }
            System.out.println();
    }
*/