package net.smallacademy.tabs.Place;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.text.util.Linkify;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import net.smallacademy.tabs.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstPlace extends Fragment {
    View v;
    private SwipeRefreshLayout swipeRefresh;
    private static final String TAG = "FirstPlace";
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDis = new ArrayList<>();
    private RecyclerView myrecyclerview;
    private List<PlaceModel> lstplacemodel;
    public FirstPlace() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_first_place, container, false);
        swipeRefresh = (SwipeRefreshLayout) v.findViewById(R.id.swipe_refresh_first);
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
        mImageUrls.add("https://www.ahstatic.com/photos/7258_ho_00_p_1024x768.jpg");
        mNames.add("Гостиница Ibis Калининград");
        mDis.add("Адрес:\n" +
                "Калининград, Московский проспект, 52; тел.: 8 (4012) 59-64-30; факс: 8 (4012) 59-64-31.\n\n" +
                "Сайт:\n" +
                "www.accorhotels.com/ru/hotel-7258-ibis-/index.shtml;\n\n" +
                " e-mail: h7258@accor.com\n\n" +
                "Отель расположен в историческом центре Калининграда, вблизи Кафедрального собора и квартала Рыбная Деревня. В отеле находится конференц-зал для организации мероприятий вместимостью до 50 человек и две переговорные комнаты вместимостью до 12 человек. В ресторане Sud&Cie и барe Rendez-Vous всегда рады гостям. В отеле бесплатный Wi-Fi. Стоимоть парковки 200 рублей в сутки.\n" +
                "При оплате бронь не взимается. НДС входит в стоимость номера/места. Завтрак не включен в стоимость номера. В стоимость проживания можно включить завтрак – 390 руб. На территории отеля расположен ресторан. средиземноморской кухни Sudet Cie и бар Rendez-Vous.\n\n" +
                "Проезд:\n\n" +

                "От аэропорта «Храброво»:\n" +
                " авт. №№ 144, 244э до остановки \"Гостиница \"Калининград\", затем пешком 550 м. (≈ 7 мин.) или от ост. \"Гостиница \"Калининград\" маршрут. такси №72 до ост. \"СК Юность\".\n\n" +

                "От ж/д вокзала Калининград-Пассажирский (Южный вокзал):\n" +
                "авт. № 49 или маршрут. такси № 77, №93 от ост. \"пр. Калинина\" до ост. \"СК Юность\"; или авт. №№ 3, 5, 12, 18, 27, 36, тролл. № 1, маршрут. такси №№ 63, 71, 85, 89 от ост. \"пр. Калинина\" до ост. \"Гостиница \"Калининград\", затем пешком 550 м. (≈ 7 мин.) до гостиницы.\n\n" +

                "От гостиницы до Калининградской областной научной библиотеки:\n" +
                " перейти на противоположную от отеля сторону Московского пр-та, от ост. \"СК Юность\":авт.№ 2, тролл. №2 до ост. \"ул. Театральная\"; или пешком дойти до ост. \"Гостиница \"Калининград\" 550 м и сесть на авт. №№ 3, 9, 12, 18. маршрут. такси №№ 63, №71 от ост. \"Гостиница \"Калининград\" до ост. \"КГТУ\", затем 100 м пешком до библиотеки или авт. №№ 5, 24, 36, 105, 106, 107, маршрут. такси №№ 72, 83, 89 от ост.");


        mImageUrls.add("https://hi-kaliningrad.com/wp-content/uploads/2019/09/holiday-inn-otel-na-pregole-reke-1.jpg");
        mNames.add("Отель \"Holliday Inn\"");
        mDis.add("Адрес:\n" +
                "ул. Гюго, 1, Калининград 236006 Россия\n\n" +
                "Номер телефона:\n" +
                "8 (800) 500-98-54\n\n");
        mImageUrls.add("https://ic.pics.livejournal.com/nedbaylova/32106248/800364/800364_original.jpg");
        mNames.add("Гостиница «Калининград»");
        mDis.add("Адрес:\n\n" +
                " Калининград, Ленинский пр-т, д. 81; тел.: 8 (4012) 35-05-31; факс: 8 (4012) 53-60-21\n\n" +
                "Сайт: hotel.kaliningrad.ru;\n\n" +
                "e-mail: rezerv@hotel.kaliningrad.ru\n\n" +
                "Гостиница расположена в центре города, из ее окон открывается вид на остров Канта (Кнайпхоф) и старинный Калининградский замок.\n" +
                "К услугам гостей 2 ресторана интернациональной кухни, бесплатная парковка и современные номера со спутниковым телевидением.\n" +
                "Номера гостиницы \"Калининград\" с удобными диванами оборудованы рабочим столом и собственной ванной комнатой.\n" +
                "При оплате бронь не взимается. НДС входит в стоимость номера/места. Завтрак не включен в стоимость номера.\n" +
                " По желанию гостя завтрак стоимостью 350 руб. (шведский стол) может быть включен в стоимость номера." +
                " К услугам гостей 2 ресторана интернациональной кухни, бесплатная парковка, современные номера со спутниковым телевидением и Wi-Fi.\n" +
                "При размещении одного гостя в двухместном номере номер оплачивается полностью.\n\n" +
                "Проезд:\n\n" +

                "От аэропорта «Храброво»:\n" +
                " авт. №№ 144, 244э до ост.\"Гостиница \"Калининград\".\n\n" +

                "От ж/д вокзала Калининград-Пассажирский (Южный вокзал):\n" +
                " от ост. \"пр-т Калинина\"(300 м пешком):\n" +
                "авт. №№ 3, 5, 12, 18, 27, 36; трол. № 1; маршрут. такси №№ 63, 71, 85, 89 до ост. \"Гостиница \"Калининград\".\n\n" +

                "От гостиницы до Калининградской областной научной библиотеки:\n" +
                " от ост. \"Гостиница \"Калининград\":\n" +
                "авт. №№ 3, 9, 12, 18; маршрут. такси №№ 63, № 71 от ост. \"Гостиница \"Калининград\" до ост. \"КГТУ\", затем 100 м пешком до библиотеки; от ост. " +
                "\"Гостиница \"Калининград\": авт. №№ 5, 24, 36, 105, 106, 107; маршрут. такси №№ 72, 83 до ост. \"ул. Театральная\".");
        swipeRefresh.setRefreshing(false);
        initRecyclerView();

    }


    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        myrecyclerview = (RecyclerView) v.findViewById(R.id.first_place_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstplacemodel, mNames, mImageUrls, mDis);
        myrecyclerview.setAdapter(recyclerViewAdapter);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstplacemodel = new ArrayList<>();
        lstplacemodel.add(new PlaceModel("Библиотека", R.drawable.lera));

    }


}
