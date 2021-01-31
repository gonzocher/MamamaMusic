package com.mathmaniarobotics.mamamamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    // Array of strings...
    String[] songTitleArray = {"Ain't No Sunshine", "Let It Go", "Can't Help Falling In Love", "Say Something",
            "Haven't Got Time For The Pain", "Jar of Hearts", "Apologize", "Need You Now", "Mad World", "New Kid in Town", "The Thunder Rolls", "She Don't Know She's Beautiful"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, songTitleArray);

        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);

        // Find the Button that shows the artists
        Button artists = (Button) findViewById(R.id.btn_artists);

        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the Button that will go to the music player
        Button player = (Button) findViewById(R.id.btn_player);

        // Set a click listener on that View
        player.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, MusicPlayerActivity.class);
                startActivity(playerIntent);
            }
        });
    }
}
