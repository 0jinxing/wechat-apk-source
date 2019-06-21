package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;

final class l$1
  implements Runnable
{
  l$1(l paraml, int paramInt)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(96141);
    if (this.hMB == 1)
      if (l.a(this.hMC).equals("horizontal"))
        break label158;
    while (true)
    {
      if (i != -2147483648)
      {
        l.b(this.hMC).setHomeOrientation(i);
        l.c(this.hMC).setConfig(l.b(this.hMC));
      }
      AppMethodBeat.o(96141);
      return;
      if (this.hMB == 3)
      {
        if (l.a(this.hMC).equals("horizontal"))
          i = 1;
        else
          i = 2;
      }
      else if (this.hMB == 0)
      {
        if (!l.a(this.hMC).equals("horizontal"))
          i = 1;
      }
      else if (this.hMB == 2)
      {
        if (l.a(this.hMC).equals("horizontal"))
          i = 2;
        else
          label158: i = 3;
      }
      else
        i = -2147483648;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.live.l.1
 * JD-Core Version:    0.6.2
 */