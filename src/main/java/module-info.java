module com.tomcc.infohotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tomcc.infohotel to javafx.fxml;
    exports com.tomcc.infohotel;
}