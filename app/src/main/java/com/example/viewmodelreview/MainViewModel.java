package com.example.viewmodelreview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class MainViewModel extends ViewModel implements LifecycleObserver {
    MutableLiveData<Integer> mData = new MutableLiveData<>();
    public void Random(int bound){
        int value = new Random().nextInt(bound);
        mData.setValue(value);
    }
    public LiveData<Integer> getData(){
        return mData;
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate(){
    }
}
