package com.example.android.portfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();
        final int[] ids = {
            R.id.movies_btn,
            R.id.hawk_btn,
            R.id.buildit_btn,
            R.id.materal_btn,
            R.id.ubiquitous_btn,
            R.id.capstone_btn
        };

        for (int id : ids) {
            Button button = (Button) findViewById(id);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast notification = Toast.makeText(context,
                            getResources().getString(R.string.not_implemented_text),
                            Toast.LENGTH_SHORT);
                    notification.show();
                }
            });
        }
    }
}
