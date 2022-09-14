import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class controller {
    @FXML
    private TextField tf1;
    @FXML
    private Label lb1;

    public void bt1_onClick(){
        String eingabe = tf1.getText();
        lb1.setText(eingabe);
    }
    public void bt2_onClick(){
        tf1.setText("Element für Liste eingeben!");
        lb1.setText("Hier kommt Ihre Liste hin!");
    }
}