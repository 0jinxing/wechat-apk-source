package com.tencent.mm.app.plugin.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.sdk.platformtools.ap;

public final class a$f extends com.tencent.mm.sdk.b.c<fn>
{
  k chd;
  ap che;
  boolean chf;
  boolean chg;
  boolean chh;
  fn chi;
  Runnable chj;
  String fileName;

  public a$f()
  {
    AppMethodBeat.i(15742);
    this.fileName = "";
    this.xxI = fn.class.getName().hashCode();
    AppMethodBeat.o(15742);
  }

  final void stopRecord()
  {
    AppMethodBeat.i(15743);
    if (this.chd != null)
    {
      this.chg = this.chd.EB();
      if (this.chj != null)
      {
        if (this.chi != null)
        {
          this.chi.czn.czo = this.chd.coZ.cpR;
          this.chi = null;
        }
        if (this.chh)
          this.chj.run();
        this.chj = null;
      }
      this.chf = true;
    }
    AppMethodBeat.o(15743);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.b.a.f
 * JD-Core Version:    0.6.2
 */