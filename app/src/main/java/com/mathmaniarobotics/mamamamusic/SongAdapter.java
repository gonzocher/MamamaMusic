package com.mathmaniarobotics.mamamamusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    private Context mContext;
    private List<Song> songList = new ArrayList<>();

    public SongAdapter(@NonNull Context context, ArrayList<Song> list) {
        super(context, 0, list);
        mContext = context;
        songList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.activity_music_player_list_view,parent,false);

        Song currentSong = songList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.song_image);
        image.setImageResource(currentSong.getmImageDrawable());

        TextView title = (TextView) listItem.findViewById(R.id.song_title);
        title.setText(currentSong.getmTitle());

        TextView artist = (TextView) listItem.findViewById(R.id.song_artist);
        artist.setText(currentSong.getmArtist());

        return listItem;
    }
}