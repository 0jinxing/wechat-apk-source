package com.tencent.mm.plugin.appbrand.dynamic.d;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.n.a;
import com.tencent.mm.sdk.platformtools.ab;

final class a$b$4$1
  implements n.a
{
  a$b$4$1(a.b.4 param4)
  {
  }

  public final void f(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(10819);
    ab.i("MicroMsg.IPCInvoke_DoAuthorize", "stev onRevMsg resultCode %d", new Object[] { Integer.valueOf(paramInt) });
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    default:
      ab.d("MicroMsg.IPCInvoke_DoAuthorize", "press back button!");
      localBundle.putInt("retCode", -1);
    case 1:
    case 2:
    }
    while (true)
    {
      this.hmT.hmQ.l(localBundle);
      AppMethodBeat.o(10819);
      return;
      localBundle.putInt("retCode", 0);
      localBundle.putInt("resultCode", paramInt);
      localBundle.putBundle("resultData", paramBundle);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.d.a.b.4.1
 * JD-Core Version:    0.6.2
 */