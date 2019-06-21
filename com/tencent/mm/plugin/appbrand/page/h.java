package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import java.util.HashMap;

public class h extends p
{
  private static final int CTRL_INDEX = 49;
  private static final String NAME = "onAppEnterBackground";

  public final void A(i parami)
  {
    AppMethodBeat.i(87064);
    HashMap localHashMap = new HashMap(1);
    g.d locald = g.wV(parami.mAppId);
    String str = "hide";
    switch (h.1.gWZ[locald.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      localHashMap.put("mode", str);
      s(localHashMap).i(parami.xT()).aCj();
      AppMethodBeat.o(87064);
      return;
      str = "close";
      continue;
      str = "back";
      continue;
      str = "hide";
      continue;
      str = "hang";
      continue;
      str = "launchMiniProgram";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.h
 * JD-Core Version:    0.6.2
 */