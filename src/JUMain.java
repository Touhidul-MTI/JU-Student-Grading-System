/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Touhidul_MTI
 */

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

//main class
public class JUMain extends Application {

    public static Stage window;
    static Scene welcomeScene;
    GridPane gpLogin;
    static Label logoutMessage;

    
    public static void main(String[] args) {
        launch(args);
    }

    //main/first/welcome window with properties
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Jahangirnagar University Student Grading System");

        //window.setResizable(false);
        window.setMinWidth(1215);
        window.setMinHeight(685);
        
        //window.setMaxWidth(1370);
        //window.setMaxHeight(725);
  
        //window.setFullScreen(true);
        
        window.setOnCloseRequest(e ->{ //App closing permission on red cross press
            e.consume();
            closeApp();
        });

        Label JUsgName = new Label("JU Student Grading Software");
        JUsgName.setId("libraryNameStyleId");
       
        
        //create borderpane and set all in border pane
        BorderPane bpWindow = new BorderPane();
        bpWindow.setPadding(new Insets(15, 20, 20, 20));

        Button regButton = new Button("Student Registration");
        regButton.setStyle("-fx-background-color:#383838;-fx-text-fill: #993333");//css
        regButton.setOnAction(e -> {
            StudentRegistration.studentRegistration();
        });
        
        bpWindow.setTop(JUsgName);//set on top of borderpane
        bpWindow.setAlignment(JUsgName, Pos.CENTER);
        bpWindow.setCenter(regButton);

        welcomeScene = new Scene(bpWindow, 1200, 650);
        //css set
        welcomeScene.getStylesheets().add("RegularStyle.css");
        window.setScene(welcomeScene);
        window.show();
    }

    //proper app closing
    public void closeApp() {
        boolean closePermission = Confirmation.confirm("Are You Sure You Want to Leave?");
        if (closePermission) {
            window.close();
        }
    }
}
