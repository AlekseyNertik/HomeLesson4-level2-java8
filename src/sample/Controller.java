package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;

public class Controller
//        implements Initialize
{

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Button sendButton;

    public void onSendButtonClick(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
        textField.clear();
    }
//    @Override
//    public void initialize (URL location, ResourseBundle resourses) {
//        sendButton.setDefaultButton(true);
//        Platform.runLater(() -> textField.requestFocus());
//    }

}
