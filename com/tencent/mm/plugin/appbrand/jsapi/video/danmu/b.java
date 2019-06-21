package com.tencent.mm.plugin.appbrand.jsapi.video.danmu;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

public final class b
{
  public static int iaT = 18;
  public static int iaU = 10;
  private static int iaV = 3;

  public static int E(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(138541);
    paramInt = a.fromDPToPix(paramContext, paramInt);
    AppMethodBeat.o(138541);
    return paramInt;
  }

  public static int aGd()
  {
    return iaV;
  }

  public static float cO(Context paramContext)
  {
    AppMethodBeat.i(126597);
    float f = a.fromDPToPix(paramContext, iaT);
    AppMethodBeat.o(126597);
    return f * 2.0F;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.danmu.b
 * JD-Core Version:    0.6.2
 */