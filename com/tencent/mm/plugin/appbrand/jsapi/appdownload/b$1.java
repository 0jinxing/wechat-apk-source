package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.c;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.q;
import org.json.JSONObject;

final class b$1
  implements MMToClientEvent.c
{
  b$1(b paramb, q paramq)
  {
  }

  public final void bk(Object paramObject)
  {
    AppMethodBeat.i(130644);
    if ((paramObject instanceof AppbrandDownloadState))
    {
      paramObject = (AppbrandDownloadState)paramObject;
      if (this.hsD != null)
        this.hzF.i(this.hsD).AL(paramObject.aCq().toString()).aCj();
    }
    AppMethodBeat.o(130644);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.b.1
 * JD-Core Version:    0.6.2
 */