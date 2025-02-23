class Factorial{
	public static void main(String args[]){
		Factorial obj=new Factorial();
	long a=obj.factorialforloop();
	long b=obj.factorialwhileloop();
	long c=obj.factorialrecursive(5);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}

 	long factorialforloop(){
 	 long T = System.nanoTime();
 		int number = 5; 
        	long factorial = 1;
        	for (int i = 1; i <= number; i++) {
            	factorial *= i;
        	}
        	
         long result=System.nanoTime()-T; 
         return result;
 	}
 	
 	long factorialwhileloop(){
 	  long T = System.nanoTime();
 	  int number = 5; 
          long factorial = 1;
          int i = 1;
          while (i <= number) {
            factorial *= i;
            i++;
          }
          long result=System.nanoTime()-T;
         return result;
 	}
 	
 	long factorialrecursive(int n){
 	 long T=System.nanoTime();
 	  if (n == 0) {
            return System.nanoTime()-T; 
            
        } else {
            return n * factorialrecursive(n - 1); 
        }
        
 	} 
}
