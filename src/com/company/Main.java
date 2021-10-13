package com.company;

public class Main {

    public static void main(String[] args) {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;

        boolean e = true;

        float f = 5.1f;
        double g = 5.2;
        char h = 'h';

        System.out.println("Значение выражения ="+calcExp(5,6,2,3));
        System.out.println("Сумма находится в переделах от 10 до 20: "+checkInRange(8,3));
        checkIsPositive(-4);
        int x = 3;
        System.out.println(x+"является отрицательным: "+checkIsNegative(x));
        printGreeting("Tимур");
        checkIsLeap(1904);


        //exercise 2
        //1.
        int[] boolArray = new int[] {0,0,1,0,1,1,1,0,1,0,0,1,1};
        for(int i=0; i<boolArray.length; i++) {
            if(boolArray[i]==0)
                boolArray[i] = 1;
            else
                boolArray[i] = 0;
        }
        //2.
        int[] progression = new int[8];
        for(int i=0; i<progression.length; i++){
            progression[i] = i*3;
        }
        //3.
        int[] thirdArray = new int[] {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i=0; i<thirdArray.length; i++){
            if(thirdArray[i]<6)
                thirdArray[i] = thirdArray[i]*2;
        }
        //4.
        int[][] matrix = new int[5][5];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(i==j)
                    matrix[i][j] = 1;
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        //5.
        int[] fifthArray = new int[] {5,2,7,10,3,1,4,15,6};
        int min = fifthArray[0];
        int max = fifthArray[0];
        for(int i=1; i<fifthArray.length; i++){
            if(fifthArray[i]>max)
                max = fifthArray[i];
            else if(fifthArray[i]<min)
                min = fifthArray[i];
        }
        System.out.println("min="+min+" max="+max);
        //6.
        int[] randArray = new int[] {8,0,1,0,1,1,1,0,1,0,0,1,1,1};
        System.out.println("Сумма левой и правой части массива равны: "+checkBalance(randArray));
    }

    public static int calcExp(int a, int b, int c, int d) {
        return a*(b+(c/d));
    }

    public static boolean checkInRange(int a, int b) {
        int c = a+b;
        if(c >= 10 && c <= 20)
            return true;
        else
            return false;
    }

    public static void checkIsPositive(int a) {
        if(a >= 0)
            System.out.println("Число является положительным");
        else
            System.out.println("Число является отрицательным");
    }

    public static boolean checkIsNegative(int a) {
        if(a < 0)
            return true;
        else
            return false;
    }

    public static void printGreeting(String name) {
        System.out.println("Привет "+name);
    }

    public static void checkIsLeap(int year) {
        if(year % 4 == 0) {
            if(year % 100 != 0 || year % 400 == 0) {
                System.out.println("Год високосный");
            }
            else
                System.out.println("Год невисокосный");
        }
        else
            System.out.println("Год невисокосный");
    }

    public static boolean checkBalance(int[] array){
        boolean result = false;
        int r_sum, l_sum;
        for(int i=0; i<array.length; i++){
            r_sum = l_sum = 0;
            for(int left=0; left<=i; left++)
                l_sum += array[left];
            for(int right=i+1; right<array.length; right++)
                r_sum += array[right];
            if(l_sum == r_sum) {
                result = true;
                break;
            }
        }
        return result;
    }
}
