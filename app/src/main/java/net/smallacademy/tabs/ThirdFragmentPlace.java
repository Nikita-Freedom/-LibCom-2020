package net.smallacademy.tabs;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.smallacademy.tabs.Place.PlaceModel;
import net.smallacademy.tabs.Place.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragmentPlace extends Fragment {
    View v;
    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mDis2 = new ArrayList<>();
    private SwipeRefreshLayout swipeRefresh;
    private RecyclerView myrecyclerview;
    private List<PlaceModel> lstplacemodel;

    public ThirdFragmentPlace() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_third_place, container, false);
        // myrecyclerview = (RecyclerView) v.findViewById(R.id.second_place_recyclerview);
        // RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstplacemodel, );
        // myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        // myrecyclerview.setAdapter(recyclerViewAdapter);
        swipeRefresh = (SwipeRefreshLayout) v.findViewById(R.id.swipe_refresh_third);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                swipeRefresh.setRefreshing(false);
                //initImageBitmaps();

            }
        });
        initImageBitmaps();
        return v;
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");


        mImageUrls2.add("https://avatars.mds.yandex.net/get-altay/1868686/2a00000169dece8a17dea07d3789cf872301/XXL");
        mNames2.add("Табаско");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "07:00 – 21:00\n" +
                "Вторник - " +
                "07:00 – 21:00\n" +
                "Среда - " +
                "07:00 – 21:00\n" +
                "Четверг - " +
                "07:00 – 21:00\n" +
                "Пятница - " +
                "07:00 – 22:00\n" +
                "Суббота - " +
                "07:00 – 22:00\n" +
                "Воскресенье - " +
                "07:00 – 21:00\n\n" +
                "Адрес:\n\n" +
                "Россия, Калининград, Театральная улица, 30, ТРЦ Европа, этаж 2\n\n" +
                "Номер телефона:\n" +
                "+7 (4012) 92-11-31\n");


        mImageUrls2.add("https://mir-s3-cdn-cf.behance.net/project_modules/1400/0c00f087230889.5db17f751f07e.jpg");
        mNames2.add("Кафе \"Порто кофе\"");
        mDis2.add("Адрес:\n" +
                "ул. Черняховского, 6А, Калининград.\n\n" +
                "Время работы:\n" +
                "Понедельник - " +
                "07:00 – 23:00\n" +
                "Вторник - " +
                "07:00 – 23:00\n" +
                "Среда - " +
                "07:00 – 23:00\n" +
                "Четверг - " +
                "07:00 – 23:00\n" +
                "Пятница - " +
                "07:00 – 02:00\n" +
                "Суббота - " +
                "09:00 – 02:00\n" +
                "Воскресенье - " +
                "09:00 – 23:00" +
                "Номер телефона:\n" +
                "+7 (4012) 37-98-28\n");

        mImageUrls2.add("https://avatars.mds.yandex.net/get-altay/1992662/2a0000016f7c2d550d5f54dc091bda4d9790/XXL");
        mNames2.add("Лофт Кафе \"Терраса\"");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "12:00 – 00:00\n" +
                "Вторник - " +
                "12:00 – 00:00\n" +
                "Среда - " +
                "12:00 – 00:00\n" +
                "Четверг - " +
                "12:00 – 00:00\n" +
                "Пятница - " +
                "12:00 – 04:00\n" +
                "Суббота - " +
                "12:00 – 04:00\n" +
                "Воскресенье - " +
                "12:00 – 00:00\n\n" +
                "Адрес:\n" +
                "ул. Профессора Баранова, 34, Калининград ТЦ Акрополь, эт. 7\n\n" +
                "Номер телефона:\n" +
                "+7 (4012) 52-49-45");

        mImageUrls2.add("https://10619-2.s.cdn12.com/rests/small/w550/h367/201_500741905.jpg");
        mNames2.add("Кафе-клуб \"Океан\"");
        mDis2.add("Время  работы:\n" +
                "Понедельник - " +
                "12:00 – 02:00\n" +
                "Вторник - " +
                "12:00 – 02:00\n" +
                "Среда - " +
                "12:00 – 02:00\n" +
                "Четверг - " +
                "12:00 – 02:00\n" +
                "Пятница - " +
                "12:00 – 06:00\n" +
                "Суббота - " +
                "12:00 – 06:00\n" +
                "Воскресенье - " +
                "12:00 – 02:00\n\n" +
                "Адрес:\n\n" +
                "Театральная ул., 35, Калининград\n" +
                "БЦ Морской, эт. 2\n\n" +
                "Номер телефона:\n" +
                "+7 (4012) 52-45-49\n");

        mImageUrls2.add("https://avatars.mds.yandex.net/get-altay/223006/2a0000015b2023c11c40e38f5529a46ee2f4/XXL");
        mNames2.add("\"Борщ и сало\"");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "12:00 – 00:00\n" +
                "Вторник - " +
                "12:00 – 00:00\n" +
                "Среда - " +
                "12:00 – 00:00\n" +
                "Четверг - " +
                "12:00 – 00:00\n" +
                "Пятница - " +
                "12:00 – 02:00\n" +
                "Суббота - " +
                "12:00 – 02:00\n" +
                "Воскресенье - " +
                "12:00 – 00:00\n\n" +
                "Адрес:\n\n" +
                "площадь Победы, 10, Калининград\n\n" +
                "Номер телефона:\n" +
                "+7 (4012) 35-76-76\n");



        mImageUrls2.add("https://www.newkaliningrad.ru/upload/iblock/9c5/9c5a2b2b989ffe114782d222b2c1baef.jpg");
        mNames2.add("Патиссон Markt");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "09:00 – 23:00\n" +
                "Вторник - " +
                "09:00 – 23:00\n" +
                "Среда - " +
                "09:00 – 23:00\n" +
                "Четверг - " +
                "09:00 – 23:00\n" +
                "Пятница - " +
                "09:00 – 00:00\n" +
                "Суббота - " +
                "09:00 – 00:00\n" +
                "Воскресенье - " +
                "09:00 – 23:00\n\n" +
                "Адрес:\n\n" +
                "просп. Мира, 26, Калининград\n\n" +
                "Номер телефона:\n" +
                "+7 (962) 266-62-96\n");


        mImageUrls2.add("https://avatars.mds.yandex.net/get-pdb/1863957/a4f4da09-875f-4f04-8621-311eecf3bcf2/s1200");
        mNames2.add("Königsbäcker");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "08:00 – 21:00\n" +
                "Вторник - " +
                "08:00 – 21:00\n" +
                "Среда - " +
                "08:00 – 21:00\n" +
                "Четверг - " +
                "08:00 – 21:00\n" +
                "Пятница - " +
                "08:00 – 21:00\n" +
                "Суббота - " +
                "09:00 – 21:00\n" +
                "Воскресенье - " +
                "09:00 – 21:00\n\n" +
                "Адреса:\n\n" +
                "\n" +
                "1. Пролетарская ул., 55, Калининград\n" +
                "2. ул. Александра Невского, 30, Калининград\n" +
                "3. Краснооктябрьская ул., 1, Калининград\n" +
                "4. ул. Фрунзе, 21, Калининград\n" +
                "5. Советский просп., 6А, Калининград, ТЦ Северный, этаж 1\n" +
                "6. Советский просп., 234, Калининград\n" +
                "7. Житомирская ул., 6, Калининград\n\n" +
                "Номер телефона:\n" +
                "+7 (906) 214-56-48\n");

        mImageUrls2.add("https://pravdazdes.ru/pictures/09c8529237f96a6dc6192499276bcdea82.jpg");
        mNames2.add("Круассан кафе");
        mDis2.add("Время работы:\n\n" +
                "Понедельник - " +
                "08:00 – 22:00\n" +
                "Вторник - " +
                "08:00 – 22:00\n" +
                "Среда - " +
                "08:00 – 22:00\n" +
                "Четверг - " +
                "08:00 – 22:00\n" +
                "Пятница - " +
                "08:00 – 23:00\n" +
                "Суббота - " +
                "09:00 – 23:00\n" +
                "Воскресенье - \n" +
                "09:00 – 22:00\n\n" +
                "Адрес:\n\n" +
                "1. ул. Горького, 150А, Калининград\n" +
                "2. Ленинский просп., 67, Калининград\n" +
                "3. ул. Александра Невского, 30, Калининград\n" +
                "4. ул. Багратиона, 91, Калининград\n" +
                "5. просп. Мира, 23, Калининград\n\n" +
                "Номер телефона:\n" +
                "+7 (4012) 38-94-68\n" +
                "+7 (4012) 75-41-79\n");
        swipeRefresh.setRefreshing(false);
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        myrecyclerview = (RecyclerView) v.findViewById(R.id.third_place_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter2 = new RecyclerViewAdapter(getContext(), lstplacemodel, mNames2, mImageUrls2, mDis2);
        myrecyclerview.setAdapter(recyclerViewAdapter2);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstplacemodel = new ArrayList<>();
        lstplacemodel.add(new PlaceModel("Библиотека", R.drawable.lera));
    }

}
