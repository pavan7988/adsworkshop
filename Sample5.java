import java.util.ArrayList;
import java.util.ListIterator;
public class Sample5{
public static void main(String args[]){
ArrayList<String>a1=new ArrayList<>();
a1.add("apple");
a1.add("banana");
a1.add("mango");
ListIterator<String>l1=a1.listIterator();
while(l1.hasNext()){
l1.next();
}
while(l1.hasPrevious()){
System.out.println(l1.previous());
}
}
}