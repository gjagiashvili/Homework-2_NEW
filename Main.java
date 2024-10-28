public class Main {
    public static void main(String[] args) {

        //Homework 1

        int h = 5;
        int z = 10;
        int temporary = h;
        h = z;
        z = temporary;
        System.out.println("h = " + h + ", z = " + z);

        //Homework 1a

        int c = 10;
        int d = 15;
        c = c + d; // c = 25
        d = c - d; // d = 25-15 = 10
        c = c - d; // c = 25-10 = 15
        System.out.println("c = " + c + ", d = " + d);

        //Homework 2

        double original = 10.234;
        double remaining = original - Math.floor(original);
        System.out.println("Original Number = " + original + ", Remaining = " + remaining);

        //Homework 3

        int number = 9;
        if (number >= 100 && number <= 999) {
            System.out.println("არის სამნიშნა");
        } else {
            System.out.println("არ არის სამნიშნა");
        }

        //Homework 4

        char smallChar = 'a';
        char capitalChar = (char) (smallChar - 32);
        System.out.println("დიდი ასო: " + capitalChar);

        //Homework 5

        double newNumber = 10.5;
        long rounded = Math.round(newNumber);

        System.out.println("დამრგვალებული რიცხვი: " + rounded);

        //Homework 6

        int a = 18;
        int b = 15;
        int k = 4;

        int area = a * b;
        int square = k * k;
        int total = area / square;
        if (area % square != 0) {
            System.out.println("ეტევა: " + total);
        }


        //Homework 7

        int allSeconds = 12555;
        int hours = allSeconds / 3600;
        int remainingSeconds = allSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        if (hours > 0) {
            System.out.print(hours + " საათი");
            if (minutes > 0 || seconds > 0) {
                System.out.print(", ");
            }
        }

        if (minutes > 0) {
            System.out.print(minutes + " წუთი");
            if (seconds > 0) {
                System.out.print(", ");
            }
        }

        if (seconds > 0) {
            System.out.println(seconds + " წამი");
        }


        if (hours == 0 && minutes == 0 && seconds == 0) {
            System.out.println("0 წამი");
        }

        //Homework 8

        seconds = 12555;
        hours = seconds / 3600;
        seconds = seconds % 3600;
        minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
