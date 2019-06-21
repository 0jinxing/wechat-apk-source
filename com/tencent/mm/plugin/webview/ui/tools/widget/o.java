package com.tencent.mm.plugin.webview.ui.tools.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.webview.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class o
{
  static void JU(int paramInt)
  {
    AppMethodBeat.i(80452);
    switch (paramInt)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(80452);
      while (true)
      {
        return;
        if (g.K(a.class) != null)
        {
          ((a)g.K(a.class)).cYT();
          AppMethodBeat.o(80452);
        }
        else
        {
          ab.e("MicroMsg.WebViewBagService", "doOp MMKernel.service(IWebViewBagService.class) null");
          AppMethodBeat.o(80452);
          continue;
          if (g.K(a.class) == null)
            break;
          ((a)g.K(a.class)).cYU();
          AppMethodBeat.o(80452);
        }
      }
      ab.e("MicroMsg.WebViewBagService", "doOp MMKernel.service(IWebViewBagService.class) null");
    }
  }

  public static void JV(int paramInt)
  {
    AppMethodBeat.i(80453);
    if (ah.bqo())
    {
      ab.i("MicroMsg.WebViewBagService", "in mm process op:%d", new Object[] { Integer.valueOf(paramInt) });
      JU(paramInt);
      AppMethodBeat.o(80453);
    }
    while (true)
    {
      return;
      XIPCInvoker.a("com.tencent.mm", new IPCInteger(paramInt), o.a.class, new o.1());
      AppMethodBeat.o(80453);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.o
 * JD-Core Version:    0.6.2
 */