package codealpha_tasks;
import java.util.*;
public class student_grade{
    public static void average(int[] arr,int size){
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        int avg=sum/size;
        System.out.println("Average of student's marks: "+avg);
    }
    public static void highest(int[] arr,int size){
        int max=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Highest marks:" + max);
    }
    public static void lowest(int[] arr,int size){
        int min=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("lowest marks:" + min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int index = 0;
        while (true) {
            int grade = sc.nextInt();
            if (grade == -1) 
            break;
            arr[index++] = grade;
        }
        if(index==0){
            System.out.println("No student found...");
        }
        else{
        average(arr,index);
        highest(arr,index);
        lowest(arr,index);
        }
    }
}
