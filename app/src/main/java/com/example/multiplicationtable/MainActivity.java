package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button btn;
    int Number;
    boolean Status = true;
    String result = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);
        btn = (Button)findViewById(R.id.button);
    }

    public void showTable() {
        editText = (EditText)findViewById(R.id.Number);
        Number = Integer.parseInt(String.valueOf(editText.getText()));
//        Number = Integer.parseInt(String.valueOf(editText));
        for (int i=1; i<=10; i++){
            int multi = Number*i;
            result += (Number +" " + "X" + " " + i + " " + "=" + " " + multi +"\n");
        }
        textView.setText(result);
        Status = false;
        btn.setText(R.string.reset);
    }

    public void functionality(View view){
        if(Status){
            showTable();
        }
        else{
            editText.setText("");
            textView.setText("");
            result="";
            btn.setText(R.string.btn_txt);
            Status = true;
        }
    }
}