package com.tencent.mm.plugin.webview.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Map;

public final class b
{
  private static final b ugs;
  private b.a ugt;

  static
  {
    AppMethodBeat.i(5772);
    ugs = new b();
    AppMethodBeat.o(5772);
  }

  public static boolean a(c paramc)
  {
    AppMethodBeat.i(5770);
    boolean bool;
    if ("1".equals(paramc.dru().get("canPreloadWidget")))
    {
      bool = true;
      AppMethodBeat.o(5770);
    }
    while (true)
    {
      return bool;
      ab.i("WidgetPkgPreDownloadMgr", "abtest close preDownload");
      bool = false;
      AppMethodBeat.o(5770);
    }
  }

  public static b cWr()
  {
    return ugs;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.a.a.b
 * JD-Core Version:    0.6.2
 */