package com.tencent.qbar;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private static List<String> Aqr;
  private static List<String> Aqs;

  static
  {
    AppMethodBeat.i(108291);
    ArrayList localArrayList = new ArrayList();
    Aqr = localArrayList;
    localArrayList.add("weixin://wxpay/");
    Aqr.add("wxp://");
    Aqr.add("https://wx.tenpay.com/");
    Aqr.add("https://payapp.weixin.qq.com/");
    Aqr.add("https://action.weixin.qq.com/");
    localArrayList = new ArrayList();
    Aqs = localArrayList;
    localArrayList.add("https://qr.alipay.com/");
    AppMethodBeat.o(108291);
  }

  public static void a(QbarNative paramQbarNative)
  {
    AppMethodBeat.i(108290);
    if (paramQbarNative == null)
    {
      ab.w("MicroMsg.QBarAIModHelper", "config qbarNative is null");
      AppMethodBeat.o(108290);
    }
    while (true)
    {
      return;
      Iterator localIterator = Aqr.iterator();
      while (localIterator.hasNext())
        paramQbarNative.AddWhiteList((String)localIterator.next(), paramQbarNative.Aqx);
      localIterator = Aqs.iterator();
      while (localIterator.hasNext())
        paramQbarNative.AddBlackList((String)localIterator.next(), paramQbarNative.Aqx);
      paramQbarNative.AddBlackInternal(6, paramQbarNative.Aqx);
      AppMethodBeat.o(108290);
    }
  }

  public static QbarNative.QbarAiModelParam iy(Context paramContext)
  {
    AppMethodBeat.i(108289);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = com.tencent.mm.compatible.util.e.eSi.replace("/data/user/0", "/data/data") + "files/";
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1, "qbar");
      if (!((File)localObject2).exists())
        ((File)localObject2).mkdirs();
      String str = ((File)localObject2).getAbsolutePath();
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = str + "/detect_model.bin";
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = str + "/detect_model.param";
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = str + "/srnet.bin";
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      str = str + "/srnet.param";
      localObject4 = ah.doB();
      boolean bool = ((SharedPreferences)localObject4).getBoolean("qbar_ai_mode_version_1", false);
      if (!bool)
      {
        com.tencent.mm.a.e.deleteFile((String)localObject1);
        com.tencent.mm.a.e.deleteFile((String)localObject2);
        com.tencent.mm.a.e.deleteFile((String)localObject3);
        com.tencent.mm.a.e.deleteFile(str);
        ((SharedPreferences)localObject4).edit().putBoolean("qbar_ai_mode_version_1", true).apply();
      }
      if ((!bool) || (!com.tencent.mm.a.e.ct((String)localObject1)))
      {
        m.copyAssets(paramContext, "qbar/detect_model.bin", (String)localObject1);
        m.copyAssets(paramContext, "qbar/detect_model.param", (String)localObject2);
        m.copyAssets(paramContext, "qbar/srnet.bin", (String)localObject3);
        m.copyAssets(paramContext, "qbar/srnet.param", str);
      }
      paramContext = new com/tencent/qbar/QbarNative$QbarAiModelParam;
      paramContext.<init>();
      paramContext.detect_model_bin_path_ = ((String)localObject1);
      paramContext.detect_model_param_path_ = ((String)localObject2);
      paramContext.superresolution_model_bin_path_ = ((String)localObject3);
      paramContext.superresolution_model_param_path_ = str;
      AppMethodBeat.o(108289);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.w("MicroMsg.QBarAIModHelper", "getAiModeParam err %s", new Object[] { paramContext.getMessage() });
        paramContext = null;
        AppMethodBeat.o(108289);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qbar.a
 * JD-Core Version:    0.6.2
 */