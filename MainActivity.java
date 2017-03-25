package io.github.akshayadinesh.calculatortutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText) findViewById(R.id.editText3);
        input2 = (EditText) findViewById(R.id.editText4);
        answer = (TextView) findViewById(R.id.textView3);
    }

    public void buttonClicked(View view) {

        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());

        int sum = num1 + num2;

        answer.setText("Answer: " + sum);

    }
}
