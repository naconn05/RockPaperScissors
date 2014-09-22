package com.example.alex.rockpaperscissors;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Result extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        int clickedType = intent.getIntExtra(RPSUtil.INPUT_TYPE, 0);

        SelectionType userChoice = SelectionType.ROCK;
        if (clickedType == R.id.imageRock) {
            userChoice = SelectionType.ROCK;
        } else if (clickedType == R.id.imagepaper) {
            userChoice = SelectionType.PAPER;
        } else if (clickedType == R.id.imagescissors) {
            userChoice = SelectionType.SCISSORS;
        }

        ComputerSelection computer = new ComputerSelection();
        SelectionType computerSelection = computer.play();


        ImageView imageComputer = (ImageView) findViewById(R.id.imageComputer);
        if (computerSelection == SelectionType.ROCK) {
            imageComputer.setImageResource(R.drawable.rock);
        } else if (computerSelection == SelectionType.PAPER) {
            imageComputer.setImageResource(R.drawable.paper);
        } else if (computerSelection == SelectionType.SCISSORS) {
            imageComputer.setImageResource(R.drawable.scissors);
        }

        String result = RPSUtil.eval(userChoice, computerSelection);
        TextView textView = (TextView)findViewById(R.id.textResult);
        textView.setText(result);

        Button button = (Button)findViewById(R.id.btnAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.this.finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.result, menu);
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
}
