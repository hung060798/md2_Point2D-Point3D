public class MAIN {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3,5);
        p1.setxy(0,1);
        System.out.println(p1.toString());

        Point3D p2 = new Point3D(3,4,5);
        System.out.println(p2.toString());
        p2.setxyz(5,4,3);
        System.out.println(p2.toString());
    }
}
