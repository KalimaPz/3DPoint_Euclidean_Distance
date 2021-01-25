
public class Point3D {

    private double x;
    private double y;
    private double z;

    Point3D() {
    }

    Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double temp) {
        this.x = temp;
    }

    public void setY(double temp) {
        this.y = temp;
    }

    public void setz(double temp) {
        this.z = temp;
    }

    public void setPoint(Point3D point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public static Point3D findCenter(Point3D pointA, Point3D pointB) {
        Point3D center;
        center = new Point3D((pointA.x + pointB.x) / 2, (pointA.y + pointB.y) / 2, (pointA.z + pointB.z) / 2);
        return center;
    }

    public static double findDistance(Point3D pointA, Point3D pointB) {
        double temp = Math.pow(pointA.x - pointB.x, 2) - Math.pow(pointA.y - pointB.y, 2)
                - Math.pow(pointA.z - pointB.z, 2);
        double result = Math.sqrt(Math.abs(temp));

        return result;
    }
}