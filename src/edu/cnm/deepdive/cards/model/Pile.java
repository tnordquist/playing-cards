package edu.cnm.deepdive.cards.model;

public class Pile extends Wash {

  public void add(Card card, boolean topOfPile) {
    if (topOfPile) {
      getCards().add(0, card);
    } else {
      add(card);
    }
  }

}
