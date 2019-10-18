package example.com.wittapp_ywca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
   int[] image ={R.drawable.imagestraining,R.drawable.imagesgirlscentre,R.drawable.imagessupportservice,R.drawable.imagespublic};
   String[] title ={"Training","Girls Center","Support Service","Parentingand Care"};
   String[] description ={"YWCA Toronto offers a range of free and paid employment and training programs.","Explore educational and fun programs and services for girls.",
           "Heal from trauma and develop healthy coping skills.", "Shelter and safety for women fleeing violence."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview );
        customAdaptor customAdaptor = new customAdaptor();
        listView.setAdapter(customAdaptor);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {






            }
        });
    }
    class customAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return description.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView =getLayoutInflater().inflate(R.layout.activityclayout, null);
            ImageView img = (ImageView) convertView.findViewById(R.id.speaker7);
            TextView mytext = (TextView) convertView.findViewById(R.id.textView_name7);
            TextView mydescription = (TextView) convertView.findViewById(R.id.textView_tib7);
            img.setImageResource(image[position]);
            mytext.setText(title[position]);
            mydescription.setText(description[position]);

            return convertView;
        }
    }
}
