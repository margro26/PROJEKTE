public class Node {
    //Attribute
    private String content;

    //pointer
    private Node previous;

    public Node(String pContent){
        content = pContent;
        previous = null;
    }

    public String getAll(){
        if (previous == null){
            return content.toString();
        }else {
            return content.toString()+ "\n" + previous.getAll();
        }
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrevious(Node previous) {
        this.previous = previous; }

    public Node getPrevious() {
        return previous; }

    public String getContent() {
        return content; }
}
