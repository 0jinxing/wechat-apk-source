package com.tencent.mm.plugin.wepkg;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.event.DownloadBigPkgCompleteNotify;
import com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1
  implements com.tencent.mm.plugin.wepkg.event.a
{
  c$1(c paramc)
  {
  }

  public final void ct(Object paramObject)
  {
    AppMethodBeat.i(63364);
    int j;
    if ((paramObject instanceof ForceUpdateNotify))
    {
      paramObject = (ForceUpdateNotify)paramObject;
      if ((paramObject != null) && (paramObject.uWC != null) && (paramObject.uWC.length > 0))
      {
        paramObject = paramObject.uWC;
        int i = paramObject.length;
        j = 0;
        if (j < i)
        {
          String str = paramObject[j];
          if ((str.equals(a.dga())) || ((!bo.isNullOrNil(c.a(this.uVG))) && (str.equals(c.a(this.uVG)))))
          {
            c.a(this.uVG, str);
            AppMethodBeat.o(63364);
          }
        }
      }
    }
    while (true)
    {
      return;
      j++;
      break;
      AppMethodBeat.o(63364);
      continue;
      if ((paramObject instanceof DownloadBigPkgCompleteNotify))
      {
        paramObject = (DownloadBigPkgCompleteNotify)paramObject;
        if ((paramObject != null) && (paramObject.eBS != null) && ((paramObject.eBS.equals(a.dga())) || (paramObject.eBS.equals(c.a(this.uVG)))))
          c.a(this.uVG, paramObject.eBS, paramObject.success);
      }
      AppMethodBeat.o(63364);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.c.1
 * JD-Core Version:    0.6.2
 */