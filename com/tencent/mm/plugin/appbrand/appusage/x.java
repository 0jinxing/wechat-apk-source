package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.widget.recentview.d;
import com.tencent.mm.protocal.protobuf.anx;
import java.util.concurrent.TimeUnit;

public final class x extends com.tencent.mm.ai.a<anx>
{
  private static final long has;

  static
  {
    AppMethodBeat.i(129705);
    has = TimeUnit.MINUTES.toSeconds(5L);
    AppMethodBeat.o(129705);
  }

  public static void axL()
  {
    AppMethodBeat.i(129702);
    if (!g.RN().eJb)
      AppMethodBeat.o(129702);
    while (true)
    {
      return;
      g.K(d.class);
      AppMethodBeat.o(129702);
    }
  }

  static anx axM()
  {
    AppMethodBeat.i(129703);
    anx localanx = (anx)f.auZ().e("GetSearchShowOutWxaApp_resp", anx.class);
    AppMethodBeat.o(129703);
    return localanx;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.x
 * JD-Core Version:    0.6.2
 */