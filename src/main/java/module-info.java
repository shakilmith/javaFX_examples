module com.company.javafx_examples {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.javafx_examples to javafx.fxml;
    exports com.company.javafx_examples;
}