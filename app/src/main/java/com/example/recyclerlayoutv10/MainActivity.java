package com.example.recyclerlayoutv10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView memesrecyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     memesrecyclerview =findViewById(R.id.birthdayrecyclerview);
        ArrayList<birthdays>  meme =new ArrayList<>();

//        meme.add(new birthdays("PAPA","1 FEB", "https://www.homemade-gifts-made-easy.com/image-files/donut-with-candle-800x533.jpg.pagespeed.ce.ffPKo9Sv15.jpg"));
//        meme.add(new birthdays("MUMMY","27 OCT", "https://www.homemade-gifts-made-easy.com/image-files/donut-with-candle-800x533.jpg.pagespeed.ce.ffPKo9Sv15.jpg"));
//        meme.add(new birthdays("DEEPAK","31 MAY", "https://serving.photos.photobox.com/73959015ce57300a4b200d0c1ab413b5bbc4046e2601f7b64fffb2b2b424ad74d07824b6.jpg"));
//        meme.add(new birthdays("MADHU DI","10 SEP", "https://www.homemade-gifts-made-easy.com/image-files/donut-with-candle-800x533.jpg.pagespeed.ce.ffPKo9Sv15.jpg"));
//        meme.add(new birthdays("PRINCESS","8 AUG", "https://serving.photos.photobox.com/1487751199de18a2c7cedfd93467cc5331bf2e6b48ef729767ae6bde1249bfa95eb5b2fd.jpg"));
//        meme.add(new birthdays("PAWAN BHAIA","27 SEP", "https://serving.photos.photobox.com/91150438db878ce1aa6742a02f90da93b1eea3e9089b6edd4c146ba06b48eb850c6c228b.jpg"));
//        meme.add(new birthdays("LOVELY DI","8 SEP", "https://www.homemade-gifts-made-easy.com/image-files/donut-with-candle-800x533.jpg.pagespeed.ce.ffPKo9Sv15.jpg"));
//        meme.add(new birthdays("JIJAJI","21 DEC", "https://www.homemade-gifts-made-easy.com/image-files/donut-with-candle-800x533.jpg.pagespeed.ce.ffPKo9Sv15.jpg"));
//        meme.add(new birthdays("TUTTU","17 JULY", "https://serving.photos.photobox.com/67396833744e249328fdeb1a413a2202b74550ef736b7938938f92fa46a3d0497a0a57fd.jpg"));

        

//        meme.add(new birthdays("MELMAN","", ""));
//        meme.add(new birthdays("JOBBIN","", ""));
//        meme.add(new birthdays("MIKKI","", ""));
//
//        meme.add(new birthdays("","", ""));
//        meme.add(new birthdays("","", "https://serving.photos.photobox.com/34792705135ece0f6d7c4c4b1172fec40691d673c57cc6f8f69e7c832791560f154d88c3.jpg"));

        recyclerviewadapter adapter =new recyclerviewadapter(this);
        adapter.setMeme(meme);
        memesrecyclerview.setAdapter(adapter);
        memesrecyclerview.setLayoutManager(new GridLayoutManager(this,2));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }
}