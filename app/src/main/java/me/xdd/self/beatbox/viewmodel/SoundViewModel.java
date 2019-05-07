package me.xdd.self.beatbox.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import me.xdd.self.beatbox.model.BeatBox;
import me.xdd.self.beatbox.model.Sound;

/**
 * 视图模型类
 */
public class SoundViewModel extends BaseObservable{
    private Sound mSound;
    private BeatBox mBeatBox;
    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        this.mSound = sound;
        notifyChange();
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public void onButtonClicked(){
        mBeatBox.play(mSound);
    }
}
