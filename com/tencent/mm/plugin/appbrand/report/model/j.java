package com.tencent.mm.plugin.appbrand.report.model;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
{
  private static final Set<String> iBn = new HashSet();
  private static final String[] iBo;
  private static final Set<String> iBp;
  private static final ThreadPoolExecutor iBq;
  private static final j.b iBr;
  private static final Pattern iBs;

  static
  {
    AppMethodBeat.i(132629);
    try
    {
      localObject1 = ah.getContext().getAssets().open("15007_api_list.txt");
      if (localObject1 != null)
      {
        localObject1 = new InputStreamReader((InputStream)localObject1);
        localBufferedReader = new BufferedReader((Reader)localObject1);
      }
    }
    catch (Exception localException1)
    {
      try
      {
        while (true)
        {
          String str = localBufferedReader.readLine();
          if (str == null)
            break;
          if (!bo.isNullOrNil(str))
            iBn.add(str);
        }
      }
      catch (Exception localException2)
      {
        Object localObject1;
        ab.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", localException2, "readLine()", new Object[0]);
        bo.b(localBufferedReader);
        bo.b((Closeable)localObject1);
        while (true)
        {
          iBo = new String[] { "addMapCircles", "addMapControls", "addMapLines", "addMapMarkers", "createAudioInstance", "createRequestTask", "createSocketTask", "destroyAudioInstance", "disableScrollBounce", "drawCanvas", "getAudioState", "getCurrentRoute", "getMapCenterLocation", "getStorage", "getStorageSync", "getSystemInfo", "hideToast", "moveToMapLocation", "onAccelerometerChange", "onCompassChange", "onKeyboardValueChange", "onMapRegionChange", "onSocketClose", "onSocketError", "onSocketMessage", "onSocketOpen", "onTouchEnd", "onTouchMove", "onTouchStart", "onVideoTimeUpdate", "operateAudio", "operateSocketTask", "removeStorageSync", "reportIDKey", "reportKeyValue", "reportRealtimeAction", "setStorage", "setStorageSync", "showModal", "showToast", "syncAudioEvent", "updateCanvas", "updateMap", "traceEvent" };
          iBp = new HashSet(Arrays.asList(iBo));
          iBq = new j.2(TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j.1());
          iBr = new j.b((byte)0);
          iBs = Pattern.compile(".*\"errMsg\":\"[^:]+:([^\"]+)\".*");
          AppMethodBeat.o(132629);
          return;
          localException1 = localException1;
          ab.printErrStackTrace("MicroMsg.AppBrand.JsApiInvokeReportProtocol", localException1, "open read 15007_api_list.txt", new Object[0]);
          localCloseable = null;
          break;
          bo.b(localBufferedReader);
          bo.b(localCloseable);
        }
      }
      finally
      {
        BufferedReader localBufferedReader;
        Closeable localCloseable;
        bo.b(localBufferedReader);
        bo.b(localCloseable);
        AppMethodBeat.o(132629);
      }
    }
  }

  public static boolean DD(String paramString)
  {
    AppMethodBeat.i(132625);
    boolean bool;
    if (iBp.contains(paramString))
    {
      bool = true;
      AppMethodBeat.o(132625);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(132625);
    }
  }

  public static String DE(String paramString)
  {
    AppMethodBeat.i(132627);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(132627);
    }
    while (true)
    {
      return paramString;
      paramString = iBs.matcher(paramString);
      if (paramString.matches())
      {
        paramString = bo.nullAsNil(paramString.group(1));
        AppMethodBeat.o(132627);
      }
      else
      {
        paramString = "";
        AppMethodBeat.o(132627);
      }
    }
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, long paramLong, String paramString5)
  {
    AppMethodBeat.i(132626);
    if (bo.isNullOrNil(paramString1))
      AppMethodBeat.o(132626);
    while (true)
    {
      return;
      j.a locala = iBr.aLu();
      locala.appId = paramString1;
      locala.csu = paramString2;
      locala.iBt = paramString3;
      locala.hAP = paramString4;
      locala.iBu = paramInt;
      locala.iBv = paramLong;
      locala.cBp = paramString5;
      iBq.submit(locala);
      AppMethodBeat.o(132626);
    }
  }

  public static void aLp()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.j
 * JD-Core Version:    0.6.2
 */