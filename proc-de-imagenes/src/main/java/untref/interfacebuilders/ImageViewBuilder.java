package untref.interfacebuilders;

import javafx.scene.image.ImageView;

public class ImageViewBuilder {
	private ImageView imageView;

	public ImageViewBuilder(String imagePath) {
		this.imageView = new ImageView(imagePath);
	}

	public ImageViewBuilder withAutosize() {
		this.imageView.autosize();
		return this;
	}

	public ImageViewBuilder withPreserveRatio(boolean preserve) {
		imageView.setPreserveRatio(true);
		return this;
	}

	public ImageViewBuilder withFitWidth(double width) {
		imageView.setFitWidth(width);
		return this;
	}

	public ImageViewBuilder withFitHeight(double height) {
		imageView.setFitHeight(height);
		return this;
	}

	public ImageViewBuilder withVisible(boolean visible) {
		imageView.setVisible(visible);
		return this;
	}

	public ImageViewBuilder withX(double x) {
		imageView.setX(x);
		return this;
	}

	public ImageViewBuilder withY(double y) {
		imageView.setY(150);
		return this;
	}

	public ImageView build(){
		return imageView;
	}
}