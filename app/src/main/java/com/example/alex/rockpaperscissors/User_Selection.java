package com.example.alex.rockpaperscissors;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;



public class User_Selection extends Activity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_selection);

        ImageView imageViewRock = (ImageView) findViewById(R.id.imageRock);
        imageViewRock.setOnClickListener(this);

        ImageView imageViewPaper = (ImageView) findViewById(R.id.imagepaper);
        imageViewPaper.setOnClickListener(this);

        ImageView imageViewScissors = (ImageView) findViewById(R.id.imagescissors);
        imageViewScissors.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.user_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void onClick(View view){
        Intent intent = new Intent(this,Result.class);
        intent.putExtra(RPSUtil.INPUT_TYPE, view.getId());
        startActivity(intent);
    }
}