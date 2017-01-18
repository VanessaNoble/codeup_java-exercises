/**
 * Created by vanessamnoble on 1/17/17.
 */

import java.util.ArrayList;
import java.util.Scanner;

//List movies by category.
//
//        The user can enter any of the following categories to display the films in the list that match the category: animated, drama, horror, scifi.
//        After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.
//        Each movie should be represented by an object of type Movie. The Movie class must provide two private fields: title and category. Both of these fields should be Strings.
//        The class should also provide a constructor that accepts a title and category as parameters and uses the values passed to it to initialize its fields.
//        When the user enters a category, the program should read through all of the movies in the ArrayList and display a line for any movie whose category matches the category entered by the user.
//        Sufficient tests should be present.
//        Standardize the category codes by displaying a menu of categories and having the user select the category by number rather than entering the name.
//        Display the movies for the selected category in alphabetical order.
//        Get the class MoviesIO from here. This class has a method named getMovie. Use this method to fill the array list with 100 Movie objects.


public class Main {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        // Each movie should be represented by an object of type Movie. The Movie class must provide two private fields: title and category. Both of these fields should be Strings.
        String choice = "";
        String name = "";
        boolean pickMovie = true;

        // Initialize and set ArrayList
        //Assign variable and initial values to Movies list

        ArrayList<Movies> list = new ArrayList<Movies>();

