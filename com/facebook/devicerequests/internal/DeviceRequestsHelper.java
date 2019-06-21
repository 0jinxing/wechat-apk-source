package com.facebook.devicerequests.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.Utility;
import com.google.b.a;
import com.google.b.b.b;
import com.google.b.c;
import com.google.b.e;
import com.google.b.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceRequestsHelper
{
  static final String DEVICE_INFO_DEVICE = "device";
  static final String DEVICE_INFO_MODEL = "model";
  public static final String DEVICE_INFO_PARAM = "device_info";
  public static final String DEVICE_TARGET_USER_ID = "target_user_id";
  static final String SDK_FLAVOR = "android";
  static final String SDK_HEADER = "fbsdk";
  static final String SERVICE_TYPE = "_fb._tcp.";
  private static final String TAG;
  private static HashMap<String, NsdManager.RegistrationListener> deviceRequestsListeners;

  static
  {
    AppMethodBeat.i(96608);
    TAG = DeviceRequestsHelper.class.getCanonicalName();
    deviceRequestsListeners = new HashMap();
    AppMethodBeat.o(96608);
  }

  public static void cleanUpAdvertisementService(String paramString)
  {
    AppMethodBeat.i(96605);
    cleanUpAdvertisementServiceImpl(paramString);
    AppMethodBeat.o(96605);
  }

  @TargetApi(16)
  private static void cleanUpAdvertisementServiceImpl(String paramString)
  {
    AppMethodBeat.i(96607);
    NsdManager.RegistrationListener localRegistrationListener = (NsdManager.RegistrationListener)deviceRequestsListeners.get(paramString);
    NsdManager localNsdManager;
    if (localRegistrationListener != null)
      localNsdManager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
    try
    {
      localNsdManager.unregisterService(localRegistrationListener);
      deviceRequestsListeners.remove(paramString);
      AppMethodBeat.o(96607);
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      while (true)
        Utility.logd(TAG, localIllegalArgumentException);
    }
  }

  public static Bitmap generateQRCode(String paramString)
  {
    AppMethodBeat.i(96604);
    EnumMap localEnumMap = new EnumMap(c.class);
    localEnumMap.put(c.bxY, Integer.valueOf(2));
    try
    {
      localObject = new com/google/b/e;
      ((e)localObject).<init>();
      paramString = ((e)localObject).a(paramString, a.bxM, 200, 200, localEnumMap);
      i = paramString.height;
      j = paramString.width;
      localObject = new int[i * j];
      for (int k = 0; k < i; k++)
      {
        int m = 0;
        if (m < j)
        {
          if (paramString.bB(m, k));
          for (int n = -16777216; ; n = -1)
          {
            localObject[(k * j + m)] = n;
            m++;
            break;
          }
        }
      }
      paramString = Bitmap.createBitmap(j, i, Bitmap.Config.ARGB_8888);
    }
    catch (h paramString)
    {
      try
      {
        Object localObject;
        int i;
        int j;
        paramString.setPixels((int[])localObject, 0, j, 0, 0, j, i);
        while (true)
        {
          label158: AppMethodBeat.o(96604);
          return paramString;
          paramString = paramString;
          paramString = null;
        }
      }
      catch (h localh)
      {
        break label158;
      }
    }
  }

  public static String getDeviceInfo()
  {
    AppMethodBeat.i(96601);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("device", Build.DEVICE);
      localJSONObject.put("model", Build.MODEL);
      label33: String str = localJSONObject.toString();
      AppMethodBeat.o(96601);
      return str;
    }
    catch (JSONException localJSONException)
    {
      break label33;
    }
  }

  public static boolean isAvailable()
  {
    AppMethodBeat.i(96603);
    boolean bool;
    if ((Build.VERSION.SDK_INT >= 16) && (FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(SmartLoginOption.Enabled)))
    {
      bool = true;
      AppMethodBeat.o(96603);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96603);
    }
  }

  public static boolean startAdvertisementService(String paramString)
  {
    AppMethodBeat.i(96602);
    boolean bool;
    if (isAvailable())
    {
      bool = startAdvertisementServiceImpl(paramString);
      AppMethodBeat.o(96602);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(96602);
    }
  }

  @TargetApi(16)
  private static boolean startAdvertisementServiceImpl(String paramString)
  {
    AppMethodBeat.i(96606);
    if (deviceRequestsListeners.containsKey(paramString))
      AppMethodBeat.o(96606);
    while (true)
    {
      return true;
      Object localObject = String.format("%s_%s_%s", new Object[] { "fbsdk", String.format("%s-%s", new Object[] { "android", FacebookSdk.getSdkVersion().replace('.', '|') }), paramString });
      NsdServiceInfo localNsdServiceInfo = new NsdServiceInfo();
      localNsdServiceInfo.setServiceType("_fb._tcp.");
      localNsdServiceInfo.setServiceName((String)localObject);
      localNsdServiceInfo.setPort(80);
      NsdManager localNsdManager = (NsdManager)FacebookSdk.getApplicationContext().getSystemService("servicediscovery");
      localObject = new DeviceRequestsHelper.1((String)localObject, paramString);
      deviceRequestsListeners.put(paramString, localObject);
      localNsdManager.registerService(localNsdServiceInfo, 1, (NsdManager.RegistrationListener)localObject);
      AppMethodBeat.o(96606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.devicerequests.internal.DeviceRequestsHelper
 * JD-Core Version:    0.6.2
 */