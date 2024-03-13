package View;

import Controller.Controller;
import Model.VirtualWalletModel;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class VirtualWalletGui {
    private Controller controller;
    private VirtualWalletModel engine;
    private Label availableAmount;

    public VirtualWalletGui(Controller c) {
        controller = c;
    }

    public void display() {
        GridPane pane = new GridPane();
        Stage stage = new Stage();
        Label header = new Label();
        Label availableLabel = new Label();
        availableAmount = new Label();

        header.setText("Virtual Wallet");
        header.setFont(Font.font(30));

        availableLabel.setText("Available funds: ");
        availableLabel.setPrefWidth(100);

        availableAmount.setText(String.format("%.2f", controller.getAmount()));

        pane.setHgap(20);
        pane.setVgap(10);

        pane.add(header, 1, 1);
        pane.add(availableLabel, 2, 1);
        pane.add(availableAmount, 2, 2);

        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.show();
    }

    public void updateAmount(double amount) {
        availableAmount.setText(String.format("%.2f", amount));
    }
}
