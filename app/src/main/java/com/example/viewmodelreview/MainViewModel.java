package com.example.viewmodelreview;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel {
    MutableLiveData<Integer> mData = new MutableLiveData<>();
    public void Random(int bound){
        int value = new Random().nextInt(bound);
        mData.setValue(value);
    }
    public LiveData<Integer> getData(){
        return mData;
    }
}
