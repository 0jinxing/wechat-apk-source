package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;

final class g$5 extends ai
{
  g$5(g paramg, String paramString1, int paramInt1, String paramString2, int paramInt2, WxaAttributes paramWxaAttributes)
  {
    super(paramString1, paramInt1, paramString2, paramInt2, paramWxaAttributes);
  }

  public final void aHe()
  {
    AppMethodBeat.i(131779);
    g.d(this.igR);
    AppMethodBeat.o(131779);
  }

  public final void aHj()
  {
    AppMethodBeat.i(131780);
    g.e(this.igR);
    AppMethodBeat.o(131780);
  }

  public final void onDownloadProgress(int paramInt)
  {
    AppMethodBeat.i(131781);
    if (this.igR.igD != null)
      this.igR.igD.onDownloadProgress(paramInt);
    AppMethodBeat.o(131781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.g.5
 * JD-Core Version:    0.6.2
 */