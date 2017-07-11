package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();

//        words.add("one");

//        Word w = new Word("one", "ichi");
//        words.add(w);


        words.add(new Word ("one", "ichi"));
        words.add(new Word ("one", "ni"));
        words.add(new Word ("one", "san"));
        words.add(new Word ("one", "yon"));
        words.add(new Word ("one", "go"));
        words.add(new Word ("one", "roku"));
        words.add(new Word ("one", "nana"));
        words.add(new Word ("one", "hachi"));
        words.add(new Word ("one", "kyuu"));
        words.add(new Word ("one", "juu"));


//        int index = 0;
//
//        while (index<words.size()) {
//            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            index++;
//        }

        //Find the root view of the whole layout
//        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//
//        for (int index = 0; index <words.size(); index++) {
//
//            //Create a new TextView
//            TextView wordView = new TextView(this);
//
//            //Set the text to be word at the current index
//            wordView.setText(words.get(index));
//            //Add this TextView as another child to the root view of this layout
//            rootView.addView(wordView);
//        }

//        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(itemsAdapter);

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // words_listlayout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
