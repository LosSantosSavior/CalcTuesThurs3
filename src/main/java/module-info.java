module bsu.comp152.calctuesthurs {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens bsu.comp152.calctuesthurs to javafx.fxml;
    exports bsu.comp152.calctuesthurs;
}