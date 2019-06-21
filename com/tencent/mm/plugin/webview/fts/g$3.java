package com.tencent.mm.plugin.webview.fts;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.protocal.protobuf.bvq;
import com.tencent.mm.sdk.platformtools.ab;

public final class g$3
  implements w.a
{
  public g$3(g paramg, int paramInt, String paramString1, String paramString2)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(5740);
    if (paramm.getType() != 2608)
      AppMethodBeat.o(5740);
    while (true)
    {
      return 0;
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.FTS.WebSearchLogic", "getPoiInfo onSceneEnd errType:" + paramInt1 + " errCode:" + paramInt2 + " will retry");
        AppMethodBeat.o(5740);
        continue;
      }
      Bundle localBundle;
      if (paramb != null)
      {
        Object localObject = (bvq)paramb.fsH.fsP;
        paramb = h.JR(this.ugl);
        paramString = this.hlQ;
        paramm = this.ugm;
        localObject = ((bvq)localObject).vOy;
        localBundle = new Bundle();
        localBundle.putString("searchId", paramString);
        localBundle.putString("poiId", paramm);
        localBundle.putString("json", (String)localObject);
      }
      try
      {
        if (paramb.umI != null)
          paramb.umI.c(145, localBundle);
        AppMethodBeat.o(5740);
      }
      catch (RemoteException paramString)
      {
        while (true)
          ab.w("MicroMsg.MsgHandler", "onGetPoiReady exception" + paramString.getMessage());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.g.3
 * JD-Core Version:    0.6.2
 */