package com.tencent.mm.plugin.webview.modeltools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;

public final class n
{
  private final LinkedList<String> upF;

  public n()
  {
    AppMethodBeat.i(7036);
    this.upF = new LinkedList();
    AppMethodBeat.o(7036);
  }

  private void aeV(String paramString)
  {
    AppMethodBeat.i(7038);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(7038);
    while (true)
    {
      return;
      synchronized (this.upF)
      {
        String str = (String)this.upF.peekLast();
        paramString = URLEncoder.encode(paramString);
        if ((str == null) || (!str.equals(paramString)))
          this.upF.addLast(paramString);
        if (this.upF.size() > 10)
          this.upF.removeFirst();
        AppMethodBeat.o(7038);
      }
    }
  }

  public final String[] cYO()
  {
    AppMethodBeat.i(7039);
    synchronized (this.upF)
    {
      String[] arrayOfString = new String[this.upF.size()];
      Iterator localIterator = this.upF.iterator();
      for (int i = 0; localIterator.hasNext(); i++)
        arrayOfString[i] = ((String)localIterator.next());
      AppMethodBeat.o(7039);
      return arrayOfString;
    }
  }

  public final void cYP()
  {
    AppMethodBeat.i(7040);
    if (!b.dnO())
      AppMethodBeat.o(7040);
    while (true)
    {
      return;
      StringBuilder localStringBuilder = new StringBuilder("routeList: ");
      synchronized (this.upF)
      {
        Iterator localIterator = this.upF.iterator();
        if (localIterator.hasNext())
          localStringBuilder.append(URLDecoder.decode((String)localIterator.next())).append("\n");
      }
      ab.d("MicroMsg.WebViewURLRouteList", localStringBuilder.toString());
      AppMethodBeat.o(7040);
    }
  }

  public final void wy(String paramString)
  {
    AppMethodBeat.i(7037);
    try
    {
      aeV(paramString);
      AppMethodBeat.o(7037);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewURLRouteList", "add exp = %s", new Object[] { bo.l(paramString) });
        AppMethodBeat.o(7037);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.n
 * JD-Core Version:    0.6.2
 */