package dev.tanto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameController {

    @FXML
    private Label countNameLabel;

    @FXML
    private TextField huNameField;

    @FXML
    private TextField itaNameField;

    @FXML
    void initialize() {
        System.out.println("Töltés...");
        int size = App.nameDictList.size();
        countNameLabel.setText(String.valueOf(size));
    }

    @FXML
    void onClickBackButton(ActionEvent event) {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        // System.out.println(App.nameDictList.get(0).getHuName());
        String huName = huNameField.getText();
        for( NameDict nameDict : App.nameDictList ) {
            if(huName.equals(nameDict.getHuName())) {
                itaNameField.setText(nameDict.getItaName());
            }
        }
    }
}