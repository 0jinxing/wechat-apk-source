package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements a
{
  private String appId;
  private String hcx;
  private String hlm;
  private Map<String, Integer> hoQ;

  public c(String paramString1, String paramString2)
  {
    AppMethodBeat.i(10977);
    this.hoQ = new HashMap();
    this.appId = paramString1;
    this.hlm = paramString2;
    this.hcx = (this.hlm + "-" + this.appId);
    AppMethodBeat.o(10977);
  }

  public final void Al(String paramString)
  {
    AppMethodBeat.i(10978);
    if (TextUtils.isEmpty(paramString))
      AppMethodBeat.o(10978);
    while (true)
    {
      return;
      Integer localInteger1 = (Integer)this.hoQ.get(paramString);
      Integer localInteger2 = localInteger1;
      if (localInteger1 == null)
        localInteger2 = Integer.valueOf(0);
      this.hoQ.put(paramString, Integer.valueOf(localInteger2.intValue() + 1));
      AppMethodBeat.o(10978);
    }
  }

  public final void IF()
  {
    AppMethodBeat.i(10979);
    Iterator localIterator = this.hoQ.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      h.pYm.e(14705, new Object[] { localEntry.getKey(), localEntry.getValue(), this.hcx, this.hlm, this.appId });
    }
    this.hoQ.clear();
    AppMethodBeat.o(10979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.i.c
 * JD-Core Version:    0.6.2
 */