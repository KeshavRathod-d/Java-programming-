class P7keshav{
public static void main(String args[]){
P7keshav keshav=new P7keshav();
int size=2;
keshav.displayPatternK(size);
keshav.displayPatternE(size);
keshav.displayPatternS(size);
keshav.displayPatternH(size);
keshav.displayPatternA(size);
keshav.displayPatternV(size);
}
void displayPatternK(int size){
	for(int line=1;line<size+1;line++)
	{
		System.out.print("*");
			for(int space=size+2-line;space>0;space--)
			{
				System.out.print(" ");
			}
				System.out.print("*");
				System.out.print("\n");
				
	}
	for(int line=size+1;line>0;line--)
	{
	  System.out.print("*");
	   	for(int space=size+2-line;space>0;space--)
	    {
	      System.out.print(" ");
	    }
	    	System.out.print("*");
				System.out.print("\n");
	}

}

void displayPatternE(int Size)
{
for(int line=1;line<=2*Size+1;line++)
    { 
    if(line==1||line==Size+1||line==2*Size+1)  
    {
    for(int star=1;star<=2*Size+1;star++)
         { System.out.print("*");}
    }
   else
   {
   System.out.print("*");
    }
    System.out.print("\n");
   }
   }


void displayPatternS(int size)
       {
          for(int line=1;line<=size;line++)
            {
              for(int space=size-line;space>0;space--)
              {
               System.out.print(" ");
               }
               if(line==1){
               for(int star=1;star<=2*size+2;star++){
               System.out.print("*");}}
               else{
               System.out.print("*");}
                System.out.print("\n");
             }
             
             
             for(int line=1;line<size;line++)
            {
              for(int space=size-line;space<size;space++)
              {
               System.out.print(" ");
               }
               if(line==size-1){
               for(int star=1;star<=size+3;star++){
               System.out.print("*");}}
               else{
               System.out.print("*");}
                System.out.print("\n");
             }
             
             for(int line=1;line<size;line++)
            {
              for(int space=size*3-line;space<5*size+1;space++)
              {
               System.out.print(" ");
               }
               System.out.print("*");
                System.out.print("\n");
             }
             
             
             for(int line=1;line<size-1;line++)
            {
              for(int space=line-size;space<2*size;space++)
              {
               System.out.print(" ");
               }
               System.out.print("*");
               System.out.print("\n");
               
            
               }
                //System.out.print("\n");
                for(int star=1;star<=2*size+2;star++){
              {
               System.out.print("*");
              
               }
                
             }
System.out.println("");
           }

void displayPatternH(int size){
         for(int line=1;line<=2*size+1;line++){
         if(line==size+1){

           for(int star=1;star<=size+3;star++){
           System.out.print("*");
           }
         }
      else{
           System.out.print("*");
              for(int space=1;space<=size+1;space++){
                      System.out.print(" ");}
                       System.out.print("*");}
                      System.out.print("\n");
                  }
              }




void displayPatternA(int size){
for(int line=1;line<=size+1;line++){
      for(int space=0;space<=size-line;space++){
      System.out.print(" ");
         }
         if(line==size+1){
         for(int star=1;star<=2*size+1 ;star++){
        System.out.print("*");}
             System.out.print("\n");
                 }
         else{
              System.out.print("*");

       if(line==1){
           System.out.print("\n");}
         else{
           for(int space=0;space<2*(line-1)-1;space++){
                System.out.print(" ");}

           System.out.println("*");}}
}
        for(int line=1;line<=size;line++){
                System.out.print("*");
        for(int space=1;space<=2*size-1;space++)
       {System.out.print(" ");
                }
      System.out.println("*");}
 }


void displayPatternV(int size){
     for(int line=1;line<=2*size+1;line++){
         for(int space=1;space<line;space++){
       System.out.print(" ");
              }
         System.out.print("*");
          for(int space=1;space<=(2*size+1)-line;space++){
         System.out.print(" ");}

             System.out.println("*");

}
}
}

