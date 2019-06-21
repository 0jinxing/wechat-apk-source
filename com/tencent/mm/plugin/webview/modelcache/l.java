package com.tencent.mm.plugin.webview.modelcache;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

public final class l extends j<g>
{
  private static volatile l unR = null;
  private final com.tencent.mm.sdk.e.e bSd;
  public final boolean hrm;

  private l(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, g.ccO, "WebViewResourceCache", null);
    AppMethodBeat.i(6846);
    this.bSd = parame;
    if (parame != null);
    for (boolean bool = true; ; bool = false)
    {
      this.hrm = bool;
      if (!this.hrm)
        ab.e("MicroMsg.WebViewCacheResStorage", "storage can not work!!!");
      AppMethodBeat.o(6846);
      return;
    }
  }

  static String IN(int paramInt)
  {
    AppMethodBeat.i(6847);
    String str = "1=1";
    if ((!b.a.IK(paramInt)) || (!b.a.IJ(paramInt)))
      str = String.format(" %s=%s ", new Object[] { "protocol", Integer.valueOf(paramInt) });
    AppMethodBeat.o(6847);
    return str;
  }

  private boolean a(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(6850);
    if (!this.hrm)
      AppMethodBeat.o(6850);
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramg.field_url))
      {
        ab.d("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, url is null or nil");
        AppMethodBeat.o(6850);
      }
      else
      {
        String str = ag.ck(paramg.field_url);
        if (bo.isNullOrNil(str))
        {
          ab.e("MicroMsg.WebViewCacheResStorage", "insertWebViewCacheRes, get md5 is null or nil , url = %s", new Object[] { paramg.field_url });
          AppMethodBeat.o(6850);
        }
        else
        {
          paramg.field_urlMd5Hashcode = str.hashCode();
          long l = bo.anT();
          paramg.field_accessTime = l;
          paramg.field_createTime = l;
          bool = a(paramg, false);
          AppMethodBeat.o(6850);
        }
      }
    }
  }

  public static List<e.a> cYn()
  {
    AppMethodBeat.i(6844);
    LinkedList localLinkedList = new LinkedList();
    String str = j.a(g.ccO, "WebViewResourceCache");
    localLinkedList.add(new e.a("WEBVIEW_RESOURCE_CACHE_TABLE".hashCode(), new String[] { str }));
    AppMethodBeat.o(6844);
    return localLinkedList;
  }

  public static l cYo()
  {
    AppMethodBeat.i(6845);
    l locall;
    if (!com.tencent.mm.kernel.g.RK())
    {
      locall = new l(null);
      AppMethodBeat.o(6845);
    }
    while (true)
    {
      return locall;
      if (unR == null);
      try
      {
        if ((unR == null) || (!unR.hrm))
        {
          locall = new com/tencent/mm/plugin/webview/modelcache/l;
          locall.<init>(com.tencent.mm.kernel.g.RP().eJN);
          unR = locall;
        }
        locall = unR;
        AppMethodBeat.o(6845);
      }
      finally
      {
        AppMethodBeat.o(6845);
      }
    }
  }

  public final boolean b(g paramg)
  {
    boolean bool = false;
    AppMethodBeat.i(6853);
    if (!this.hrm)
      AppMethodBeat.o(6853);
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramg.field_url))
      {
        ab.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, url is null or nil");
        AppMethodBeat.o(6853);
      }
      else
      {
        long l = bo.anT();
        paramg.field_accessTime = l;
        paramg.field_createTime = l;
        ab.d("MicroMsg.WebViewCacheResStorage", "updateWebViewCacheRes, record = ".concat(String.valueOf(paramg)));
        bool = b(paramg, false, new String[] { "urlMd5Hashcode", "appId", "domain", "cacheType", "packageId" });
        AppMethodBeat.o(6853);
      }
    }
  }

  public final boolean checkIsCached(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(6849);
    if (!this.hrm)
      AppMethodBeat.o(6849);
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(6849);
      }
      else
      {
        paramString = rawQuery(String.format("select * from %s where %s=? and %s", new Object[] { "WebViewResourceCache", "urlMd5Hashcode", IN(paramInt) }), new String[] { String.valueOf(ag.ck(paramString).hashCode()) });
        if (paramString == null)
        {
          AppMethodBeat.o(6849);
        }
        else if (paramString.getCount() > 0)
        {
          paramString.close();
          AppMethodBeat.o(6849);
          bool = true;
        }
        else
        {
          paramString.close();
          AppMethodBeat.o(6849);
        }
      }
    }
  }

  public final boolean insert(g paramg, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(6851);
    boolean bool = a(paramg);
    AppMethodBeat.o(6851);
    return bool;
  }

  public final List<g> o(String paramString, String[] paramArrayOfString)
  {
    g localg = null;
    AppMethodBeat.i(6848);
    paramArrayOfString = rawQuery(paramString, paramArrayOfString);
    if (paramArrayOfString == null)
    {
      AppMethodBeat.o(6848);
      paramString = localg;
    }
    while (true)
    {
      return paramString;
      if (paramArrayOfString.moveToFirst())
      {
        paramString = new LinkedList();
        do
        {
          localg = new g();
          localg.d(paramArrayOfString);
          paramString.add(localg);
        }
        while (paramArrayOfString.moveToNext());
        paramArrayOfString.close();
        AppMethodBeat.o(6848);
      }
      else
      {
        paramArrayOfString.close();
        AppMethodBeat.o(6848);
        paramString = localg;
      }
    }
  }

  public final boolean update(g paramg, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(6852);
    boolean bool = b(paramg);
    AppMethodBeat.o(6852);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.l
 * JD-Core Version:    0.6.2
 */