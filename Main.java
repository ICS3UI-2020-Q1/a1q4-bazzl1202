import java.util.Scanner;
/**
 *
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

    // ask user for the first x coordinate
    System.out.println("Please enter in the x coordinate of the first point");

    // declare and intialize varaible that stores first x coordinate
    double firstCoordinateX = input.nextDouble();

    // ask user for the first y coordinate
    System.out.println("Please enter in the y coordinate of the first point");

    // declare and intialize varaible that stores first y coordinate
    double firstCoordinateY = input.nextDouble();

    // ask user for second coordinate x
    System.out.println("Please enter in the x coordinate of the second point");
    
    // declare and intialize varaible that stores second x coordinate
    double secondCoordinateX = input.nextDouble();

    // ask user for the second y coordinate
    System.out.println("Please enter in the y coordinate of the second point");

    // declare and intialize varaible that stores second y coordinate
    double secondCoordinateY = input.nextDouble();

    // declare and calculate slope
    double slope = (secondCoordinateY-firstCoordinateY)/(secondCoordinateX-firstCoordinateX);

    // tell the user the slope
    System.out.println("The slope of your line would be " + slope + ".");

  }
}
