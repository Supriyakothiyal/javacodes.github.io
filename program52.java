class greatest{
public static void main(String arg[]) throws java.io.IOException{
java.io.InputStreamReader isr= new java.io.InputStreamReader(System.in);
java.io.BufferedReader br= new java.io.BufferedReader(isr);
System.out.print("ENTER Number1: ");
String s = br.readLine();
int n1= Integer.parseInt(s);
System.out.print("\nENTER Number2: ");
String s1 = br.readLine();
int n2= Integer.parseInt(s1);
System.out.print("\nENTER Number3: ");
String s2 = br.readLine();
int n3= Integer.parseInt(s2);
if((n1>n2) && (n1>n3)){
System.out.println(n1+" is greatest number");
}
else if((n2>n1) && (n2>n3)){
System.out.println(n2+" is greatest number");
}
else{System.out.println(n3+" is greatest number");}
}}