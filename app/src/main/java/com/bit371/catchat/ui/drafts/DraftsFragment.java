package com.bit371.catchat.ui.drafts;

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

public class DraftsFragment extends Fragment {

    private DraftsViewModel draftsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        draftsViewModel =
                ViewModelProviders.of(this).get(DraftsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_drafts, container, false);
        final TextView textView = root.findViewById(R.id.text_drafts);
        draftsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}