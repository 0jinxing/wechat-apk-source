package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum aq
{
  private final String type;

  static
  {
    AppMethodBeat.i(87347);
    iuY = new aq("APP_LAUNCH", 0, "appLaunch");
    iuZ = new aq("NAVIGATE_TO", 1, "navigateTo");
    iva = new aq("NAVIGATE_BACK", 2, "navigateBack");
    ivb = new aq("REDIRECT_TO", 3, "redirectTo");
    ivc = new aq("RE_LAUNCH", 4, "reLaunch");
    ivd = new aq("AUTO_RE_LAUNCH", 5, "autoReLaunch");
    ive = new aq("SWITCH_TAB", 6, "switchTab");
    ivf = new aq[] { iuY, iuZ, iva, ivb, ivc, ivd, ive };
    AppMethodBeat.o(87347);
  }

  private aq(String paramString)
  {
    this.type = paramString;
  }

  public final String toString()
  {
    return this.type;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aq
 * JD-Core Version:    0.6.2
 */