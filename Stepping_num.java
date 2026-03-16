class Stepping_num{
public static void main(String[] args){
int n=987657321;
int pre=0;
int next=0;
boolean isStep=true;
pre=n%10;
n=n/10;
while(n>0){
next=n%10;
if(Math.abs(next-pre)!=1){
isStep=false;
break;
}
pre=next;
n=n/10;
}
if(isStep)
System.out.println("Stepping number");
else
System.out.println("Not Stepping number");
}
} 
