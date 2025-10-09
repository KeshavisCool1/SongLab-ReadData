import java.io.*;
import java.util.Scanner;

public class ReadData {
    String longest_name = "";
    String artist_name;
    String shortest_name;

    // printing all data
    public void getData(){
        Scanner in;
        try{
            int count =1;
            in = new Scanner(new File("songs2025-2026.csv"));

            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(count + ": " + line);
                count++;
                
            } 
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in opening scanner");
        }
    }

    //getting longest artist names and shortest artist names
    public void getExtremeValues(){
        Scanner in;
        try{

            int count =1;
            in = new Scanner(new File("songs2025-2026.csv"));
            String line1 = in.nextLine();
            shortest_name = count + ": " + line1.split(",")[0];

            while(in.hasNext()){
                String line = in.nextLine();

                artist_name = count + ": " + line.split(",")[0];
                if (artist_name.length() > longest_name.length()){
                    longest_name = artist_name;
                }

                if (artist_name.length() < shortest_name.length()){
                    shortest_name = artist_name;
                }
                count++;   
            }
            System.out.println("longest name is: " + longest_name);
            System.out.println("shortest name is: " + shortest_name);
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in opening scanner");
        }
    }

    // printing all artist names
    public void getArtist(){
        Scanner in;
        try{
            int count =1;
            in = new Scanner(new File("songs2025-2026.csv"));
            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(count + ": " + line.split(",")[0]);
                count++;  
            }
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in opening scanner");
        }
    }

    public void getTracks(){
        Scanner in;
        try{
            int count =1;
            in = new Scanner(new File("songs2025-2026.csv"));
            while(in.hasNext()){
                String line = in.nextLine();
                System.out.println(count + ": " + line.split(",")[1]);
                count++;  
            }
            in.close();
        }
        catch(IOException e){
            System.out.println("Error in opening scanner");
        }
    }

}
