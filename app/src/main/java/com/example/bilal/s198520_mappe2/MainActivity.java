package com.example.bilal.s198520_mappe2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    //button listeners
    Button btn_new = (Button)findViewById(R.id.btn_new);
    btn_new.setOnClickListener(this);

    Button btn_change = (Button)findViewById(R.id.btn_change);
    btn_change.setOnClickListener(this);

    Button btn_change = (Button)findViewById(R.id.btn_change);
    btn_change.setOnClickListener(this);

    Button btn_show = (Button)findViewById(R.id.btn_show);
    btn_show.setOnClickListener(this);

}

    @Override
    public void onClick(View view) {
        //handle clickson
        if (view.getId() == R.id.btn_new) {
            Intent playIntent = new Intent(this, thegame.class);
            this.startActivity(playIntent);
        } else if(view.getId() == R.id.helpBtn){
            Intent playIntent = new Intent(this, help.class);
            this.startActivity(playIntent);
        } else if(view.getId() == R.id.languageBtn){
            Intent playIntent = new Intent(this, Language.class);
            this.startActivity(playIntent);
        } else if(view.getId() == R.id.quitBtn){
            System.exit(0);
        }
    }

public class MainActivity extends AppCompatActivity {

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
}

    public void anime(View view){
        view.setBackgroundResource(R.drawable.button2green);

}

