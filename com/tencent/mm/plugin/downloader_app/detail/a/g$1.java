package com.tencent.mm.plugin.downloader_app.detail.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.a.a.a;
import com.tencent.mm.plugin.downloader_app.a.a.b;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;

final class g$1
  implements a.b
{
  g$1(g paramg, bc.a parama)
  {
  }

  public final void a(a.a parama, long paramLong)
  {
    AppMethodBeat.i(136079);
    if (parama == a.a.kNZ)
    {
      this.kOw.d(null, null);
      AppMethodBeat.o(136079);
    }
    while (true)
    {
      return;
      if (parama == a.a.kOa)
      {
        this.kOw.d("fail", null);
        AppMethodBeat.o(136079);
      }
      else
      {
        if (parama == a.a.kOb)
          this.kOw.d("wait_for_wifi", null);
        AppMethodBeat.o(136079);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.g.1
 * JD-Core Version:    0.6.2
 */