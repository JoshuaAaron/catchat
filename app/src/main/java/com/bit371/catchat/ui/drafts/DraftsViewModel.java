package com.bit371.catchat.ui.drafts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DraftsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DraftsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the drafts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}