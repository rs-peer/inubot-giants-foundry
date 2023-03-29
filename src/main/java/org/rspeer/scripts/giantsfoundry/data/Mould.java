package org.rspeer.scripts.giantsfoundry.data;

import java.util.Map;
import java.util.stream.Stream;

public enum Mould {

  //Default moulds
  CHOPPER_FORTE("Chopper Forte", Type.FORTE, Style.BROAD, 4, Style.LIGHT, 4, Style.FLAT, 4),
  GLADIUS_RICASSO("Gladius Ricasso", Type.FORTE, Style.BROAD, 4, Style.HEAVY, 4, Style.FLAT, 4),
  DISARMING_FORTE("Disarming Forte", Type.FORTE, Style.NARROW, 4, Style.LIGHT, 4, Style.SPIKED, 4),
  MEDUSA_RICASSO("Medusa Ricasso", Type.FORTE, Style.BROAD, 8, Style.HEAVY, 6, Style.FLAT, 8),
  SERPENT_RICASSO("Serpent Ricasso", Type.FORTE, Style.NARROW, 6, Style.LIGHT, 8, Style.FLAT, 8),
  SERRATED_FORTE("Serrated Forte", Type.FORTE, Style.NARROW, 8, Style.HEAVY, 8, Style.SPIKED, 6),
  SAW_BLADE("Saw Blade", Type.BLADE, Style.BROAD, 4, Style.LIGHT, 4, Style.SPIKED, 4),
  DEFENDERS_EDGE("Defenders Edge", Type.BLADE, Style.BROAD, 4, Style.HEAVY, 4, Style.SPIKED, 4),
  FISH_BLADE("Fish Blade", Type.BLADE, Style.NARROW, 4, Style.LIGHT, 4, Style.FLAT, 4),
  MEDUSA_BLADE("Medusa Blade", Type.BLADE, Style.BROAD, 8, Style.HEAVY, 8, Style.FLAT, 6),
  STILETTO_BLADE("Stiletto Blade", Type.BLADE, Style.NARROW, 8, Style.LIGHT, 6, Style.FLAT, 8),
  GLADIUS_EDGE("Gladius Edge", Type.BLADE, Style.NARROW, 6, Style.HEAVY, 8, Style.FLAT, 8),
  PEOPLE_POKER_POINT("People Poker Point", Type.TIP, Style.NARROW, 4, Style.HEAVY, 4, Style.FLAT, 4),
  CHOPPER_TIP("Chopper Tip", Type.TIP, Style.BROAD, 4, Style.LIGHT, 4, Style.SPIKED, 4),
  MEDUSAS_HEAD("Medusa's Head", Type.TIP, Style.BROAD, 4, Style.HEAVY, 4, Style.SPIKED, 4),
  SERPENTS_FANG("Serpent's Fang", Type.TIP, Style.NARROW, 8, Style.LIGHT, 6, Style.SPIKED, 8),
  GLADIUS_POINT("Gladius Point", Type.TIP, Style.NARROW, 8, Style.HEAVY, 8, Style.FLAT, 6),
  SAW_TIP("Saw Tip", Type.TIP, Style.BROAD, 6, Style.HEAVY, 8, Style.SPIKED, 8),

  //Purchasable moulds
  STILETTO_FORTE("Stiletto Forte", Type.FORTE, Style.NARROW, 8, Style.LIGHT, 10, Style.FLAT, 8),
  DEFENDER_BASE("Defender Base", Type.FORTE, Style.BROAD, 8, Style.HEAVY, 10, Style.FLAT, 8),
  JUGGERNAUT_FORTE("Juggernaut Forte", Type.FORTE, Style.BROAD, 4, Style.HEAVY, 4, Style.SPIKED, 16),
  CHOPPER_FORTE_1("Chopper Forte +1", Type.FORTE, Style.BROAD, 3, Style.LIGHT, 4, Style.FLAT, 18),
  SPIKER("Spiker!", Type.FORTE, Style.NARROW, 1, Style.HEAVY, 2, Style.SPIKED, 22),
  FLAMBERGE_BLADE("Flamberge Blade", Type.BLADE, Style.NARROW, 8, Style.LIGHT, 8, Style.SPIKED, 10),
  SERPENT_BLADE("Serpent Blade", Type.BLADE, Style.NARROW, 10, Style.LIGHT, 8, Style.FLAT, 8),
  CLAYMORE_BLADE("Claymore Blade", Type.BLADE, Style.BROAD, 16, Style.HEAVY, 4, Style.FLAT, 4),
  FLEUR_DE_BLADE("Fleur de Blade", Type.BLADE, Style.BROAD, 4, Style.HEAVY, 18, Style.SPIKED, 1),
  CHOPPA("Choppa!", Type.BLADE, Style.BROAD, 1, Style.LIGHT, 22, Style.FLAT, 2),
  CORRUPTED_POINT("Corrupted Point", Type.TIP, Style.NARROW, 8, Style.LIGHT, 10, Style.SPIKED, 8),
  DEFENDERS_TIP("Defenders Tip", Type.TIP, Style.BROAD, 10, Style.HEAVY, 8, Style.SPIKED, 8),
  SERRATED_TIP("Serrated Tip", Type.TIP, Style.NARROW, 4, Style.LIGHT, 16, Style.SPIKED, 4),
  NEEDLE_POINT("Needle Point", Type.TIP, Style.NARROW, 18, Style.LIGHT, 3, Style.FLAT, 4),
  THE_POINT("The Point!", Type.TIP, Style.BROAD, 2, Style.LIGHT, 1, Style.FLAT, 22);

  private final String name;
  private final Type type;
  private final Map<Style, Integer> commission;

  Mould(String name, Type type, Style s1, int p1, Style s2, int p2, Style s3, int p3) {
    this.name = name;
    this.type = type;
    this.commission = Map.of(s1, p1, s2, p2, s3, p3);
  }

  public static Mould get(String name) {
    for (Mould mould : Mould.values()) {
      if (mould.name.equalsIgnoreCase(name)) {
        return mould;
      }
    }
    return null;
  }

  public Type getType() {
    return type;
  }

  public int getMetalScore(Style s1, Style s2) {
    return Stream.of(s1, s2)
        .mapToInt(style -> commission.getOrDefault(style, 0))
        .sum();
  }

  @Override
  public String toString() {
    return name;
  }
}