package com.bridgelabz.program;

import com.bridgelabz.program.News.NewsType;

public class DelhiAajTak implements Observer{
	@Override
  public void onUpdate(News data) {
	  System.out.println(data.newsTitle);
  }
	
	@Override
	public NewsType getNewsType() {
		// TODO Auto-generated method stub
		return NewsType.DELHINEWS;
	}
}
