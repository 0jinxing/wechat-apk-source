package com.tencent.mm.plugin.sight.base;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Environment;
import android.os.StatFs;
import android.util.StringBuilderPrinter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.x;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.sdk.platformtools.g;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class d
{
  private static int osv = 0;
  private static int osw = 0;

  public static String RK(String paramString)
  {
    AppMethodBeat.i(117310);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("extInfo: \n".concat(String.valueOf(a(paramString, new PInt(), new PInt(), new PInt(), new PInt(), new PInt()))));
    localStringBuffer.append("size: " + bo.ga(com.tencent.mm.vfs.e.asZ(paramString)) + ":" + paramString + "\n");
    String str = SightVideoJNI.getMp4RecordInfo(paramString);
    if (!bo.isNullOrNil(str))
      localStringBuffer.append(str);
    localStringBuffer.append("isH265:").append(r.uc(paramString));
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(117310);
    return paramString;
  }

  public static String WO(String paramString)
  {
    AppMethodBeat.i(117305);
    paramString = bo.bc(paramString, "") + ".thumb";
    AppMethodBeat.o(117305);
    return paramString;
  }

  public static String WP(String paramString)
  {
    AppMethodBeat.i(117306);
    paramString = bo.bc(paramString, "") + ".soundmp4";
    AppMethodBeat.o(117306);
    return paramString;
  }

  public static boolean WQ(String paramString)
  {
    AppMethodBeat.i(117308);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (!com.tencent.mm.vfs.e.ct(paramString)))
    {
      AppMethodBeat.o(117308);
      bool = false;
    }
    while (true)
    {
      return bool;
      long l = bo.yz();
      c localc = new c();
      int i = SightVideoJNI.isSightOk(paramString, localc.qxg, localc.qxh, localc.qxi, localc.qxk, localc.qxj, localc.qxj.length);
      ab.d("MicroMsg.SightUtil", "ashu::check sight use %dms", new Object[] { Long.valueOf(bo.az(l)) });
      if (i == 0)
      {
        AppMethodBeat.o(117308);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(117308);
        bool = false;
      }
    }
  }

  public static a WR(String paramString)
  {
    a locala = null;
    AppMethodBeat.i(117312);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(117312);
      paramString = locala;
    }
    while (true)
    {
      return paramString;
      if (!com.tencent.mm.vfs.e.ct(paramString))
      {
        AppMethodBeat.o(117312);
        paramString = locala;
        continue;
      }
      locala = new a();
      try
      {
        paramString = SightVideoJNI.getSimpleMp4Info(paramString);
        ab.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        locala.eWK = ((int)localJSONObject.getDouble("videoDuration"));
        locala.width = localJSONObject.getInt("videoWidth");
        locala.height = localJSONObject.getInt("videoHeight");
        locala.eTk = ((int)localJSONObject.getDouble("videoFPS"));
        locala.videoBitrate = localJSONObject.getInt("videoBitrate");
        locala.fzS = localJSONObject.getInt("audioBitrate");
        locala.qwV = localJSONObject.getInt("audioChannel");
        ab.i("MicroMsg.SightUtil", "get media %s", new Object[] { locala });
        AppMethodBeat.o(117312);
        paramString = locala;
      }
      catch (Exception paramString)
      {
        while (true)
          ab.e("MicroMsg.SightUtil", "get media info error %s", new Object[] { paramString.toString() });
      }
    }
  }

  public static String a(String paramString, PInt paramPInt1, PInt paramPInt2, PInt paramPInt3, PInt paramPInt4, PInt paramPInt5)
  {
    AppMethodBeat.i(117311);
    StringBuffer localStringBuffer = new StringBuffer();
    try
    {
      paramString = SightVideoJNI.getSimpleMp4Info(paramString);
      ab.d("MicroMsg.SightUtil", "get simple mp4 info %s", new Object[] { paramString });
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramPInt1.value = ((int)localJSONObject.getDouble("videoDuration"));
      paramPInt2.value = localJSONObject.getInt("videoWidth");
      paramPInt3.value = localJSONObject.getInt("videoHeight");
      paramPInt4.value = ((int)localJSONObject.getDouble("videoFPS"));
      paramPInt5.value = localJSONObject.getInt("videoBitrate");
      localStringBuffer.append("videoBitrate: ").append(paramPInt5.value).append("\n");
      localStringBuffer.append("videoWidth,videoHeight: ").append(paramPInt2.value).append("*").append(paramPInt3.value);
      localStringBuffer.append(" ").append(String.format("%.4f", new Object[] { Double.valueOf(paramPInt2.value * 1.0D / paramPInt3.value) })).append("\n");
      localStringBuffer.append("videoDuration: ").append(paramPInt1.value).append("\n");
      localStringBuffer.append("videoFPS: ").append(paramPInt4.value).append("\n");
      paramString = localStringBuffer.toString();
      AppMethodBeat.o(117311);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.SightUtil", paramString, "get media info error", new Object[0]);
    }
  }

  public static Bitmap ag(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117307);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(117307);
      return paramString;
    }
    Bitmap localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    if (localBitmap == null)
      ab.e("MicroMsg.SightUtil", "create remux thumb bmp error, target path %s", new Object[] { paramString });
    for (paramString = localBitmap; ; paramString = com.tencent.mm.sdk.platformtools.d.a(localBitmap, paramInt2, paramInt1, true, true))
    {
      AppMethodBeat.o(117307);
      break;
    }
  }

  public static boolean ckV()
  {
    AppMethodBeat.i(117304);
    boolean bool;
    if (q.ete.eub == 0)
    {
      bool = false;
      AppMethodBeat.o(117304);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.compatible.util.d.iW(14);
      AppMethodBeat.o(117304);
    }
  }

  public static String ckW()
  {
    AppMethodBeat.i(117309);
    StringBuilder localStringBuilder = new StringBuilder(512);
    StringBuilderPrinter localStringBuilderPrinter = new StringBuilderPrinter(localStringBuilder);
    Object localObject1 = ah.getContext();
    localStringBuilderPrinter.println("#accinfo.revision=" + f.REV);
    localStringBuilderPrinter.println("#accinfo.build=" + f.TIME + ":" + f.HOSTNAME + ":" + g.cdf);
    Object localObject2 = new StringBuilder("#accinfo.env=");
    Object localObject3;
    if (b.foreground)
      localObject3 = "f";
    while (true)
    {
      localStringBuilderPrinter.println((String)localObject3 + ":" + Thread.currentThread().getName() + ":" + b.xxv);
      localStringBuilderPrinter.println("#aacinfo.device_brand=" + com.tencent.mm.protocal.d.vxi);
      localStringBuilderPrinter.println("#aacinfo.device_model=" + com.tencent.mm.protocal.d.vxj);
      localStringBuilderPrinter.println("#aacinfo.os_type=" + com.tencent.mm.protocal.d.vxk);
      localStringBuilderPrinter.println("#aacinfo.os_name=" + com.tencent.mm.protocal.d.vxl);
      localStringBuilderPrinter.println("#aacinfo.os_version=" + com.tencent.mm.protocal.d.vxm);
      localStringBuilderPrinter.println("#aacinfo.device_name=" + com.tencent.mm.protocal.d.DEVICE_NAME);
      try
      {
        String str2 = Environment.getDataDirectory().getAbsolutePath();
        localObject2 = new android/os/StatFs;
        ((StatFs)localObject2).<init>(str2);
        localObject3 = new android/os/StatFs;
        ((StatFs)localObject3).<init>(com.tencent.mm.compatible.util.e.eSl);
        localObject3 = String.format("%dMB %s:%d:%d:%d %s:%d:%d:%d", new Object[] { Integer.valueOf(((ActivityManager)((Context)localObject1).getSystemService("activity")).getMemoryClass()), str2, Integer.valueOf(((StatFs)localObject2).getBlockSize()), Integer.valueOf(((StatFs)localObject2).getBlockCount()), Integer.valueOf(((StatFs)localObject2).getAvailableBlocks()), com.tencent.mm.compatible.util.e.eSl, Integer.valueOf(((StatFs)localObject3).getBlockSize()), Integer.valueOf(((StatFs)localObject3).getBlockCount()), Integer.valueOf(((StatFs)localObject3).getAvailableBlocks()) });
        localStringBuilderPrinter.println("#accinfo.data=".concat(String.valueOf(localObject3)));
        localObject1 = new Date();
        localObject3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
        localStringBuilderPrinter.println("#accinfo.crashTime=" + ((SimpleDateFormat)localObject3).format((Date)localObject1));
        localStringBuilderPrinter.println("#crashContent=");
        localObject3 = localStringBuilder.toString();
        AppMethodBeat.o(117309);
        return localObject3;
        localObject3 = "b";
      }
      catch (Exception localException)
      {
        while (true)
        {
          ab.e("MicroMsg.SightUtil", "check data size failed :%s", new Object[] { localException.getMessage() });
          String str1 = "";
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.base.d
 * JD-Core Version:    0.6.2
 */