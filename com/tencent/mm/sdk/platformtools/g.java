package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class g
{
  public static int cdf;
  public static String cdg;
  public static int cdh;
  public static int cdl;
  public static int xya;
  public static int xyb;
  public static String xyc;
  public static boolean xyd;
  public static boolean xye;
  public static boolean xyf;
  public static boolean xyg;

  static
  {
    AppMethodBeat.i(115177);
    cdh = 0;
    cdf = 0;
    xya = 0;
    cdl = 0;
    cdg = Build.VERSION.SDK_INT;
    xyb = 0;
    xyc = "market://details?id=" + ah.getPackageName();
    xyd = false;
    xye = true;
    xyf = false;
    xyg = false;
    AppMethodBeat.o(115177);
  }

  public static String ar(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(115175);
    paramContext = d(paramContext, paramInt, xyd);
    AppMethodBeat.o(115175);
    return paramContext;
  }

  public static String d(Context paramContext, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(115176);
    int i = paramInt >> 8 & 0xFF;
    Object localObject1;
    if (i == 0)
      localObject1 = (paramInt >> 24 & 0xF) + "." + (paramInt >> 16 & 0xFF);
    while (true)
    {
      ab.d("MicroMsg.SDK.ChannelUtil", "minminor ".concat(String.valueOf(i)));
      i = 0xFFFFFFF & paramInt;
      Object localObject2 = localObject1;
      paramInt = i;
      if (paramContext != null)
        paramInt = i;
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 128);
        localObject2 = localObject1;
        paramInt = i;
        if (paramContext != null)
        {
          paramInt = i;
          i = paramContext.versionCode;
          paramInt = i;
          localObject2 = paramContext.versionName;
          paramInt = i;
        }
        if (paramBoolean)
        {
          paramContext = (String)localObject2 + "_" + paramInt;
          ab.d("MicroMsg.SDK.ChannelUtil", "full version: ".concat(String.valueOf(paramContext)));
          AppMethodBeat.o(115176);
          return paramContext;
          localObject1 = (paramInt >> 24 & 0xF) + "." + (paramInt >> 16 & 0xFF) + "." + i;
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
          localObject2 = localObject1;
          continue;
          localObject1 = ((String)localObject2).split("\\.");
          if ((localObject1 == null) || (localObject1.length < 4))
          {
            AppMethodBeat.o(115176);
            paramContext = (Context)localObject2;
          }
          else
          {
            paramContext = localObject1[0] + "." + localObject1[1];
            if (localObject1[2].trim().equals("0"))
            {
              AppMethodBeat.o(115176);
            }
            else
            {
              paramContext = paramContext + "." + localObject1[2];
              AppMethodBeat.o(115176);
            }
          }
        }
      }
    }
  }

  public static boolean dnY()
  {
    boolean bool = true;
    if (cdf == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static boolean dnZ()
  {
    if (cdf == 1001);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void gj(Context paramContext)
  {
    AppMethodBeat.i(115171);
    try
    {
      cdf = Integer.parseInt((String)u.amt(bo.convertStreamToString(paramContext.getAssets().open("channel.ini"))).get("CHANNEL"));
      AppMethodBeat.o(115171);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.SDK.ChannelUtil", "setup channel id from channel.ini failed");
        ab.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(115171);
      }
    }
  }

  public static void gk(Context paramContext)
  {
    AppMethodBeat.i(115172);
    try
    {
      paramContext = u.amt(bo.convertStreamToString(paramContext.getAssets().open("profile.ini")));
      Object localObject = bo.nullAsNil((String)paramContext.get("PROFILE_DEVICE_TYPE"));
      cdg = (String)localObject;
      if (((String)localObject).length() <= 0)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        cdg = Build.VERSION.SDK_INT;
      }
      cdh = parseInt((String)paramContext.get("UPDATE_MODE"));
      xyb = parseInt((String)paramContext.get("BUILD_REVISION"));
      xyf = parseBoolean((String)paramContext.get("GPRS_ALERT"));
      cdl = parseInt((String)paramContext.get("AUTO_ADD_ACOUNT"));
      xyg = parseBoolean((String)paramContext.get("NOKIA_AOL"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("profileDeviceType=");
      ab.w("MicroMsg.SDK.ChannelUtil", cdg);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("updateMode=");
      ab.w("MicroMsg.SDK.ChannelUtil", cdh);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("shouldShowGprsAlert=");
      ab.w("MicroMsg.SDK.ChannelUtil", xyf);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("autoAddAccount=");
      ab.w("MicroMsg.SDK.ChannelUtil", cdl);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("isNokiaol=");
      ab.w("MicroMsg.SDK.ChannelUtil", xyg);
      paramContext = (String)paramContext.get("MARKET_URL");
      if ((paramContext != null) && (paramContext.trim().length() != 0) && (Uri.parse(paramContext) != null))
        xyc = paramContext;
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>("marketURL=");
      ab.w("MicroMsg.SDK.ChannelUtil", xyc);
      AppMethodBeat.o(115172);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.SDK.ChannelUtil", "setup profile from profile.ini failed");
        ab.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(115172);
      }
    }
  }

  private static boolean parseBoolean(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(115174);
    try
    {
      boolean bool2 = Boolean.parseBoolean(paramString);
      bool1 = bool2;
      AppMethodBeat.o(115174);
      return bool1;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SDK.ChannelUtil", paramString, "", new Object[0]);
        ab.w("MicroMsg.SDK.ChannelUtil", paramString.getMessage());
        AppMethodBeat.o(115174);
      }
    }
  }

  private static int parseInt(String paramString)
  {
    AppMethodBeat.i(115173);
    try
    {
      i = Integer.parseInt(paramString);
      AppMethodBeat.o(115173);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.SDK.ChannelUtil", paramString.getMessage());
        int i = 0;
        AppMethodBeat.o(115173);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.g
 * JD-Core Version:    0.6.2
 */