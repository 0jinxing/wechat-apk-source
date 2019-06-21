package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class aq$m
{
  public int cSQ;
  public String uni;
  public HashMap<String, Long> unu;

  public aq$m(aq paramaq)
  {
    AppMethodBeat.i(6770);
    this.unu = new HashMap();
    AppMethodBeat.o(6770);
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(6772);
    if (paramd == null)
      AppMethodBeat.o(6772);
    while (true)
    {
      return;
      int i = aq.aEn();
      Iterator localIterator = this.unu.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Map.Entry)localIterator.next();
        String str1 = (String)((Map.Entry)localObject).getKey();
        long l = ((Long)((Map.Entry)localObject).getValue()).longValue();
        h.pYm.a(32L, 2L, 1L, true);
        if (l == -1L)
        {
          h.pYm.a(32L, 13L, 1L, true);
          ab.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report fail url : %s, netType : %d", new Object[] { str1, Integer.valueOf(i) });
        }
        if ((l >= 0L) && (l <= 60000L))
        {
          String str2 = this.uni;
          if (str1 == null);
          for (localObject = str1; ; localObject = str1.replace(",", "!"))
          {
            aq.b(paramd, str2, new Object[] { Integer.valueOf(2), Long.valueOf(l), Integer.valueOf(i), localObject, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(this.cSQ), this.uni });
            ab.i("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.report url : %s, cost time : %d, netType : %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { str1, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(this.cSQ), this.uni });
            h.pYm.a(32L, 6L, l, true);
            break;
          }
        }
      }
      AppMethodBeat.o(6772);
    }
  }

  public final void bE(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(6771);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
      AppMethodBeat.o(6771);
    }
    while (true)
    {
      return;
      if (this.unu.containsKey(paramString))
      {
        if (paramBoolean)
        {
          long l1 = ((Long)this.unu.get(paramString)).longValue();
          long l2 = bo.anU();
          this.unu.put(paramString, Long.valueOf(l2 - l1));
          AppMethodBeat.o(6771);
        }
        else
        {
          this.unu.put(paramString, Long.valueOf(-1L));
        }
      }
      else
        AppMethodBeat.o(6771);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aq.m
 * JD-Core Version:    0.6.2
 */