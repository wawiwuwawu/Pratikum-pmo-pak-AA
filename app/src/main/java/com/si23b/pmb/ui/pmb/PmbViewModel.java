package com.si23b.pmb.ui.pmb;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PmbViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PmbViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is PMB fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}