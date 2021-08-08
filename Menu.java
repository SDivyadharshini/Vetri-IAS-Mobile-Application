package com.example.vetri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        LinearLayout layout, contactlayout, admissionlayout, courselayout, gallerylayout;

        layout = (LinearLayout) findViewById(R.id.about);
        contactlayout = (LinearLayout) findViewById(R.id.contact);
        admissionlayout = (LinearLayout) findViewById(R.id.admission);
        courselayout = (LinearLayout) findViewById(R.id.course);
        gallerylayout = (LinearLayout) findViewById(R.id.gallery);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, com.example.vetri.About.class);
                startActivity(intent);
            }
        });

        contactlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, com.example.vetri.Contact.class);
                startActivity(intent);

            }
        });

        admissionlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, com.example.vetri.Admission.class);
                startActivity(intent);


            }

        });

        courselayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, com.example.vetri.Course.class);
                startActivity(intent);
            }
        });

        gallerylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Menu.this, com.example.vetri.Gallery.class);
                startActivity(intent);
            }
        });


    }}
