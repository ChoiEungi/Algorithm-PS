import java.util.*;
import java.io.*;

class Song implements Comparable<Song>{
    String title;
    String artist; // 가수 이름
    String album; // 앨범 이름
    String track; // 트랙 번호


    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }

    Song(String t, String a, String al, String tr){
        title = t;
        artist = a;
        album = al;
        track = tr;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getTrack() {
        return track;
    }
    public String classInfo(){
        return getTitle()+":"+getArtist()+":"+getAlbum()+":"+getTrack()+"\n";
    }

}

public class MusicDB {
    ArrayList<Song> arr = new ArrayList<Song>();

    public static void main(String[] args){
        new MusicDB().start();
    }

    public void start() {
        getSongs();
        Collections.sort(arr);
        putSongs();
    }
    void getSongs(){
        /* 상대 경로로 사용할 시 사용하는 코드
        String path = MusicDB.class.getResource("").getPath();
        path = path.replace("%20","");
        File inFile = new File(path+"MusicSrcList.txt");
        */
        File inFile = new File("src/MusicSrcList.txt"); //intellij project 내에서 시행하는 코드
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inFile), "utf-8"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    void putSongs(){
        File outFile = new File("MusicDstList.txt");
        try{
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"));
            Iterator<Song> it = arr.iterator();
            while(it.hasNext()){
                writer.write(it.next().classInfo());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    void addSong(String lineToParse) {
        String [] tokens = lineToParse.split(":");
        Song nextSong = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        arr.add(nextSong);
    }


}

