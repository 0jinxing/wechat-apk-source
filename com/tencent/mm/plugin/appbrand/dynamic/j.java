package com.tencent.mm.plugin.appbrand.dynamic;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.plugin.report.service.h;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class j
{
  private static j hlJ;
  public Map<String, j.b> hlB;

  static
  {
    AppMethodBeat.i(10712);
    hlJ = new j();
    AppMethodBeat.o(10712);
  }

  public j()
  {
    AppMethodBeat.i(10706);
    this.hlB = new ConcurrentHashMap();
    AppMethodBeat.o(10706);
  }

  public static j azE()
  {
    return hlJ;
  }

  private String zY(String paramString)
  {
    AppMethodBeat.i(10710);
    if (TextUtils.isEmpty(paramString))
    {
      paramString = "";
      AppMethodBeat.o(10710);
    }
    while (true)
    {
      return paramString;
      Iterator localIterator = this.hlB.entrySet().iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          if ((localEntry.getValue() != null) && (paramString.equals(((j.b)localEntry.getValue()).appId)))
          {
            paramString = (String)localEntry.getKey();
            AppMethodBeat.o(10710);
            break;
          }
        }
      paramString = "";
      AppMethodBeat.o(10710);
    }
  }

  public final void E(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(10708);
    j.b localb = (j.b)this.hlB.get(paramString);
    if (localb != null)
    {
      b.i("WidgetReporter_14443", "report %s, %s, %s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      h.pYm.e(14443, new Object[] { localb.appId, Integer.valueOf(0), Integer.valueOf(localb.css), Integer.valueOf(2), localb.czZ, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(localb.fmr) });
    }
    AppMethodBeat.o(10708);
  }

  public final void ba(String paramString, int paramInt)
  {
    AppMethodBeat.i(10707);
    E(zY(paramString), 626, paramInt);
    AppMethodBeat.o(10707);
  }

  public final void zX(String paramString)
  {
    AppMethodBeat.i(10709);
    E(zY(paramString), 626, 7);
    AppMethodBeat.o(10709);
  }

  public final void zZ(String paramString)
  {
    AppMethodBeat.i(10711);
    E(paramString, 626, 26);
    AppMethodBeat.o(10711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j
 * JD-Core Version:    0.6.2
 */