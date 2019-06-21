package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.fk;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  private static final SparseArray<a> unE;
  private static volatile a.b unF;
  private static final byte[] unG;
  public final String appId;
  public final String path;
  public final a.b unD;

  static
  {
    AppMethodBeat.i(6824);
    unE = new SparseArray();
    unF = null;
    unG = new byte[0];
    AppMethodBeat.o(6824);
  }

  private a(String paramString)
  {
    AppMethodBeat.i(6823);
    this.appId = paramString;
    com.tencent.mm.vfs.e.tf(com.tencent.mm.compatible.util.e.evd + "sfs");
    this.path = (com.tencent.mm.compatible.util.e.evd + String.valueOf(paramString.hashCode()));
    com.tencent.mm.vfs.e.tf(this.path);
    this.unD = cYi();
    AppMethodBeat.o(6823);
  }

  public static a aeH(String paramString)
  {
    AppMethodBeat.i(6820);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(6820);
      return paramString;
    }
    int i = paramString.hashCode();
    a locala = (a)unE.get(i);
    if (locala == null)
    {
      paramString = new a(paramString);
      unE.put(i, paramString);
    }
    while (true)
    {
      AppMethodBeat.o(6820);
      break;
      com.tencent.mm.vfs.e.tf(locala.path);
      paramString = locala;
    }
  }

  public static e.a cYh()
  {
    AppMethodBeat.i(6819);
    e.a locala = new e.a("WEBVIEW_RESOURCE_CACHE_APPID_OCCUPATION_TABLE".hashCode(), new String[] { j.a(fk.Hm(), "WebViewCacheAppIdOccupation") });
    AppMethodBeat.o(6819);
    return locala;
  }

  private static a.b cYi()
  {
    AppMethodBeat.i(6822);
    a.b localb;
    if (!g.RK())
    {
      localb = new a.b(null);
      AppMethodBeat.o(6822);
    }
    while (true)
    {
      return localb;
      synchronized (unG)
      {
        if ((unF == null) || (!unF.hrm))
        {
          localb = new com/tencent/mm/plugin/webview/modelcache/a$b;
          g.RQ();
          localb.<init>(g.RP().eJN);
          unF = localb;
        }
        localb = unF;
        AppMethodBeat.o(6822);
      }
    }
  }

  static void clearCache()
  {
    AppMethodBeat.i(6821);
    unE.clear();
    AppMethodBeat.o(6821);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.a
 * JD-Core Version:    0.6.2
 */