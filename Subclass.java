class Parentclass{
int num=100;
}
class Subclass{
int num=100;
void print number(){
System.out.println(super.num());
}
public static void main(String[] args){
subclass obj=new Subclass();
obj.print number();
}