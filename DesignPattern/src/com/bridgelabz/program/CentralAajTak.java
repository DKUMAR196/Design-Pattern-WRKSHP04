package com.bridgelabz.program;

import java.util.ArrayList;
import java.util.List;

public class CentralAajTak {
		List<Observer>observerList = new ArrayList<>();
		
		void register(Observer observer) {
			observerList.add (observer);
		}
		
		void update(News news) {
			//observerList.stream().filter(t -> t.getNewsType()==news.newsType).forEach(t -> t.onUpdate(news));
			observerList.stream().filter(t -> news.newsType == (t.getNewsType())).forEach(i -> i.onUpdate(news));
		}
		
		void unRegister(Observer observer) {
			observerList.remove(observer);
		}
}

