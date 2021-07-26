package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane pane = new BorderPane();
        HBox firstBox = new HBox(10);
        HBox secondBox = new HBox(10);
        TextField firstInput = new TextField();
        TextField secondInput = new TextField();

        firstBox.getChildren().add(new Label("Number 1"));
        firstBox.getChildren().add(firstInput);
        secondBox.getChildren().add(new Label("Number 2"));
        secondBox.getChildren().add(secondInput);

        VBox inputBox = new VBox(10);
        inputBox.setPadding(new Insets(11.5, 12.5 ,13.5, 14.5));
        inputBox.getChildren().add(firstBox);
        inputBox.getChildren().add(secondBox);

        pane.setTop(inputBox); //set top of the layout


        HBox btnGroup = new HBox(5);
        Button addBtn = new Button("+");
        Button subtractBtn = new Button("-");
        Button multiplyBtn = new Button("*");
        Button divideBtn = new Button("/");
        btnGroup.getChildren().add(addBtn);
        btnGroup.getChildren().add(subtractBtn);
        btnGroup.getChildren().add(multiplyBtn);
        btnGroup.getChildren().add(divideBtn);
        btnGroup.setPadding(new Insets(0, 12.5 ,13.5, 14.5));

        pane.setCenter(btnGroup); //set center of the layout

        HBox result = new HBox(5);
        result.setPadding(new Insets(0, 12.5 ,13.5, 14.5));
        result.setAlignment(Pos.CENTER);
        result.getChildren().add(new Label("Result"));
        TextField resultTextField = new TextField();
        resultTextField.setText("0");
        result.getChildren().add(resultTextField);
        pane.setBottom(result);
        resultTextField.setAlignment(Pos.BASELINE_RIGHT);

        //handle the event
        addBtn.setOnAction((ActionEvent)-> {
            double ret = Double.parseDouble(String.valueOf(firstInput.getText())) + Double.parseDouble(String.valueOf(secondInput.getText()));
            resultTextField.setText(Double.toString(ret));
        });
        subtractBtn.setOnAction((ActionEvent)-> {
            double ret = Double.parseDouble(String.valueOf(firstInput.getText())) - Double.parseDouble(String.valueOf(secondInput.getText()));
            resultTextField.setText(Double.toString(ret));
        });
        multiplyBtn.setOnAction((ActionEvent)-> {
            double ret = Double.parseDouble(String.valueOf(firstInput.getText())) * Double.parseDouble(String.valueOf(secondInput.getText()));
            resultTextField.setText(Double.toString(ret));
        });
        divideBtn.setOnAction((ActionEvent)-> {
            double ret = Double.parseDouble(String.valueOf(firstInput.getText())) / Double.parseDouble(String.valueOf(secondInput.getText()));
            resultTextField.setText(Double.toString(ret));
        });

        primaryStage.setTitle("Calc");
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

