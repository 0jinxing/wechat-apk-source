package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.j.a.b;
import com.tencent.mm.plugin.appbrand.j.a.d;

final class r$2
  implements a.b
{
  r$2(r paramr, q.a parama)
  {
  }

  public final void a(a.d paramd)
  {
    AppMethodBeat.i(132341);
    this.iss.runOnUiThread(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(132340);
        r.2.this.ist.proceed();
        AppMethodBeat.o(132340);
      }
    });
    AppMethodBeat.o(132341);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.r.2
 * JD-Core Version:    0.6.2
 */