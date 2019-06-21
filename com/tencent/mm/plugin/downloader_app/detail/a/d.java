package com.tencent.mm.plugin.downloader_app.detail.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.ah;
import com.tencent.mm.plugin.webview.luggage.jsapi.o;
import com.tencent.mm.plugin.webview.luggage.jsapi.w;
import java.util.LinkedList;

public final class d
{
  private static LinkedList<Class<? extends com.tencent.luggage.d.a>> kOz;

  private static void ao(Class<? extends com.tencent.luggage.d.a> paramClass)
  {
    AppMethodBeat.i(136073);
    kOz.add(paramClass);
    AppMethodBeat.o(136073);
  }

  public static LinkedList<Class<? extends com.tencent.luggage.d.a>> biH()
  {
    try
    {
      AppMethodBeat.i(136072);
      LinkedList localLinkedList = new java/util/LinkedList;
      localLinkedList.<init>();
      kOz = localLinkedList;
      ao(a.class);
      ao(e.class);
      ao(g.class);
      ao(ah.class);
      ao(w.class);
      ao(o.class);
      ao(c.class);
      ao(b.class);
      ao(f.class);
      localLinkedList = kOz;
      AppMethodBeat.o(136072);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.d
 * JD-Core Version:    0.6.2
 */