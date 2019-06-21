package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.a.d;
import com.tencent.mm.plugin.appbrand.appcache.a.a.a;
import com.tencent.mm.plugin.appbrand.appcache.a.b.a.a;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class az
{
  private static volatile az gVp = null;
  private final Map<String, Map<az.a, Boolean>> gVq;
  public final ap gVr;

  public az()
  {
    AppMethodBeat.i(59528);
    this.gVq = new android.support.v4.f.a();
    this.gVr = new ap();
    AppMethodBeat.o(59528);
  }

  static void a(String paramString, WxaPkgLoadProgress paramWxaPkgLoadProgress)
  {
    AppMethodBeat.i(59536);
    ab.i("MicroMsg.AppBrandWxaPkgUpdater", "hy: urlkey: %s, onProgressUpdate %s", new Object[] { paramString, paramWxaPkgLoadProgress });
    Object localObject = xK(paramString);
    if (localObject != null)
    {
      paramString = ((Map)localObject).keySet().iterator();
      while (paramString.hasNext())
      {
        localObject = (az.a)paramString.next();
        if (localObject != null)
          ((az.a)localObject).bl(paramWxaPkgLoadProgress);
      }
      AppMethodBeat.o(59536);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandWxaPkgUpdater", "callback progress, null callback urlKey = %s", new Object[] { paramString });
      AppMethodBeat.o(59536);
    }
  }

  static void a(String paramString, az.a parama)
  {
    AppMethodBeat.i(59532);
    Object localObject;
    if ((!bo.isNullOrNil(paramString)) && (parama != null))
    {
      localObject = awq();
      if (localObject != null);
    }
    else
    {
      AppMethodBeat.o(59532);
    }
    while (true)
    {
      return;
      try
      {
        Map localMap = (Map)((az)localObject).gVq.get(paramString);
        localObject = localMap;
        if (localMap == null)
        {
          localObject = new java/util/HashMap;
          ((HashMap)localObject).<init>();
          awq().gVq.put(paramString, localObject);
        }
        ((Map)localObject).put(parama, Boolean.TRUE);
        AppMethodBeat.o(59532);
      }
      finally
      {
        AppMethodBeat.o(59532);
      }
    }
    throw paramString;
  }

  static void a(String paramString1, String paramString2, b.a.a parama)
  {
    AppMethodBeat.i(59543);
    if (awq() == null)
    {
      ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadFail, get instance null !!!");
      AppMethodBeat.o(59543);
    }
    while (true)
    {
      return;
      a(paramString1, paramString2, parama, null);
      AppMethodBeat.o(59543);
    }
  }

  static void a(String paramString1, String paramString2, b.a.a parama, az.b paramb)
  {
    AppMethodBeat.i(59542);
    paramString1 = xJ(paramString1);
    if (paramString1 != null)
    {
      paramString1 = paramString1.keySet().iterator();
      while (paramString1.hasNext())
      {
        az.a locala = (az.a)paramString1.next();
        if (locala != null)
          locala.a(paramString2, parama, paramb);
      }
      AppMethodBeat.o(59542);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandWxaPkgUpdater", "callback, null callback appId = %s", new Object[] { paramString2 });
      AppMethodBeat.o(59542);
    }
  }

  static void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, z.a parama)
  {
    AppMethodBeat.i(59544);
    boolean bool = j.a.kR(paramInt2);
    if (awq() == null)
    {
      ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, get instance null !!!");
      AppMethodBeat.o(59544);
    }
    while (true)
    {
      return;
      if (bo.isNullOrNil(paramString3))
      {
        ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, filePath is null or nil");
        a(paramString1, paramString2, b.a.a.gVC, null);
        parama.avt();
        AppMethodBeat.o(59544);
      }
      else if (!new File(paramString3).exists())
      {
        ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg file not exists");
        a(paramString1, paramString2, b.a.a.gVC, null);
        parama.avt();
        AppMethodBeat.o(59544);
      }
      else if (((d)com.tencent.mm.kernel.g.K(d.class)).xF() == null)
      {
        ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, WxaPkgStorage is null");
        br(paramString1, paramString2);
        AppMethodBeat.o(59544);
      }
      else
      {
        if (!bool);
        Object localObject;
        for (int i = paramInt1; ; i = 1)
        {
          localObject = ((d)com.tencent.mm.kernel.g.K(d.class)).xF().a(paramString2, i, paramInt2, new String[0]);
          if (localObject != null)
            break label243;
          ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, no manifest record!!! with given appId(%s) version(%d) debugType(%d)", new Object[] { paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          a(paramString1, paramString2, b.a.a.gVB, null);
          AppMethodBeat.o(59544);
          break;
        }
        label243: parama.avu();
        if (!bo.isNullOrNil(paramString2))
          if (paramString2.endsWith("__CODELIB__"))
            bool = true;
        while (true)
        {
          parama.dz(bool);
          if (bool)
            break label468;
          e.deleteFile(paramString3);
          a(paramString1, paramString2, b.a.a.gVE, null);
          AppMethodBeat.o(59544);
          break;
          File localFile = new File(paramString3);
          localObject = ((at)localObject).field_versionMd5;
          if (!bool)
          {
            String str = com.tencent.mm.a.g.v(localFile);
            if (!bo.nullAsNil((String)localObject).equals(str))
            {
              ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, record.md5(%s) != file.md5(%s)", new Object[] { localObject, str });
              bool = false;
            }
          }
          else
          {
            localObject = new ao(localFile);
            if (!((ao)localObject).gUe)
            {
              ((ao)localObject).close();
              ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg invalid");
              localFile.delete();
              bool = false;
            }
            else if (!((ao)localObject).avW())
            {
              ((ao)localObject).close();
              ab.e("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, pkg readInfo failed");
              localFile.delete();
              bool = false;
            }
            else
            {
              ((ao)localObject).close();
              bool = true;
              continue;
              bool = false;
            }
          }
        }
        label468: ab.i("MicroMsg.AppBrandWxaPkgUpdater", "onDownloadComplete, update ret = %b, appId = %s, debugType = %d, pkgVersion = %d, String filePath = %s", new Object[] { Boolean.valueOf(((d)com.tencent.mm.kernel.g.K(d.class)).xF().d(paramString2, paramInt2, i, paramString3)), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(i), paramString3 });
        a(paramString1, paramString2, b.a.a.gVA, new az.b(paramString2, paramString3, paramInt1, paramInt2));
        AppMethodBeat.o(59544);
      }
    }
  }

  static boolean a(com.tencent.mm.plugin.appbrand.appcache.a.a parama, az.a parama1)
  {
    boolean bool = false;
    AppMethodBeat.i(59537);
    if (awq() == null)
    {
      ab.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      AppMethodBeat.o(59537);
    }
    while (true)
    {
      return bool;
      if (parama == null)
      {
        AppMethodBeat.o(59537);
      }
      else
      {
        a(parama.vdC, parama1);
        int i = awq().gVr.b(parama);
        if ((i != 0) && (i != 2))
        {
          a(parama.vdC, parama.appId, b.a.a.gVH, null);
          AppMethodBeat.o(59537);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(59537);
        }
      }
    }
  }

  public static boolean a(String paramString1, int paramInt1, int paramInt2, int paramInt3, String paramString2, az.a parama)
  {
    Object localObject1 = null;
    boolean bool1 = false;
    AppMethodBeat.i(59538);
    boolean bool2;
    if (awq() == null)
    {
      ab.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, get null updater instance!!!");
      AppMethodBeat.o(59538);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      Object localObject2;
      if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
        localObject2 = null;
      while (true)
      {
        if (localObject2 != null)
          break label292;
        localObject2 = localObject1;
        if (localObject2 != null)
          break label362;
        ab.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadPkg, create Null request, appId %s, pkgType %d, pkgVersion %d, url %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
        AppMethodBeat.o(59538);
        bool2 = bool1;
        break;
        switch (paramInt1)
        {
        default:
          localObject2 = null;
          break;
        case 10000:
        case 10001:
        case 10002:
        case 10100:
        case 10101:
        case 10102:
          localObject2 = new bb(paramString2, paramString1, paramInt2, paramInt1);
          break;
        case 0:
        case 12:
        case 13:
        case 14:
          localObject2 = new aq(paramString1, paramInt1, paramInt2, paramString2);
          break;
        case 1:
        case 2:
        case 999:
          localObject2 = new ak(paramString1, paramString2, paramInt1);
        }
      }
      label292: if ("@LibraryAppId".equals(paramString1))
        bool2 = false;
      while (true)
      {
        ((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2).gVz = bool2;
        if (paramInt3 > 2097152)
        {
          ((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2).setReadTimeout(((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2).getReadTimeout() * 2);
          ((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2).setConnectTimeout(((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2).getConnectTimeout() * 2);
        }
        break;
        if (paramInt1 != 0)
          bool2 = false;
        else
          bool2 = true;
      }
      label362: bool2 = a((com.tencent.mm.plugin.appbrand.appcache.a.a)localObject2, parama);
      AppMethodBeat.o(59538);
    }
  }

  public static boolean a(String paramString, int paramInt, az.a parama)
  {
    AppMethodBeat.i(59531);
    boolean bool = b("@LibraryAppId", 0, paramInt, paramString, parama);
    AppMethodBeat.o(59531);
    return bool;
  }

  public static boolean a(String paramString1, int paramInt, String paramString2, az.a parama)
  {
    AppMethodBeat.i(59540);
    boolean bool = b(paramString1, paramInt, 1, paramString2, parama);
    AppMethodBeat.o(59540);
    return bool;
  }

  public static boolean a(String paramString1, int paramInt, String paramString2, az.a parama, a.a parama1)
  {
    AppMethodBeat.i(59541);
    boolean bool;
    if (awq() == null)
    {
      ab.e("MicroMsg.AppBrandWxaPkgUpdater", "startDownloadDebugPkg with keyGen, get null updater instance!!!");
      bool = false;
      AppMethodBeat.o(59541);
    }
    while (true)
    {
      return bool;
      bool = a(new ak(paramString1, paramString2, paramInt, parama1), parama);
      AppMethodBeat.o(59541);
    }
  }

  public static az awq()
  {
    AppMethodBeat.i(59529);
    az localaz;
    if (((d)com.tencent.mm.kernel.g.K(d.class)).xF() == null)
    {
      gVp = null;
      AppMethodBeat.o(59529);
      localaz = null;
    }
    while (true)
    {
      return localaz;
      if (gVp == null);
      try
      {
        if (gVp == null)
        {
          localaz = new com/tencent/mm/plugin/appbrand/appcache/az;
          localaz.<init>();
          gVp = localaz;
        }
        localaz = gVp;
        AppMethodBeat.o(59529);
      }
      finally
      {
        AppMethodBeat.o(59529);
      }
    }
  }

  public static boolean b(String paramString1, int paramInt1, int paramInt2, String paramString2, az.a parama)
  {
    AppMethodBeat.i(59539);
    boolean bool = a(paramString1, paramInt1, paramInt2, 0, paramString2, parama);
    AppMethodBeat.o(59539);
    return bool;
  }

  static void br(String paramString1, String paramString2)
  {
    AppMethodBeat.i(59535);
    a(paramString1, paramString2, b.a.a.gVH, null);
    AppMethodBeat.o(59535);
  }

  public static void shutdown()
  {
    AppMethodBeat.i(59530);
    try
    {
      az localaz = gVp;
      gVp = null;
      if (localaz != null)
        localaz.gVr.gUn.shutdown();
      AppMethodBeat.o(59530);
      return;
    }
    finally
    {
      AppMethodBeat.o(59530);
    }
  }

  static Map<az.a, Boolean> xJ(String paramString)
  {
    AppMethodBeat.i(59533);
    az localaz;
    if (!bo.isNullOrNil(paramString))
    {
      localaz = awq();
      if (localaz != null);
    }
    else
    {
      paramString = null;
      AppMethodBeat.o(59533);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = (Map)localaz.gVq.remove(paramString);
        AppMethodBeat.o(59533);
      }
      finally
      {
        AppMethodBeat.o(59533);
      }
    }
    throw paramString;
  }

  private static Map<az.a, Boolean> xK(String paramString)
  {
    AppMethodBeat.i(59534);
    Object localObject;
    if (!bo.isNullOrNil(paramString))
    {
      localObject = awq();
      if (localObject != null);
    }
    else
    {
      paramString = null;
      AppMethodBeat.o(59534);
    }
    while (true)
    {
      return paramString;
      try
      {
        localObject = (Map)((az)localObject).gVq.get(paramString);
        paramString = (String)localObject;
        if (localObject != null)
          paramString = new HashMap((Map)localObject);
        AppMethodBeat.o(59534);
      }
      finally
      {
        AppMethodBeat.o(59534);
      }
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.az
 * JD-Core Version:    0.6.2
 */