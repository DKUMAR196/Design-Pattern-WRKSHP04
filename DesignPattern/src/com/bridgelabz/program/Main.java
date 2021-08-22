package com.bridgelabz.program;

public class Main {

	public static void main(String[] args) {
		CentralAajTak centralAajTak  = new CentralAajTak();
		MumbaiAajTak mumbaiAajTak = new MumbaiAajTak();
		DelhiAajTak delhiAajTak = new DelhiAajTak();
		News news = new News();
		news.newsType = News.NewsType.MUMBAINEWS;
		news.newsTitle = "Sensex close at 15000";
        centralAajTak.register(mumbaiAajTak);
        centralAajTak.register(delhiAajTak);
        centralAajTak.unRegister(delhiAajTak);
        //sub.unRegister(observer2);
        centralAajTak.update( news);       
	}
}
