package com.bit371.catchat.ui.inbox;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InboxViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InboxViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is an inbox fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}