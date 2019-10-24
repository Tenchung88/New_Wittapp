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
   int[] image ={R.drawable.ywcalogof,R.drawable.ywcalogof,R.drawable.ywcalogof};
   String[] title ={"YWCA","IBM","YWCA"};
    String[] time ={"2:00pm","2:00pm","3:00pm"};
   String[] description ={"YWCA Toronto offers a range of free and paid training programs.....","Explore educational and fun.....",
           "The success stories comes from......"};
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
                if(position==0)
                {
                    Intent i = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(i);
                }






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
            TextView time1 = (TextView) convertView.findViewById(R.id.timeview);
            time1.setText(time[position]);
            img.setImageResource(image[position]);
            mytext.setText(title[position]);
            mydescription.setText(description[position]);

            return convertView;
        }
    }
}
