public class loop{
public static void main(String args[]{
int n = 1234;
int reverse=0;
while(n>0){
int remainder = n%10;
reverse= (reverse*10)+remainder;
n=n/10;
}
if (num ==reverse){
System.out.println(num + " is a palindrome number);
}else{
System.out.println(in +" is not a palindrome number");
}
}
}
