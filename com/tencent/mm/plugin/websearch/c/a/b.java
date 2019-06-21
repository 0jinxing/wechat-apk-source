package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
  implements c
{
  Map<a, c.a> jxd;
  Map<a, CountDownLatch> uce;
  private l ucf;
  private l ucg;

  public b()
  {
    AppMethodBeat.i(91370);
    this.uce = new ConcurrentHashMap();
    this.jxd = new HashMap();
    this.ucf = new b.1(this);
    this.ucg = new b.2(this);
    AppMethodBeat.o(91370);
  }

  private static boolean a(a parama, l paraml)
  {
    boolean bool = false;
    AppMethodBeat.i(91373);
    if (bo.isNullOrNil(parama.query))
      AppMethodBeat.o(91373);
    while (true)
    {
      return bool;
      i locali = new i();
      locali.query = parama.query;
      locali.mEr = new int[] { 131072 };
      locali.mEs = new int[] { 1, 5 };
      locali.mEt = parama.ucd;
      locali.mEv = com.tencent.mm.plugin.fts.a.c.b.mEV;
      locali.mEu = new HashSet();
      locali.mEw = paraml;
      locali.scene = 1;
      ((n)g.M(n.class)).search(2, locali).mDs = parama;
      AppMethodBeat.o(91373);
      bool = true;
    }
  }

  public final void a(a parama, c.a parama1)
  {
    AppMethodBeat.i(91372);
    this.jxd.put(parama, parama1);
    a(parama, this.ucg);
    AppMethodBeat.o(91372);
  }

  public final a adR(String paramString)
  {
    AppMethodBeat.i(91371);
    e locale = new e(paramString);
    CountDownLatch localCountDownLatch = (CountDownLatch)this.uce.get(locale);
    if (localCountDownLatch == null)
      if (a(locale, this.ucf))
      {
        ab.i("FTSMatchContact", "not have a running task ,start new task, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(2147483647) });
        paramString = new CountDownLatch(1);
        this.uce.put(locale, paramString);
      }
    while (true)
    {
      if (paramString != null);
      try
      {
        paramString.await(2000L, TimeUnit.MILLISECONDS);
        this.uce.remove(locale);
        AppMethodBeat.o(91371);
        return locale;
        ab.i("FTSMatchContact", "start new task fail, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(2147483647) });
        paramString = localCountDownLatch;
        continue;
        ab.i("FTSMatchContact", "have a running task ,wait for result, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(2147483647) });
        paramString = localCountDownLatch;
      }
      catch (Exception paramString)
      {
        while (true)
          ab.printErrStackTrace("FTSMatchContact", paramString, "", new Object[0]);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.c.a.b
 * JD-Core Version:    0.6.2
 */