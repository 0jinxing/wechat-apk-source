package com.tencent.mm.plugin.sns.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class a
  implements c
{
  private Map<Integer, com.tencent.mm.plugin.sns.a.a.a> qCV;

  public a()
  {
    AppMethodBeat.i(35688);
    this.qCV = new HashMap();
    AppMethodBeat.o(35688);
  }

  public final void a(int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35690);
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.qCV.get(Integer.valueOf(paramInt1));
    if (locala == null)
    {
      ab.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt1) });
      AppMethodBeat.o(35690);
    }
    while (true)
    {
      return;
      locala.e(paramInt2, paramArrayOfObject);
      AppMethodBeat.o(35690);
    }
  }

  public final void a(com.tencent.mm.plugin.sns.a.a.a parama)
  {
    AppMethodBeat.i(35689);
    this.qCV.put(Integer.valueOf(parama.cez()), parama);
    AppMethodBeat.o(35689);
  }

  public final void e(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(35691);
    com.tencent.mm.plugin.sns.a.a.a locala = (com.tencent.mm.plugin.sns.a.a.a)this.qCV.get(Integer.valueOf(paramInt));
    if (locala == null)
    {
      ab.w("SnsAdReportService", "can not find %s implementation for kv %d", new Object[] { com.tencent.mm.plugin.sns.a.a.a.class, Integer.valueOf(paramInt) });
      AppMethodBeat.o(35691);
    }
    while (true)
    {
      return;
      locala.t(paramArrayOfObject);
      AppMethodBeat.o(35691);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.a
 * JD-Core Version:    0.6.2
 */