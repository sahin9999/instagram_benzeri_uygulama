package com.example.yersennstagram;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get references to ImageView and TextView elements
        ImageView car1Image = findViewById(R.id.car1_image);
        ImageView car2Image = findViewById(R.id.car2_image);
        ImageView car3Image = findViewById(R.id.car3_image);
        ImageView car4Image = findViewById(R.id.car4_image);
        ImageView car5Image = findViewById(R.id.car5_image);
        ImageView car6Image = findViewById(R.id.car6_image);
        ImageView car7Image = findViewById(R.id.car7_image);
        ImageView car8Image = findViewById(R.id.car8_image);
        TextView car1Brand = findViewById(R.id.car1_brand);
        TextView car2Brand = findViewById(R.id.car2_brand);
        TextView car3Brand = findViewById(R.id.car3_brand);
        TextView car4Brand = findViewById(R.id.car4_brand);
        TextView car5Brand = findViewById(R.id.car5_brand);
        TextView car6Brand = findViewById(R.id.car6_brand);
        TextView car7Brand = findViewById(R.id.car7_brand);
        TextView car8Brand = findViewById(R.id.car8_brand);
        TextView car1Model = findViewById(R.id.car1_model);
        TextView car2Model = findViewById(R.id.car2_model);
        TextView car3Model = findViewById(R.id.car3_model);
        TextView car4Model = findViewById(R.id.car4_model);
        TextView car5Model = findViewById(R.id.car5_model);
        TextView car6Model = findViewById(R.id.car6_model);
        TextView car7Model = findViewById(R.id.car7_model);
        TextView car8Model = findViewById(R.id.car8_model);


        // Set images and texts for each car
        car1Image.setImageResource(R.drawable.car1);
        car1Brand.setText("Toyota");
        car1Model.setText("Corolla");
        car2Image.setImageResource(R.drawable.car2);
        car2Brand.setText("Honda");
        car2Model.setText("Civic");
        car3Image.setImageResource(R.drawable.car3);
        car3Brand.setText("BMW");
        car3Model.setText("X5");
        car4Image.setImageResource(R.drawable.car4);
        car4Brand.setText("Mercedes-Benz");
        car4Model.setText("E-Class");
        car5Image.setImageResource(R.drawable.car5);
        car5Brand.setText("Audi");
        car5Model.setText("A4");

        car5Image.setImageResource(R.drawable.car6);
        car5Brand.setText("Audi");
        car5Model.setText("A4");

        car5Image.setImageResource(R.drawable.car7);
        car5Brand.setText("Audi");
        car5Model.setText("A4");

        car5Image.setImageResource(R.drawable.car8);
        car5Brand.setText("Audi");
        car5Model.setText("A4");
    }
}

