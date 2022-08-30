package com.mnmason6.songr;

import java.sql.Array;
import java.util.ArrayList;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    static Album album1 = new Album("S&M", "Metallica", 21, 7993, "https://i.ytimg" +
            ".com/vi/2ywNO3UOErM/hqdefault.jpg");
    static Album album2 = new Album("The Prophecy", "Ninja Sex Party", 12, 2326,
            "https://i.scdn.co/image/ab67616d0000b273d9662d3d3d3ddbc6b2c49c7c");
    static Album album3 = new Album("No Strings Attached", "NSYNC", 14, 2838,
            "https://upload.wikimedia.org/wikipedia/en/a/a1/Nsync_-_No_Strings_Attached.png");

    public static Album[] listAlbums(){
        Album[] albumList = new Album[3];
        albumList[0] = album1;
        albumList[1] = album2;
        albumList[2] = album3;

        return albumList;
    }
}
