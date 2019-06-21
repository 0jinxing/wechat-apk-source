package com.tencent.mm.pluginsdk.g.a.c;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.a.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@SuppressLint({"UseSparseArrays"})
public final class r
{
  private static final HashMap<Integer, g> vfB;
  private static volatile List<g> vfC;

  static
  {
    AppMethodBeat.i(79626);
    Object localObject = new HashMap(2);
    vfB = (HashMap)localObject;
    ((HashMap)localObject).put(Integer.valueOf("CheckResUpdatePlugin".hashCode()), new b.a());
    try
    {
      localObject = Class.forName("com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper$ResDownloaderPlugin").newInstance();
      vfB.put(Integer.valueOf("WebViewCacheDownload".hashCode()), (g)localObject);
      vfC = null;
      AppMethodBeat.o(79626);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ResDownloaderPluginMap", localException, "", new Object[0]);
    }
  }

  public static Collection<g> diz()
  {
    AppMethodBeat.i(79625);
    Object localObject;
    if (vfC != null)
    {
      localObject = vfC;
      AppMethodBeat.o(79625);
    }
    while (true)
    {
      return localObject;
      localObject = new LinkedList();
      Iterator localIterator = vfB.keySet().iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        g localg = (g)vfB.get(Integer.valueOf(i));
        if (localg != null)
          ((LinkedList)localObject).add(localg);
      }
      vfC = (List)localObject;
      AppMethodBeat.o(79625);
    }
  }

  public static void init()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.c.r
 * JD-Core Version:    0.6.2
 */