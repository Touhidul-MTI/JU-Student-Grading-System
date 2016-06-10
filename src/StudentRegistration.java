

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Touhidul_MTI
 */
public class StudentRegistration {
    static Stage regStage;
    static Scene regScene;
   
    static String fullName, userName, contact, password, address;//for user
    
    static Label regMessage;
    public static void studentRegistration(){
        regStage = new Stage();
        regStage.setTitle("Student Registration");
        regStage.initModality(Modality.APPLICATION_MODAL);

        GridPane gpUserReg = new GridPane();
        gpUserReg.setPadding(new Insets(10, 10, 10, 10));
        gpUserReg.setHgap(10);
        gpUserReg.setVgap(10);

        //user registration
        Label userRegistrationL = new Label("Student Registration");
        gpUserReg.setConstraints(userRegistrationL, 1, 0);
        userRegistrationL.getStyleClass().add("headline");//css

        //fullname label
        Label fullnameL = new Label("Student Full Name");
        gpUserReg.setConstraints(fullnameL, 0, 2);
        fullnameL.getStyleClass().add("labelStyle");//css
        //fullname field
        TextField fullnameF = new TextField();
        fullnameF.setPromptText("Enter student name here");//for watermark writing
        gpUserReg.setConstraints(fullnameF, 1, 2);
        fullnameF.getStyleClass().add("textFieldStyle");
        fullnameF.setPrefWidth(250); //increasing text field width
        //automatically increase field in this form 

        //contact
        Label contactL = new Label("Email/Phone");
        gpUserReg.setConstraints(contactL, 0, 3);
        contactL.getStyleClass().add("labelStyle");//css
        //contact field
        TextField contactF = new TextField();
        contactF.setPromptText("Email or Phone");//for watermark writing
        gpUserReg.setConstraints(contactF, 1, 3);
        contactF.getStyleClass().add("textFieldStyle");

        //address
        Label addressL = new Label("Current Address");
        gpUserReg.setConstraints(addressL, 0, 4);
        addressL.getStyleClass().add("labelStyle");//css
        //address field
        TextField addressF = new TextField();
        addressF.setPromptText("Enter address here");//for watermark writing
        gpUserReg.setConstraints(addressF, 1, 4);
        addressF.getStyleClass().add("textFieldStyle");

        //dept label
        Label departmentL = new Label("Department");
        gpUserReg.setConstraints(departmentL, 0, 5);
        departmentL.getStyleClass().add("labelStyle");//css
        //dept field
        TextField departmentF = new TextField();
        departmentF.setPromptText("Enter department here");//for watermark writing
        gpUserReg.setConstraints(departmentF, 1, 5);
        departmentF.getStyleClass().add("textFieldStyle");
        
        //semister/year label
        Label semisterL = new Label("Password");
        gpUserReg.setConstraints(semisterL, 0, 6);
        semisterL.getStyleClass().add("labelStyle");//css
        //semister/year field
        TextField semisterF = new TextField();
        semisterF.setPromptText("Enter password here");//for watermark writing
        gpUserReg.setConstraints(semisterF, 1, 6);
        semisterF.getStyleClass().add("textFieldStyle");

        //Courses
        
        //label
        Label courseL = new Label("Eneter all courses");
        gpUserReg.setConstraints(courseL, 0, 7);
        courseL.getStyleClass().add("labelStyle");//css
        
        // field
        TextField course1F = new TextField();
        course1F.setPromptText("Enter a course");//for watermark writing
        gpUserReg.setConstraints(course1F, 1, 7);
        course1F.getStyleClass().add("textFieldStyle");
        // field
        TextField course2F = new TextField();
        course2F.setPromptText("Enter a course");//for watermark writing
        gpUserReg.setConstraints(course2F, 1, 8);
        course2F.getStyleClass().add("textFieldStyle");
        // field
        TextField course3F = new TextField();
        course3F.setPromptText("Enter a course");//for watermark writing
        gpUserReg.setConstraints(course3F, 1, 9);
        course3F.getStyleClass().add("textFieldStyle");
        // field
        TextField course4F = new TextField();
        course4F.setPromptText("Enter a course");//for watermark writing
        gpUserReg.setConstraints(course4F, 1, 10);
        course4F.getStyleClass().add("textFieldStyle");
        
        //submit button
        Button submit = new Button("Save");
        gpUserReg.setConstraints(submit, 1, 12);
        //message level
        regMessage = new Label();
        gpUserReg.setConstraints(regMessage, 1, 13);
        regMessage.getStyleClass().add("MessageStyle");//css


        //close registration form
        Button closeReg = new Button("Close Registration");
        gpUserReg.setConstraints(closeReg, 1, 19);
        closeReg.getStyleClass().add("closeButtonStyle");

        
        closeReg.setOnAction(e -> {
            regStage.close();
        });

        gpUserReg.getChildren().addAll(submit, fullnameL, fullnameF,
                contactL, contactF, addressL, addressF,departmentL, departmentF,courseL,
                course1F, course2F, course3F, course4F,
                userRegistrationL, regMessage, closeReg);
        gpUserReg.setAlignment(Pos.CENTER);

        regScene = new Scene(gpUserReg, 600, 600);

        regScene.getStylesheets().add("RegularStyle.css");//css

        regStage.setScene(regScene);
        regStage.showAndWait();
    }
}
