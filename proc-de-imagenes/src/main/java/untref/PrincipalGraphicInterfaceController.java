package untref;

import javafx.scene.Node;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import javafx.scene.image.ImageView;
import untref.interfacebuilders.ImageViewBuilder;

import java.util.ArrayList;
import java.util.List;

public class PrincipalGraphicInterfaceController {

	public List<Node> initInterfaceElements() {
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = new Menu("File");
		menuBar.getMenus().addAll(fileMenu, new Menu("hola"));

		MenuItem fileMenuItem = new MenuItem("open...");

		fileMenu.getItems().addAll(fileMenuItem);

		ImageView image1 = new ImageViewBuilder("default.jpg").withPreserveRatio(true).withFitWidth(500).withFitHeight(500).withVisible(true)
				.withX(50).withY(150).withAutosize().build();
		ImageView image2 = new ImageViewBuilder("default.jpg").withPreserveRatio(true).withFitWidth(500).withFitHeight(500).withVisible(true)
				.withX(580).withY(150).withAutosize().build();
		
		
		List<Node> childrens = new ArrayList<Node>();
		childrens.add(menuBar=new MenuBarCreate(image1).getMenuBar());
		childrens.add(image1);
		childrens.add(image2);
		return childrens;

	}
	
	

}