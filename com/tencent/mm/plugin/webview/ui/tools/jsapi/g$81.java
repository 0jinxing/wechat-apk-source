package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.protocal.protobuf.csp;
import com.tencent.mm.sdk.platformtools.ab;

final class g$81
  implements w.a
{
  g$81(g paramg, long paramLong)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(9145);
    ab.i("MicroMsg.MsgHandler", "doUxSearchOpLog rsp errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramb = (csp)paramb.fsH.fsP;
    paramString = new Bundle();
    paramString.putLong("reqId", this.uAE);
    paramString.putInt("ret", paramInt2);
    if (paramb.xpR != null)
    {
      paramb.xpR.dlY();
      paramString.putString("json", paramb.xpR.dlY());
    }
    try
    {
      if (g.k(this.uHd) != null)
        g.k(this.uHd).c(147, paramString);
      AppMethodBeat.o(9145);
      return 0;
    }
    catch (RemoteException paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.MsgHandler", paramString, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.81
 * JD-Core Version:    0.6.2
 */