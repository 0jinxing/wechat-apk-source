package com.tencent.mm.plugin.appbrand.app;

import com.tencent.luggage.g.d.a;
import com.tencent.mars.xlog.Xlog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$a
  implements d.a
{
  private final Xlog gSb;

  private g$a()
  {
    AppMethodBeat.i(129304);
    this.gSb = new Xlog();
    AppMethodBeat.o(129304);
  }

  public final int getLogLevel()
  {
    AppMethodBeat.i(129310);
    int i = this.gSb.getLogLevel();
    AppMethodBeat.o(129310);
    return i;
  }

  public final void logD(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(129307);
    this.gSb.logD(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(129307);
  }

  public final void logE(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(129309);
    this.gSb.logE(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(129309);
  }

  public final void logI(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(129306);
    this.gSb.logI(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(129306);
  }

  public final void logV(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(129305);
    this.gSb.logV(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(129305);
  }

  public final void logW(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(129308);
    this.gSb.logW(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(129308);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.g.a
 * JD-Core Version:    0.6.2
 */