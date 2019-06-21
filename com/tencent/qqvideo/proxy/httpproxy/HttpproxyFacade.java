package com.tencent.qqvideo.proxy.httpproxy;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.qqvideo.proxy.common.ConfigStorage;
import com.tencent.qqvideo.proxy.common.VcSystemInfo;
import org.json.JSONObject;

public class HttpproxyFacade
{
  private static String TAG = "TV_Httpproxy";
  private static final String dev_type = "2";
  private static Context mContext = null;
  private static HttpproxyFacade mInstance;
  private static boolean mbHttpProxyExist = false;
  private IUtils mUtils = null;

  static
  {
    mInstance = null;
  }

  public static void idKeyReport(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(124406);
    try
    {
      if ((!TextUtils.isEmpty(paramString1)) && (!TextUtils.isEmpty(paramString2)) && (!TextUtils.isEmpty(paramString3)))
      {
        HttpproxyFacade localHttpproxyFacade = instance();
        if (localHttpproxyFacade.mUtils != null)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("idKeyReport:id=");
          localStringBuilder.append(paramString1).append(",key=").append(paramString2).append(",value=").append(paramString3);
          localHttpproxyFacade.mUtils.idKeyReport(paramString1, paramString2, paramString3);
          AppMethodBeat.o(124406);
          return;
        }
      }
    }
    catch (Throwable paramString1)
    {
      while (true)
      {
        print(6, TAG, "idKeyReport exception");
        AppMethodBeat.o(124406);
      }
    }
  }

  public static HttpproxyFacade instance()
  {
    try
    {
      AppMethodBeat.i(124402);
      if (mInstance == null)
      {
        localHttpproxyFacade = new com/tencent/qqvideo/proxy/httpproxy/HttpproxyFacade;
        localHttpproxyFacade.<init>();
        mInstance = localHttpproxyFacade;
      }
      HttpproxyFacade localHttpproxyFacade = mInstance;
      AppMethodBeat.o(124402);
      return localHttpproxyFacade;
    }
    finally
    {
    }
  }

  public static boolean isLoadSuccess()
  {
    return mbHttpProxyExist;
  }

  public static void javaUtilLog(String paramString)
  {
    try
    {
      AppMethodBeat.i(124403);
      HttpproxyFacade localHttpproxyFacade = instance();
      if (localHttpproxyFacade.mUtils != null)
      {
        localHttpproxyFacade.mUtils.javaUtilLog(4, TAG, paramString);
        AppMethodBeat.o(124403);
      }
      while (true)
      {
        return;
        "IUtils.javaUtilLog not init ".concat(String.valueOf(paramString));
        AppMethodBeat.o(124403);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static void jsonReport(String paramString)
  {
    AppMethodBeat.i(124405);
    try
    {
      String str1 = VcSystemInfo.getDeviceID(mContext);
      str2 = VcSystemInfo.getOsVersion();
      int i = VcSystemInfo.getNetWorkType(mContext);
      localObject = ((WifiManager)mContext.getSystemService("wifi")).getConnectionInfo();
      if (((WifiInfo)localObject).getBSSID() != null)
      {
        localObject = String.valueOf(WifiManager.calculateSignalLevel(((WifiInfo)localObject).getRssi(), 5));
        String str3 = ConfigStorage.getHttpProxyVersion();
        String str4 = ConfigStorage.getConfigVersion();
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        localJSONObject.put("dev_id", str1);
        localJSONObject.put("dev_type", "2");
        localJSONObject.put("os_ver", str2);
        localJSONObject.put("net_type", i);
        localJSONObject.put("net_stren", localObject);
        localJSONObject.put("config_ver", str4);
        localJSONObject.put("proxy_ver", str3);
        paramString = localJSONObject.toString();
        "IUtils.MTA_Report:".concat(String.valueOf(paramString));
        str2 = paramString.replace(",", ";");
        if (!TextUtils.isEmpty(str2))
        {
          paramString = instance();
          if (paramString.mUtils == null)
            break label314;
          if (str2.length() <= 1000)
          {
            paramString.mUtils.httpproxyReport(new String[] { str2 });
            AppMethodBeat.o(124405);
          }
          while (true)
          {
            return;
            int j = str2.length();
            i = j;
            if (j > 2000)
              i = 2000;
            localObject = str2.substring(0, 1000);
            str2 = str2.substring(1000, i);
            paramString.mUtils.httpproxyReport(new String[] { localObject, str2 });
            AppMethodBeat.o(124405);
          }
        }
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        String str2;
        print(6, TAG, "reportMTA exception");
        AppMethodBeat.o(124405);
        continue;
        label314: "IUtils.MTA_Report:".concat(String.valueOf(str2));
        AppMethodBeat.o(124405);
        continue;
        Object localObject = "";
      }
    }
  }

  public static void kvReport(String paramString)
  {
    AppMethodBeat.i(124407);
    try
    {
      String str1 = ConfigStorage.getHttpProxyVersionCode();
      String str2 = ConfigStorage.getConfigVersion();
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str3 = ((JSONObject)localObject).optString("DownloadResult");
      String str4 = ((JSONObject)localObject).optString("OptimalCDN");
      String str5 = ((JSONObject)localObject).optString("VideoRate");
      String str6 = ((JSONObject)localObject).optString("VideoTotalFileLength");
      String str7 = ((JSONObject)localObject).optString("VideoContentLength");
      String str8 = ((JSONObject)localObject).optString("DownloadTotalFlow");
      paramString = ((JSONObject)localObject).optString("DownloadCostTime");
      String str9 = ((JSONObject)localObject).optString("DownloadAverageSpeed");
      String str10 = ((JSONObject)localObject).optString("DownloadMaxSpeed");
      String str11 = ((JSONObject)localObject).optString("DownloadMinSpeed");
      localObject = instance();
      if (((HttpproxyFacade)localObject).mUtils != null)
      {
        ((HttpproxyFacade)localObject).mUtils.kvReport(new String[] { str3, str4, str1, str2, str5, str6, str7, str8, paramString, str9, str10, str11 });
        AppMethodBeat.o(124407);
        return;
      }
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        print(6, TAG, "kvReport exception");
        AppMethodBeat.o(124407);
      }
    }
  }

  public static void print(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(124404);
    HttpproxyFacade localHttpproxyFacade = instance();
    if (localHttpproxyFacade.mUtils != null)
    {
      localHttpproxyFacade.mUtils.javaUtilLog(paramInt, paramString1, paramString2);
      AppMethodBeat.o(124404);
    }
    while (true)
    {
      return;
      "IUtils.javaUtilLog not init ".concat(String.valueOf(paramString2));
      AppMethodBeat.o(124404);
    }
  }

  public static void setContext(Context paramContext)
  {
    mContext = paramContext;
  }

  public native String buildPlayURL(int paramInt);

  public native int cleanStorage();

  public native void deinit();

  public native int getCurrentOffset(int paramInt);

  public native int getLocalServerPort();

  public native int getTotalOffset(int paramInt);

  public native String getVersion();

  public native int init(String paramString1, String paramString2);

  public native int preLoad(int paramInt1, int paramInt2);

  public native void pushEvent(int paramInt);

  public native void setCookie(String paramString);

  public native int setMaxStorageSize(long paramLong);

  public native void setNetWorkState(int paramInt);

  public native void setPlayerState(int paramInt);

  public native void setRemainTime(int paramInt1, int paramInt2);

  public void setUtils(IUtils paramIUtils)
  {
    this.mUtils = paramIUtils;
  }

  public native int startPlay(String paramString1, int paramInt1, String paramString2, long paramLong, int paramInt2);

  public native void stopPlay(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqvideo.proxy.httpproxy.HttpproxyFacade
 * JD-Core Version:    0.6.2
 */