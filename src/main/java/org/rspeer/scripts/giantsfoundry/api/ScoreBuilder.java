package org.rspeer.scripts.giantsfoundry.api;

import org.rspeer.scripts.giantsfoundry.data.Style;

import java.util.HashMap;
import java.util.Map;

public class ScoreBuilder {

  private final Map<Style, Integer> score = new HashMap<>();

  private ScoreBuilder() {
    throw new IllegalAccessError();
  }

  public static ScoreBuilder newInstance() {
    return new ScoreBuilder();
  }

  public ScoreBuilder add(Style style, int score) {
    this.score.put(style, score);
    return this;
  }

  public Map<Style, Integer> build() {
    return score;
  }
}
