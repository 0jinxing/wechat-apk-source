package com.tencent.mm.plugin.appbrand;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService.a;

final class i$4 extends AppBrandMainProcessService.a
{
  private boolean gOd = false;

  i$4(i parami)
  {
  }

  public final void ats()
  {
    AppMethodBeat.i(86654);
    if (this.gOd)
      i.c(this.gOb);
    this.gOd = false;
    AppMethodBeat.o(86654);
  }

  public final void att()
  {
    this.gOd = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.4
 * JD-Core Version:    0.6.2
 */