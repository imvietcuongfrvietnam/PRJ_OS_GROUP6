package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import manager.SwitchManager;

import java.io.IOException;

public class MainController extends BaseController{
    @FXML
    private Button WFQButton;
    @FXML
    private Button RMSButton;
    @FXML
    private Button EDFButton;

    public void initialize(){
    WFQButton.setOnAction(event -> {
        try {
            SwitchManager.goWFQPage(this,event);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    });
        RMSButton.setOnAction(event -> {
            try {
                SwitchManager.goRMSPage(this,event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        EDFButton.setOnAction(event -> {
            try {
                SwitchManager.goEDFPage(this,event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
}
}
