package edu.cnm.deepdive.cards.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Wash implements Iterable<Card> {

  private final List<Card> cards;


  public Wash() {
    cards = new ArrayList<>();
  }

  public void add(Card card) {
    cards.add(card);
  }

  public Card draw(Card card) {
    return cards.remove(0);
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

  protected List<Card> getCards() {
    return cards;
  }
}
