package com.tencent.mm.plugin.game.luggage.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wepkg.event.b;
import com.tencent.mm.sdk.platformtools.bo;

final class d$2 extends b
{
  d$2(d paramd)
  {
  }

  public final void bDB()
  {
    AppMethodBeat.i(135930);
    if (!bo.isNullOrNil(d.a(this.mUS)))
      this.mUS.post(new d.2.1(this));
    AppMethodBeat.o(135930);
  }

  public final void bDC()
  {
    AppMethodBeat.i(135931);
    this.mUS.post(new d.2.2(this));
    AppMethodBeat.o(135931);
  }

  public final void hL(final boolean paramBoolean)
  {
    AppMethodBeat.i(135932);
    this.mUS.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(135929);
        if (d.c(d.2.this.mUS))
        {
          d.a(d.2.this.mUS, false);
          d.e(d.2.this.mUS);
          if (paramBoolean)
          {
            com.tencent.luggage.g.d.i("MicroMsg.GameWebCoreImpl", "onPkgReady");
            d.2.this.mUS.stopLoading();
            d.f(d.2.this.mUS);
            d.2.this.mUS.loadUrl(d.g(d.2.this.mUS));
          }
        }
        AppMethodBeat.o(135929);
      }
    });
    AppMethodBeat.o(135932);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.d.d.2
 * JD-Core Version:    0.6.2
 */