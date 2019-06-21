package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2$2
  implements Runnable
{
  d$2$2(d.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(135928);
    com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onForceUpdate");
    d.a(this.mUT.mUS, true);
    this.mUT.mUS.postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(135927);
        if (d.c(d.2.2.this.mUT.mUS))
          d.d(d.2.2.this.mUT.mUS);
        AppMethodBeat.o(135927);
      }
    }
    , 1000L);
    AppMethodBeat.o(135928);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d.2.2
 * JD-Core Version:    0.6.2
 */