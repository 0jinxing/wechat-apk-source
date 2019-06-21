package com.tencent.mm.plugin.boots.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.boots.a.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class a
  implements e
{
  public static a jJA;
  public com.tencent.mm.plugin.boots.b.a.a jJB;

  private void e(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = 255;
    AppMethodBeat.i(90532);
    if (this.jJB != null)
    {
      com.tencent.mm.plugin.boots.a.a locala = this.jJB.rV(paramInt1);
      paramInt1 = this.jJB.rU(paramInt1);
      if ((paramBoolean) && (locala.field_dau != paramInt1))
      {
        if (paramInt1 > 255)
        {
          paramInt1 = i;
          h.pYm.a(paramInt2, paramInt1, 1L, false);
        }
      }
      else
        AppMethodBeat.o(90532);
    }
    while (true)
    {
      return;
      break;
      ab.w("MicroMsg.Boots.TinkerLogic", "storage is null.");
      AppMethodBeat.o(90532);
    }
  }

  public final List<com.tencent.mm.plugin.boots.a.a> aVJ()
  {
    AppMethodBeat.i(90533);
    List localList;
    if (this.jJB != null)
    {
      localList = this.jJB.aVJ();
      AppMethodBeat.o(90533);
    }
    while (true)
    {
      return localList;
      localList = null;
      AppMethodBeat.o(90533);
    }
  }

  public final void dC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(90531);
    e(paramInt1, true, paramInt2);
    AppMethodBeat.o(90531);
  }

  public final void rT(int paramInt)
  {
    AppMethodBeat.i(90530);
    e(paramInt, false, 0);
    AppMethodBeat.o(90530);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.boots.b.a
 * JD-Core Version:    0.6.2
 */