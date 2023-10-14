

import java.io.*;
public class List{
public static void main(String[] args){
int list[] = new int[10];
int i, num = 0;
String input ="";

BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
for(i = 0; i < 10; i++){
list[i] = 0;
}
for(i = 0; i < 10; i++){
System.out.print("Input Value for List [ " + i + " ] =  ");
try{
input = in.readLine();
}catch(IOException e){}
num =Integer.parseInt(input);
list[i] = num;
}
for(i = 0; i < 10; i++){
System.out.println("List[ " + i +"]= "+ list[i]);

}



}
}
