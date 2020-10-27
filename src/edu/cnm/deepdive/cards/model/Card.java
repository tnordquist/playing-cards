package edu.cnm.deepdive.cards.model;

import java.util.Objects;

public final class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;
  private final int hash;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    hash = Objects.hash(rank, suit);
  }

  @Override
  public int hashCode() {
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    boolean equal;
    if (this == obj) {
      equal = true;
    } else if (obj instanceof Card) {
      Card other = (Card) obj;
      equal = (hash == other.hash) && (rank == other.rank) && (suit == other.suit);
    } else {
      equal = false;
    }
    return equal;
  }

  @Override
  public String toString() {
    return rank.getSymbol() + suit.getSymbol();
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

}
