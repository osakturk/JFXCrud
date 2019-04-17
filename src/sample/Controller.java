package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField         address, fullName, email, nation, idNumber;
    @FXML
    private CheckBox          maleCheckBox;
    @FXML
    private CheckBox          femaleCheckBox;
    @FXML
    private CheckBox          otherCheckBox;
    @FXML
    private Button            addUser, deleteUser, updateUser;


    @FXML
    protected void addButtonToDB(ActionEvent event) {
        User user = new User();
        user.setFullName(fullName.getText());
        user.setEmail(email.getText());
        user.setAddress(address.getText());
        user.setId(Long.valueOf(idNumber.getText()));
        user.setNationality(nation.getText());
        if (maleCheckBox.isSelected()){
            user.setGender(maleCheckBox.isSelected() ? "Male" : "");
        }else if (femaleCheckBox.isSelected()){
            user.setGender(femaleCheckBox.isSelected() ? "Female" : "");
        }else if (otherCheckBox.isSelected()){
            user.setGender(otherCheckBox.isSelected() ? "Other" : "");
        }
        System.out.println(user.toString());
        addUser.setOnAction(event1 -> {
            // You can add method to database
        });
    }

    @FXML
    protected void deleteButtonToDB(ActionEvent event) {
        // you need to get a single user and who's id
        deleteUser.setOnAction(event1 -> {
            // You can delete user to database in here
        });
    }

    @FXML
    protected void updateButtonToDB(ActionEvent event) {
        // you need to get a single user and who's id
        updateUser.setOnAction(event1 -> {
            // You can update user to database in here
        });
    }
}



