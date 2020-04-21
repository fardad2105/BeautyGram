package com.example.beautygram.common;

import com.example.beautygram.R;
import com.example.beautygram.models.ProfileSamples;

import java.util.ArrayList;
import java.util.List;

public class RecyclerProfileSamplesGenerator {

    public List<ProfileSamples> getSample(int count) {
        List<ProfileSamples> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ProfileSamples profileSamples = new ProfileSamples();
            profileSamples.setId(i);
            switch (i % 6) {
                case 0:
                    profileSamples.setImage(R.drawable.fashion1);
                    break;
                case 1:
                    profileSamples.setImage(R.drawable.fashion2);
                    break;
                case 2:
                    profileSamples.setImage(R.drawable.fashion3);
                    break;
                case 3:
                    profileSamples.setImage(R.drawable.fashion4);
                    break;
                case 4:
                    profileSamples.setImage(R.drawable.fashion5);
                    break;
                case 5:
                    profileSamples.setImage(R.drawable.fashion7);
                    break;
            }
            list.add(profileSamples);
        }
        return list;
    }
    
}
