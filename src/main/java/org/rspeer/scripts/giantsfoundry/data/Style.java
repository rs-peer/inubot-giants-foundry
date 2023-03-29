package org.rspeer.scripts.giantsfoundry.data;

public enum Style {

  NONE,
  NARROW,
  LIGHT,
  FLAT,
  BROAD,
  HEAVY,
  SPIKED;

  public static Style valueOf(int varbit) {
    Style[] styles = Style.values();
    return varbit >= 0 && varbit < styles.length ? styles[varbit] : NONE;
  }
}
