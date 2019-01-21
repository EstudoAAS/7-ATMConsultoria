package com.hudeing.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hudeing.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_sobre);

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .addGroup("Fale conosco")
                .create();

        setContentView(sobre);
    }
}
