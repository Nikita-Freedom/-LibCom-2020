package net.smallacademy.tabs;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ActivityPlaceInfo2 extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url2") && getIntent().hasExtra("image_name2") && getIntent().hasExtra("image_dis2")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl2 = getIntent().getStringExtra("image_url2");
            String imageName2 = getIntent().getStringExtra("image_name2");
            String mDis2 = getIntent().getStringExtra("image_dis2");
            setImage(imageUrl2, imageName2, mDis2 );
        }
    }


    private void setImage(String imageUrl2, String imageName2, String mDis2){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name2 = findViewById(R.id.image_description2);
        TextView dis2 = findViewById(R.id.description2);




        name2.setText(imageName2);
        dis2.setText(mDis2);


        ImageView image2 = findViewById(R.id.image22);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl2)
                .into(image2);
    }

}