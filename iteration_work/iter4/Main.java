public class Main {
/*
    public static int muteVolume(int volume) {
        volume = 0;
        System.out.println("Volume has been turned down to 0");
        return volume;
    }
    public static int maxVolume(int volume) {
        volume = 100;
        System.out.println("Volume has been turned up to 100");
        return volume;
    }
*/
    public static void main(String[] args) {
        // Create instances of triangles A and B using the Triangle constructor within the Triangle class
        Triangle triangleA = new Triangle(15,8,15,8,17);
        Triangle triangleB = new Triangle(3,2.598,3,3,30);
        
        // Call the findArea() instance method on each triangle to find their respective areas
        // Store them in a variable
        double triangleAArea = triangleA.findArea();
        System.out.println("the area is " + triangleAArea);

        double triangleBArea = triangleB.findArea();
        System.out.println("the area is " + triangleBArea);

        // Access triangle instances' attributes (instance variables)
        double aBase = triangleA.base;
        double bSideOne = triangleB.sideLenOne;
        System.out.println(aBase);
        System.out.println(bSideOne);
        
/*
        int volume = 50;
        System.out.println("volume is " + volume);

        volume = muteVolume(volume);
        System.out.println("volume is now " + volume);

        volume = maxVolume(volume);
        System.out.println("volume is now " + volume);
*/
    }




}
