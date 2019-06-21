package com.tencent.mm.plugin.appbrand.appcache;

import android.webkit.URLUtil;
import android.webkit.WebResourceResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.IWxaFileSystemWithModularizing;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.appstorage.t;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.r.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class aw
{
  private static final Map<i, aw> gVb;
  private static final aw gVc;
  private final u gVd;
  private final LinkedList<o> gVe;
  private final String mAppId;

  static
  {
    AppMethodBeat.i(86830);
    gVb = new HashMap();
    gVc = new aw.1();
    AppMethodBeat.o(86830);
  }

  private aw(i parami)
  {
    AppMethodBeat.i(86825);
    this.gVe = new LinkedList();
    if (parami == null)
    {
      this.gVd = null;
      this.mAppId = null;
      AppMethodBeat.o(86825);
    }
    while (true)
    {
      return;
      this.mAppId = parami.mAppId;
      this.gVd = new u(parami.ye().hhd);
      this.gVd.avK();
      g.a(this.mAppId, new aw.2(this, parami));
      AppMethodBeat.o(86825);
    }
  }

  public static String a(i parami, String paramString)
  {
    AppMethodBeat.i(86818);
    parami = bo.nullAsNil((String)r(parami).d(paramString, String.class));
    AppMethodBeat.o(86818);
    return parami;
  }

  public static void a(i arg0, o paramo)
  {
    AppMethodBeat.i(86823);
    aw localaw = r(???);
    synchronized (localaw.gVe)
    {
      paramo.init();
      localaw.gVe.addFirst(paramo);
      AppMethodBeat.o(86823);
      return;
    }
  }

  public static boolean b(i parami, String paramString)
  {
    AppMethodBeat.i(86819);
    parami = d(parami, paramString);
    boolean bool;
    if (parami != null)
    {
      bo.b(parami);
      bool = true;
      AppMethodBeat.o(86819);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86819);
    }
  }

  public static WebResourceResponse c(i parami, String paramString)
  {
    AppMethodBeat.i(86820);
    parami = (WebResourceResponse)r(parami).d(paramString, WebResourceResponse.class);
    AppMethodBeat.o(86820);
    return parami;
  }

  public static InputStream d(i parami, String paramString)
  {
    AppMethodBeat.i(86821);
    parami = (InputStream)r(parami).d(paramString, InputStream.class);
    AppMethodBeat.o(86821);
    return parami;
  }

  public static String e(i parami, String paramString)
  {
    AppMethodBeat.i(86822);
    if (xD(paramString))
    {
      AppMethodBeat.o(86822);
      parami = null;
    }
    while (true)
    {
      return parami;
      parami = parami.asE();
      if ((parami instanceof t))
      {
        parami = ((IWxaFileSystemWithModularizing)((t)parami).ae(IWxaFileSystemWithModularizing.class)).findAppropriateModuleInfo(paramString);
        if (parami != null)
        {
          parami = w.a(parami, paramString);
          AppMethodBeat.o(86822);
        }
      }
      else
      {
        AppMethodBeat.o(86822);
        parami = null;
      }
    }
  }

  public static void p(i parami)
  {
    AppMethodBeat.i(86816);
    parami = r(parami);
    if ((parami != null) && (parami.gVd != null))
      parami.gVd.avK();
    AppMethodBeat.o(86816);
  }

  public static u q(i parami)
  {
    AppMethodBeat.i(86817);
    parami = r(parami).gVd;
    AppMethodBeat.o(86817);
    return parami;
  }

  private static aw r(i parami)
  {
    AppMethodBeat.i(86824);
    Object localObject;
    if ((parami == null) || (parami.mFinished))
    {
      localObject = gVc;
      AppMethodBeat.o(86824);
    }
    while (true)
    {
      return localObject;
      synchronized (gVb)
      {
        aw localaw = (aw)gVb.get(parami);
        localObject = localaw;
        if (localaw == null)
        {
          localObject = new com/tencent/mm/plugin/appbrand/appcache/aw;
          ((aw)localObject).<init>(parami);
          gVb.put(parami, localObject);
        }
        AppMethodBeat.o(86824);
      }
    }
  }

  private static boolean xD(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(86827);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(86827);
    while (true)
    {
      return bool;
      if (com.tencent.luggage.g.h.t(paramString, "about:blank"))
      {
        AppMethodBeat.o(86827);
      }
      else if (d.Ed(paramString))
      {
        AppMethodBeat.o(86827);
      }
      else if (URLUtil.isFileUrl(paramString))
      {
        AppMethodBeat.o(86827);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(86827);
      }
    }
  }

  private InputStream xE(String paramString)
  {
    AppMethodBeat.i(86828);
    while (true)
    {
      Object localObject;
      synchronized (this.gVe)
      {
        Iterator localIterator = this.gVe.iterator();
        if (localIterator.hasNext())
        {
          localObject = ((o)localIterator.next()).openRead(paramString);
          if (localObject == null)
            continue;
          AppMethodBeat.o(86828);
          paramString = (String)localObject;
          return paramString;
        }
        localObject = this.gVd.findAppropriateModuleInfo(paramString);
        if (localObject == null)
        {
          paramString = null;
          AppMethodBeat.o(86828);
        }
      }
      paramString = ((ao)localObject).xy(paramString);
      AppMethodBeat.o(86828);
    }
  }

  protected <T> T d(String paramString, Class<T> paramClass)
  {
    String str1 = null;
    AppMethodBeat.i(86826);
    if (xD(paramString))
    {
      AppMethodBeat.o(86826);
      paramString = str1;
      return paramString;
    }
    str1 = l.yk(paramString);
    if (str1.startsWith("/__APP__"))
      str1 = l.yk(str1.substring(8));
    while (true)
    {
      long l = System.currentTimeMillis();
      paramString = xE(str1);
      if (paramString != null);
      for (paramString = ((aw.b)aw.b.a.gVh.get(paramClass)).c(str1, paramString); ; paramString = null)
      {
        String str2 = this.mAppId;
        if (paramString == null);
        for (boolean bool = true; ; bool = false)
        {
          ab.i("MicroMsg.WxaPkgRuntimeReader", "openRead, appId = %s, reqURL = %s, null(%B), type = %s, cost = %dms", new Object[] { str2, str1, Boolean.valueOf(bool), paramClass.getName(), Long.valueOf(System.currentTimeMillis() - l) });
          AppMethodBeat.o(86826);
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.aw
 * JD-Core Version:    0.6.2
 */