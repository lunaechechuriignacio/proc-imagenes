package untref;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class MenuBarCreate {
	MenuBar menuBar;

	ImageView image1;

	public MenuBarCreate(ImageView image1) {

		this.menuBar = new MenuBar();
		this.image1 = image1;

	}

	private Menu menuFileCreate() {

		Menu fileMenu = new Menu("Archivo");
		MenuItem openMenuItem = new MenuItem("Abrir");
		MenuItem saveMenuItem = new MenuItem("Guardar");
		this.eventOpenItemMenu(openMenuItem);
		this.eventSaveItemMenu(saveMenuItem);

		fileMenu.getItems().addAll(openMenuItem, saveMenuItem);

		return fileMenu;
	}

	public MenuBar getMenuBar() {
		this.menuBar.getMenus().addAll(this.menuFileCreate());

		return this.menuBar;
	}

	private void eventOpenItemMenu(MenuItem openMenuItem) {

		openMenuItem.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				FileChooser fileChooser = new FileChooser();
				fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"));
				File selectedFile = fileChooser.showOpenDialog(null);

				if (selectedFile != null) {

					image1.setImage(new Image("file:/" + selectedFile.getAbsolutePath()));

				} else {
					System.out.println("HAY QUE LANZAR UNA ALERTAAAA");
					// actionStatus.setText("File selection cancelled.");
				}

			}
		});

	}

	private void eventSaveItemMenu(MenuItem saveMenuItem) {

	}
}
