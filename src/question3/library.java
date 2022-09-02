package question3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class library {
    public static void main(String[] args) {
		HashMap<Integer,Book> hm=new HashMap<>();
		hm.put(1, new Book(1,"Math", "ram"));
		hm.put(2, new Book(2,"physics", "sdh"));
		hm.put(3, new Book(3,"English", "mahsh"));
		hm.put(4, new Book(4,"geography", "shayam"));
		hm.put(5, new Book(5,"history", "ram"));

       Set<Integer> key=hm.keySet();
       System.out.println(key);
       Collection<Book> val=hm.values();
       for(Book item:val) {
    	   System.out.println(item);
       }
       
       Set<Map.Entry<Integer, Book>> keyvalue=hm.entrySet();
       for(Map.Entry<Integer, Book> item:keyvalue) {
    	   System.out.println(item.getKey()+"--------"+item.getValue());
       }
       
       
       TreeMap<Members,Integer> tm=new TreeMap<>(new Treemapcomrable());
       System.out.println("enter how many members want to add");
       Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       for(int i=0;i<n;i++) {
    	   
    	   
    	   System.out.println("Enter id M :"+(i+1));
    	   int id=input.nextInt();
    	   System.out.println("Enter name of M :"+(i+1));
    	   String name=input.next();
    	   System.out.println("Enter Membership no of M :"+(i+1));
    	   int mno=input.nextInt();
    	   System.out.println("Enter date of M : " +(i+1) +" in YYYY-MM-DD formate");
    	   String date=input.next();
    	   DateTimeFormatter dat=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	   LocalDate date1=LocalDate.parse(date, dat);
    	   
    	   Members mb=new Members(id, name, mno, date1);
    	   tm.put(mb, id);
    	   
    	   
    	   
    	   
    	   
       }
       
      Set<Members> keymeb= tm.keySet();
      for(Members item :keymeb) {
    	  System.out.println(item);
      }
       
       
	}
}
