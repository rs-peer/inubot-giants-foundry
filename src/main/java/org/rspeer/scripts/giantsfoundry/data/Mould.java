package org.rspeer.scripts.giantsfoundry.data;

import org.rspeer.scripts.giantsfoundry.api.ScoreBuilder;

import java.util.Map;
import java.util.stream.Stream;

public enum Mould {

  //Default moulds
  CHOPPER_FORTE("Chopper Forte", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.LIGHT, 4)
          .add(Style.FLAT, 4)
  ),

  GLADIUS_RICASSO("Gladius Ricasso", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.HEAVY, 4)
          .add(Style.FLAT, 4)
  ),

  DISARMING_FORTE("Disarming Forte", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 4)
          .add(Style.LIGHT, 4)
          .add(Style.SPIKED, 4)
  ),

  MEDUSA_RICASSO("Medusa Ricasso", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 8)
          .add(Style.HEAVY, 6)
          .add(Style.FLAT, 8)
  ),

  SERPENT_RICASSO("Serpent Ricasso", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 6)
          .add(Style.LIGHT, 8)
          .add(Style.FLAT, 8)
  ),

  SERRATED_FORTE("Serrated Forte", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.HEAVY, 8)
          .add(Style.SPIKED, 6)
  ),

  SAW_BLADE("Saw Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.LIGHT, 4)
          .add(Style.SPIKED, 4)
  ),

  DEFENDERS_EDGE("Defenders Edge", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.HEAVY, 4)
          .add(Style.SPIKED, 4)
  ),

  FISH_BLADE("Fish Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 4)
          .add(Style.LIGHT, 4)
          .add(Style.FLAT, 4)
  ),

  MEDUSA_BLADE("Medusa Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 8)
          .add(Style.HEAVY, 8)
          .add(Style.FLAT, 6)
  ),

  STILETTO_BLADE("Stiletto Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.LIGHT, 6)
          .add(Style.FLAT, 8)
  ),

  GLADIUS_EDGE("Gladius Edge", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 6)
          .add(Style.HEAVY, 8)
          .add(Style.FLAT, 8)
  ),

  PEOPLE_POKER_POINT("People Poker Point", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 4)
          .add(Style.HEAVY, 4)
          .add(Style.FLAT, 4)
  ),

  CHOPPER_TIP("Chopper Tip", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.LIGHT, 4)
          .add(Style.SPIKED, 4)
  ),

  MEDUSAS_HEAD("Medusa's Head", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.HEAVY, 4)
          .add(Style.SPIKED, 4)
  ),

  SERPENTS_FANG("Serpent's Fang", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.LIGHT, 6)
          .add(Style.SPIKED, 8)
  ),

  GLADIUS_POINT("Gladius Point", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.HEAVY, 8)
          .add(Style.FLAT, 6)
  ),

  SAW_TIP("Saw Tip", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 6)
          .add(Style.HEAVY, 8)
          .add(Style.SPIKED, 8)
  ),

  //Purchasable moulds
  STILETTO_FORTE("Stiletto Forte", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.LIGHT, 10)
          .add(Style.FLAT, 8)
  ),

  DEFENDER_BASE("Defender Base", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 8)
          .add(Style.HEAVY, 10)
          .add(Style.FLAT, 8)
  ),

  JUGGERNAUT_FORTE("Juggernaut Forte", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.HEAVY, 4)
          .add(Style.SPIKED, 16)
  ),

  CHOPPER_FORTE_1("Chopper Forte +1", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 3)
          .add(Style.LIGHT, 4)
          .add(Style.FLAT, 18)
  ),

  SPIKER("Spiker!", Type.FORTE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 1)
          .add(Style.HEAVY, 2)
          .add(Style.SPIKED, 22)
  ),

  FLAMBERGE_BLADE("Flamberge Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.LIGHT, 8)
          .add(Style.SPIKED, 10)
  ),

  SERPENT_BLADE("Serpent Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 10)
          .add(Style.LIGHT, 8)
          .add(Style.FLAT, 8)
  ),

  CLAYMORE_BLADE("Claymore Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 16)
          .add(Style.HEAVY, 4)
          .add(Style.FLAT, 4)
  ),

  FLEUR_DE_BLADE("Fleur de Blade", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 4)
          .add(Style.HEAVY, 18)
          .add(Style.SPIKED, 1)
  ),

  CHOPPA("Choppa!", Type.BLADE,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 1)
          .add(Style.LIGHT, 22)
          .add(Style.FLAT, 2)
  ),

  CORRUPTED_POINT("Corrupted Point", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 8)
          .add(Style.LIGHT, 10)
          .add(Style.SPIKED, 8)
  ),

  DEFENDERS_TIP("Defenders Tip", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 10)
          .add(Style.HEAVY, 8)
          .add(Style.SPIKED, 8)
  ),

  SERRATED_TIP("Serrated Tip", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 4)
          .add(Style.LIGHT, 16)
          .add(Style.SPIKED, 4)
  ),

  NEEDLE_POINT("Needle Point", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.NARROW, 18)
          .add(Style.LIGHT, 3)
          .add(Style.FLAT, 4)
  ),

  THE_POINT("The Point!", Type.TIP,
      ScoreBuilder.newInstance()
          .add(Style.BROAD, 2)
          .add(Style.LIGHT, 1)
          .add(Style.FLAT, 22)
  );

  private final String name;
  private final Type type;
  private final Map<Style, Integer> commission;

  Mould(String name, Type type, ScoreBuilder builder) {
    this.name = name;
    this.type = type;
    this.commission = builder.build();
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