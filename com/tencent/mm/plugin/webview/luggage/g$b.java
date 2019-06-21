package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.m.e;
import com.tencent.mm.m.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

class g$b
  implements i<IPCBoolean, IPCBoolean>
{
  private static IPCBoolean cXa()
  {
    boolean bool = true;
    AppMethodBeat.i(6134);
    IPCBoolean localIPCBoolean = new IPCBoolean();
    try
    {
      i = bo.getInt(g.Nu().getValue("EnableWebviewScanQRCode"), 1);
      if (i == 1)
      {
        localIPCBoolean.value = bool;
        AppMethodBeat.o(6134);
        return localIPCBoolean;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.GameWebViewMenuListHelper", "isAllowScanQRCode parseInt failed");
        int i = 0;
        continue;
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.b
 * JD-Core Version:    0.6.2
 */