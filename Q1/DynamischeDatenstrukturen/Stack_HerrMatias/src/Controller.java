import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Stack;

public class Controller {
    @FXML
    private TextField tfIsEmpty;
    @FXML
    private TextField tfPush;
    @FXML
    private TextField tfTop;
    private Stack<String> s;

    public void btStack_onclick() {
        s = new Stack <String> ();
    }

    public void btIsEmpty_onclick() {
        if (s.isEmpty()) tfIsEmpty.setText("ja - leer!");
        else tfIsEmpty.setText("nicht leer!");
    }

    public void btPush_onclick() {
    }

    public void btPop_onclick() {
    }

    public void btTop_onclick() {
    }
}