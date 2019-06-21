package com.tencent.mm.plugin.webview.modelcache;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.h;
import com.tencent.mm.pluginsdk.g.a.b.d;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.List;

final class r$1$1
  implements Runnable
{
  r$1$1(r.1 param1, com.tencent.mm.plugin.webview.modelcache.downloaderimpl.f paramf)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6876);
    com.tencent.mm.plugin.webview.modelcache.downloaderimpl.f localf = this.uol;
    List localList;
    Object localObject1;
    Object localObject2;
    label157: Object localObject3;
    Object localObject5;
    label327: label361: label1403: boolean bool;
    if (localf != null)
    {
      if ((bo.isNullOrNil(localf.appId)) || (bo.isNullOrNil(localf.cSx)) || (bo.isNullOrNil(localf.filePath)))
      {
        ab.i("MicroMsg.WebViewCacheDownloadResponseLogic", "onResponse, invalid response = %s", new Object[] { localf });
        AppMethodBeat.o(6876);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.WebViewCacheDownloadResponseLogic", "onResponse, response = %s", new Object[] { localf });
        localList = r.a.cYq().uoh.u(localf.url, localf.appId, localf.cSx, localf.cSy);
        localObject1 = localf.exception;
        Object localObject4;
        if (localObject1 != null)
        {
          ab.i("MicroMsg.WebViewCacheDownloadResponseLogic", "onResponse, response.exception = %s", new Object[] { localObject1 });
          if (!bo.ek(localList))
          {
            if ((localObject1 instanceof SocketTimeoutException))
            {
              localObject1 = "timeout";
              localObject2 = localList.iterator();
            }
            while (true)
            {
              if (!((Iterator)localObject2).hasNext())
                break label361;
              localObject3 = (f.c)((Iterator)localObject2).next();
              localObject4 = h.JR(((f.c)localObject3).unN);
              i = ((f.c)localObject3).unO;
              if (localf.cSz == 3);
              for (localObject5 = "publicCache"; ; localObject5 = "cache")
              {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject4).K(i, (String)localObject5, (String)localObject1);
                if (localf.cSz != 1)
                  break label327;
                r.a.cYq().uoh.a(((f.c)localObject3).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz, localf.url);
                break label157;
                if ((localObject1 instanceof d))
                {
                  localObject1 = "not support redirect resource";
                  break;
                }
                if ((localObject1 instanceof com.tencent.mm.pluginsdk.g.a.b.g))
                {
                  localObject1 = "not support 0kb resource";
                  break;
                }
                if (((localObject1 instanceof com.tencent.mm.pluginsdk.g.a.b.a)) && (localf.aHW >= 5242880L))
                {
                  localObject1 = "exceed cache threshold";
                  break;
                }
                localObject1 = "batch download fail";
                break;
              }
              r.a.cYq().uoh.a(((f.c)localObject3).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz);
            }
          }
        }
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label390;
          n.lQ(7L);
          AppMethodBeat.o(6876);
          break;
        }
        label390: if (com.tencent.mm.a.e.cs(localf.filePath) == 0)
        {
          ab.i("MicroMsg.WebViewCacheDownloadResponseLogic", "onResponse, readFileLength = 0, return");
          if (!bo.ek(localList))
          {
            localObject2 = localList.iterator();
            if (((Iterator)localObject2).hasNext())
            {
              localObject3 = (f.c)((Iterator)localObject2).next();
              localObject5 = h.JR(((f.c)localObject3).unN);
              i = ((f.c)localObject3).unO;
              if (localf.cSz == 3);
              for (localObject1 = "publicCache"; ; localObject1 = "cache")
              {
                ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject5).K(i, (String)localObject1, "batch download fail");
                r.a.cYq().uoh.a(((f.c)localObject3).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz, localf.url);
                break;
              }
            }
          }
          i = 0;
        }
        while (true)
        {
          if (i != 0)
            break label1415;
          n.lQ(8L);
          AppMethodBeat.o(6876);
          break;
          localObject4 = q.aeM(localf.url);
          localObject2 = r.a.cYq();
          Object localObject6 = localf.appId;
          localObject3 = localf.cSx;
          i = localf.cSz;
          String str1 = localf.cSy;
          if ((bo.isNullOrNil((String)localObject6)) || (bo.isNullOrNil((String)localObject3)) || (bo.isNullOrNil((String)localObject4)))
          {
            ab.e("MicroMsg.WebViewCacheWorkerManager", "getWebViewCacheWriter, invalid params | appId = %s, domain = %s, mainURL = %s", new Object[] { localObject6, localObject3, localObject4 });
            localObject5 = null;
            i = 0;
            if (localObject5 != null)
            {
              localObject6 = localf.filePath;
              localObject4 = localf.version;
              localObject3 = localf.bqF;
              if (!bo.isNullOrNil((String)localObject6))
                break label913;
              ab.e("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, filePath is null or nil");
              i = -1;
              label684: if (i != 0)
                break label1357;
              i = 1;
            }
            label692: if (i != 0)
              break label1409;
            if (bo.ek(localList))
              break label1403;
            localObject5 = localList.iterator();
          }
          while (true)
          {
            label712: if (!((Iterator)localObject5).hasNext())
              break label1403;
            localObject3 = (f.c)((Iterator)localObject5).next();
            localObject2 = h.JR(((f.c)localObject3).unN);
            i = ((f.c)localObject3).unO;
            if (localf.cSz == 3);
            for (localObject1 = "publicCache"; ; localObject1 = "cache")
            {
              ((com.tencent.mm.plugin.webview.ui.tools.jsapi.g)localObject2).K(i, (String)localObject1, "batch save fail");
              if (localf.cSz != 1)
                break label1369;
              r.a.cYq().uoh.a(((f.c)localObject3).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz, localf.url);
              break label712;
              int j = String.format("%s_%s_%s_%s", new Object[] { localObject6, localObject3, Integer.valueOf(i), localObject4 }).hashCode();
              localObject5 = (m)((r)localObject2).uof.get(j);
              localObject1 = localObject5;
              if (localObject5 == null)
              {
                localObject1 = new m((String)localObject6, (String)localObject3, i, (String)localObject4, str1);
                ((r)localObject2).uof.put(j, localObject1);
              }
              localObject5 = localObject1;
              break;
              label913: if (!com.tencent.mm.a.e.ct((String)localObject6))
              {
                ab.e("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, file not exists");
                i = -1;
                break label684;
              }
              if (com.tencent.mm.a.e.cs((String)localObject6) <= 0)
              {
                ab.i("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, file size = 0kb");
                i = 6;
                break label684;
              }
              if (bo.isNullOrNil((String)localObject4))
              {
                ab.e("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, resVersion is null or nil, return");
                i = -1;
                break label684;
              }
              if (((m)localObject5).unT == null)
              {
                ab.e("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, appIdDir is null, return");
                i = -1;
                break label684;
              }
              localObject1 = ((m)localObject5).unT;
              localObject2 = ((m)localObject5).cHg;
              long l1;
              label1034: String str2;
              String str3;
              if ((bo.isNullOrNil((String)localObject6)) || (bo.isNullOrNil((String)localObject2)))
              {
                l1 = 0L;
                localObject6 = l.cYo();
                localObject1 = ((m)localObject5).appId;
                str2 = ((m)localObject5).cSx;
                i = ((m)localObject5).cSz;
                str1 = ((m)localObject5).unS;
                str3 = ((m)localObject5).cSy;
                if (!((l)localObject6).hrm)
                  break label1284;
                if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str2)) && (!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str3)))
                  break label1188;
                localObject1 = null;
              }
              while (true)
              {
                if (localObject1 != null)
                  break label1289;
                ab.e("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, no db record stored");
                i = -1;
                break;
                long l2 = com.tencent.mm.vfs.e.y((String)localObject6, (String)localObject2);
                l1 = l2;
                if (l2 <= 0L)
                  break label1034;
                l1 = l2;
                if (!((String)localObject2).startsWith(((a)localObject1).path))
                  break label1034;
                ((a)localObject1).unD.ay(((a)localObject1).appId, l2);
                l1 = l2;
                break label1034;
                label1188: localObject2 = new g();
                ((g)localObject2).field_appId = ((String)localObject1);
                ((g)localObject2).field_domain = str2;
                ((g)localObject2).field_cacheType = i;
                ((g)localObject2).field_urlMd5Hashcode = ag.ck(str1).hashCode();
                ((g)localObject2).field_packageId = str3;
                localObject1 = localObject2;
                if (!((l)localObject6).b((c)localObject2, new String[] { "appId", "domain", "cacheType", "urlMd5Hashcode", "packageId" }))
                  label1284: localObject1 = null;
              }
              label1289: ((g)localObject1).field_localPath = ((m)localObject5).cHg;
              ((g)localObject1).field_version = ((String)localObject4);
              ((g)localObject1).field_contentType = ((String)localObject3);
              ((g)localObject1).field_contentMd5 = q.aeP(((g)localObject1).field_localPath);
              ((g)localObject1).field_contentLength = l1;
              l.cYo().b((g)localObject1);
              ab.i("MicroMsg.WebViewCacheResWriter", "writeRes with filePath, updated record = %s", new Object[] { localObject1 });
              i = 0;
              break label684;
              label1357: i = 0;
              break label692;
            }
            label1369: r.a.cYq().uoh.a(((f.c)localObject3).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz);
          }
          i = 0;
          continue;
          label1409: i = 1;
        }
        label1415: if (localf.cSz != 1)
          break;
        if (bo.ek(localList))
          break label1857;
        localObject5 = localList.iterator();
        while (((Iterator)localObject5).hasNext())
        {
          localObject1 = (f.c)((Iterator)localObject5).next();
          h.JR(((f.c)localObject1).unN).K(((f.c)localObject1).unO, "cache", "ok");
          r.a.cYq().uoh.a(((f.c)localObject1).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz, localf.url);
        }
        AppMethodBeat.o(6876);
      }
      localObject2 = l.cYo();
      localObject5 = localf.appId;
      localObject3 = localf.cSx;
      localObject1 = localf.cSy;
      if (!((l)localObject2).hrm)
      {
        localObject1 = null;
        if (bo.ek((List)localObject1))
          break label1857;
        localObject5 = ((List)localObject1).iterator();
        if (!((Iterator)localObject5).hasNext())
          break label1866;
        localObject1 = (g)((Iterator)localObject5).next();
        if (localObject1 != null)
          break label1790;
        bool = false;
        label1599: if (bool)
          break label1849;
      }
    }
    label1849: label1857: label1866: for (int i = 0; ; i = 1)
    {
      if ((i != 0) && (!bo.ek(localList)))
      {
        localObject1 = localList.iterator();
        while (true)
          if (((Iterator)localObject1).hasNext())
          {
            localObject5 = (f.c)((Iterator)localObject1).next();
            h.JR(((f.c)localObject5).unN).K(((f.c)localObject5).unO, "cache", "ok");
            r.a.cYq().uoh.a(((f.c)localObject5).unN, localf.appId, localf.cSx, localf.cSy, localf.cSz);
            continue;
            if ((bo.isNullOrNil((String)localObject5)) || (bo.isNullOrNil((String)localObject3)) || (bo.isNullOrNil((String)localObject1)))
            {
              localObject1 = null;
              break;
            }
            localObject1 = ((l)localObject2).o(String.format("select * from %s where %s=? and %s=? and %s=?", new Object[] { "WebViewResourceCache", "appId", "domain", "packageId" }), new String[] { localObject5, localObject3, localObject1 });
            break;
            label1790: if ((!bo.isNullOrNil(((g)localObject1).field_contentMd5)) && (bo.nullAsNil(q.aeP(((g)localObject1).field_localPath)).equals(((g)localObject1).field_contentMd5)));
            for (bool = true; ; bool = false)
            {
              ab.d("MicroMsg.WebViewCacheUtils", "isCacheResValid, cacheRes = %s, ret = %b", new Object[] { localObject1, Boolean.valueOf(bool) });
              break label1599;
              break;
            }
          }
      }
      AppMethodBeat.o(6876);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r.1.1
 * JD-Core Version:    0.6.2
 */