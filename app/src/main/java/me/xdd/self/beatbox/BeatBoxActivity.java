package me.xdd.self.beatbox;

import android.support.v4.app.Fragment;

import me.xdd.self.beatbox.fragment.BeatBoxFragment;

public class BeatBoxActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newFragment();
    }
}
