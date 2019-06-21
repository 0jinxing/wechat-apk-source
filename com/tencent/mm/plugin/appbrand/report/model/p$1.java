package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.appbrand.report.i;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class p$1
  implements Runnable
{
  p$1(p paramp, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132664);
    try
    {
      String str = (String)this.iBJ[18];
      int i;
      if (!bo.isNullOrNil(str))
      {
        i = str.indexOf('?');
        if (i >= 0)
          break label70;
      }
      label70: for (str = ""; ; str = q.encode(str.substring(i + 1, str.length())))
      {
        this.iBJ[18] = str;
        h.pYm.e(14992, i.k(this.iBJ));
        KVCommCrossProcessReceiver.cgo();
        AppMethodBeat.o(132664);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
        this.iBJ[18] = "";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.p.1
 * JD-Core Version:    0.6.2
 */