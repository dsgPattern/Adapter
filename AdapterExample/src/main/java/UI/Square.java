package UI;

import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class Square implements IShapeWithValidation {
    private int _x, _y, _size;
    private Rectangle _rectangle;

    Square(int x, int y, int size) {
        _size = size;
        _x = x;
        _y = y;
        _rectangle = new Rectangle(_x, _y, _size, _size);
    }

    public Shape GetObject(){
        return _rectangle;
    }

    public Boolean FitsBoundaries(double maxX, double maxY) {
        return _x + _size < maxX && _y + _size < maxY;
    }
}
