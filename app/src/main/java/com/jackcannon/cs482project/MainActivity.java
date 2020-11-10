package com.jackcannon.cs482project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DO AUTHENTICATION FIRST

        String name = "Jack";
        String greetMe = "Hi, " + name;
        greeting = (TextView) findViewById(R.id.greeting);
        greeting.setText(greetMe);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.app_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_favorite:
                startActivity(new Intent(this, HomeActivity.class));
                return true;
            case R.id.profile:
                startActivity(new Intent(this, Profile.class));
                return true;
            case R.id.feedback:
                startActivity(new Intent(this, Feedback.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void toOwnerProfile(View view) {
        startActivity(new Intent(this, Owner.class));
    }

    public void toSitterProfile(View view) {
        startActivity(new Intent(this, Sitter.class));
    }

    public void toAdoptionPage(View view) {
        startActivity(new Intent(this, Adopt.class));
    }
}