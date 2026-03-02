class Perfect_number{
public static void main(String args[]){
int n=6;
int i=1,sum=0;
for(;i<n;i++){
if(n%i==0){
sum+=i;
}
}
if(sum==n)
System.out.println(n+" is a perfect number");
else
System.out.println(n+" is not a perfect number");
}
}