package data_types.point;

import static java.lang.Math.abs;

public class Points {
    public static double aproximation = 0.000005;

    public Points() {
    }

    public static Point sum(Point p1, Point p2) {
        return new Point(p1.x + p2.x, p1.y + p2.y, p1.z + p2.z);
    }

    public static Point subtract(Point p1, Point p2) {
        return new Point(p1.x - p2.x, p1.y - p2.y, p1.z - p2.z);
    }

    public static Point multiply(Point p1, Point p2) {
        return new Point(p1.x * p2.x, p1.y * p2.y, p1.z * p2.z);
    }

    public static Point divide(Point p1, Point p2) {
        return new Point(p1.x / p2.x, p1.y / p2.y, p1.z / p2.z);
    }

    public static Point enlarge(Point p, double c) {
        return new Point(c * p.x, c * p.y, c * p.z);
    }

    public static double length(Point point) {
        return point.length();
    }

    public static Point opposite(Point point) {
        return new Point(-point.x, -point.y, -point.z);
    }

    public static Point inverse(Point point) {
        return new Point(1 / point.x, 1 / point.y, 1 / point.z);
    }

    public static double scalarProduct(Point p1, Point p2) {
        return p1.x * p2.x + p1.y * p2.y + p1.z * p2.z;
    }

    public static Point vectorProduct(Point p1, Point p2) {
        return new Point(p1.y * p2.z - p1.z * p2.y, p1.z * p2.x - p1.x * p2.z, p1.x * p2.y - p1.y * p2.x);
    }

    public static boolean equalsApproximately(double x, double y) {
        if (abs(x - y) <= aproximation) {
            return true;
        }
        return false;
    }

    public static boolean equalsApproximately(Point p1, Point p2) {
        if (equalsApproximately(p1.x, p2.x)
                & equalsApproximately(p1.y, p2.y)
                & equalsApproximately(p1.z, p2.z)) {
            return true;
        }
        return false;
    }
}