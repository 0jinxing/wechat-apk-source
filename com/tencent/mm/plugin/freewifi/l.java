package com.tencent.mm.plugin.freewifi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

public final class l
{
  public static void a(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(20620);
    if (paramBoolean)
    {
      h.pYm.e(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(20620);
    }
    while (true)
    {
      return;
      h.pYm.e(12651, new Object[] { Integer.valueOf(4), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(20620);
    }
  }

  public static void b(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(20621);
    if (paramBoolean)
    {
      h.pYm.e(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(1), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(20621);
    }
    while (true)
    {
      return;
      h.pYm.e(12651, new Object[] { Integer.valueOf(5), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
      AppMethodBeat.o(20621);
    }
  }

  public static void v(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(20617);
    h.pYm.e(12651, new Object[] { Integer.valueOf(1), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    AppMethodBeat.o(20617);
  }

  public static void w(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(20618);
    h.pYm.e(12651, new Object[] { Integer.valueOf(2), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    AppMethodBeat.o(20618);
  }

  public static void x(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(20619);
    h.pYm.e(12651, new Object[] { Integer.valueOf(3), paramString1, Integer.valueOf(0), paramString2, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt) });
    AppMethodBeat.o(20619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.l
 * JD-Core Version:    0.6.2
 */