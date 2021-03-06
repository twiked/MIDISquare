package fr.cpe.midi.model;

public interface Observable {
	public void addObserver(Observer obs);

	public void removeObserver(Observer obs);

	public void notifyObserver();
}