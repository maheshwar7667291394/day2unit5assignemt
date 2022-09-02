package question2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Queue<Product> pq=new PriorityQueue<>(new SortAccotoprice());
	Scanner input=new  Scanner(System.in);
	System.out.println("Enter how many product want to add");
	int n=input.nextInt();
	
	for(int i=0;i<n;i++ ) {
		System.out.println("Enter id");
		int id=input.nextInt();
		System.out.println("Enter name");
		String name=input.next();
		System.out.println("Enter prince");
		int price=input.nextInt();
		Product pd=new Product(id, name, price);
		pq.add(pd);
	}
	
	
	Iterator<Product> l1=pq.iterator();
	while(l1.hasNext()) {
		System.out.println(l1.next());
	}
}
}
