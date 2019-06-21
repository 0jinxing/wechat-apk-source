package com.tencent.mm.plugin.appbrand.s;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.page.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class b
{
  private static final String fqf;
  private static ConcurrentMap<String, Boolean> iRc;
  private static Map<String, List<b.a>> iRd;

  static
  {
    AppMethodBeat.i(87406);
    iRc = new ConcurrentHashMap();
    iRd = new HashMap();
    String str1 = e.eSn;
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    str2 = str2 + "wxacache/";
    fqf = str2;
    j.aih(str2);
    AppMethodBeat.o(87406);
  }

  private static String Eg(String paramString)
  {
    AppMethodBeat.i(87401);
    paramString = pE(paramString);
    paramString = String.format("%s%s", new Object[] { fqf, paramString });
    AppMethodBeat.o(87401);
    return paramString;
  }

  public static void a(final c paramc, String paramString1, final String paramString2, b.a parama)
  {
    int i = 1;
    AppMethodBeat.i(87397);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(87397);
    while (true)
    {
      return;
      if (parama == null)
      {
        AppMethodBeat.o(87397);
      }
      else
      {
        if (paramString1.startsWith("wxfile://"))
        {
          ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, url:%s", new Object[] { paramString1 });
          if (paramc == null)
          {
            ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, component is null");
            label68: i = 0;
          }
          while (true)
          {
            if (i != 0)
              break label257;
            b(parama);
            AppMethodBeat.o(87397);
            break;
            paramc = paramc.asE().yg(paramString1);
            if ((paramc == null) || (!paramc.exists()))
              break label68;
            paramc = paramc.getAbsolutePath();
            ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleWxfile, localPath:%s", new Object[] { paramc });
            if ((!cS(paramString2, paramc)) || (parama == null))
              break label68;
            parama.AN(paramc);
          }
        }
        if ((paramString1.startsWith("http://")) || (paramString1.startsWith("https://")))
        {
          ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleNetworkFile, url:%s", new Object[] { paramString1 });
          paramc = Eg(paramString1);
          ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handleNetworkFile, localPath:%s", new Object[] { paramc });
          al.d(new b.1(paramString1, parama));
          com.tencent.mm.sdk.g.d.post(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(87395);
              b.F(this.val$url, paramString2, paramc);
              AppMethodBeat.o(87395);
            }
          }
          , "AppBrandLiveFileLoadHelperThread");
          AppMethodBeat.o(87397);
        }
        else
        {
          if (!b(paramc, paramString1, paramString2, parama))
            b(parama);
          label257: AppMethodBeat.o(87397);
        }
      }
    }
  }

  private static void b(b.a parama)
  {
    AppMethodBeat.i(87398);
    if (parama != null)
      parama.AN(null);
    AppMethodBeat.o(87398);
  }

  private static boolean b(c paramc, String paramString1, String paramString2, b.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(87399);
    ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, url:%s", new Object[] { paramString1 });
    if (paramc == null)
    {
      ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, component is null");
      AppMethodBeat.o(87399);
    }
    while (true)
    {
      return bool;
      if (!(paramc instanceof h))
      {
        ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, can not get runtime from component");
        AppMethodBeat.o(87399);
      }
      else
      {
        i locali = ((h)paramc).getRuntime();
        if (locali == null)
        {
          ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, runtime is null");
          AppMethodBeat.o(87399);
        }
        else
        {
          paramc = Eg(paramString1);
          ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, localPath:%s", new Object[] { paramc });
          File localFile = new File(paramc);
          if (!localFile.exists())
          {
            paramString1 = s.j(locali, paramString1);
            if ((paramString1 == null) || (paramString1.isRecycled()));
          }
          else
          {
            try
            {
              com.tencent.mm.sdk.platformtools.d.a(paramString1, 100, Bitmap.CompressFormat.PNG, paramc, true);
              if ((paramString1 != null) && (!paramString1.isRecycled()))
              {
                ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", new Object[] { paramString1 });
                paramString1.recycle();
              }
              if (!cS(paramString2, paramc))
                break label347;
              if (parama == null)
                break label370;
              parama.AN(paramc);
              AppMethodBeat.o(87399);
              bool = true;
              continue;
            }
            catch (IOException paramc)
            {
              ab.e("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, fail to compress bitmap to file", new Object[] { paramc });
              if ((paramString1 != null) && (!paramString1.isRecycled()))
              {
                ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", new Object[] { paramString1 });
                paramString1.recycle();
              }
              AppMethodBeat.o(87399);
              continue;
            }
            finally
            {
              if ((paramString1 != null) && (!paramString1.isRecycled()))
              {
                ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "bitmap recycle %s", new Object[] { paramString1 });
                paramString1.recycle();
              }
              AppMethodBeat.o(87399);
            }
          }
          ab.e("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, no bitmap in the given url");
          AppMethodBeat.o(87399);
          continue;
          label347: ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "handlePackageImage, file exists but md5 not valid, deleted:%b", new Object[] { Boolean.valueOf(localFile.delete()) });
          label370: AppMethodBeat.o(87399);
        }
      }
    }
  }

  private static void cR(String paramString1, String paramString2)
  {
    AppMethodBeat.i(87400);
    al.d(new b.3(paramString1, paramString2));
    AppMethodBeat.o(87400);
  }

  private static boolean cS(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(87403);
    if (bo.isNullOrNil(paramString1))
    {
      ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid target nil, no check");
      AppMethodBeat.o(87403);
    }
    while (true)
    {
      return bool;
      paramString2 = g.cz(paramString2);
      ab.i("MicroMsg.AppBrand.AppBrandLiveFileLoadHelper.javayhu", "isMd5Valid file:%s target:%s", new Object[] { paramString2, paramString1 });
      bool = paramString1.equals(paramString2);
      AppMethodBeat.o(87403);
    }
  }

  private static String pE(String paramString)
  {
    AppMethodBeat.i(87402);
    String str = null;
    if (!bo.isNullOrNil(paramString))
      str = g.x(paramString.getBytes());
    AppMethodBeat.o(87402);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.b
 * JD-Core Version:    0.6.2
 */