package com.ithinkbest.visualizer00;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;


public class TextToSpeechActivity extends ActionBarActivity {
    static final String[] texts = {"大家好", "非常高興和大家在這裡相聚", "今天要分享的主題是安卓語音開發"};
    static int index = -1;
    TextToSpeech textToSpeech;
    TextView tvScript;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_speech);
        tvScript = (TextView) findViewById(R.id.tv_script);
        textToSpeech = new TextToSpeech(TextToSpeechActivity.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.CHINESE);
                }
            }
        });
    }

    @Override
    protected void onPause() {
        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
        super.onPause();
    }

    public void onClickTextToSpeech(View view) {
        String text;
        index++;
        if (index == texts.length) {
            index = 0;
        }
        text = texts[index];
        Log.d("MARK987","index="+index);
        tvScript.setText(text);
        textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }
}
