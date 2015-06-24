package com.ithinkbest.visualizer00;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickBtn1(View view) {
//        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn1),
//                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, VisualizerActivity.class);
        startActivity(intent);

    }

    public void onClickBtn2(View view) {
//        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn2),
//                Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, CaptureAudioActivity.class);
        startActivity(intent);
    }

    public void onClickBtn3(View view) {
//        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn3),
//                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, VoiceActivity.class);
        startActivity(intent);
    }

    public void onClickBtn4(View view) {
//        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn4),
//                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, TextToSpeechActivity.class);
        startActivity(intent);
    }

    public void onClickBtn5(View view) {
        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn5),
                Toast.LENGTH_SHORT).show();
    }

    public void onClickBtn6(View view) {
        Toast.makeText(this, "to launch " + getResources().getString(R.string.btn6),
                Toast.LENGTH_SHORT).show();
    }


}
