package com.example.mary.hedgehog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String head_array[] = {
            "00. Ежовые",
            "01. Алжирский ёж",
            "02. Амурский ёж",
            "03. Белобрюхий ёж",
            "04. Восточноевропейский ёж",
            "05. Даурский ёж",
            "06. Длинноиглый ёж",
            "07. Индийский ёж",
            "08. Малая гимнура",
            "09. Обыкновенная гимнура",
            "10. Обыкновенный ёж",
            "11. Ошейниковый ёж",
            "12. Сомалийский ёж",
            "13. Ушастый ёж",
            "14. Эфиопский ёж",
            "15. Южноафриканский ёж",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,head_array));
        listView.setTextFilterEnabled(true);



        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Intent intent= new Intent();
                intent.setClass(MainActivity.this, DetailActivity.class);

                intent.putExtra("head", position);

                startActivity(intent);
            }
        });


    }
}
