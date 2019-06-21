package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.af.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class WebViewUI$45
  implements af.b
{
  private Map<Integer, Integer> uxx;

  WebViewUI$45(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7871);
    this.uxx = new HashMap();
    AppMethodBeat.o(7871);
  }

  public final void add(int paramInt)
  {
    AppMethodBeat.i(7872);
    WebViewUI.d(this.uxp, paramInt);
    if (this.uxx.containsKey(Integer.valueOf(paramInt)))
    {
      int i = ((Integer)this.uxx.get(Integer.valueOf(paramInt))).intValue();
      this.uxx.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
      AppMethodBeat.o(7872);
    }
    while (true)
    {
      return;
      this.uxx.put(Integer.valueOf(paramInt), Integer.valueOf(1));
      AppMethodBeat.o(7872);
    }
  }

  public final boolean cXH()
  {
    AppMethodBeat.i(7874);
    Iterator localIterator = this.uxx.entrySet().iterator();
    boolean bool;
    while (localIterator.hasNext())
      if (((Integer)((Map.Entry)localIterator.next()).getValue()).intValue() > 0)
      {
        bool = true;
        AppMethodBeat.o(7874);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(7874);
    }
  }

  public final void remove(int paramInt)
  {
    AppMethodBeat.i(7873);
    WebViewUI.e(this.uxp, paramInt);
    if (this.uxx.containsKey(Integer.valueOf(paramInt)))
    {
      int i = ((Integer)this.uxx.get(Integer.valueOf(paramInt))).intValue();
      this.uxx.put(Integer.valueOf(paramInt), Integer.valueOf(i - 1));
      AppMethodBeat.o(7873);
    }
    while (true)
    {
      return;
      this.uxx.put(Integer.valueOf(paramInt), Integer.valueOf(0));
      AppMethodBeat.o(7873);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI.45
 * JD-Core Version:    0.6.2
 */