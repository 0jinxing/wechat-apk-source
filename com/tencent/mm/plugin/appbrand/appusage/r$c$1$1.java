package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.sdk.platformtools.ab;

final class r$c$1$1
  implements w.a
{
  r$c$1$1(r.c.1 param1, float paramFloat1, float paramFloat2, double paramDouble)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(129626);
    ab.d("MicroMsg.AppBrandPushNewOrRedDotLogic", "locationReport, errType %d, errCode %d, errMsg %s, longitude %f, latitude %f, accuracy %f", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Float.valueOf(this.gZX), Float.valueOf(this.gZY), Double.valueOf(this.fCb) });
    AppMethodBeat.o(129626);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.r.c.1.1
 * JD-Core Version:    0.6.2
 */