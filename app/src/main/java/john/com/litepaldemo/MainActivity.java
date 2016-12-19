package john.com.litepaldemo;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.litepal.LitePal;
import org.litepal.crud.DataSupport;

import john.com.litepaldemo.bean.Album;
import john.com.litepaldemo.bean.Song;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase mSqLiteDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSqLiteDatabase = LitePal.getDatabase();

//        Album albumToUpdate = DataSupport.find(Album.class, 2);
//        albumToUpdate.setPrice(20.99f); // raise the price
//        albumToUpdate.save();
        updata();



    }

    public void insertData(){
        Album album = new Album();
        album.setName("周杰伦专辑");
        album.setPrice(100.6f);
        album.save();
        Album album1 = new Album();
        album1.setName("莫文蔚专辑");
        album1.setPrice(100.6f);
        album1.save();

        Song song = new Song();
        song.setName("菊花台");
        song.setDuration(120);
        song.setAlbum(album);
        song.save();
        Song song1 = new Song();
        song1.setName("青花瓷");
        song1.setDuration(120);
        song1.setAlbum(album);
        song1.save();
        Song song2 = new Song();
        song2.setName("盛夏的果实");
        song2.setDuration(120);
        song2.setAlbum(album1);
        song2.save();

        song2.setName("过火");
        song2.save();
        song2.setName("明天你好");
        song2.setDuration(10);
        song2.save();
    }

    public void updata(){
        //1,通过Id得到对象在set数据
        Album album = DataSupport.find(Album.class,1);
        album.setName("王菲专辑");
        album.save();
    }
}
