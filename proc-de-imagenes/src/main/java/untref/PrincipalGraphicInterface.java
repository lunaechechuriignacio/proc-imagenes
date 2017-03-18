package untref;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PrincipalGraphicInterface extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {
		AnchorPane principalPane = new AnchorPane();
		Scene scene = new Scene(principalPane, 300, 300);
		primaryStage.setScene(scene);

		((AnchorPane) scene.getRoot()).getChildren().addAll(new PrincipalGraphicInterfaceController().initInterfaceElements());

		primaryStage.setMaximized(true);
		primaryStage.show();
	}
}