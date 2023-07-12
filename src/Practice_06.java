import java.util.Scanner;

public class Practice_06 {
    public static void main(String[] args) {

        // Problem 1- Calculating sum of array of 5 flats
        /*
        int [] flats = new int[5];
        flats[0] = 100;
        flats[1] = 101;
        flats[2] = 102;
        flats[3] = 103;
        flats[4] = 104;
        int sum=flats[0]+flats[1]+flats[2]+flats[3]+flats[4];
        System.out.println(sum);

         */

        // Problem 2- Finding out whether an integer is present in array or not
        /*
        int[] marks = {45, 67, 63, 99, 100};
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int element:marks) {
            if (a == element) {
                System.out.println("Element is present in array");
                break;
            }
            else {
                System.out.println("Element is not present in array");
                break;
            }
        }

         */

        //Problem 3- Calculating average marks of 5 students in Physics
        /*
        int [] marks = new int[5];
        marks[0] = 100;
        marks[1] = 95;
        marks[2] = 97;
        marks[3] = 90;
        marks[4] = 86;
        int sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        System.out.println("total marks are");
        System.out.println(sum);
        int avg = sum/5;
        System.out.println("Average marks are");
        System.out.println(avg);

         */

        // Problem 4-Addition of two matrices
        /*
        int[][] matrix1;
        matrix1 = new int[2][3];
        matrix1[0][0] = 101;
        matrix1[0][1] = 102;
        matrix1[0][2] = 103;
        matrix1[1][0] = 201;
        matrix1[1][1] = 202;
        matrix1[1][2] = 203;

        System.out.println("Matrix 1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        int[][] matrix2;
        matrix2 = new int[2][3];
        matrix2[0][0] = 103;
        matrix2[0][1] = 313;
        matrix2[0][2] = 428;
        matrix2[1][0] = 134;
        matrix2[1][1] = 234;
        matrix2[1][2] = 344;


        System.out.println("Matrix 2");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
            }

        int[][] matrixSum;
        matrixSum = new int[2][3];
        matrixSum[0][0] =matrix1[0][0]+matrix2[0][0];
        matrixSum[0][1] =matrix1[0][1]+matrix2[0][1];
        matrixSum[0][2] =matrix1[0][2]+matrix2[0][2];
        matrixSum[1][0] =matrix1[1][0]+matrix2[1][0];
        matrixSum[1][1] =matrix1[1][1]+matrix2[1][1];
        matrixSum[1][2] =matrix1[1][2]+matrix2[1][2];

        System.out.println("Matrix Sum");
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[i].length; j++) {
                System.out.print(matrixSum[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

         */

        // Problem 5-array reversal
        /*
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

         */

        // Problem 6- Finding the maximum element of an array
        /*
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);

         */

        // Problem 7- Finding the minimum element of an array
        /*
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int min = Integer.MAX_VALUE;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("the value of the minimum element in this array is: "+ min);

         */

        // Problem 8- Finding whether an array is sorted or not
        int [] arr = {100, 36, 25, 15, 7};
        for (int i=0;i<=arr.length;i++){
            if(arr[i] > arr[i+1])
            {
                System.out.println("Array is sorted");
                break;
            }
            else
            {
                System.out.println("Array is not sorted");
                break;
            }
        }


    }
    }
