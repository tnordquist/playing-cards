package edu.cnm.deepdive.cards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Stream;

public abstract class Wash implements Iterable<Card> {

  private final List<Card> cards;

  protected Wash() {
    cards = new ArrayList<>();
  }

  public void add(Card card) {
    cards.add(card);
  }

  public Card draw() throws NoSuchElementException {
    try {
      return cards.remove(0);
    } catch (IndexOutOfBoundsException e) {
      throw new NoSuchElementException();
    }
  }

  public void sort() {
    cards.sort(null);
  }

  public void shuffle(Random rng) {
    Collections.shuffle(cards, rng);
  }

  @Override
  public Iterator<Card> iterator() {
    return cards.iterator();
  }

  @Override
  public String toString() {
    return cards.toString();
  }

  public int size() {
    return cards.size();
  }

  public boolean isEmpty() {
    return cards.isEmpty();
  }

  public Stream<Card> stream() {
    return cards.stream();
  }

  protected List<Card> getCards() {
    return cards;
  }

}
