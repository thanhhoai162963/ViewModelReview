package com.example.viewmodelreview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel implements LifecycleObserver {
    MutableLiveData<String> mData = new MutableLiveData<>();



    public void chuoi(String chuoi){
        mData.setValue(chuoi);
    }
    public LiveData<String> getData(){
        return mData;
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
    }
}
