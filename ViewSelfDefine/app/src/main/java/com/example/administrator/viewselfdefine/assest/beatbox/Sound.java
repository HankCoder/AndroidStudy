package com.example.administrator.viewselfdefine.assest.beatbox;

/**
 * Created by Administrator on 2016/12/16 0016.
 */

public class Sound {

    private String mAssetpath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetpath) {
        mAssetpath = assetpath;
        String[] components = assetpath.split("/");
        String fileName = components[components.length - 1];
        mName = fileName.replace(".wav", "");
    }

    public String getAssetpath() {
        return mAssetpath;
    }

    public String getName() {
        return mName;
    }

    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
