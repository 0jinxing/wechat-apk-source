package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.net.Uri;
import android.support.annotation.Keep;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.b.a.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.t.d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppBrandVideoDownLoadMgr
{
  public static final String hYF;
  private static HashMap<String, String> hYG;
  static final Map<String, a> hYH;
  public static AppBrandVideoDownLoadMgr hYI;
  static d hYJ;

  static
  {
    AppMethodBeat.i(131532);
    hYG = new HashMap();
    hYH = new ConcurrentHashMap();
    hYI = null;
    hYJ = null;
    if (hYI == null)
      hYI = new AppBrandVideoDownLoadMgr();
    String str = e.eSn;
    Object localObject = str;
    if (!str.endsWith("/"))
      localObject = str + "/";
    hYF = (String)localObject + "wagamefiles/";
    d.a(com.tencent.mm.plugin.cdndownloader.h.a.bfc());
    localObject = new d();
    hYJ = (d)localObject;
    ((d)localObject).ewY = new com.tencent.mm.t.c()
    {
      public final void onTaskFail(String paramAnonymousString, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(131522);
        ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskFail err_code = %s, url = %s,is_resume = %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
        AppBrandVideoDownLoadMgr localAppBrandVideoDownLoadMgr = AppBrandVideoDownLoadMgr.hYI;
        AppBrandVideoDownLoadMgr.al(paramAnonymousString, false);
        ((a)AppBrandVideoDownLoadMgr.aje().get(paramAnonymousString)).hYE.bj(paramAnonymousString, paramAnonymousInt);
        AppMethodBeat.o(131522);
      }

      public final void onTaskSucc(String paramAnonymousString1, String paramAnonymousString2, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(131521);
        ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad downloadVideo onTaskSucc save_path = %s, url = %s, is_resume = %s", new Object[] { paramAnonymousString2, paramAnonymousString1, Boolean.valueOf(paramAnonymousBoolean) });
        AppBrandVideoDownLoadMgr localAppBrandVideoDownLoadMgr = AppBrandVideoDownLoadMgr.hYI;
        AppBrandVideoDownLoadMgr.al(paramAnonymousString1, true);
        ((a)AppBrandVideoDownLoadMgr.aje().get(paramAnonymousString1)).hYE.cv(paramAnonymousString1, paramAnonymousString2);
        AppMethodBeat.o(131521);
      }
    };
    AppMethodBeat.o(131532);
  }

  private static String BO(String paramString)
  {
    AppMethodBeat.i(131526);
    synchronized (hYG)
    {
      if (hYG.containsKey(paramString))
      {
        paramString = (String)hYG.get(paramString);
        AppMethodBeat.o(131526);
        return paramString;
      }
      paramString = null;
      AppMethodBeat.o(131526);
    }
  }

  private static String BP(String paramString)
  {
    AppMethodBeat.i(131527);
    paramString = hYF + paramString + "/";
    AppMethodBeat.o(131527);
    return paramString;
  }

  private static String BQ(String paramString)
  {
    AppMethodBeat.i(131530);
    Uri localUri = Uri.parse(paramString);
    if (localUri.getHost().equalsIgnoreCase("wxsnsdy.wxs.qq.com"));
    for (paramString = localUri.getQueryParameter("m"); ; paramString = "unverify" + ag.ck(paramString))
    {
      AppMethodBeat.o(131530);
      return paramString;
    }
  }

  static void ak(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(131525);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(131525);
    while (true)
    {
      return;
      String str = BQ(paramString);
      synchronized (hYG)
      {
        if (hYG.containsKey(str))
          hYG.remove(str);
        ??? = (a)hYH.get(paramString);
        if (??? == null)
          break label133;
        if ((((a)???).url.equalsIgnoreCase(paramString)) && (((a)???).startTimeStamp > 0L))
          ((a)???).hYC = bo.az(((a)???).startTimeStamp);
        if (paramBoolean)
        {
          ((a)???).hYD = c.a.cTC;
          AppMethodBeat.o(131525);
        }
      }
      ((a)???).hYD = c.a.cTD;
      label133: AppMethodBeat.o(131525);
    }
  }

  private static String xY(String paramString)
  {
    AppMethodBeat.i(131528);
    paramString = BP(paramString);
    j.aih(paramString);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString, ".nomedia");
      localFile.createNewFile();
      label31: AppMethodBeat.o(131528);
      return paramString;
    }
    catch (Exception localException)
    {
      break label31;
    }
  }

  @Keep
  String genAdFileExist(String paramString, a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(131523);
    if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(parama.url)))
    {
      ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error source or videoUrl = %s", new Object[] { parama.url });
      AppMethodBeat.o(131523);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str1 = BQ(parama.url);
      if (bo.isNullOrNil(str1))
      {
        ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFileExist error urlFileMd5 = %s or videoUrl = %s", new Object[] { str1, parama.url });
        AppMethodBeat.o(131523);
        paramString = localObject;
      }
      else if (!bo.isNullOrNil(BO(str1)))
      {
        paramString = "downloading";
        AppMethodBeat.o(131523);
      }
      else
      {
        paramString = BP(paramString) + str1 + ".gad";
        File localFile = new File(paramString);
        String str2 = g.v(localFile);
        if ((localFile.exists()) && ((str1.startsWith("unverify")) || ((str2 != null) && (str2.equalsIgnoreCase(str1)))))
        {
          parama.hYC = 0L;
          parama.hYD = c.a.cTC;
          AppMethodBeat.o(131523);
        }
        else
        {
          AppMethodBeat.o(131523);
          paramString = localObject;
        }
      }
    }
  }

  @Keep
  String genAdFilePath(String paramString, a arg2)
  {
    Object localObject = null;
    AppMethodBeat.i(131524);
    if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(???.url)))
    {
      ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error source or videoUrl = %s", new Object[] { ???.url });
      AppMethodBeat.o(131524);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      String str = BQ(???.url);
      if (bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad genAdFilePath error urlFileMd5 = %s or videoUrl = %s", new Object[] { str, ???.url });
        AppMethodBeat.o(131524);
        paramString = localObject;
        continue;
      }
      if (!bo.isNullOrNil(BO(str)))
      {
        AppMethodBeat.o(131524);
        paramString = localObject;
        continue;
      }
      ???.startTimeStamp = bo.yz();
      ???.hYD = c.a.cTB;
      paramString = xY(paramString) + str + ".gad";
      synchronized (hYG)
      {
        hYG.put(str, paramString);
        AppMethodBeat.o(131524);
      }
    }
  }

  public final void report(String paramString)
  {
    while (true)
    {
      a locala;
      try
      {
        AppMethodBeat.i(131529);
        if (bo.isNullOrNil(paramString))
        {
          ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report error videoUrl is nil");
          AppMethodBeat.o(131529);
          return;
        }
        locala = (a)hYH.get(paramString);
        if ((locala == null) || (locala.hYC < 0L) || (!paramString.equalsIgnoreCase(locala.url)))
        {
          ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report error preLoadCostTime or videoUrl");
          AppMethodBeat.o(131529);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.AppBrand.AppBrandVideoDownLoadMgr", "leonlad report downLoadCostTime = %s,preLoadStatus = %s", new Object[] { Long.valueOf(locala.hYC), locala.hYD });
      com.tencent.mm.g.b.a.c localc = new com/tencent/mm/g/b/a/c;
      localc.<init>();
      paramString = localc.eq(paramString);
      paramString.cTy = locala.hYC;
      paramString.cTz = locala.hYD;
      paramString.ajK();
      AppMethodBeat.o(131529);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoDownLoadMgr
 * JD-Core Version:    0.6.2
 */