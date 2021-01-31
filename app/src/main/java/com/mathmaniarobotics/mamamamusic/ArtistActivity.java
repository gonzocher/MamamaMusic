package com.mathmaniarobotics.mamamamusic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;



public class ArtistActivity extends AppCompatActivity {
    // Array of strings...
    String[] songArtistArray = {"Bill Withers","Idina Menzel","Ingrid Michaelson","Great Big World",
            "Carly Simon","Christina Perry","One Republic","Lady A","Gary Jules","Eagles","Garth Brooks","Sammy Kershaw"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, songArtistArray);

        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(adapter);

        // Find the View that shows the song by artist button
        Button songs = (Button) findViewById(R.id.btn_songs);

        // Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistActivity.this, MainActivity.class);
                startActivity(songsIntent);
            }
        });



    }


}