package UI;

import javafx.scene.shape.Shape;

public class Rectangle implements IShapeWithValidation {
    private int _x, _y, _width, _height;
    private javafx.scene.shape.Rectangle _rectangle;

    Rectangle(int x, int y, int width, int height) {
        _width = width;
        _height = height;
        _x = x;
        _y = y;
        _rectangle = new javafx.scene.shape.Rectangle(_x, _y, _width, _height);
    }

    public Shape GetObject(){
        return _rectangle;
    }

    public Boolean FitsBoundaries(double maxX, double maxY) {
        return _x + _width < maxX && _y + _height < maxY;
    }
}
