public class Driver {

    public static void main(String[] args) {
        
        ReadData data = new ReadData();
        Song [] listOfSongs = data.getData(); 
        System.out.println("Total number of songs: " + data.getTotalSongs(listOfSongs));
        System.out.println("Total number of songs from 1982: " + data.getSongsFrom(listOfSongs,1982));
        System.out.println("Total number of songs from 2000: " + data.getSongsFrom(listOfSongs,2000));
        System.out.println("Total number of songs from 2015: " + data.getSongsFrom(listOfSongs,2015));
        System.out.println("Songs with danceability ratings > 0.80: " + data.getSongs_HighDance(listOfSongs));
        System.out.println("Song with largest len: " + data.getLargestLen(listOfSongs));
        System.out.println("Song with lowest shakeability score: " + data.getLowestShakability(listOfSongs));
        System.out.println("Loudest song: " + data.getLoudestSong(listOfSongs));
        System.out.println("Average obscenity level in decade 1950 - 1959: " + data.getAverageObscenityFrom(listOfSongs,1950 , 1959));
        System.out.println("Average obscenity level in decade 1960 - 1969: " + data.getAverageObscenityFrom(listOfSongs,1960 , 1969));
        System.out.println("Average obscenity level in decade 1970 - 1979: " + data.getAverageObscenityFrom(listOfSongs,1970 , 1979));
        System.out.println("Average obscenity level in decade 1980 - 1989: " + data.getAverageObscenityFrom(listOfSongs,1980 , 1989));
        System.out.println("Average obscenity level in decade 1990 - 1999: " + data.getAverageObscenityFrom(listOfSongs,1990 , 1999));
        System.out.println("Average obscenity level in decade 2000 - 2009: " + data.getAverageObscenityFrom(listOfSongs,2000 , 2009));
        System.out.println("Average obscenity level in decade 2010 - 2019: " + data.getAverageObscenityFrom(listOfSongs,2010 , 2019));
        System.out.println("Average obscenity level in decade 2020 - 2029: " + data.getAverageObscenityFrom(listOfSongs,2020 , 2029));
        System.out.println("Songs with Michael Jackson in it: " + data.getSongsWith(listOfSongs, "michael jackson"));
        System.out.println("Songs with Whitney Houston in it: " + data.getSongsWith(listOfSongs, "whitney houston"));
    }

}
