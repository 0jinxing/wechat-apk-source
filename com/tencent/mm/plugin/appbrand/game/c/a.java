package com.tencent.mm.plugin.appbrand.game.c;

import com.tencent.magicbrush.a.d.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static final class b
    implements d.a
  {
    private int hro = -1;

    public final void fR(int paramInt)
    {
      AppMethodBeat.i(130128);
      ab.i("MBFontManagerRegistry", "mbfont idkey logid:" + this.hro + ",key:" + paramInt);
      h.pYm.k(this.hro, paramInt, 1L);
      AppMethodBeat.o(130128);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.c.a
 * JD-Core Version:    0.6.2
 */