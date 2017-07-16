package rinc.geniusk.androidformetoring1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = (TextView) findViewById(R.id.textview);
        textView.setText("여러분 환영합니다!");

        final EditText editText1 = (EditText) findViewById(R.id.num1);
        final EditText editText2 = (EditText) findViewById(R.id.num2);
        Button pButton = (Button) findViewById(R.id.btn1);
        Button mButton = (Button) findViewById(R.id.btn2);
        Button xButton = (Button) findViewById(R.id.btn3);
        Button nButton = (Button) findViewById(R.id.btn4);
        pButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getResult(editText1, editText2, "+"));
            }
        });
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getResult(editText1, editText2, "-"));
            }
        });
        xButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getResult(editText1, editText2, "*"));
            }
        });
        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(getResult(editText1, editText2, "/"));
            }
        });
    }

    public static String getResult(int num1, int num2, String type) {
        switch (type) {
            case "+":
                return String.valueOf(num1 + num2);
            case "-":
                return String.valueOf(num1 - num2);
            case "*":
                return String.valueOf(num1 * num2);
            case "/":
                return String.valueOf(num1 / num2);
        }
        return "failed";
    }

    public static String getResult(EditText num1, EditText num2, String type) {
        switch (type) {
            case "+":
                return String.valueOf(getInt(num1.getText().toString()) + getInt(num2.getText().toString()));
            case "-":
                return String.valueOf(getInt(num1.getText().toString()) - getInt(num2.getText().toString()));
            case "*":
                return String.valueOf(getInt(num1.getText().toString()) * getInt(num2.getText().toString()));
            case "/":
                return String.valueOf(getInt(num1.getText().toString()) / getInt(num2.getText().toString()));
        }
        return "failed";
    }

    public static int getInt(String value) {
        return Integer.parseInt(value);
    }
}

