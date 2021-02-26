import java.util.*;
class bintodec{    
static void toDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    System.out.println(decimal); 
}  
static void toBinary(int decimal){    
     int binary[] = new int[40];    
     int index = 0;    
     while(decimal > 0){    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the decimal number to be changed into binary : ");
int dec=in.nextInt();
System.out.println("The binary number is : ");
toBinary(dec);
System.out.print("Enter the binary number to be changed into decimal : ");
int bin=in.nextInt();
System.out.println("The decimal number is : ");
toDecimal(bin);
}
}