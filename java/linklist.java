import java.util.LinkedList; 
public class linklist {
   public static void main(String[] args) {
    LinkedList<String> l=new LinkedList<>();
    l.add("gold");
    l.add("silver");
    l.add("bronze");
    l.add("diamond");
    System.out.println("list:"+l);
    l.remove("gold");
    System.out.println("list:"+l);
l.remove(2);
System.out.println("list:"+l);
l.removeFirst();
System.out.println("list:"+l);




   } 
}
