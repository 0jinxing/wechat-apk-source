package com.tencent.mm.plugin.appbrand.config;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.service.d.a;
import com.tencent.mm.sdk.platformtools.al;

final class n$3
  implements Runnable
{
  n$3(n paramn, d.a parama, String paramString, al paramal)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(129875);
    if (!g.RN().QY())
    {
      if (this.hhz != null)
        this.hhz.d(null);
      AppMethodBeat.o(129875);
      return;
    }
    if (r.zr(this.eiH))
      r.a(this.eiH, false, new n.3.1(this));
    while (true)
    {
      Looper.myQueue().addIdleHandler(new n.3.2(this));
      AppMethodBeat.o(129875);
      break;
      if (this.hhz != null)
        this.hhz.d(this.hhA.zb(this.eiH));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.n.3
 * JD-Core Version:    0.6.2
 */