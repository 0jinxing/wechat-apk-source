package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.report.i;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class k$1
  implements Runnable
{
  k$1(k paramk, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132630);
    try
    {
      String str = (String)this.iBJ[19];
      int i;
      if (!bo.isNullOrNil(str))
      {
        i = str.indexOf('?');
        if (i >= 0)
          break label70;
      }
      label70: for (str = ""; ; str = q.encode(str.substring(i + 1, str.length())))
      {
        this.iBJ[19] = str;
        h.pYm.e(13536, i.k(this.iBJ));
        KVCommCrossProcessReceiver.cgo();
        AppMethodBeat.o(132630);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        this.iBJ[19] = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.k.1
 * JD-Core Version:    0.6.2
 */