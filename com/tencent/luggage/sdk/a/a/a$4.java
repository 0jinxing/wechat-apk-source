package com.tencent.luggage.sdk.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.aj;

final class a$4
  implements Runnable
{
  a$4(a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101636);
    if (this.bQU.aJz().getWebScrollY() == 0)
      AppMethodBeat.o(101636);
    while (true)
    {
      return;
      a.a(this.bQU);
      this.bQU.aJz().setVerticalScrollBarEnabled(false);
      AppMethodBeat.o(101636);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.a.a.a.4
 * JD-Core Version:    0.6.2
 */