package com.geektech.quizapp_gt_4_2.main;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    public MutableLiveData<String> message = new MutableLiveData<>();
    public MutableLiveData<Integer> counter = new MutableLiveData<>();


    public MainViewModel() {
        Log.d("ololo", "View model create");
        message.setValue("Hello Observer");
        counter.setValue(0);
    }
    public  void countIncrement(){

        counter.setValue(counter.getValue()+1);
    }
    public  void counterDeCrement(){
        counter.setValue(counter.getValue()-1);


    }


    @Override
    protected void onCleared() {
        super.onCleared();
    }

}
