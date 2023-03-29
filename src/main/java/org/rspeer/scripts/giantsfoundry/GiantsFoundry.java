package org.rspeer.scripts.giantsfoundry;

import org.rspeer.commons.ArrayUtils;
import org.rspeer.commons.StopWatch;
import org.rspeer.game.Game;
import org.rspeer.game.component.tdi.Skill;
import org.rspeer.game.script.Task;
import org.rspeer.game.script.TaskScript;
import org.rspeer.game.script.meta.ScriptMeta;
import org.rspeer.game.script.meta.paint.PaintBinding;
import org.rspeer.game.script.meta.paint.PaintScheme;
import org.rspeer.scripts.giantsfoundry.domain.Domain;

@ScriptMeta(
    name = "Giants Foundry",
    desc = "Doga",
    version = 1.0,
    paint = PaintScheme.class,
    regions = -3
)
public class GiantsFoundry extends TaskScript {

  @PaintBinding("Runtime")
  private final StopWatch runtime = StopWatch.start();

  @PaintBinding("Experience")
  private final Skill skill = Skill.SMITHING;

  @Override
  protected Class<? extends Task>[] tasks() {
    return ArrayUtils.getTypeSafeArray(

    );
  }

  private Domain getDomain() {
    return injector.getInstance(Domain.class);
  }

  @Override
  public void initialize() {
    Game.getEventDispatcher().subscribe(getDomain());
  }

  @Override
  public void shutdown() {
    Game.getEventDispatcher().unsubscribe(getDomain());
  }
}
