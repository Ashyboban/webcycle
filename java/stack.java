import java.util.Stack;
public class stack {
    public static void deletepos(Stack<String> stack,int position) {
        if(position>=1&&position<=stack.size())
        {
            Stack<String> temp=new Stack<>();
            for(int i=1;i<position;i++)
            {
                temp.push(stack.pop());
            }
            stack.pop();
            while (!temp.isEmpty()) {
                stack.push(temp.pop());

            }
        }
    }
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("element a");
        stack.push("element b");
        stack.push("element c");
        stack.push("element d");
        stack.push("element e");
        System.out.println("befor stack:"+stack);
        int pos=3;
        deletepos(stack,pos);
        System.out.println("after stack"+stack);




    }
}
