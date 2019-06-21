package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.aw.e;
import com.tencent.mm.g.a.ke;
import com.tencent.mm.g.a.ke.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.sdk.b.c;
import java.util.Iterator;
import java.util.Set;

final class b$3 extends c<ke>
{
  b$3(b paramb)
  {
    AppMethodBeat.i(5675);
    this.xxI = ke.class.getName().hashCode();
    AppMethodBeat.o(5675);
  }

  private boolean a(ke paramke)
  {
    AppMethodBeat.i(5676);
    e locale = paramke.cFH.cFB;
    if ((locale != null) && (a.d(locale)))
      switch (paramke.cFH.action)
      {
      case 5:
      case 6:
      default:
      case 2:
      case 3:
      case 4:
      case 7:
      case 0:
      case 1:
      }
    while (true)
    {
      AppMethodBeat.o(5676);
      return false;
      paramke = this.ufq.ufg.iterator();
      while (paramke.hasNext())
        h.JR(((Integer)paramke.next()).intValue()).dN(locale.fJU, 0);
      paramke = this.ufq.ufg.iterator();
      while (paramke.hasNext())
        h.JR(((Integer)paramke.next()).intValue()).dN(locale.fJU, 1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.3
 * JD-Core Version:    0.6.2
 */