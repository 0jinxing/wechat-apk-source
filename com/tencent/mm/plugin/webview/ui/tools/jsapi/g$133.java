package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modelcache.a;
import com.tencent.mm.plugin.webview.modelcache.a.a;
import com.tencent.mm.plugin.webview.modelcache.a.b;
import com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper;
import com.tencent.mm.plugin.webview.modelcache.l;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

final class g$133
  implements Runnable
{
  g$133(g paramg, String paramString)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(9210);
    r.a.cYq();
    String str1 = this.uIB;
    Object localObject2;
    if (!bo.isNullOrNil(str1))
    {
      localObject2 = l.cYo();
      if (!((l)localObject2).hrm)
      {
        if (bo.ek((List)localObject1))
          break label272;
        localObject1 = ((List)localObject1).iterator();
      }
    }
    label49: label317: 
    while (true)
    {
      Object localObject3;
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.webview.modelcache.g)((Iterator)localObject1).next();
        localObject3 = a.aeH(((com.tencent.mm.plugin.webview.modelcache.g)localObject2).field_appId);
        if (localObject3 != null)
        {
          localObject2 = ((com.tencent.mm.plugin.webview.modelcache.g)localObject2).field_localPath;
          if (!bo.isNullOrNil((String)localObject2))
            if (!((String)localObject2).startsWith(((a)localObject3).path));
        }
      }
      else
      {
        for (long l = e.asZ((String)localObject2); ; l = 0L)
        {
          if ((!e.deleteFile((String)localObject2)) || (!((String)localObject2).startsWith(((a)localObject3).path)))
            break label317;
          localObject2 = ((a)localObject3).unD;
          String str2 = ((a)localObject3).appId;
          if (!((a.b)localObject2).hrm)
            break label49;
          localObject3 = new a.a((byte)0);
          ((a.a)localObject3).field_appId = str2;
          if (!((a.b)localObject2).b((c)localObject3, new String[0]))
            break label49;
          ((a.a)localObject3).field_occupation = Math.max(0L, ((a.a)localObject3).field_occupation - l);
          ((a.b)localObject2).c((c)localObject3, new String[0]);
          break label49;
          if (bo.isNullOrNil(str1))
            break;
          localObject1 = ((l)localObject2).o(String.format("select * from %s where %s=? ", new Object[] { "WebViewResourceCache", "domain" }), new String[] { str1 });
          break;
          localObject1 = l.cYo();
          if ((!((l)localObject1).hrm) || (bo.isNullOrNil(str1)));
          while (true)
          {
            WebViewCacheDownloadHelper.cYs();
            AppMethodBeat.o(9210);
            return;
            localObject2 = new com.tencent.mm.plugin.webview.modelcache.g();
            ((com.tencent.mm.plugin.webview.modelcache.g)localObject2).field_domain = str1;
            ((l)localObject1).a((c)localObject2, new String[] { "domain" });
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.133
 * JD-Core Version:    0.6.2
 */