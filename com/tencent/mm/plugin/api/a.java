package com.tencent.mm.plugin.api;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.mmsight.api.a.b;
import com.tencent.mm.plugin.mmsight.model.b.b;
import com.tencent.mm.plugin.mmsight.model.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
  implements a.b
{
  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    AppMethodBeat.i(76302);
    if (paramInt1 == 1)
    {
      paramString1 = new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
      AppMethodBeat.o(76302);
    }
    while (true)
    {
      return paramString1;
      if (paramInt1 == 2)
      {
        paramString1 = new c(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5);
        AppMethodBeat.o(76302);
      }
      else
      {
        paramString1 = null;
        AppMethodBeat.o(76302);
      }
    }
  }

  public final com.tencent.mm.plugin.mmsight.api.a a(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(76303);
    if (paramInt1 == 1)
    {
      paramString1 = new b(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
      AppMethodBeat.o(76303);
    }
    while (true)
    {
      return paramString1;
      if (paramInt1 == 2)
      {
        paramString1 = new c(paramString1, paramString2, paramInt2, paramInt3, paramInt4, paramInt5, paramLong1, paramLong2);
        AppMethodBeat.o(76303);
      }
      else
      {
        paramString1 = null;
        AppMethodBeat.o(76303);
      }
    }
  }

  public final com.tencent.mm.plugin.mmsight.api.a a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(76301);
    int i = q.etj.etI;
    ab.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
      if (i == 1)
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        AppMethodBeat.o(76301);
      }
    while (true)
    {
      return paramString1;
      if (i == 2)
      {
        paramString1 = new c(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        AppMethodBeat.o(76301);
      }
      else if (d.iW(19))
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        AppMethodBeat.o(76301);
      }
      else
      {
        paramString1 = new c(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4, paramLong1, paramLong2);
        AppMethodBeat.o(76301);
      }
    }
  }

  public final com.tencent.mm.plugin.mmsight.api.a b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(76300);
    int i = q.etj.etI;
    ab.i("MicroMsg.MMSightPresendRemuxerImpl", "get, configRemuxerType: %s", new Object[] { Integer.valueOf(i) });
    if (i != -1)
      if (i == 1)
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(76300);
      }
    while (true)
    {
      return paramString1;
      if (i == 2)
      {
        paramString1 = new c(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(76300);
      }
      else if (d.iW(19))
      {
        paramString1 = new b(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(76300);
      }
      else
      {
        paramString1 = new c(paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramInt4);
        AppMethodBeat.o(76300);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.a
 * JD-Core Version:    0.6.2
 */