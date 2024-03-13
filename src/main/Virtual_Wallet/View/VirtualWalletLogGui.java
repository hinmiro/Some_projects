package View;

import Controller.Controller;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;


public class VirtualWalletLogGui extends Application {
    private Controller controller;
    private static String user = "appuser";
    private static String pass = "appuser";

    @Override
    public void start(Stage stage) {
        this.controller = new Controller(this);
        GridPane pane = new GridPane();
        Label userLabel = new Label();
        TextField userField = new TextField();
        Label passwordLabel = new Label();
        PasswordField passField = new PasswordField();
        Button loginButton = new Button("Login");

        userLabel.setText("Username: ");
        userLabel.setPrefWidth(100);

        userField.setPromptText("Type username");

        passwordLabel.setText("Password: ");

        passField.setPromptText("Type password");

        pane.setHgap(20.0);
        pane.setVgap(10.0);


        pane.add(userLabel, 1,1);
        pane.add(userField, 2, 1);
        pane.add(passwordLabel, 1, 2);
        pane.add(passField, 2,2);
        pane.add(loginButton, 3, 3);

        GridPane.setMargin(loginButton, new Insets(10,10,10,10));

        Scene scene = new Scene(pane);

        stage.setMaxHeight(170);
        stage.setMaxWidth(400);
        stage.setMinHeight(170);
        stage.setMinWidth(400);
        stage.setScene(scene);
        stage.show();

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (userField.getText().equals(user) && passField.getText().equals(pass)) {
                    VirtualWalletGui gui = new VirtualWalletGui(controller);
                    stage.close();
                    gui.display();
                }
                else {
                    System.out.println("Invalid login credentials");
                }
            }
        });


    }
}
