import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList; 
public class Queue2{
public static void main(String args[]){
Queue<Integer>q=new LinkedList<>();
q.offer(1);
q.offer(2);
q.offer(3);
q.offer(4);
q.offer(5);
q.offer(6);
System.out.println(q);
Stack<Integer>s=new Stack<>();
s.push(q.poll());
s.push(q.poll());
s.push(q.poll());
s.push(q.poll());
s.push(q.poll());
s.push(q.poll());
System.out.println(s);
Queue<Integer>q1=new LinkedList<>();
q1.offer(s.pop());
q1.offer(s.pop());
q1.offer(s.pop());
q1.offer(s.pop());
q1.offer(s.pop());
q1.offer(s.pop());
System.out.println(q1);
}
}

for(int i =0;i<n;i++){
pq.offer(s.nextInt());iff(i<2){
System.out.println(-1);
}
else{
int first = pq.poll();
int second = pq.poll();
int third = pq.poll();
int res = first*