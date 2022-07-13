class numbers
 {
  public static void main(String args[])
   {
     System.out.println(krishnamurthy(145));//40585
     System.out.println(power(2,5)); 
     print(5);  
     operators(5);
automorphic(9376);
     for(int i = 100;i<10000;i++)
     {
      perfect(i);
     }  
   Complex_Numbers n1 = new Complex_Numbers(4,5);
    Complex_Numbers n2 = new Complex_Numbers(4,5);
     n1.print(n2);
    }
 public static boolean krishnamurthy(int n)
{
  int rem , val = 1;int temp,sum=0;
  temp = n;
  while(temp>0)
 {
  rem = temp %10;
   val=factorial(rem);
   sum = sum + val;
  temp = temp / 10;
 } 
   if(sum == n)
    return true;
 return false;
 }

 public static int factorial(int n)
 {
   int val1 = 1;
   if(n==0 || n==1)
   return 1; 
   val1 = n * factorial(n-1);
   return val1;
 }
//********Power**********//
  public static double power(int x, int n)
  {
    double exp=x;
    if (n==0)
    return 1;
    else if(n==1)
    return exp;
    return exp *= power(x,n-1);
  }

  public static void print(int n){
		//Write your code here
        if(n==0){
            System.out.println();
            return;
}
        print(n-1);
        System.out.println(n);
}

     public static void operators(int n)
{
  int a=n++;
  System.out.println(a);
  System.out.println(n);
}
 public static void automorphic(int n)
  {
    int temp;int c=0;
    long exp = n * n;
    temp = n;
    while(temp>0)
    {
      temp = temp/10;
      c++;
    }
    double div=power(10,c);
    if((double)exp%div==n)
     System.out.println(n+"is automorphic");
    
}
   public static void perfect(int n)
  {
    int sum = 0;
    for(int i =1;i<=n/2; i++)
    {
     if(n%i == 0)
     sum = sum +i;
    } 
    if(sum==n)
    System.out.println(n+" is perfect number");
}
}