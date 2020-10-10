module com.abysl.trader {
    requires kotlin.stdlib;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.web;

    opens com.abysl.trader.controllers to javafx.fxml;
    exports com.abysl.trader;
}
