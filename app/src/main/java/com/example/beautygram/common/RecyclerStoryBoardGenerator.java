package com.example.beautygram.common;

import com.example.beautygram.R;
import com.example.beautygram.models.StoryBoard;

import java.util.ArrayList;
import java.util.List;

public class RecyclerStoryBoardGenerator {

    public List<StoryBoard> getSample(int count) {
        List<StoryBoard> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            StoryBoard storyBoard = new StoryBoard();
            storyBoard.setId(i);
            switch (i % 6) {
                case 0:
                    storyBoard.setImage(R.drawable.story1);
                    storyBoard.setText("خدمات عروسی");
                    break;
                case 1:
                    storyBoard.setImage(R.drawable.story2);
                    storyBoard.setText("خدمات ناخن");
                    break;
                case 2:
                    storyBoard.setImage(R.drawable.story3);
                    storyBoard.setText("خدمات صورت");
                    break;
                case 3:
                    storyBoard.setImage(R.drawable.story4);
                    storyBoard.setText("ماساژ");
                    break;
                case 4:
                    storyBoard.setImage(R.drawable.story5);
                    storyBoard.setText("خدمات زیبایی");
                    break;
                case 5:
                    storyBoard.setImage(R.drawable.story6);
                    storyBoard.setText("سایر");
                    break;
            }
            list.add(storyBoard);
        }
        return list;
    }
}
