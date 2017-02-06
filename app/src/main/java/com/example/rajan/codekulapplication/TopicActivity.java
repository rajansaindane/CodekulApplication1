package com.example.rajan.codekulapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;

import java.util.ArrayList;

import static android.R.id.list;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

       findViewById(R.id.btn).setOnClickListener(this::click);


    }



    private void click(View view) {

        get();

    }

    private void get(){


        webservices.q(this).add(new StringRequest
                ("http://192.168.2.35:7878/codekul/technology/getList",this::OnJoke,this::OnJokeError));

       // "http://api.icndb.com/jokes/random/3"
    }

    private void OnJokeError(VolleyError volleyError) {

        Log.i("@codekul","volly Error - "+volleyError.toString());

    }

    private void OnJoke(String s) {

        Log.i("@codekul","Json - "+s);

        Gson gson=new Gson();
        joke jok=gson.fromJson(s, com.example.rajan.codekulapplication.joke.class);
        updatejoke(jok);


    }

    private void updatejoke(joke jok){
        ArrayList<String> jokes=new ArrayList<>();
        for(jokeinfo info : jok.getValue()){

            jokes.add(info.getTechnologyName());
        }




        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,jokes);
        ListView list=((ListView)findViewById(R.id.listview));
                list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                if(position == 0){

                    Intent webintent=new Intent(TopicActivity.this,TechnologyActivity.class);

                    startActivity(webintent);



                }



            }
        });


    }



}
