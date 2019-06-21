package com.tencent.mm.plugin.webview.modelcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.Iterator;
import java.util.List;

public final class r$5
  implements Runnable
{
  public r$5(r paramr, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6884);
    Iterator localIterator = this.uoq.iterator();
    Object localObject1;
    int i;
    label70: String str;
    Object localObject2;
    label167: label240: Object localObject3;
    Object localObject4;
    while (localIterator.hasNext())
    {
      localObject1 = (String)localIterator.next();
      ab.i("MicroMsg.WebViewCacheWorkerManager", "triggerMainDocumentURLUpdate requestURL = %s", new Object[] { localObject1 });
      if (!bo.isNullOrNil((String)localObject1))
      {
        if (((String)localObject1).startsWith("http://"))
        {
          i = b.a.cYk();
          str = q.aeM((String)localObject1);
          localObject2 = l.cYo();
          if (((l)localObject2).hrm)
            break label167;
          localObject2 = null;
        }
        while (true)
        {
          if (!bo.ek((List)localObject2))
            break label240;
          ab.i("MicroMsg.WebViewCacheWorkerManager", "triggerMainDocumentURLUpdate, not cached requestURL = %s, parsed mainURL = %s, protocol = %s", new Object[] { localObject1, str, b.a.toString(i) });
          break;
          if (((String)localObject1).startsWith("https://"))
          {
            i = b.a.IL(b.a.cYk());
            break label70;
          }
          ab.i("MicroMsg.WebViewCacheWorkerManager", "triggerMainDocumentURLUpdate, unsupported scheme, url = %s", new Object[] { localObject1 });
          break;
          if (bo.isNullOrNil(str))
            localObject2 = null;
          else
            localObject2 = ((l)localObject2).o(String.format("select * from %s where %s=? and %s=?", new Object[] { "WebViewResourceCache", "urlMd5Hashcode", "protocol" }), new String[] { String.valueOf(ag.ck(str).hashCode()), String.valueOf(i) });
        }
        localObject3 = q.aeM((String)localObject1);
        if (!bo.isNullOrNil((String)localObject3))
        {
          long l = bo.anT();
          localObject4 = ((List)localObject2).iterator();
          do
          {
            if (!((Iterator)localObject4).hasNext())
              break;
            localObject2 = (g)((Iterator)localObject4).next();
          }
          while ((l - ((g)localObject2).field_createTime <= 60L) || (!((String)localObject3).equals(((g)localObject2).field_version)));
        }
      }
    }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        ab.i("MicroMsg.WebViewCacheWorkerManager", "triggerMainDocumentURLUpdate, createTime not exceed 1min, no need to update this mainDocument, url = %s", new Object[] { localObject1 });
        break;
      }
      localObject3 = q.aeO((String)localObject1);
      if (bo.cb((byte[])localObject3))
      {
        ab.i("MicroMsg.WebViewCacheWorkerManager", "triggerMainDocumentURLUpdate, get empty bytes from requestURL = %s", new Object[] { localObject1 });
        break;
      }
      localObject2 = l.cYo();
      if (!((l)localObject2).hrm)
        localObject2 = null;
      while (true)
      {
        if (!bo.ek((List)localObject2))
          break label478;
        ab.e("MicroMsg.WebViewCacheWorkerManager", "batchUpdateContent with bytes, get empty list ");
        break;
        if (bo.isNullOrNil(str))
          localObject2 = null;
        else
          localObject2 = ((l)localObject2).o(String.format("select * from %s where %s=? and %s", new Object[] { "WebViewResourceCache", "urlMd5Hashcode", l.IN(i) }), new String[] { String.valueOf(ag.ck(str).hashCode()) });
      }
      label478: str = ag.w((byte[])localObject3);
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (g)((Iterator)localObject1).next();
        ab.d("MicroMsg.WebViewCacheWorkerManager", "batchUpdateContent with bytes, cacheRes = %s", new Object[] { localObject2 });
        if (!bo.isNullOrNil(((g)localObject2).field_localPath))
          if (!str.equals(((g)localObject2).field_contentMd5))
          {
            a locala = a.aeH(((g)localObject2).field_appId);
            if (locala != null)
            {
              localObject4 = ((g)localObject2).field_localPath;
              if ((bo.isNullOrNil((String)localObject4)) || (bo.cb((byte[])localObject3)));
              label681: 
              while (true)
              {
                ((g)localObject2).field_contentMd5 = str;
                l.cYo().b((g)localObject2);
                ab.i("MicroMsg.WebViewCacheWorkerManager", "batchUpdateContent with bytes, updated cacheRes = %s", new Object[] { localObject2 });
                break;
                if (e.b((String)localObject4, (byte[])localObject3, localObject3.length) == 0);
                for (i = 1; ; i = 0)
                {
                  if ((i == 0) || (!((String)localObject4).startsWith(locala.path)))
                    break label681;
                  locala.unD.ay(locala.appId, localObject3.length);
                  break;
                }
              }
            }
          }
          else
          {
            ab.i("MicroMsg.WebViewCacheWorkerManager", "batchUpdateContent with bytes, cache not updated");
          }
      }
      break;
      AppMethodBeat.o(6884);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.r.5
 * JD-Core Version:    0.6.2
 */