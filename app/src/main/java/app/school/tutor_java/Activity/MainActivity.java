package app.school.tutor_java.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Timer;
import java.util.TimerTask;

import app.school.tutor_java.Fragment.LoginFragment;
import app.school.tutor_java.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                TextView textView = findViewById(R.id.logo);
                textView.setVisibility(View.INVISIBLE);

                ProgressBar progressBar = findViewById(R.id.progressBar);
                progressBar.setVisibility(View.INVISIBLE);

                if (transaction.isEmpty()) {
                    transaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
                    transaction.add(R.id.content, new LoginFragment());
                    transaction.commit();
                }
            }
        }, 2 * 1000);

    }
}