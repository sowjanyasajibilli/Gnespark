Recursion : A Function calling itself is called Recursion.

1.  Factorial Problem :

public class factorial {
    public static int fact(int n){
        if (n==0 || n==1) return 1;
        else return n * fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Factorail of "+number+" is " + fact(number));
    }
}

Output : 5
        Factorial of 5 is 120

---------------------------------------------------------------------------------------------------------------------

2. Sum of array values till ith index

public class sum_of_arrayelements {
    static int  sum_of_arrayelements_upto_index(int[] ar, int i){
        if (i == 0) return  ar[i];
        else  return ar[i] + sum_of_arrayelements_upto_index(ar,i-1);
    }
    public static void main(String[] args) {
        int[] arr = { 1,5,6,7,8,9,10,12};
        int sum = sum_of_arrayelements_upto_index(arr,2); // sample i value can be taken anything
        System.out.println(sum);
    }
}

Output : 12

----------------------------------------------------------------------------------------------------------------------

3. Fibnocci series --> 0 1 1 2 3 5 8 13 . . 

public class Fibnocci {
    public static int fib(int n ){
        if( n==0 || n== 1) return n;
        else return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.print(" "+fib(i));
        }
    }
}

Output : 9
         0 1 1 2 3 5 8 13 21 

---------------------------------------------------------------------------------------------------------------------

4. Series getting doubled --> 0 1 2 4 8 16  . . 

public class series_getting_doubled {
    public static int series_of_war(int n) {
        if (n == 0 || n == 1 || n == 2) return n;
        else return 2 * series_of_war(n-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print(" "+series_of_war(i));
        }
    }
}

Output : 5
        0 1 2 4 8 
