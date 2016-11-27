package com.odin.fsociety.bdtesteodin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView mTextCondicao;
    Button mbtnBotao1;
    Button mbtnBotao2;
    Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mTextCondicao = (TextView)findViewById(R.id.textCondicao);
        mbtnBotao1 = (Button)findViewById(R.id.btnBotao1);
        mbtnBotao2 = (Button)findViewById(R.id.btnBotao2);
        mRef = new Firebase("https://bdteste-b1752.firebaseio.com/condicao");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mTextCondicao.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
