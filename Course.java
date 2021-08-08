package com.example.vetri;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course);


        ListView listView;

        listView = (ListView)findViewById(R.id.listview);

        String[] data = new String[10];

        data[0]= "UPSC Prelims cum Mains 2019";
        data[1]= "UPSC Prelims Test Series 2019";
        data[2]= "TNPSC Gr-1 Test Series 2019";
        data[3]= "TNPSC Gr 1 & 2 Prelims cums Mains";
        data[4]= "TNPSC Gr 1 & 2 A Prelims Exclusive";
        data[5]= "TNPSC Gr 2 PCM";
        data[6]= "TNPSC Gr 1 Mains";
        data[7]= "Banking";
        data[8]= "Banking Gr2 Prelims Exclusive";
        data[9]= "Test series";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,android.R.id.text1,data);



        listView.setAdapter(adapter);

    }

}

