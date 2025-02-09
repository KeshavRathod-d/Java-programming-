class Pattern{ 
 public static void main(String[] args){
 Pattern obj=new Pattern();
 obj.displayPattern(3);

 }
   void displayPattern(int num){
   
   if(num>=0){
     
     
     displayStar(num);
      System.out.print("\n");
      num-=1;
     
      displayPattern(num);
        
   
      displayStar(num);
         System.out.print("\n");
   
      if(num==2){
        displayStar(num+=1);
}
   }
   }
   
   void displayStar(int num){
   
   if(num<=3){
   System.out.print("*");
   num+=1;
   displayStar(num);
   
   }

   
   }
 }
