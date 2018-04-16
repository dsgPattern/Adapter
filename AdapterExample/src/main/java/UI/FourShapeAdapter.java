package UI;

import graphic.utils.FourSideShape;
import javafx.scene.shape.Shape;

public class FourShapeAdapter implements IShapeWithValidation{
    private FourSideShape _shape;
    public FourShapeAdapter(FourSideShape shape)
    {
       _shape=shape;
    }

    @Override
    public Shape GetObject() {
        return _shape.GetShape();
    }

    @Override
    public Boolean FitsBoundaries(double maxX, double maxY) {
        return _shape.IsVisibleOnUI(maxX, maxY);
    }
}
