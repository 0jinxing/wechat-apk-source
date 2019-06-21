package com.tencent.mm.plugin.appbrand.page;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class q$17
  implements q.a
{
  private boolean isd = false;
  private boolean ise = false;
  private boolean xH = false;

  q$17(q paramq, String paramString, aq paramaq)
  {
  }

  public final void aJr()
  {
    this.ise = true;
  }

  public final void cancel()
  {
    this.xH = true;
  }

  public final void proceed()
  {
    AppMethodBeat.i(87095);
    if (this.xH)
      AppMethodBeat.o(87095);
    while (true)
    {
      return;
      if (q.a(this.irR) == null)
      {
        ab.w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", new Object[] { this.isf, this.isg });
        AppMethodBeat.o(87095);
      }
      else
      {
        if (!this.isd)
        {
          q.a(this.irR, this.isf, this.isg, this.ise);
          this.isd = true;
        }
        AppMethodBeat.o(87095);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.q.17
 * JD-Core Version:    0.6.2
 */