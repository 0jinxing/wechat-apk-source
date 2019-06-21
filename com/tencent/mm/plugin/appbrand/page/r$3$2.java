package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$3$2
  implements Runnable
{
  r$3$2(r.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132343);
    if ((this.isw.isv) && (r.a(this.isw.iss) != null))
    {
      r.a(this.isw.iss).cancel();
      r.a(this.isw.iss, null);
    }
    this.isw.ist.cancel();
    AppMethodBeat.o(132343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.r.3.2
 * JD-Core Version:    0.6.2
 */