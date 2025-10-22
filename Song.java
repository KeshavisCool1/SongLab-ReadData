public class Song {
    private String title;
    private String artist;
    private String genre;
    private String topic;
    private int year;
    private int len;
    private double shake_the_audience;
    private double obscene;
    private double danceability;
    private double loudness;

    public Song(String artist, String title, int year , String genre, int len, double shake_the_audience, double obscene, double danceability, double loudness, String topic){

        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.len = len;
        this.shake_the_audience = shake_the_audience;
        this.obscene = obscene;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }

    public String getTitle(){
        return title;
    }

    public double getLoudness(){
        return loudness;
    }

    public String getArtist(){
        return artist;
    }

    public int getYear(){
        return year;
    }

    public double getDanceability(){
        return danceability;
    }

    public int getLen(){
        return len;
    }

    public double getShakeabiblity(){
        return shake_the_audience;
    }

    public double getObscene(){
        return obscene;
    }

}
