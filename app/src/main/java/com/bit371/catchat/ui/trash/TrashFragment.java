package com.bit371.catchat.ui.trash;

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

public class TrashFragment extends Fragment {

    private TrashViewModel trashViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        trashViewModel =
                ViewModelProviders.of(this).get(TrashViewModel.class);
        View root = inflater.inflate(R.layout.fragment_trash, container, false);
        final TextView textView = root.findViewById(R.id.text_trash);
        trashViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}