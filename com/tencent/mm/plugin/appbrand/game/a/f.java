package com.tencent.mm.plugin.appbrand.game.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/config/WAGameConfigWxbct;", "Lcom/tencent/mm/plugin/appbrand/game/config/WAGameDynamicConfig;", "", "()V", "TAG", "", "enableABTest", "Lcom/tencent/mm/plugin/expt/api/IExptService$ExptEnum;", "enableAlert", "enableKv", "getActuallyConfig", "getConfig", "()Ljava/lang/Boolean;", "getConfigDefaultValue", "onProcessConfig", "input", "(Ljava/lang/String;)Ljava/lang/Boolean;", "plugin-appbrand-integration_release"})
public final class f extends g<Boolean>
{
  public static final f hqR;

  static
  {
    AppMethodBeat.i(134628);
    hqR = new f();
    AppMethodBeat.o(134628);
  }

  public static final boolean aAE()
  {
    AppMethodBeat.i(134627);
    boolean bool;
    if (!((Boolean)hqR.Uw()).booleanValue())
    {
      ab.i("WAGameConfigWxbct", "getActuallyConfig self == false");
      AppMethodBeat.o(134627);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = ((Number)a.a(a.a.lIB, Integer.valueOf(0))).intValue();
      if (i == 0)
      {
        ab.i("WAGameConfigWxbct", "getActuallyConfig gcfactor == 0");
        AppMethodBeat.o(134627);
        bool = false;
      }
      else
      {
        ab.i("WAGameConfigWxbct", "getActuallyConfig gcfactor != 0 [" + i + "], enable wxbct");
        bool = true;
        AppMethodBeat.o(134627);
      }
    }
  }

  protected final boolean aAA()
  {
    return true;
  }

  protected final String aAy()
  {
    return "wxbct";
  }

  protected final a.a aAz()
  {
    return a.a.lIF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.a.f
 * JD-Core Version:    0.6.2
 */