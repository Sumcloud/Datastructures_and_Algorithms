package Utilities;

import CustomExceptions.ArrayMismatchException;

import java.util.ArrayList;
import java.util.List;

public interface ConstantTestValues {
    //String Arrays (Musical Albums)
    String[] stringArray1dDaftPunk = {"Da Funk / Rollin' and Stratchin' ","Homework","Discovery","Alive 1997","Daft Club","Human After All", "Greatest Hits",
            "Human After All: Remixes", "Daft Punk Musique Vol. 1", "Daft Punk Alive", "TRON: Legacy", "Tron: Legacy Reconfigured", "TRON: Legacy Collector’s Digital EP",
    "Random Access Memories","Daft Punk Deep Cuts"};
    String[] stringArray1dAmerica = {"America","Homecoming","Hat Trick","Holiday","Hearts","Hideaway","Harbor","America Live","Silent Letter","Alibi",
            "View from the Ground", "The Last Unicorn", "Your move", "Perspective", "In concert" , "Hourglass", "Human Nature"};
    String[] stringArray1dBeatles = {"Please Please Me","With the Beatles","Introducing The Beatles","Meet the Beatles!","Twist and Shout", "A Hard Day's Night",
            "Something New", "Beatles for Sale", "Help!", "Rubber Soul", "Revolver", "Sgt. Pepper's Lonely Heart Club Band", "Magical Mystery Tour", "The Beatles"
            ,"Yellow Submarine","Abbey Road", "Let It Be"};
    String[] stringArray1dFooFighters = {"Foo Fighters", "The Colour and the Shape","There Is Nothing Left to Lose", "Generator", "One by One", "Everywhere but Home",
            "B-sides", "In Your Honour", "Wasting Light", "Medium Rare", "Sonic Highways", "Saint Cecilia", "Concrete and Gold", "Easy Targets", "Medicine at Midnight",
            "Hail Satin"};
    // Corresponding release years to previously declared album names //TODO ADD RELEASE YEARS!
    Integer[] releaseYearsDaftpunk = {1995,1997,2001,2001,2003,2005,2006,2006,2006,2007,2010,2011,2011,2013,2020};
    Integer[] releaseYearsAmerica = {1971,1972,1973,1974,1975,1976,1977,1979,1980,1980,1982,1982,1983,1984,1985,1994,1998};
    Integer[] releaseYearsBeatles = {1963,1963,1964,1964,1964,1964,1964,1964,1965,1965,1966,1967,1967,1968,1969,1969,1970};
    Integer[] releaseYearsFooFighters= {1995,1997,1999,2000,2002,2003,2004,2005,2011,2011,2014,2015,2017,2020,2021,2021};

    //Integer Arrays (Student Numbers) SORTED!!
    Integer[] integerArrayStudentNumbers = {180101,180102,180103,180104,180105,180106,180107,180108,180110,180204,180320,180323,180532,180589,180599,180635,180681,180742,
    180744,180762,180763,180775,180776,180780,180838,18902,180910, 180991,190102,190203,190204,190205,190206,190210,190212,190215,190230,190245,190250,190268,190272,
    190321,190368,190555,190668,190900,200130,20130};

    //Comparable Object Array UNSORTED
    Product[] productArray = {new Product("Orange Juice",1.30), new Product("Chocolate chip Cookies",1.05),new Product("Granny Smith Apple",0.79),
    new Product("Banana",1.80),new Product("Baking Soda",0.80),new Product("Sugar Cubes",2.15),new Product("Coca Cola 1L",1.50),
            new Product("Pepsi 1L",1.35),new Product("Potatoes 1kg",4.99),new Product("Eggs 12pcs",1.10),new Product("Milk 1L",1.00),
            new Product("Coconut water", 0.80),new Product("Coconut milk",0.90),new Product("Pumpkin",1.52),new Product("After Eights", 0.95),
            new Product("Chewing Gum Spearmint",0.89),new Product("Almond milk",0.99),new Product("Soy milk Vanilla",1.03),
            new Product("Bacon",0.80),new Product("Chicken breasts",2.10),new Product("Chicken wings",2.30),new Product("Bleach",1.30),
            new Product("Samsung speaker",5.15),new Product("Philips Television",131.50),new Product("Dual Shock 4 Controller", 39.15)
            ,new Product("Spaghetti", 1.49),new Product("Kidney Beans",0.78),new Product("Corn",0.83),new Product("Sweet chili",1.23),
            new Product("Ground beef",1.89),new Product("Pickles",1.39),new Product("Cucumber",0.40),new Product("Fermented Pork",1.29),
            new Product("Gouda Cheese",1.19),new Product("Blue cheese",1.69),new Product("Green beans 1kg",1.21),new Product("Rice 5kg", 3.30),
            new Product("Sponges 3pcs",0.90),new Product("Pot soil 20L",1.19),new Product("Peanut Butter",1.18),new Product("Wild Honey",2.03)};

    // 2-Dimensional Array
    Integer[][] basicInteger2dArray = {{10,11,13},{4,6,8},{24,1,56},{38,19,27},{29,31,42},{3,5,7},{27,9,21},{73,69,56},{88,78,75},{34,22,41},{17,44,52}};

    //TODO CREATE AN ADJACENCY MATRIX FOR THE PATH FINDING ALGORITHMS
    //TODO COMPLETE FUNCTION BELOW!

    //REALLY DIRTY METHOD ;/
    public static Album[] massAlbumCreator() throws ArrayMismatchException {
        List<Album> albums = new ArrayList<>();

        albums.addAll(albumListCreator("Daft Punk",stringArray1dDaftPunk,releaseYearsDaftpunk));
        albums.addAll(albumListCreator("America",stringArray1dAmerica,releaseYearsAmerica));
        albums.addAll(albumListCreator("The Beatles",stringArray1dBeatles,releaseYearsBeatles));
        albums.addAll(albumListCreator("Foo Fighters",stringArray1dFooFighters,releaseYearsFooFighters));

        Album[] tmp = new Album[albums.size()];
        for (int i = 0; i < tmp.length; i ++)
            tmp[i] = albums.get(i);
        return tmp;
    }
    public static List<Album> albumListCreator(String artist, String[] albumNames, Integer[] releaseYears) throws ArrayMismatchException {
        List<Album> tmp = new ArrayList<>();
        if (albumNames.length != releaseYears.length)
            throw new ArrayMismatchException("The album names ("+ artist +") and corresponding release year arrays have different lengths which will result in index out of bounds! " +
                    "Release Years: " + releaseYears.length + " Album names: " + albumNames.length);
        for (int i = 0; i < albumNames.length; i++){
            tmp.add(new Album(artist,albumNames[i],releaseYears[i]));
        }
        return tmp;
    }

}
