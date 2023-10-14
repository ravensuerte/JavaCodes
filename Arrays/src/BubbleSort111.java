

import java.io.*;

public class BubbleSort111{
public static void main(String[] args){
int i, num = 0,size;
int temp =0;
String input ="";
String input1 ="";
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

System.out.print("Input size of array : ");
try{
input1 = in.readLine();
}catch(IOException e){}
size =Integer.parseInt(input1);
int list[] = new int[size];



for(i = 0; i < size; i++){
System.out.print("Input Value for List [ " + i + " ] =  ");
try{
input = in.readLine();
}catch(IOException e){}
num =Integer.parseInt(input);
list[i] = num;
}
/*
for(i = 0; i < size; i++){
System.out.println("List[ " + i +"]= "+ list[i]);

}
*/
for ( i = 0; i < list.length; i++) {     
            for (int j = i+1; j < list.length; j++) {     
               if(list[i] > list[j]) {    
                   temp = list[i];    
                   list[i] = list[j];    
                   list[j] = temp;    
               }     
            }     
        }
System.out.println("Elements of array sorted in ascending order: ");    
        for ( i = 0; i < list.length; i++) {     
            System.out.print(list[i] + " ");    
        }

}
}

