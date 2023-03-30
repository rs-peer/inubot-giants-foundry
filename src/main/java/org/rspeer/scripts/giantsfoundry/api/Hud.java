package org.rspeer.scripts.giantsfoundry.api;

import org.rspeer.game.Vars;
import org.rspeer.scripts.giantsfoundry.data.Constant;

public class Hud {

  public static int getSectionCount() {
    int value = Vars.get(Vars.Type.VARBIT, Constant.SECTION_VARBIT);
    if (value < 20) {
      return 3;
    } else if (value < 60) {
      return 4;
    } else if (value < 90) {
      return 5;
    } else if (value <= 120) {
      return 6;
    }

    return 7;
  }

  public static int getTemperature() {
    return Vars.get(Vars.Type.VARBIT, Constant.TEMPERATURE_VARBIT);
  }

  public static int getProgress() {
    return Vars.get(Vars.Type.VARBIT, Constant.PROGRESS_VARBIT);
  }
}
