package ado.edu.intec.layoutsapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linearLayoutVerticalButton = (Button) findViewById(R.id.linearLayoutVertical);
        Button linearLayoutHorizontalButton = (Button) findViewById(R.id.linearLayoutHorizontal);
        Button relativeLayoutButton = (Button) findViewById(R.id.relativeLayout);
        Button tableLayoutButton = (Button) findViewById(R.id.tableLayout);
        Button frameLayoutButton = (Button) findViewById(R.id.frameLayout);
        Button listViewButton = (Button) findViewById(R.id.listView);
        Button gridViewButton = (Button) findViewById(R.id.gridView);
        Button customAdapterButton = (Button) findViewById(R.id.customAdapter);

        linearLayoutVerticalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutVerticalActivity.class);
                startActivity(intent);
            }
        });

        linearLayoutHorizontalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutHorizontalActivity.class);
                startActivity(intent);
            }
        });
        relativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });
        tableLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        frameLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
        listViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });
        gridViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                startActivity(intent);
            }
        });
        customAdapterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
    }
}
