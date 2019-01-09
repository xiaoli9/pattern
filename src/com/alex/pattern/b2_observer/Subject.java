package com.alex.pattern.b2_observer;

public interface Subject {

	void attach(Observer observer);
	void detach(Observer observer);
	void notice();
}
