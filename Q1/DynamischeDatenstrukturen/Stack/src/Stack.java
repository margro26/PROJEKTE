public class Stack {
    //Attribute - pointer
    private Node top;


    public Stack(){
        top = null;
    }

    //Methoden
    public String getAll(){
        if (top != null){
            return top.getAll();
        }else{
            return "";
        }
    }

    public void push(String pContent){
        Node obj = new Node(pContent);
        obj.setPrevious(top);
        top = obj;
    }

    public void pop(){
        if (top != null){
            top = top.getPrevious();
        }else {
            System.out.println("piss dich!");
        }

    }

    public boolean isEmpty(){
        return top==null;
    }

    public String top(){
        if (top == null){
             return "";
        }else{
            return top.getContent();
        }
    }
}
