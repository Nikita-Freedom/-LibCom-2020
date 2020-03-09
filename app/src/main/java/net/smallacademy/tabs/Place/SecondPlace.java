package net.smallacademy.tabs.Place;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.smallacademy.tabs.R;

import java.util.ArrayList;
import java.util.List;

import static androidx.constraintlayout.widget.Constraints.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondPlace extends Fragment {
    View v;
    private ArrayList<String> mNames2 = new ArrayList<>();
    private ArrayList<String> mImageUrls2 = new ArrayList<>();
    private ArrayList<String> mDis2 = new ArrayList<>();

    private RecyclerView myrecyclerview;
    private List<PlaceModel> lstplacemodel;

    public SecondPlace() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        v =  inflater.inflate(R.layout.fragment_second_place, container, false);
       // myrecyclerview = (RecyclerView) v.findViewById(R.id.second_place_recyclerview);
       // RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstplacemodel, );
       // myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
       // myrecyclerview.setAdapter(recyclerViewAdapter);
        initImageBitmaps();
        return v;
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");
        mImageUrls2.add("https://avatars.mds.yandex.net/get-pdb/368827/4bc876c0-30a2-4f1f-9759-ddbb15a7734e/s1200?webp=false");
        mNames2.add("Музей янтаря");
        mDis2.add("Время работы\n" +
                "Понедельник - " +
                "Выходной\n" +
                "Вторник - " +
                "10:00 – 18:00\n" +
                "Среда - " +
                "10:00 – 18:00\n" +
                "Четверг - " +
                "10:00 – 18:00\n" +
                "Пятница - " +
                "10:00 – 18:00\n" +
                "Суббота - " +
                "10:00 – 18:00\n" +
                "Воскресенье - " +
                "10:00 – 18:00\n\n" +
                "Адрес\n" +
                "Россия, Калининград, площадь Маршала Василевского, 1, 236016\n\n" +
                "Единственный в России Музей янтаря был открыт в 1979 году. Он расположен в центре Калининграда на берегу озера Верхнее в крепостной башне середины ХIХ века.\n" +
                "\n" +
                "Башня была построена в 1853 году под руководством разработчика общего плана крепостных сооружений Кёнигсберга шефа инженерного корпуса Эрнста Людвига фон Астера и входила в систему городских оборонительных укреплений." +
                " Она носила имя прусского генерал-фельдмаршала Фридриха Карла Дона, участника освободительной войны против наполеоновского нашествия." +
                " Здание является также памятником Второй мировой войны.\n" +
                "\n" +
                "Музей янтаря – это музей одного минерала. Экспозиция расположена на трех этажах здания общей площадью около 1000 кв. метров. По содержанию она делится на естественно-научную и культурно-историческую части.\n" +
                "\n" +
                "Янтарь – это окаменевшая смола древних хвойных деревьев, произраставших более 40 млн. лет назад на современной территории Скандинавского полуострова и прилегающих к нему областях дна Балтийского моря.\n" +
                "\n" +
                "В естественно-научном разделе собрания представлены различные по весу, цветовой гамме, степени прозрачности образцы янтаря. В экспозиции находится самый крупный в России «солнечный камень»: его вес – 4 кг 280 г.\n" +
                "Значительную часть коллекции составляют образцы янтаря с включениями остатков животных и растительных организмов, попавших десятки миллионов лет назад в некогда жидкую и вязкую смолу." +
                " Включения в балтийском янтаре представляют большой научный интерес благодаря своему разнообразию и превосходной сохранности. Они ценны для уточнения наших знаний о флоре и фауне, а также климатических условиях на Земле 40 – 45 млн. лет назад.\n" +
                " На сегодняшний день коллекция Калининградского музея янтаря является главным российским национальным фондом инклюзов в балтийском янтаре.\n\n"
        );

        mImageUrls2.add("https://www.kenig-gid.ru/images/rocketlauncher/foto/11.jpg");
        mNames2.add("Росгартенские ворота в Калининграде");
        mDis2.add("Адрес:\n" +
                "Россия, Калининград, площадь Маршала Василевского, 3А, 236016\n\n" +
        "Росгартенские ворота, также известны как ворота Россгартен (Rosgartenskie vorota, немецкое название Roßgärter Tor) - один из семи сохранившихся городских ворот Калининграда.\n\n" +
                "Названные в честь района Россгартен (Rossgarten, немецкое - Roßgarten). Данные ворота заменили предыдущую версию ворот начала 17 века.\n"+
                "Сохранившиеся до наших дней Росгартенские ворота были построены между 1852 и 1855 годами под руководством Вильгельма Людвига Штюрмера, для укреплений оборонительной системы Кёнигсберга.\n" +
                "\n" +
                "Рядом с Росгартенскими воротами располагалась Башня «Дона» (ныне в башне находится музей Янтаря). Оба строения были соединены оборонительной стеной и составляли единый архитектурный ансамбль, часть которого можно видеть и в настоящее время.");

        mImageUrls2.add("https://www.culture.ru/storage/images/fc4dd2cce03a6fcb34cade377fee4bda/21e72e9254f9827150201bf167fbe549.jpg");
        mNames2.add("Музей мирового океана");
        mDis2.add("Время работы\n" +
                "Понедельник - " +
                "Выходной\n" +
                "Вторник - " +
                "Выходной\n" +
                "Среда - " +
                "10:00 – 18:00\n" +
                "Четверг - " +
                "10:00 – 18:00\n" +
                "Пятница - " +
                "10:00 – 18:00\n" +
                "Суббота - " +
                "10:00 – 18:00\n" +
                "Воскресенье - " +
                "10:00 – 18:00\n\n" +
                "Адрес:\n" +
                "Россия, Калининград, набережная Петра Великого, 1, 236006\n\n"+
                "Музей Мирового океана — первый в России комплексный маринистический музей, расположенный в Калининграде. Имеет экспозиции, посвящённые судоходству, морской флоре и фауне, геологии и гидрологии мирового океана, а также маринистическую библиотеку и действующую экологическую станцию.\n" +
                "\n" +
                "Посетитель может осмотреть музейные суда «Витязь», «Космонавт Виктор Пацаев» (судно входило в число судов Службы космических исследований АН СССР), подводную лодку Б-413, а также скелет кашалота; познакомиться с коллекцией старинных пушек и якорей. Филиал музея — ледокол «Красин» — находится на вечной стоянке в Санкт-Петербурге.\n" +
                "\n" +
                "В музее проводятся конгрессы, действуют тематические клубы. Музей также ведёт научную работу.");

        mImageUrls2.add("https://avatars.mds.yandex.net/get-pdb/202366/49ff7e2e-5a69-4760-b325-5f4ed94f2ec1/s1200?webp=false");
        mNames2.add("Музей «Фридландские ворота»");
        mDis2.add("Время работы\n" +
                "Понедельник - " +
                "10:00 – 18:00\n" +
                "Вторник - " +
                "10:00 – 18:00\n" +
                "Среда - " +
                "10:00 – 18:00\n" +
                "Четверг - " +
                "10:00 – 18:00\n" +
                "Пятница - " +
                "10:00 – 18:00\n" +
                "Суббота - " +
                "10:00 – 18:00\n" +
                "Воскресенье - " +
                "10:00 – 18:00\n\n" +
                "Адрес:\n" +
                "Россия, Калининград, улица Дзержинского, 30\n\n" +
                "Музей истории города «Фридландские ворота» располагается в одноименном фортификационном сооружении — памятнике архитектуры XIX в. В 2017 г\n." +
                " Фридландские ворота отмечают 155-летие, а музейный комплекс «Фридландские ворота» 15-летие.\n" +
                "За свою историю Фридландские ворота входили в состав оборонительных сооружений Кёнигсберга XIX в.\n " +
                "Через них проходила дорога, ведущая к городу Фридланд (г. Правдинск Калининградской области). \n" +
                "До Первой мировой войны через ворота можно было попасть в город или выехать из него, а с 1920 г. они стали входными воротами в парк «Южный».\n" +
                " В 1950-1960-е гг. их помещения использовали как овощехранилище. В 2002 г. во «Фридландских воротах» начал работать музей как отдел парка.\n" +
                " А в 2008 г. музей получил статус самостоятельного учреждения культуры.\n " +
                " Благодаря  интересной, мульти культурной истории города, которая  насчитывает около восьми веков активной жизни, музей представил экспозиции, раскрывающие события от эпохи Тевтонского ордена  (1255 г.) до первых переселенцев Калининградской области после Второй мировой войны.\n" +
                " В каждом зале применены разные приемы и методы построения экспозиции.  Пространства, созданные с помощью художественных и мультимедийных средств, коллекции экспонатов позволяют окунуться в жизнь города с его развитой инфраструктурой в разные периоды времени.\n" +
                " Комплекс «Фридландские ворота» делает упор на инновационные практики музейного дела, расширяет выставочную деятельность и активно развивает направление музейной педагогики с использованием интерактивных программ.\n" +
                " Сегодня музей активно развивается и продолжает участвовать в грантовых, конкурсных программах для реализации актуальных проектов  культурной и социальной значимости.");

        mImageUrls2.add("https://proehal.ru/media/sights/kaliningrad/zoopark_02.jpg");
        mNames2.add("Калининградский зоопарк");
        mDis2.add("Время работы\n" +
                "Понедельник - " +
                "09:00 – 18:00\n" +
                "Вторник - " +
                "09:00 – 18:00\n" +
                "Среда - " +
                "09:00 – 18:00\n" +
                "Четверг - " +
                "09:00 – 18:00\n" +
                "Пятница - " +
                "09:00 – 18:00\n" +
                "Суббота - " +
                "09:00 – 18:00\n" +
                "Воскресенье - " +
                "09:00 – 18:00\n\n" +
                "Адрес\n" +
                "Россия, Калининград, проспект Мира, 26, 236022\n\n"+
                "Калининградский зоопарк - один из трех исторических зоопарков России (наряду с зоопарками Москвы и Санкт-Петербурга)." +
                " Располагается на территории бывшего Кёнигсбергского зоопарка, который был основан Германом Клаассом, немецким предпринимателем в 1896 году." +
                " Калининграду отошел после капитуляции немецких войск в 1945 году.\n" +
                "На данный момент Калининградский зоопарк занимает территорию в 16,37 ГА. В коллекции насчитывается 2 068 животных 288 видов  (данные на 31.12.2019 г.)"+
                "Калининградский зоопарк является постоянным членом Евроазиатской региональной ассоциации зоопарков и аквариумов (EARAZA), объединяющей зоопарки стран СНГ и ближнего зарубежья, а также кандидатом в члены EAZA (Европейская ассоциация зоопарков и аквариумов). " +
                "Наш зоопарк участвует во многих международных программах по разведению и сохранению редких видов. " +
                "Активное сотрудничество с зоопарками России и европейских стран открывает большие возможности для развития зоопарка.");

        mImageUrls2.add("https://s3.nat-geo.ru/images/2019/9/27/970d12b8509e4b91929f4b057e9b0683.max-1200x800.jpg");
        mNames2.add("Куршская коса");
        mDis2.add("Как добраться?\n\n"+
                "Прямой автобус из Калининграда\n" +
                "Из Калининграда на Куршскую косу самостоятельно можно доехать на прямом автобусе №593 Калининград — Морское. Он отправляется с автовокзала.\n\n"+
                "Отправление 593 автобуса из Калининграда:\n\n" +
                        "5:15\n" +
                        "9:35\n" +
                        "12:35\n" +
                        "17:50\n\n"+
                "Вдоль побережья Балтийского моря: частично в России, а частично в Литве — тянется 98-километровая полоса суши саблевидной формы: Куршская коса.\n\n" +
                " Ее название, как и имя залива, отделенного ею от моря, связано с древними племенами «курши», жившими здесь до колонизации Пруссии немцами.\n" +
                "За свой удивительный рельеф и биоразнообразие Куршская коса в 2000 году была включена в список Всемирного наследия ЮНЕСКО как выдающийся культурный ландшафт.\n" +
                "Ширина этой песчаной полосы колеблется от 400 до 3800 метров.\n " +
                "Российско-литовская граница находится на 49-м километре, если считать от города Зеленоградск Калининградской области.\n" +
                " И со стороны России, и со стороны Литвы Куршская коса официально является природоохранной территорией со статусом национального парка. 72% территории занимают леса, в которых произрастает более 600 видов деревьев, кустов и растений.\n " +
                "Здесь обитают лось, косуля, кабан, лиса и другие животные: в общей сложности 296 видов. Но еще больше на Куршской косе птиц: по ней проходит древний миграционный путь 160 видов пернатых из северных районов Европы на юг континента и в Северную Африку. В дни миграций над косой ежедневно пролетают до миллиона птиц, и еще 102 вида гнездится постоянно.\n" +
                " Это дало Куршской косе неофициальное имя «птичий мост», а изучают этих представителей фауны ученые, работающие на старейшей в Европе орнитологической станции, основу которой заложил немецкий орнитолог И. Тиинеман еще в 1901 году.");



        mImageUrls2.add("https://avatars.mds.yandex.net/get-zen_doc/1542444/pub_5d53ec21f8a62300ada021ee_5d53edeaf0d4f400acf89073/scale_1200");
        mNames2.add("Рыбная деревня в Калининграде");
        mDis2.add("Этнографический и торгово-ремесленный комплекс в двух шагах от острова Канта и Кафедрального собора — это Рыбная деревня в Калининграде.\n" +
                " Воссозданный уголок старого Кенигсберга протянулся между Медовым и Высоким мостами. Часть зданий выполнена в так называемом орденском стиле, другая часть — в стиле барокко и классицизма.\n" +
                "\n" +
                "Помимо любования архитектурой и природой, поднимитесь на башню «Маяк» (133 ступеньки), чтобы с высоты «птичьего полета» взглянуть на шпиль Кафедрального собора. Потрите на удачу клюв железной чайки или прокатитесь на катере по реке Преголе, на берегу которой Рыбная деревня и расположена. Загляните в торговые ряды, чтобы прикупить себе на память янтарь или другие сувениры, и отдохните за чашечкой кофе в одном из многочисленных заведений.\n" +
                "\n" +
                "Рыбная деревня в Калининграде — новострой, здесь несколько комфортабельных гостиниц, отличные рестораны, конференц-залы, SPA-салон и небольшой музей.");


        mImageUrls2.add("https://img.tourister.ru/files/1/4/8/3/0/1/1/6/original.jpg");
        mNames2.add("Могила Иммануила Канта");
        mDis2.add("Адрес\n" +
                "Россия, Калининград, улица Канта, 1, 236039\n\n"+
                "Если спросить жителя Калининграда, какие места обязательно стоит посетить в городе, то, наверняка, каждый обязательно среди прочего назовет «могилу Канта». " +
                "Да об этой своеобразной достопримечательности и за пределами Калининграда слышали многие. Поэтому она будет интересна не только тем, кто во время путешествий любит посещать места, связанные с историческими личностями, но и практически всем туристам.");

        mImageUrls2.add("https://www.2do2go.ru/uploads/23fded67fe3882d0a1fe652802020a3a.jpg");
        mNames2.add("Кафедральный собор в Калининграде");
        mDis2.add("Время работы\n" +
                "Понедельник - " +
                "10:00 – 19:00\n" +
                "Вторник - " +
                "10:00 – 19:00\n" +
                "Среда - " +
                "10:00 – 19:00\n" +
                "Четверг - " +
                "10:00 – 19:00\n" +
                "Пятница - " +
                "10:00 – 19:00\n" +
                "Суббота - " +
                "10:00 – 19:00\n" +
                "Воскресенье - " +
                "10:00 – 19:00\n\n" +
                "Адрес\n" +
                "Россия, Калининград, улица Канта, 1, 236039\n\n" +
                "Кафедральный собор, или Домский собор Богоматери и Святого Адальберта, — один из самых узнаваемых символов в Калининграде. " +
                "Храм находится на острове Иммануила Канта, в исторической части города. Здание построили в 14 веке, после чего несколько раз реставрировали. " +
                "Во время войны оно было почти полностью разрушено, и вплоть до 90-х годов прошлого века на его месте возвышались лишь руины.\n" +
                "После восстановления в конце 20 века Кафедральный собор в Калининграде выполняет светские функции — ни католические, ни православные службы там не проводятся.\n" +
                "Теперь здесь проходят органные концерты, лекции и экскурсии. Работает музей Иммануила Канта,  а снаружи у стены — захоронение философа.\n" +
                "Окрестности собора интересны сами по себе. Остров Канта — одна большая парковая территория, где часто проходят ярмарки, праздники и народные гуляния. Разбит парк скульптур, а по Медовому мосту вы сможете попасть в Рыбную деревню.");
        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        myrecyclerview = (RecyclerView) v.findViewById(R.id.second_place_recyclerview);
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
