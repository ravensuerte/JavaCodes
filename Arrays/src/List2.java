
import java.io.*;
public class List2{
    public static void main(String[] args){
    int list[] = new int[10];
    int list2[] = new int[10];
    int list3[] = new int[10];
int i, num ;
String input ="";
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
// List 1
for(i = 0; i < 10; i++){
list[i] = 0;
}
// Input 10 scores
for(i = 0; i <10; i++){
System.out.print("Input Value for List [ " + i + " ] =  ");
try{
input = in.readLine();
}catch(IOException e){}
num =Integer.parseInt(input);
list[i] = num;
}
//2nd List
for(i = 0; i < 10; i++){
list2[i] = 0;
}
// Input 10 scores
for(i = 0; i <10 ; i++){
System.out.print("Input Value for List2 [ " + i + " ] =  ");
try{
input = in.readLine();
}catch(IOException e){}
num =Integer.parseInt(input);
list2[i] = num;
}
// Print inputted scores1
System.out.print("List1:");
for(i = 0; i < 10; i++){
System.out.print( list[i] +"\t");

}
System.out.println();
// Print inputted scores2
System.out.print("List2:");
for(i = 0; i < 10; i++){
System.out.print( list2[i] +"\t");
                
}
System.out.println();
// Print sum of  list 1 and list2
System.out.print("list3:");
    for(i = 0;i<10;i++){
    list3[i]=list[i]+list2[i];
    System.out.print(list3[i]+"\t");
    }

            
}
}
