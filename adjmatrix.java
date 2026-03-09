import java.io.*;
import java.util.*;
public class adjmatrix{
    public static void main(String [] args)throws IOException{
        Scanner input=new Scanner(new File("graph.txt"));
        ArrayList<Integer> arr=new ArrayList<>();
        while(input.hasNext()){
            arr.add(input.nextInt());
        }
        int max=0;
        for(int i=0;i<arr.size();++i){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        int[][] mat = new int [max+1][max+1];
        for(int i=0;i<mat.length;++i){
            for(int j=0;j<mat.length;++j){
                mat[i][j]=0;
            }
        }
        for(int i=0;i<arr.size()-1;i+=2){
            int a=arr.get(i);
            int b=arr.get(i+1);
            mat[a][b]=1;
            mat[b][a]=1;
        }
        System.out.print(" ");
        for(int i=0;i<mat.length;++i){
            System.out.print(" "+i);
        }
        System.out.println();
        for(int i=0;i<mat.length;++i){
            System.out.print(i+" ");
            for(int j=0;j<mat.length;++j){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}