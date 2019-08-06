package com.cbiu.picolocolorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageDetails extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_details);
        imageView = findViewById(R.id.img);

        int data = (int) getIntent().getSerializableExtra("image");
        imageView.setImageResource(data);

    }
}
