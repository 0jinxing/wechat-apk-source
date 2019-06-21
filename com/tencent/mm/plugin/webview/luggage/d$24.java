package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class d$24
  implements Runnable
{
  d$24(d paramd, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6046);
    if (this.uiy.uhT != null)
    {
      if (!bo.isNullOrNil(this.chV))
        this.uiy.uhT.setTitleText(this.chV);
      if (this.itf != 0)
        this.uiy.uhT.setTitleColor(this.itf);
    }
    AppMethodBeat.o(6046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.24
 * JD-Core Version:    0.6.2
 */