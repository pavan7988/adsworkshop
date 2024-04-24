Class Test<T>{
T obj;
Test(T obj){
this.obj = obj;
}
Public T getObject(){
return this.obj;
}
Public Class Sample2{
Public static void main(String args[]){
Test<String>sobj = new Test<String>("Good Morning");
System.out.println(sobj.getobject());
}
}
