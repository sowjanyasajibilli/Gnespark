1.Print the numbers in descending order using recursion


Public void printseriesdsc(int n){

  If (n == 0) {
   System.out.print(n);                    // base case (if the series ends with 0)
    Return;
}

  If (n == 1) {                                    //base case (if the series ends with 1)
    System.out.print(n);
    Return; }

 Else {
   System.out.print(n);
   return printseriesdsc(n-1)           //  other than base case
}

inp : 7
out : 7 6 5 4 3 2 1

-----------------------------------------------------------------------------------------------------------------------------------------

2. Print the numbers in ascending-order using recursion

Public void printNumberAsc(int n){
     Int i == 0;            // if series starts from 0
      If ( i < = n){
      System.out.println(i) ;
       i++;
      Return printNumberAsc(i);          // performing recursion 
}
}

Inp : 7
out : 1 2 3 4 5 6 7

-----------------------------------------------------------------------------------------------------------------------------------------

3. Both ascending and descending

Public static int orderprint(int n){
  if (n == 0) {   		//base case
        Return;              
    } 
else {
        orderprint(n - 1);   	// for   ascending order
        System.out.print(“ “ + n);  
   }
    System.out.print(n + " ");   }    // for descending order

----------------------------------------------------------------------------------------------------------------------------------------

4.  Print the pattern using recursion

******
****
***
**
*

Public int printpattern(int n){
If  (n==1){ 					// base case
System.out.println(“*”);
Return 0;
}
Else {
System.out.println(“*”.repeat(n));       		// prints n number of stars
Return printpattern(n-1);
}
}

-------------------------------------------------------------------------------------------------------------------------------------

5. Print the pattern using recursion
*
**
****
*****
******

Public static int printpattern(int n, int i){
If (i>n) return 0;			// base case  and i starts from 1
Else{
System.out.println(“*”.repeat(i));
I++;
}
Return printpattern(n,i);
}

----------------------------------------------------------------------------------------------------------------------------------------

6. Print the pattern using recursion

1
1 2
1 2 3 
1 2 3 4
1 2 3 4 5



Public static int numberpattern(int r,int i){
    If ( i > r ) return 0				//base case,, i starts from 1 
    Else {
     For (int j = 1; j<=1 ; j++) {
           System.out.println(“ “ + j);  	// prints the number series
}	
   I ++;              // for next row
Return numberpattern(r,i)		//recursive call for other until “i” exceeds rows.
}
}

-----------------------------------------------------------------------------------------------------------------------------------------

BONUS PROBLEMS :

1.Reverse the linkedlist using recursion

Node reverselinkedlist( Node head) {
If (head == null || head.next == null) {
Return head; }
 Node newHead = revrselinkedlist(head.next);
Head.next.next = head;
Head.next = null;
Return newHead;
}

----------------------------------------------------------------------------------------------------------------------------------------

2.Reverse the array using recursion

Public static int printrevarray(int[] arr, int n){
 If (n<=0) return 0 ;
Else {
System.out.println(“ “+arr[n-1]);
Return printrevarray(arr, n-1);
}

Inp : arr = 1 2 3 4 5 
out : arr = 5 4 3 2 1
    
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
