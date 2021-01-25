class Main {
    public static void main(String args[]) {
        Point3D p1, p2, p3;
        p1 = new Point3D(1, 2, 3);
        p2 = new Point3D(4, 5, 6);
        p3 = new Point3D(7, 8, 9);

        p1.setX(10);
        p1.setPoint(new Point3D(3, 3, 3));

        System.out.println("CENTER POINT");
        System.out.print(Point3D.findCenter(p1, p2).getY());
        System.out.print(",");
        System.out.print(Point3D.findCenter(p1, p2).getX());
        System.out.print(",");
        System.out.print(Point3D.findCenter(p1, p2).getY());
        System.out.println("\nDISTANCE");
        System.out.println(Point3D.findDistance(p1, p3));

    }
}