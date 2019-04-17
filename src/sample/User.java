package sample;

public class User {
    private String fullName;
    private Long id;
    private String gender;
    private String email;
    private String address;
    private String nationality;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    /*<Button onAction="#addButtonToDB" prefHeight="25.0" prefWidth="64.0" text="ADD" GridPane.columnIndex="10" GridPane.rowIndex="1" />
        <Button alignment="TOP_CENTER" onAction="#deleteButtonToDB" text="DELETE" GridPane.columnIndex="10" GridPane.rowIndex="2" />
        <Button alignment="BOTTOM_CENTER" onAction="#updateButtonToDB" prefHeight="25.0" prefWidth="73.0" text="UPDATE" GridPane.columnIndex="10" GridPane.rowIndex="4" />
        <Button alignment="BOTTOM_RIGHT" onAction="#getListButtonFromDB" prefHeight="25.0" prefWidth="47.0" text="GET" GridPane.columnIndex="10" GridPane.rowIndex="6" />*/
}
