package com.example.mp3_2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ListView lvten;
    TextView tvname;
    ArrayList<song> arraysong;

    int position = 0;
//    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvten = (ListView) findViewById(R.id.lvten);
        tvname = (TextView) findViewById(R.id.tvname);
        //      anhxa();
        addSong();

        customadapter customadapter = new customadapter(this, R.layout.item_name, arraysong);
        lvten.setAdapter(customadapter);

        lvten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "" + arraysong.get(position));
                Intent mh2 = new Intent(MainActivity.this, Main2Activity.class);
                mh2.putExtra("pos", position);
                startActivity(mh2);

            }
        });
    }


    private void addSong() {
        arraysong = new ArrayList<>();
        arraysong.add(new song("Đời là thế thôi", R.raw.doi_la_the_thoi));
        arraysong.add(new song("Đúng người đúng thời điểm", R.raw.dung_nguoi_dung_thoi_diem));
        arraysong.add(new song("Em sẽ là cô dâu", R.raw.em_se_la_co_dau));
        arraysong.add(new song("Hồng nhân", R.raw.hong_nhan));
        arraysong.add(new song("Khuôn mặt đáng thương", R.raw.khuon_mat_dang_thuong));
        arraysong.add(new song("Một đêm say", R.raw.mot_dem_say));
        arraysong.add(new song("Về đây em lo", R.raw.ve_day_em_lo));

    }


}
