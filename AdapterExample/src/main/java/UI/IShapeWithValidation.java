package UI;

import javafx.scene.shape.Shape;

public interface IShapeWithValidation {
    Shape GetObject();
    Boolean FitsBoundaries(double maxX, double maxY);
}
