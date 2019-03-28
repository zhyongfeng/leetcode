package code2019;
/*
写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项
f(0) = 0                 n=0
f(1) = 1                 n=1
f(n) = f(n-1) + f(n-2)   n>1

0,1,1,2,3,5,8,13...

 */
public class code20190328 {

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

    public static void main(String[] args) {
        System.out.println(Fibonacci(7));
    }
}
