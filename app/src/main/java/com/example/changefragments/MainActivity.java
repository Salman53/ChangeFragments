package com.example.changefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnShow;
    boolean status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.show);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                if(!status)
                {
                    Fragmenta fragmenta = new Fragmenta();
                    transaction.replace(R.id.frame_layout , fragmenta);
                    transaction.commit();
                    btnShow.setText("Load Frament Two");
                    status = true;
                }
                else {
                    Fragmentb fragmentb = new Fragmentb();
                    transaction.replace(R.id.frame_layout , fragmentb);
                    transaction.commit();
                    btnShow.setText("Load Fragment One");
                    status = false;
                }

            }
        });
    }
}
