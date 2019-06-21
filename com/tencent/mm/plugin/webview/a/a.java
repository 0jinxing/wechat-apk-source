package com.tencent.mm.plugin.webview.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.g.a.e;
import com.tencent.mm.sdk.g.d;

public final class a
  implements o
{
  public static n gkE;
  public static m gkF;

  public static void R(Runnable paramRunnable)
  {
    AppMethodBeat.i(5622);
    if (0L > 0L)
    {
      d.xDG.b(paramRunnable, "WebViewWorkerThread", 0L);
      AppMethodBeat.o(5622);
    }
    while (true)
    {
      return;
      d.xDG.b(paramRunnable, "WebViewWorkerThread");
      AppMethodBeat.o(5622);
    }
  }

  public final void a(m paramm)
  {
    gkF = paramm;
  }

  public final void a(n paramn)
  {
    gkE = paramn;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.a.a
 * JD-Core Version:    0.6.2
 */