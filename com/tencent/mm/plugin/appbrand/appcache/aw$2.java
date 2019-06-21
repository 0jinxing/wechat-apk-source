package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.i;
import java.util.Map;

final class aw$2 extends g.c
{
  aw$2(aw paramaw, i parami)
  {
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(86811);
    g.b(aw.a(this.gVg), this);
    synchronized (aw.awn())
    {
      aw.awn().remove(this.gVf);
      aw.b(this.gVg);
      AppMethodBeat.o(86811);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aw.2
 * JD-Core Version:    0.6.2
 */