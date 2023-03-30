package org.rspeer.scripts.giantsfoundry.domain;

import com.google.inject.Singleton;
import jag.script.RSScriptEvent;
import org.rspeer.event.Subscribe;
import org.rspeer.game.event.ClientScriptEvent;

@Singleton
public class Domain {

  @Subscribe
  public void notify(ClientScriptEvent event) {
    RSScriptEvent src = event.getSource();

  }
}
