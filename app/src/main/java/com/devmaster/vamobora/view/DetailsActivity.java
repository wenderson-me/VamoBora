package com.devmaster.vamobora.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.devmaster.vamobora.R;

public class DetailsActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        this.mViewHolder.checkParticipate = findViewById(R.id.check_participate);
    }

    public static class ViewHolder{
        CheckBox checkParticipate;
    }
}
