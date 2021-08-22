package com.bridgelabz.program;

import com.bridgelabz.program.News.NewsType;

public class MumbaiAajTak implements Observer{
   @Override
   public void onUpdate(News data) {
	   System.out.println(data.newsTitle);
   }

   @Override
   public NewsType getNewsType() {
	   return NewsType.MUMBAINEWS;
   }  
}
