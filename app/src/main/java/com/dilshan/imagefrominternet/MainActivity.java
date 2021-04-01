package com.dilshan.imagefrominternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView onlineImage, getOnlineImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineImage = findViewById(R.id.onlineImg);
        getOnlineImage = findViewById(R.id.onlineImg2);

        String uri = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS24wvA9ozipJc5-IStQrqZIo_a3urpEZGIGA&usqp=CAU";
        Picasso.get().load(uri).placeholder(R.drawable.ic_launcher_foreground).into(onlineImage);

        Picasso.get().load("https://images.unsplash.com/photo-1512621776951-a57141f2eefd?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxleHBsb3JlLWZlZWR8NXx8fGVufDB8fHw%3D&w=1000&q=80").placeholder(R.drawable.ic_launcher_foreground).into(getOnlineImage);

    }
}