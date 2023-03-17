package week10.rectanglefiles;

public class runner
{
    public static void main(String[] args)
    {
        Rectangle r = new Rectangle();
        r.setLength(6);
        r.setWidth(8);
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.getArea());

        Rectangle kitchen = new Rectangle();
        kitchen.setLength(10);
        kitchen.setWidth(12);

        System.out.println("Kitchen dimensions - length: " + kitchen.getLength() + ", width:" + kitchen.getWidth());

        Rectangle livingRoom = new Rectangle();
        livingRoom.setLength(15);
        livingRoom.setWidth(20);
        //System.out.println(livingRoom); //demonstration of printing an object's position in memory

        System.out.println("Living Room dimensions - length: " + livingRoom.getLength() + ", width:" + livingRoom.getWidth());

        Rectangle bathroom = new Rectangle();
        bathroom.setLength(20);
        bathroom.setWidth(15);
        System.out.println("Bathroom dimensions - length: " + bathroom.getLength() + ", width:" + bathroom.getWidth());

        Rectangle bedroom = new Rectangle(8, 15);
        System.out.println("Bedroom dimensions - length: " + bedroom.getLength() + ", width:" + bedroom.getWidth());

        Rectangle den = new Rectangle(2, 4);
        System.out.println("Den " + den.toString());
    }
}