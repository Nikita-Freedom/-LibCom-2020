package net.smallacademy.tabs.Place;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import net.smallacademy.tabs.Activities.LoginActivity;
import net.smallacademy.tabs.ActivityPlaceInfo;
import net.smallacademy.tabs.MainActivity;
import net.smallacademy.tabs.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    Context mContext;
    //List<PlaceModel> mData;
    Dialog mydialod;
    Dialog dialog;
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mDis = new ArrayList<>();

    public RecyclerViewAdapter(Context mContext, List<PlaceModel> mData, ArrayList<String> imageNames, ArrayList<String> images, ArrayList<String> mdis){
        mDis = mdis;
        mImageNames = imageNames;
        mImages = images;
        this.mContext = mContext;
        //this.mData = mData;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_first_place,parent,false);
        final MyViewHolder vHolder = new MyViewHolder(v);
     //   mydialod = new Dialog(mContext);
     //   mydialod.setContentView(R.layout.place_info);
//
     //   vHolder.item_first_place.setOnClickListener(new View.OnClickListener() {
     //       @SuppressLint("ShowToast")
     //       @Override
     //       public void onClick(View v) {
     //           Toast.makeText(mContext, "Click"+String.valueOf(vHolder.getAdapterPosition()), Toast.LENGTH_LONG);
     //           mydialod.show();
     //       }
     //   });
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
       // holder.tv_name.setText(mData.get(position).getName());
       // holder.img.setImageResource(mData.get(position).getPhoto());
        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.img);

        holder.tv_name.setText(mImageNames.get(position));
       // holder.tv_Dis.setText(mDis.get(position));

        holder.item_first_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames.get(position));

                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, ActivityPlaceInfo.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("image_dis", mDis.get(position));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_first_place;
        private LinearLayout item_second_place;
        private TextView tv_name;
        private TextView tv_Dis;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_first_place = (LinearLayout) itemView.findViewById(R.id.first_place_item_id);
            tv_name = (TextView) itemView.findViewById(R.id.name_first_place);
            img = (ImageView) itemView.findViewById(R.id.img_first_place);
            tv_Dis = (TextView) itemView.findViewById(R.id.description);

        }
    }
}
