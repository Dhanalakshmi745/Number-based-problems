//perfect cube 

class Perfect_cube{
public static void main(String args[]){
int n=27;
boolean iscube=false;
for(int i=1;i<n/2;i++){
int cube=i*i*i;
if(n==cube)
iscube=true;
}
if(iscube==true)
System.out.println("its a perfect cube");
else
System.out.println("its not a perfect cube");
}
}   
