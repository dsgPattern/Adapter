package UI;

import javafx.scene.shape.Shape;

public class Circle implements IShapeWithValidation {
    private double _radius, _originX, _originY;
    private javafx.scene.shape.Circle _circle;

    Circle(double originX, double originY, double radius){
        _originX=originX;
        _originY=originY;
        _radius=radius;

        _circle=new javafx.scene.shape.Circle(originX, originY, radius);
    }

    public Shape GetObject(){
        return _circle;
    }

    public Boolean FitsBoundaries(double maxX, double maxY) {
        return _originX + _radius < maxX && _originY + _radius < maxY;
    }
}
