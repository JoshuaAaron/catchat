package com.bit371.catchat.ui.sentitems;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.bit371.catchat.R;

public class SentItemsFragment extends Fragment {

    private SentItemsViewModel sentItemsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sentItemsViewModel =
                ViewModelProviders.of(this).get(SentItemsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sent_itmes, container, false);
        final TextView textView = root.findViewById(R.id.text_sent_items);
        sentItemsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}