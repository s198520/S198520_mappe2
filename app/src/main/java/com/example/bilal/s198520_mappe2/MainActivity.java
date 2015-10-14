package com.example.bilal.s198520_mappe2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn_new = (Button)findViewById(R.id.btn_new);
        final Button btn_change = (Button)findViewById(R.id.btn_change);
        final Button btn_delete = (Button)findViewById(R.id.btn_delete);
        final Button btn_show = (Button)findViewById(R.id.btn_show);



        View.OnClickListener ocl = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                    switch(v.getId()){
                        case R.id.btn_new:
                            en();
                            break;
                        case R.id.btn_change:
                            to();
                            break;
                        case R.id.btn_delete:
                            tre();
                            break;
                        case R.id.btn_show:
                            fire();
                            break;
                        default:
                            break;
                    }
                }
            };

        btn_new.setOnClickListener(ocl);
        btn_change.setOnClickListener(ocl);
        btn_delete.setOnClickListener(ocl);
        btn_show.setOnClickListener(ocl);
    }
        private void en() {
            Intent intent = new Intent(getBaseContext(), nykontakt.class);
            startActivityForResult(intent, 0);
        }
        private void to() {
            Intent intent = new Intent(getBaseContext(), redigerkontakt.class);
            startActivityForResult(intent,0);
        }
        private void tre() {
            Intent intent = new Intent(getBaseContext(), slettkontakt.class);
            startActivityForResult(intent,0);
        }
        private void fire() {
            Intent intent = new Intent(getBaseContext(), slettkontakt.class);
            startActivityForResult(intent,0);

        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void anime(View view){
        view.setBackgroundResource(R.drawable.button2green);
    }
} // end of class MainActivity

