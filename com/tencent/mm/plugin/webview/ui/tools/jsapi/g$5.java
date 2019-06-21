package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.ce.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$5
  implements w.a
{
  g$5(g paramg, i parami, String paramString1, Bundle paramBundle, String paramString2, String paramString3, String paramString4)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(9045);
    ab.i("MicroMsg.MsgHandler", "launchApplication check result errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    a.post(new g.5.1(this, paramInt1, paramInt2, paramb));
    AppMethodBeat.o(9045);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.5
 * JD-Core Version:    0.6.2
 */