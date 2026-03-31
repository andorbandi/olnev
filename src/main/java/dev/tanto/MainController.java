package dev.tanto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onClickAboutButton(ActionEvent event) {
        System.out.println("Névjegy...");
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickSearchButton(ActionEvent event) {
        System.out.println("Keresés...");
        App.setRoot("nameScene");
    }

}
