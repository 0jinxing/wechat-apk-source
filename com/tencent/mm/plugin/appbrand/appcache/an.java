package com.tencent.mm.plugin.appbrand.appcache;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import com.tencent.luggage.h.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.io.File;
import java.io.InputStream;
import org.json.JSONObject;

public final class an
{
  public static final int VERSION;
  public static final String[] gTT;
  static final an.a gTU;
  private static Boolean gTV;

  static
  {
    int i = -1;
    AppMethodBeat.i(114316);
    try
    {
      String str = avT();
      j = i;
      if (!bo.isNullOrNil(str))
      {
        j = i;
        if (e.ct(str))
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(e.cy(str));
          j = localJSONObject.optInt("version");
        }
      }
      if (j > 0)
      {
        VERSION = j;
        gTT = a.bRR;
      }
      for (gTU = an.a.gTZ; ; gTU = an.a.gTZ)
      {
        gTV = null;
        AppMethodBeat.o(114316);
        return;
        VERSION = 221;
        gTT = a.bRR;
      }
    }
    catch (Exception localException)
    {
      while (true)
        int j = i;
    }
  }

  public static void avS()
  {
    AppMethodBeat.i(114309);
    e.deleteFile(avT());
    AppMethodBeat.o(114309);
  }

  static String avT()
  {
    AppMethodBeat.i(114310);
    String str = j.w(new b(ah.getContext().getCacheDir().getAbsolutePath() + "/MockLibInfo.json").dMD());
    AppMethodBeat.o(114310);
    return str;
  }

  public static boolean avU()
  {
    AppMethodBeat.i(114311);
    if (gTV == null)
      gTV = Boolean.FALSE;
    boolean bool = gTV.booleanValue();
    AppMethodBeat.o(114311);
    return bool;
  }

  public static WxaPkgWrappingInfo avV()
  {
    AppMethodBeat.i(114315);
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = new WxaPkgWrappingInfo();
    localWxaPkgWrappingInfo.gVu = VERSION;
    localWxaPkgWrappingInfo.gVw = true;
    AppMethodBeat.o(114315);
    return localWxaPkgWrappingInfo;
  }

  public static void dD(boolean paramBoolean)
  {
    AppMethodBeat.i(114312);
    as.amF("__appbrand_comm_lib__prefs").putBoolean("disable_develop_lib", paramBoolean).commit();
    AppMethodBeat.o(114312);
  }

  public static InputStream openRead(String paramString)
  {
    AppMethodBeat.i(114313);
    paramString = l.yk(paramString);
    switch (an.1.gTW[gTU.ordinal()])
    {
    default:
      paramString = xw("wxa_library".concat(String.valueOf(paramString)));
      AppMethodBeat.o(114313);
    case 1:
    case 2:
    }
    while (true)
    {
      return paramString;
      paramString = xw("wxa_library/local".concat(String.valueOf(paramString)));
      AppMethodBeat.o(114313);
      continue;
      paramString = xw("wxa_library/develop".concat(String.valueOf(paramString)));
      AppMethodBeat.o(114313);
    }
  }

  private static InputStream xw(String paramString)
  {
    AppMethodBeat.i(114314);
    Object localObject = ah.getContext().getAssets();
    try
    {
      localObject = ((AssetManager)localObject).open(paramString);
      paramString = (String)localObject;
      AppMethodBeat.o(114314);
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.v("MicroMsg.AppBrand.WxaLocalLibPkg", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, localException });
        paramString = null;
        AppMethodBeat.o(114314);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.an
 * JD-Core Version:    0.6.2
 */