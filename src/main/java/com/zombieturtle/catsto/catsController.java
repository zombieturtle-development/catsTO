package com.zombieturtle.catsto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class catsController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}