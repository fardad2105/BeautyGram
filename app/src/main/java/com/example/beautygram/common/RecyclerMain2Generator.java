package com.example.beautygram.common;

import com.example.beautygram.R;
import com.example.beautygram.models.Comment;
import com.example.beautygram.models.ProfileSamples;

import java.util.ArrayList;
import java.util.List;

public class RecyclerMain2Generator {

    public List<Comment> getSample(int count) {
        List<Comment> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Comment comment = new Comment();
            comment.setId(i);
            comment.setLikes(i % 3);
            switch (i % 6) {
                case 0:
                    comment.setImage(R.drawable.fashion1);
                    comment.setSender("سارا یوسفی");
                    comment.setComment("خیلی عالی بود");
                    break;
                case 1:
                    comment.setImage(R.drawable.fashion2);
                    comment.setSender("مریم محمدی");
                    comment.setComment("ممنونممممم");
                    break;
                case 2:
                    comment.setImage(R.drawable.fashion3);
                    comment.setSender("مریم یگانه");
                    comment.setComment("بی نظیر بود");
                    break;
                case 3:
                    comment.setImage(R.drawable.fashion4);
                    comment.setSender("غزاله شاهین");
                    comment.setComment("عالی");
                    break;
                case 4:
                    comment.setImage(R.drawable.fashion5);
                    comment.setSender("مبینا درستی");
                    comment.setComment("حرف نداشت");
                    break;
                case 5:
                    comment.setImage(R.drawable.fashion7);
                    comment.setSender("عسل پاینده");
                    comment.setComment("مثل همیشه عالی و بدون نقص");
                    break;
            }
            list.add(comment);
        }
        return list;
    }

}
