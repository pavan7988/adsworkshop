import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueue2{
public static void main(String args[]){
PriorityQueue<Integer>pq=new PriorityQueue<Integer>(Collections.reverseOrder());
pq.add(1);
pq.add(2);
pq.add(3);
pq.add(4);
pq.add(5);
System.out.println(pq);
int f1=pq.poll();
int f2=pq.poll();
int f3=pq.poll();
System.out.println(pq);
int s= f1*f2*f3;
ArrayList<Integer>a1=new ArrayList<>();
a1.add(s);
if(pq.size()<2){
System.out.println(-1);
}
else{
System.out.println(s);
}
}
}