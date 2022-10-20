import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField tfIsEmpty;
    @FXML private TextField tfPush;
    @FXML private TextField tfTop;
    @FXML private ListView lv;
    private Stack s;

    private void filllistview(){
        lv.getItems().clear();
        lv.getItems().add(s.getAll());
    }

    public void btStack_click() {
        s = new Stack();
    }

    public void btIsEmpty_click() {
        if (s.isEmpty()) tfIsEmpty.setText("ja - leer!"); else tfIsEmpty.setText("nicht leer!");
    }

    public void btPush_click() {
        if (s!=null){
            String text = tfPush.getText();
            s.push(text);
            filllistview();
        }
    }

    public void btPop_click() {
        if (s!=null){
            s.pop();
            filllistview();
        }
    }

    public void btTop_click() {
        String text = s.top();
        tfTop.setText(text);
        s.top();
    }
}