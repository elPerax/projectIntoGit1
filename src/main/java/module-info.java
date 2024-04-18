module org.example.projectintogit1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.projectintogit1 to javafx.fxml;
    exports org.example.projectintogit1;
}