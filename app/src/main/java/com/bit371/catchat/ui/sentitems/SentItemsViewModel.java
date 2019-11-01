package com.bit371.catchat.ui.sentitems;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SentItemsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SentItemsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the sent items fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}