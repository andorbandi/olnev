module dev.tanto {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens dev.tanto to javafx.fxml;
    exports dev.tanto;
}
