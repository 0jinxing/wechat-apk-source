package com.tencent.mm.plugin.appbrand.jsapi;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.location.LocationManager;
import android.net.wifi.WifiManager;
import android.support.v4.app.y;
import com.tencent.luggage.sdk.config.AppBrandSysConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.s.w;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.statusbar.a;
import java.util.HashMap;
import java.util.Map;

public class aq<C extends com.tencent.luggage.sdk.a.a.b> extends com.tencent.mm.plugin.appbrand.jsapi.q.g<C>
{
  public static final int CTRL_INDEX = 40;
  public static final String NAME = "getSystemInfo";
  private float hxe = -1.0F;

  protected Map<String, Object> a(C paramC)
  {
    AppMethodBeat.i(101947);
    Map localMap = super.d(paramC);
    Object localObject1 = w.h(paramC);
    localMap.put("windowWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(localObject1[0])));
    localMap.put("windowHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(localObject1[1])));
    localObject1 = w.d(paramC);
    int i = localObject1[0];
    int j = localObject1[1];
    localMap.put("screenWidth", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(i)));
    localMap.put("screenHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(j)));
    int k = a.ay(paramC.ad(Activity.class));
    int m = k;
    if (k <= 0)
      m = ae.getStatusBarHeight(paramC.getContext());
    localMap.put("statusBarHeight", Integer.valueOf(com.tencent.mm.plugin.appbrand.r.g.pZ(m)));
    localMap.put("language", aa.gw(paramC.getContext()));
    localMap.put("version", com.tencent.mm.sdk.platformtools.g.ar(null, f.xxY));
    localMap.put("benchmarkLevel", Integer.valueOf(paramC.xL().xZ().bQL));
    m = paramC.getContext().getResources().getConfiguration().orientation;
    label263: Object localObject2;
    if (2 == m)
    {
      localMap.put("deviceOrientation", "landscape");
      if (this.hxe == -1.0F)
        break label544;
      localMap.put("fontSizeSetting", Integer.valueOf((int)(this.hxe * 16.0F)));
      localObject1 = new HashMap();
      localObject2 = paramC.getContext();
      if ((localObject2 == null) || (!(localObject2 instanceof Activity)))
        break label681;
      Object localObject3 = (WifiManager)((Context)localObject2).getApplicationContext().getSystemService("wifi");
      if (localObject3 == null)
        break label593;
      ((Map)localObject1).put("wifiEnabled", Boolean.valueOf(((WifiManager)localObject3).isWifiEnabled()));
      label327: ((Map)localObject1).put("notificationAuthorized", Boolean.valueOf(y.L((Context)localObject2).areNotificationsEnabled()));
      localObject3 = (LocationManager)((Context)localObject2).getSystemService("location");
      if (localObject3 == null)
        break label608;
      ((Map)localObject1).put("locationEnabled", Boolean.valueOf(((LocationManager)localObject3).isProviderEnabled("gps")));
    }
    while (true)
    {
      try
      {
        ((Map)localObject1).put("locationAuthorized", Boolean.valueOf(com.tencent.luggage.g.g.o((Context)localObject2, "android.permission.ACCESS_FINE_LOCATION")));
        ((Map)localObject1).put("cameraAuthorized", Boolean.valueOf(com.tencent.luggage.g.g.o((Context)localObject2, "android.permission.CAMERA")));
        ((Map)localObject1).put("microphoneAuthorized", Boolean.valueOf(com.tencent.luggage.g.g.o((Context)localObject2, "android.permission.RECORD_AUDIO")));
        localObject2 = BluetoothAdapter.getDefaultAdapter();
        if (localObject2 == null)
          break label756;
        ((Map)localObject1).put("bluetoothEnabled", Boolean.valueOf(((BluetoothAdapter)localObject2).isEnabled()));
        ab.i("MicroMsg.JsApiGetSystemInfo", "check permissions:%s", new Object[] { localObject1 });
        localMap.putAll((Map)localObject1);
        localObject1 = new HashMap(6);
        if (paramC.ad(Activity.class) != null)
          break label771;
        ab.w("MicroMsg.JsApiGetSystemInfo", "hy: can not retrieve UI!");
        AppMethodBeat.o(101947);
        return localMap;
        if (1 != m)
          break;
        localMap.put("deviceOrientation", "portrait");
        break;
        label544: float f = paramC.getContext().getSharedPreferences(ah.doA(), 0).getFloat("text_size_scale_key", 1.0F);
        localMap.put("fontSizeSetting", Integer.valueOf((int)(f * 16.0F)));
        this.hxe = f;
        break label263;
        label593: ((Map)localObject1).put("wifiEnabled", Boolean.FALSE);
        break label327;
        label608: ((Map)localObject1).put("locationEnabled", Boolean.FALSE);
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.JsApiGetSystemInfo", "check permissions exception", new Object[] { localException });
        ((Map)localObject1).put("locationAuthorized", Boolean.FALSE);
        ((Map)localObject1).put("cameraAuthorized", Boolean.FALSE);
        ((Map)localObject1).put("microphoneAuthorized", Boolean.FALSE);
        continue;
      }
      label681: ((Map)localObject1).put("wifiEnabled", Boolean.FALSE);
      ((Map)localObject1).put("notificationAuthorized", Boolean.FALSE);
      ((Map)localObject1).put("locationEnabled", Boolean.FALSE);
      ((Map)localObject1).put("locationAuthorized", Boolean.FALSE);
      ((Map)localObject1).put("cameraAuthorized", Boolean.FALSE);
      ((Map)localObject1).put("microphoneAuthorized", Boolean.FALSE);
      continue;
      label756: ((Map)localObject1).put("bluetoothEnabled", Boolean.FALSE);
      continue;
      label771: paramC = ae.d(paramC.ad(Activity.class), i, j);
      if (paramC != null)
      {
        j = com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.left);
        k = com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.top);
        i = com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.right);
        m = com.tencent.mm.plugin.appbrand.r.g.pZ(paramC.bottom);
        ((Map)localObject1).put("left", Integer.valueOf(j));
        ((Map)localObject1).put("top", Integer.valueOf(k));
        ((Map)localObject1).put("right", Integer.valueOf(i));
        ((Map)localObject1).put("bottom", Integer.valueOf(m));
        ((Map)localObject1).put("width", Integer.valueOf(i - j));
        ((Map)localObject1).put("height", Integer.valueOf(m - k));
        localMap.put("safeArea", localObject1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.aq
 * JD-Core Version:    0.6.2
 */