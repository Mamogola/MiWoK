package com.ekasilabalexcdtb.miwork;

import static android.os.Build.VERSION_CODES.N;

/**
 * {@link Word} represents a vocublary word that the user wants to learn.
 * It contains a default translation and a Miwork translation for the word  * Created by eKasiLab Alex CDTB on 26 Jun 2017.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * Miwork translation for the word
     */
    private String mMiworkTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourseId = NO_IMAGE_PROVIDED;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourseId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miworkTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mAudioResourseId = audioResourceID;
    }
    public Word(String defaultTranslation, String miworkTranslation, int imageResourceID,int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiworkTranslation = miworkTranslation;
        mImageResourseId = imageResourceID;
        mAudioResourseId = audioResourceID;
    }


    //Get the default translation of the word
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    //Get the Miwork translation of the word
    public String getMiworkTranslation(){
        return mMiworkTranslation;
    }
    //Get the Image resource ID for the word
    public int getImageResourseId(){return mImageResourseId;}
    //Get the Audio resource ID for the word
    public int getAudioResourseId(){return mAudioResourseId;}

    /**
     * Return whether or not there is an image for this word.
     */
    public boolean hasImage(){
    return mImageResourseId != NO_IMAGE_PROVIDED;

    }
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiworkTranslation + '\'' +
                ", mImageResourceId=" + mImageResourseId +
                ", mAudioResourceId=" + mAudioResourseId +
                '}';
    }
}
