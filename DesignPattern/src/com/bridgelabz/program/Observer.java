package com.bridgelabz.program;

import com.bridgelabz.program.News.NewsType;

public interface Observer {
		public void onUpdate(News data);
	    public NewsType getNewsType();
}
