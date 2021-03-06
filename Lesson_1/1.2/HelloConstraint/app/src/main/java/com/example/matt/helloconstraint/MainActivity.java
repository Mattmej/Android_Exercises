package com.example.matt.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;
    private Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
            zeroButton = (Button) findViewById(R.id.button_zero);
            zeroButton.setBackgroundColor(Color.RED);

            if (mCount % 2 == 0) {  // If mCount is even
//                isNotZero.setBackgroundColor(Color.CYAN);
//                isNotZero.setTextColor(Color.BLACK);
                view.setBackgroundColor(Color.CYAN);
//                view.setTextColor(Color.BLACK);
            }

            else {                  // if mCount is odd
//                isNotZero.setBackgroundColor(Color.RED);
//                isNotZero.setTextColor(Color.WHITE);
                view.setBackgroundColor(Color.GREEN);
            }
        }
    }

    public void setToZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
//        isNotZero.setBackgroundColor(Color.DKGRAY);
        view.setBackgroundColor(Color.DKGRAY);
//        isNotZero.setTextColor(Color.WHITE);
        countButton = (Button) findViewById(R.id.button_count);
        countButton.setBackgroundColor(Color.parseColor("#008577"));
    }
}
