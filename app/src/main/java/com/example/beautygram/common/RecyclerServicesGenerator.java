package com.example.beautygram.common;

import com.example.beautygram.R;
import com.example.beautygram.models.ProfileServices;
import com.example.beautygram.models.StoryBoard;

import java.util.ArrayList;
import java.util.List;

public class RecyclerServicesGenerator {

    public List<ProfileServices> getSample(int count) {
        List<ProfileServices> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            ProfileServices profileServices = new ProfileServices();
            profileServices.setId(i);
            profileServices.setPrice((i + 1) * 1000);
            profileServices.setTimeInSeconds(i * 45);
            switch (i % 3) {
                case 0:
                    profileServices.setTitle("خدمات عروسی");
                    break;
                case 1:
                    profileServices.setTitle("خدمات ناخن");
                    break;
                case 2:
                    profileServices.setTitle("خدمات صورت");
                    break;
            }
            list.add(profileServices);
        }
        return list;
    }
}
