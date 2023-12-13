package movies;

import movies.MoviesArray;
import util.Input;
import movies.Movie;

public class MoviesApplication {
    public static void main(String[] args) {
        boolean userContinue;
        do {

            System.out.println("what would you like to view?");
            System.out.println("0 - exit\n 1 - view all \n 2 - view animated movies \n 3 - view movies in drama \n 4 - view movies in horror \n 5 - view movies in scifi");

            Input input = new Input();
            int userChoice = input.getInt(0, 5);
            userContinue = true;

            for (Movie movie : MoviesArray.findAll()) {
                switch (userChoice) {
                    case 0:
                        userContinue = false;
                        break;
                    case 1:
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                        break;
                    case 2:
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                        break;
                    case 3:
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                        break;
                    case 4:
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                        break;
                    case 5:
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                        break;
                }
            }

        } while (userContinue);
    }
}
