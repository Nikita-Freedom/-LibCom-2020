package net.smallacademy.tabs.Place;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import net.smallacademy.tabs.R;

import static net.smallacademy.tabs.R.drawable.hotel;

public class ActivityPlaceInfo extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name") && getIntent().hasExtra("image_dis")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String mDis = getIntent().getStringExtra("image_dis");
            setImage(imageUrl, imageName, mDis );
        }
    }


    private void setImage(String imageUrl, String imageName, String mDis){
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView name = findViewById(R.id.image_description);
        TextView dis = findViewById(R.id.description);
        name.setText(imageName);
        dis.setText(mDis);


        ImageView image = findViewById(R.id.image);
       Glide.with(this)
               .asBitmap()
               .load(imageUrl)
               .into(image);
    }

}
