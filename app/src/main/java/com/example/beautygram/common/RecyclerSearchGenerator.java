package com.example.beautygram.common;

import com.example.beautygram.R;
import com.example.beautygram.models.SearchPage;

import java.util.ArrayList;
import java.util.List;

public class RecyclerSearchGenerator {

    public List<SearchPage> getItemSearchPages()
    {
        int sample_hairs[] = {R.drawable.h1,R.drawable.h2,R.drawable.h3,R.drawable.h4};
        List<SearchPage> searchPages = new ArrayList<>();
        for (int i = 0; i <=6 ; i++) {
            SearchPage searchPage = new SearchPage();
            searchPage.setId(i);

            switch (i)
            {
                case 0:
                    searchPage.setPf_image(R.drawable.fashion7);
                    searchPage.setName("سالن بهاران");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("با بیوتی گرام به بهترین ها بیاندیشید");
                    searchPage.setAddress("تهران ، جردن");
                    searchPage.setComments_count(i+40);
                    break;
                case 1:
                    searchPage.setPf_image(R.drawable.fashion5);
                    searchPage.setName("سالن نیاوران");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("هدف ما جلب رضایت شماست");
                    searchPage.setAddress("تهران ، نیاوران");
                    searchPage.setComments_count(i+40);
                    break;
                case 2:
                    searchPage.setPf_image(R.drawable.fashion2);
                    searchPage.setName("سالن گل رز");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("با بیوتی گرام به بهترین ها بیاندیشید");
                    searchPage.setAddress("ارومیه ، استادان");
                    searchPage.setComments_count(i+40);
                    break;
                case 3:
                    searchPage.setPf_image(R.drawable.fashion1);
                    searchPage.setName("سالن بهشت آبی");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("هدف ما جلب رضایت شماست");
                    searchPage.setAddress("ارومیه ، دانشکده");
                    searchPage.setComments_count(i+40);
                    break;
                case 4:
                    searchPage.setPf_image(R.drawable.fashion7);
                    searchPage.setName("سالن پاییزان");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("با بیوتی گرام به بهترین ها بیاندیشید");
                    searchPage.setAddress("تبریز ، آبرسان");
                    searchPage.setComments_count(i+40);
                    break;
                case 5:
                    searchPage.setPf_image(R.drawable.fashion5);
                    searchPage.setName("سالن زمستان");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("با بیوتی گرام به بهترین ها بیاندیشید");
                    searchPage.setAddress("تهران ، جردن");
                    searchPage.setComments_count(i+40);
                    break;
                case 6:
                    searchPage.setPf_image(R.drawable.fashion1);
                    searchPage.setName("سالن مد روز");
                    searchPage.setSlide_theme(R.drawable.bshop);
                    searchPage.setSample_hairs(sample_hairs);
                    searchPage.setAdvertise("هدف ما جلب رضایت شماست");
                    searchPage.setAddress("کرمانشاه ، جردن");
                    searchPage.setComments_count(i+40);
                    break;


            }

            searchPages.add(searchPage);
        }
        return searchPages;
    }
}
