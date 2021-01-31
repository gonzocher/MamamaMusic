package com.mathmaniarobotics.mamamamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class MusicPlayerActivity extends AppCompatActivity {

    private ListView listView;
    private SongAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        listView = (ListView) findViewById(R.id.song_list);
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(new Song(R.drawable.aint_no_sunshine, "Ain't No Sunshine", "Bill Withers"));
        songList.add(new Song(R.drawable.dog, "Let It Go", "Idina Menzel"));
        songList.add(new Song(R.drawable.duck, "Can't Help Falling In Love", "Ingrid Michaelson"));
        songList.add(new Song(R.drawable.fish, "Say Something", "Great Big World"));
        songList.add(new Song(R.drawable.horse, "Haven't Got Time For The Pain", "Carly Simon"));
        songList.add(new Song(R.drawable.parrot, "Jar of Hearts", "Christina Perry"));
        songList.add(new Song(R.drawable.pigeon, "Apologize", "One Republic"));
        songList.add(new Song(R.drawable.rabbit, "Need You Now", "Lady A"));
        songList.add(new Song(R.drawable.cat, "Mad World", "Gary Jules"));

        mAdapter = new SongAdapter(this, songList);
        listView.setAdapter(mAdapter);

        // Find the Button that shows the song list
        Button songs = (Button) findViewById(R.id.btn_songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MusicPlayerActivity.this, MainActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
