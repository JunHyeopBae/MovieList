package com.example.information;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     static final int REQUEST_INFO = 1;
     TextView tVResult, tVResultLabel;
     String str;

     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          Button btnReq = (Button) findViewById(R.id.btnRequest);
          Button btnEnd = (Button) findViewById(R.id.btnEnd);
          tVResultLabel = (TextView) findViewById(R.id.tVResultLabel);
          tVResult = (TextView) findViewById(R.id.tVResult);
          EditText editTextId = findViewById(R.id.editTextID);
     }

     public void onClick(View view) {

     }
}

