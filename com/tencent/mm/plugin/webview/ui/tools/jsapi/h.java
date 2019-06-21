package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modelcache.r;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class h
{
  private static final SparseArray<g> uIE;
  private static volatile g uIF;

  static
  {
    AppMethodBeat.i(9809);
    uIE = new SparseArray();
    uIF = null;
    AppMethodBeat.o(9809);
  }

  public static g JR(int paramInt)
  {
    AppMethodBeat.i(9807);
    try
    {
      if (uIE.get(paramInt) == null)
      {
        localg = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g;
        localg.<init>(paramInt);
        uIE.put(paramInt, localg);
      }
      g localg = (g)uIE.get(paramInt);
      uIF = localg;
      return localg;
    }
    finally
    {
      AppMethodBeat.o(9807);
    }
  }

  @Deprecated
  public static g dcN()
  {
    AppMethodBeat.i(9806);
    if (uIF == null)
      uIF = new g(0);
    g localg = uIF;
    AppMethodBeat.o(9806);
    return localg;
  }

  public static void detach()
  {
    AppMethodBeat.i(9808);
    ab.i("MicroMsg.MsgHandlerHolder", "detach");
    int i = 0;
    try
    {
      while (i < uIE.size())
      {
        g localg = (g)uIE.valueAt(i);
        int j = uIE.keyAt(i);
        if (localg != null)
          r.a.cYq().IP(j);
        i++;
      }
      uIE.clear();
      if (uIF != null)
      {
        r.a.cYq().IP(0);
        uIF = null;
      }
      AppMethodBeat.o(9808);
      return;
    }
    finally
    {
      AppMethodBeat.o(9808);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.h
 * JD-Core Version:    0.6.2
 */