        list.add(new Movies("Citizen Kane","drama"));
        list.add(new Movies("Casablanca", "drama"));
        list.add(new Movies("The Godfather", "drama"));
        list.add(new Movies("Gone With The Wind", "drama"));
        list.add(new Movies("Lawrence Of Arabia", "drama"));
        list.add(new Movies("The Wizard Of Oz", "musical"));
        list.add(new Movies("The Graduate", "drama"));
        list.add(new Movies("On The Waterfront", "drama"));
        list.add(new Movies("Schindler's List", "drama"));
        list.add(new Movies("Singin' In The Rain", "musical"));
        list.add(new Movies("It's A Wonderful Life", "drama"));
        list.add(new Movies("Sunset Boulevard", "drama"));
        list.add(new Movies("The Bridge On The River Kwai", "drama"));
        list.add(new Movies("Some Like It Hot", "drama"));
        list.add(new Movies("Star Wars", "scifi"));
        list.add(new Movies("The African Queen", "drama"));
        list.add(new Movies("Psycho" , "horror"));
        list.add(new Movies("Chinatown", "drama"));
        list.add(new Movies("One Flew Over The Cuckoo's Nest", "drama"));
        list.add(new Movies("The Grapes Of Wrath", "drama"));
        list.add(new Movies("2001: A Space Odyssey", "scifi"));
        list.add(new Movies("The Maltese Falcon", "drama"));
        list.add(new Movies("Raging Bull", "drama"));
        list.add(new Movies("E.T. The extra-terrestrial", "scifi"));
        list.add(new Movies("Dr. Strangelove", "drama"));
        list.add(new Movies("Bonnie And Clyde", "drama"));
        list.add(new Movies("Apocalypse Now", "drama"));
        list.add(new Movies("Mr. Smith Goes to Washington", "drama"));
        list.add(new Movies("The Treasure Of The Sierra Madre", "drama"));
        list.add(new Movies("Annie Hall", "comedy"));
        list.add(new Movies("The Godfather Part II", "drama"));
        list.add(new Movies("High Noon", "drama"));
        list.add(new Movies("To Kill A Mockingbird", "drama"));
        list.add(new Movies("It Happened One Night", "drama"));
        list.add(new Movies("Midnight Cowboy", "drama"));
        list.add(new Movies("The Best Years Of Our Lives", "drama"));
        list.add(new Movies("Double Indemnity", "drama"));
        list.add(new Movies("Doctor Zhivago", "drama"));
        list.add(new Movies("North By Northwest", "drama"));
        list.add(new Movies("West Side Story", "musical"));
        list.add(new Movies("Rear Window", "drama"));
        list.add(new Movies("King Kong", "horror"));
        list.add(new Movies("The Birth Of A Nation", "drama"));
        list.add(new Movies("A Streetcar Named Desire", "drama"));
        list.add(new Movies("A Clockwork Orange", "scifi"));
        list.add(new Movies("Taxi Driver", "drama"));
        list.add(new Movies("Jaws", "horror"));
        list.add(new Movies("Snow White And The Seven Dwarfs", "animated"));
        list.add(new Movies("Butch Cassidy And The Sundance Kid", "drama"));
        list.add(new Movies("The Philadelphia Story", "drama"));
        list.add(new Movies("From Here To Eternity", "drama"));
        list.add(new Movies("Amadeus", "drama"));
        list.add(new Movies("All Quiet On The Western Front", "drama"));
        list.add(new Movies("The Sound Of Music", "musical"));
        list.add(new Movies("M*A*S*H", "comedy"));
        list.add(new Movies("The Third Man", "drama"));
        list.add(new Movies("Fantasia", "animated"));
        list.add(new Movies("Rebel Without A Cause", "drama"));
        list.add(new Movies("Raiders Of The Lost Ark", "drama"));
        list.add(new Movies("Vertigo", "drama"));
        list.add(new Movies("Tootsie", "comedy"));
        list.add(new Movies("Stagecoach", "drama"));
        list.add(new Movies("Close Encounters Of The Third Kind", "scifi"));
        list.add(new Movies("The Silence Of The Lambs", "horror"));
        list.add(new Movies("Network", "drama"));
        list.add(new Movies("The Manchurian Candidate", "drama"));
        list.add(new Movies("An American In Paris", "drama"));
        list.add(new Movies("Shane", "drama"));
        list.add(new Movies("The French Connection", "drama"));
        list.add(new Movies("Forrest Gump", "drama"));
        list.add(new Movies("Ben-Hur", "drama"));
        list.add(new Movies("Wuthering Heights", "drama"));
        list.add(new Movies("The Gold Rush", "drama"));
        list.add(new Movies("Dances With Wolves", "drama"));
        list.add(new Movies("City Lights", "drama"));
        list.add(new Movies("American Graffiti", "drama"));
        list.add(new Movies("Rocky", "drama"));
        list.add(new Movies("The Deer Hunter", "drama"));
        list.add(new Movies("The Wild Bunch", "drama"));
        list.add(new Movies("Modern Times", "drama"));
        list.add(new Movies("Giant", "drama"));
        list.add(new Movies("Platoon", "drama"));
        list.add(new Movies("Fargo", "drama"));
        list.add(new Movies("Duck Soup", "comedy"));
        list.add(new Movies("Mutiny On The Bounty", "drama"));
        list.add(new Movies("Frankenstein", "horror"));
        list.add(new Movies("Easy Rider", "drama"));
        list.add(new Movies("Patton", "drama"));
        list.add(new Movies("The Jazz Singer", "drama"));
        list.add(new Movies("My Fair Lady", "musical"));
        list.add(new Movies("A Place In The Sun", "drama"));
        list.add(new Movies("The Apartment", "drama"));
        list.add(new Movies("Goodfellas", "drama"));
        list.add(new Movies("Pulp Fiction", "drama"));
        list.add(new Movies("The Searchers", "drama"));
        list.add(new Movies("Bringing Up Baby", "drama"));
        list.add(new Movies("Unforgiven", "drama"));
        list.add(new Movies("Guess Who's Coming To Dinner", "drama"));



        // The user can enter any of the following categories to display the films in the list that match the category: animated, drama, horror, scifi.
        System.out.println("Welcome to the Movie Library! \n\nThere is a 100 movies to pick from!");

        // while the boolean of "run" is set to true;
        while (pickMovie) {
            // ask user to enter category of interest
            System.out.println("\n\n What are you in to? \n While you may be into more than one category, please select one at a time."
                    + "(\"scifi\", \"Horror\",\"Musical\", \"Drama\", or \"Animated\")");
            name = scan1.nextLine();

            // When the user enters a category, the program should read through all of the movies in the ArrayList &
            // display a line for any movie whose category matches the category entered by the user while only displaying the movie title
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i).getCategory().equalsIgnoreCase(name))) {
                    System.out.println(list.get(i).getTitle());
                }
            }

            // After the list is displayed, the user is asked if he or she wants to continue. If no, the program ends.
            System.out.println("\nWould you like to choose another category? (y / n)");
            choice = scan1.nextLine();

            // define options to continue or end program
            if (choice.equalsIgnoreCase("y")) {
                pickMovie = true;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Addios!");
                //break;
                pickMovie = false;
            }
        }
        scan1.close();
    }
}



