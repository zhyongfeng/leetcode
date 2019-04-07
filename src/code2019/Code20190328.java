package code2019;
/*
写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项
f(0) = 0                 n=0
f(1) = 1                 n=1
f(n) = f(n-1) + f(n-2)   n>1

0,1,1,2,3,5,8,13...

 */
public class Code20190328 {

    public static long Fibonacci(int n)
    {
        int[] result = { 0, 1 };
        if (n < 2)
        {
            return result[n];
        }

        long pre = 1;
        long prePre = 0;
        long fibN = 0;

        for (int i = 2; i <= n; i++)
        {
            fibN = pre + prePre;
            prePre = pre;
            pre = fibN;
        }

        return fibN;
    }

    public static int getNum(int n){
        int preNum = 1;
        int prePreNum = 1;
        int result = 0;
        int i = 3;
        if(n ==1 || n==2){
            return 1;
        }else {
            while (i <= n){
                result = preNum + prePreNum;
                prePreNum = preNum;
                preNum = result;
                i ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getNum(0));
        System.out.println(getNum(1));
        System.out.println(getNum(2));
        System.out.println(getNum(3));
        System.out.println(getNum(4));
        System.out.println(getNum(5));
        System.out.println(getNum(6));

        System.out.println("----------");

        System.out.println(Fibonacci(0));
        System.out.println(Fibonacci(1));
        System.out.println(Fibonacci(2));
        System.out.println(Fibonacci(3));
        System.out.println(Fibonacci(4));
        System.out.println(Fibonacci(5));
        System.out.println(Fibonacci(6));

    }
}
