package pobj.td10;

public interface IRobot {

    double getX();

    double getY();

    String getMessage();

    boolean moveX(double distance);

    boolean moveY(double distance);

    void setMessage(String message);

}
