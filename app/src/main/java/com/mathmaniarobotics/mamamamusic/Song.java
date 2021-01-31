package com.mathmaniarobotics.mamamamusic;

public class Song {
    // Store the id of the song image
    private int mImageDrawable;
    // Store the song title
    private String mTitle;
    // Store the song artist
    private String mArtist;

    // Constructor that is used to create an instance of the Song object
    public Song(int mImageDrawable, String mTitle, String mArtist) {
        this.mImageDrawable = mImageDrawable;
        this.mTitle = mTitle;
        this.mArtist = mArtist;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmName(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }
}
