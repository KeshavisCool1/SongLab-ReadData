import java.io.*;
import java.util.Scanner;

public class ReadData {
    String longest_name = "";
    String artist_name;
    String shortest_name;

    // reading all data
    public Song[] getData(){
        Scanner in;
        Song [] songs = new Song[28371];
        try{
            int count =0;
            in = new Scanner(new File("songs 2025-2026.csv"));
            in.nextLine();
            while(in.hasNext()){
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shakeability = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble( line.split(";")[6]);
                double danceability = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];

                songs[count] = new Song(artist, title, year, genre, length, shakeability, obscene, danceability, loudness, topic);
                count++;

            } 
            
            in.close();
            
        }
        catch(IOException e){
            System.out.println("Error in opening scanner");
        }
        return songs;
    }

    public String getlongestTitle(Song [] list){

        String longest = "";
        for(int i = 0; i < 28372; i++){

            String title = list[i].getTitle();

            if(title.length() > longest.length()){
                longest = title;
            }
        }

        return longest;

    }

    public String getLoudestSong (Song [] list){
        String title = "";
        double loudestValue = 0;
        for(int i = 0; i < 28371; i++){
            if(list[i].getLoudness() > loudestValue){

                loudestValue = list[i].getLoudness();
                title = list[i].getTitle();

            
            }
        }
        return title;
    }

    public int getTotalSongs(Song [] list){
        int num_songs = 0;
        for(int i = 0; i < 28371; i++){
            num_songs ++;
        }
        return num_songs;

    }

    public int getSongsFrom(Song [] list , int year){
        int count = 0;
        for(int i = 0; i < 28371; i++){
            if(list[i].getYear() == year){
                count ++;
            }
        }
        return count;
    }

    public int getSongs_HighDance(Song [] list){
        int count = 0;
        for(int i =0; i < 28371; i++){
            if(list[i].getDanceability() > 0.8){
                count ++;
            }
        }
        return count;
    }    

    public String getLargestLen(Song [] list){
        String title = "";
        int aLen = 0;
        for(int i= 0; i < 28371; i++){
            if(list[i].getLen() > aLen){
                aLen =  list[i].getLen();
                title =  list[i].getTitle();
            }
        }
        return title;

    }


    public String getLowestShakability(Song [] list){
        String title = "";
        double lowShake = 1;        
        for(int i= 1; i < 28371; i++){
            if(list[i].getShakeabiblity() < lowShake){
                lowShake = list[i].getShakeabiblity();
                title = list[i].getTitle();
            }
        }
        return title;
    }
    

    public double getAverageObscenityFrom(Song [] list, int year1 , int year2){
        double average = 0.0;
        double total = 0.0;
        int count = 0;
        for(int i= 0; i < 28371; i++){
            if(list[i].getYear() >= year1 && list[i].getYear() <= year2){
                total = total + list[i].getObscene();
                count ++;
            }

        }
        average = total / count;
        return average;

    }

    public int getSongsWith(Song [] list,String name){
        int count =0;
        for(int i= 0; i < 28371; i++){
            if(list[i].getArtist().equals(name)){
                count ++;
            }
        }
        return count;
    }

}
