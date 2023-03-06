module com.zombieturtle.catsto {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;

    opens com.zombieturtle.catsto to javafx.fxml;
    exports com.zombieturtle.catsto;
}