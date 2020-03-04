package net.smallacademy.tabs.Place;


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
        //myrecyclerview = (RecyclerView) v.findViewById(R.id.first_place_recyclerview);
        //RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstplacemodel);
        //myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        //myrecyclerview.setAdapter(recyclerViewAdapter);
        initImageBitmaps();
       // swipeRefresh = (SwipeRefreshLayout) v.findViewById(R.id.swipe_refresh);
       // swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
       //     @Override
       //     public void onRefresh() {
       //         swipeRefresh.setRefreshing(true);
//
       //     }
       // });
        return v;
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://ic.pics.livejournal.com/nedbaylova/32106248/800364/800364_original.jpg");
        mNames.add("Гостиница «Калининград»");
        mDis.add("Адрес:\n" +
                " Калининград, Ленинский пр-т, д. 81; тел.: 8 (4012) 35-05-31; факс: 8 (4012) 53-60-21\n" +
                "Сайт: hotel.kaliningrad.ru;e-mail: rezerv@hotel.kaliningrad.ru\n" +
                "Гостиница расположена в центре города, из ее окон открывается вид на остров Канта (Кнайпхоф) и старинный Калининградский замок.\n" +
                "К услугам гостей 2 ресторана интернациональной кухни, бесплатная парковка и современные номера со спутниковым телевидением.\n" +
                "Номера гостиницы \"Калининград\" с удобными диванами оборудованы рабочим столом и собственной ванной комнатой.\n" +
                "При оплате бронь не взимается. НДС входит в стоимость номера/места. Завтрак не включен в стоимость номера." +
                " По желанию гостя завтрак стоимостью 350 руб. (шведский стол) может быть включен в стоимость номера." +
                " К услугам гостей 2 ресторана интернациональной кухни, бесплатная парковка, современные номера со спутниковым телевидением и Wi-Fi.\n" +
                "При размещении одного гостя в двухместном номере номер оплачивается полностью.\n" +
                "Проезд:\n" +
                "• от аэропорта «Храброво»: авт. №№ 144, 244э до ост.\"Гостиница \"Калининград\".\n" +
                "• от ж/д вокзала Калининград-Пассажирский (Южный вокзал): от ост. \"пр-т Калинина\"(300 м пешком):\n" +
                "авт. №№ 3, 5, 12, 18, 27, 36; трол. № 1; маршрут. такси №№ 63, 71, 85, 89 до ост. \"Гостиница \"Калининград\".\n" +
                "• от гостиницы до Калининградской областной научной библиотеки: от ост. \"Гостиница \"Калининград\":\n" +
                "авт. №№ 3, 9, 12, 18; маршрут. такси №№ 63, № 71 от ост. \"Гостиница \"Калининград\" до ост. \"КГТУ\", затем 100 м пешком до библиотеки; от ост. " +
                "\"Гостиница \"Калининград\": авт. №№ 5, 24, 36, 105, 106, 107; маршрут. такси №№ 72, 83 до ост. \"ул. Театральная\".");

        mImageUrls.add("https://i.pinimg.com/originals/d6/79/07/d679076b1245b5921f4e503bd34db986.jpg");
        mNames.add("Отель ГЕЛИОПАРК Кайзерхоф");
        mDis.add("Адрес\n"+
                "Калининград, ул. Октябрьская, д. 6А; тел.: 8 (4012) 59-22-22; факс: 8 (4012) 59-23-33;\n" +
                "Сайт\n: http://www.heliopark.ru/hotels/kaiserhof; e-mail: reception@kaiserhof.heliopark.ru\n" +
                "Отель расположен в самом сердце Калининграда (на берегу реки Преголя на территории так называемой Рыбной деревни).\n" +
                "Из окон номеров открывается потрясающий вид на Кафедральный собор. К услугам гостей элегантные номера с бесплатным Wi-Fi, а также спа-центр.\n" +
                "При оплате бронь не взимается. НДС входит в стоимость номера/места. Завтрак не включен в стоимость проживания. В стоимость проживания можно включить питание: завтрак 650 руб., полупансион (завтрак + ужин) 1300 руб., полный пансион (завтрак + обед + ужин) 1950 руб. В отеле расположен ресторан Хофбург, оформленный в духе рыцарского средневековья, предлагает большой выбор мясных блюд из европейского и русского меню.\n" +
                "Проезд:\n" +
                "• от аэропорта «Храброво»: авт. №№ 144, 244 до ост. \"Гостиница \"Калининград\", затем на трамв. № 5 или\n" +
                "маршрут. такси № 72 до ост. «Рыбная деревня».\n" +
                "• от ж/д вокзала Калининград-Пассажирский (Южный вокзал): маршрут. такси № 80 от ост. \"пр.\n" +
                "Калинина\" до ост. \"Рыбная деревня\".\n" +
                "• от гостиницы до Калининградской областной научной библиотеки: трамв. № 5 от ост. \"Рыбная\n" +
                "деревня\" до ост. \"Советский пр-т\", затем перейти дорогу к КГТУ и пройти 100 м до библиотеки; маршрут. такси № 72 от ост. \"Рыбная деревня\" до ост. \"ул. Театральная\".");

        mImageUrls.add("https://www.ahstatic.com/photos/7258_ho_00_p_1024x768.jpg");
        mNames.add("Гостиница Ибис Калининград Центр");
        mDis.add("Калининград, Московский проспект, 52; тел.: 8 (4012) 59-64-30; факс: 8 (4012) 59-64-31.\n" +
                "Сайт:\n" +
                "www.accorhotels.com/ru/hotel-7258-ibis-/index.shtml; e-mail: h7258@accor.com\n" +
                "Отель расположен в историческом центре Калининграда, вблизи Кафедрального собора и квартала Рыбная Деревня. В отеле находится конференц-зал для организации мероприятий вместимостью до 50 человек и две переговорные комнаты вместимостью до 12 человек. В ресторане Sud&Cie и барe Rendez-Vous всегда рады гостям. В отеле бесплатный Wi-Fi. Стоимоть парковки 200 рублей в сутки.\n" +
                "При оплате бронь не взимается. НДС входит в стоимость номера/места. Завтрак не включен в стоимость номера. В стоимость проживания можно включить завтрак – 390 руб. На территории отеля расположен ресторан. средиземноморской кухни Sudet Cie и бар Rendez-Vous.\n" +
                "Проезд:\n" +
                "• от аэропорта «Храброво»: авт. №№ 144, 244э до ост. \"Гостиница \"Калининград\", затем пешком 550 м. (≈ 7\n" +
                "мин.) или от ост. \"Гостиница \"Калининград\" маршрут. такси №72 до ост. \"СК Юность\".\n" +
                "• от ж/д вокзала Калининград-Пассажирский (Южный вокзал):\n" +
                "авт. № 49 или маршрут. такси № 77, №93 от ост. \"пр. Калинина\" до ост. \"СК Юность\"; или авт. №№ 3, 5, 12, 18, 27, 36, тролл. № 1, маршрут. такси №№ 63, 71, 85, 89 от ост. \"пр. Калинина\" до ост. \"Гостиница \"Калининград\", затем пешком 550 м. (≈ 7 мин.) до гостиницы.\n" +
                "• от гостиницы до Калининградской областной научной библиотеки: перейти на противоположную от отеля сторону Московского пр-та, от ост. \"СК Юность\":авт.№ 2, тролл. №2 до ост. \"ул. Театральная\"; или пешком дойти до ост. \"Гостиница \"Калининград\" 550 м и сесть на авт. №№ 3, 9, 12, 18. маршрут. такси №№ 63, №71 от ост. \"Гостиница \"Калининград\" до ост. \"КГТУ\", затем 100 м пешком до библиотеки или авт. №№ 5, 24, 36, 105, 106, 107, маршрут. такси №№ 72, 83, 89 от ост.");

        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg");
        mNames.add("Rocky Mountain National Park");
        mDis.add("fffffffffff");

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
