package com.maltatec.myslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_light)
                .fragment(R.layout.intro_1)
                .build()
        );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.holo_orange_light)
                .fragment(R.layout.intro_2)
                .build()
        );

        /*
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide( new SimpleSlide.Builder()
                .title("Titulo")
                .description("Description")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide( new SimpleSlide.Builder()
                .title("Titulo2")
                .description("Description2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()
        );

        addSlide( new SimpleSlide.Builder()
                .title("Titulo3")
                .description("Description3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()
        );

         */


    }
}