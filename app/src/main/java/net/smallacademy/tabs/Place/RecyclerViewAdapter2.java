package net.smallacademy.tabs.Place;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
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

import net.smallacademy.tabs.ActivityPlaceInfo;
import net.smallacademy.tabs.ActivityPlaceInfo2;
import net.smallacademy.tabs.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder2> {
    private static final String TAG = "RecyclerViewAdapter2";
    Context mContext2;
    //List<PlaceModel> mData;
    Dialog mydialod;
    Dialog dialog;
    private ArrayList<String> mImageNames2 = new ArrayList<>();
    private ArrayList<String> mImages2 = new ArrayList<>();
    private ArrayList<String> mDis2 = new ArrayList<>();

    public RecyclerViewAdapter2(Context mContext, List<PlaceModel> mData, ArrayList<String> imageNames2, ArrayList<String> images2, ArrayList<String> mdis2){
        mDis2 = mdis2;
        mImageNames2 = imageNames2;
        mImages2 = images2;
        this.mContext2 = mContext;
        //this.mData = mData;

    }
    @NonNull
    @Override
    public MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext2).inflate(R.layout.item_second_place,parent,false);
        final MyViewHolder2 vHolder2 = new MyViewHolder2(v);
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
        return vHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder2 holder, final int position) {
        // holder.tv_name.setText(mData.get(position).getName());
        // holder.img.setImageResource(mData.get(position).getPhoto());
       Glide.with(mContext2)
               .asBitmap()
               .load(mImages2.get(position))
               .into(holder.img2);

        holder.tv_name2.setText(mImageNames2.get(position));
//         holder.tv_Dis2.setText(mDis2.get(position));

        holder.item_second_place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: clicked on: " + mImageNames2.get(position));

                Toast.makeText(mContext2, mImageNames2.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext2, ActivityPlaceInfo2.class);
                intent.putExtra("image_url2", mImages2.get(position));
                intent.putExtra("image_name2", mImageNames2.get(position));
               intent.putExtra("image_dis", mDis2.get(position));
                mContext2.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames2.size();
    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder{
        private LinearLayout item_first_place2;
        private LinearLayout item_second_place2;
        private TextView tv_name2;
        private TextView tv_Dis2;
        private ImageView img2;

        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            item_second_place2 = (LinearLayout) itemView.findViewById(R.id.second_place_item_id);
            tv_name2 = (TextView) itemView.findViewById(R.id.name_second_place);
            img2 = (ImageView) itemView.findViewById(R.id.img_second_place);
            tv_Dis2 = (TextView) itemView.findViewById(R.id.description2);
        }
    }
}

