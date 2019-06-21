package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.WiFiConnector.2;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static boolean idp = false;
  private static WeakReference<com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a> idq = null;
  private static b idr = null;
  private static a ids;
  private static Context mContext;

  public static void D(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    AppMethodBeat.i(94386);
    if (idq != null)
    {
      locala = (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a)idq.get();
      if ((locala != null) && (!locala.aGB()))
        locala.Cb("duplicated request");
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a locala = new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a(ids, mContext);
    ab.i("MicroMsg.WiFiConnector", "ssid:" + paramString1 + " bssid:" + paramString2 + " psw:" + paramString3);
    locala.idi = paramString1;
    locala.idj = paramString2;
    if (TextUtils.isEmpty(paramString3))
    {
      i = 0;
      if ((paramString1 != null) && (paramString1.length() > 0))
        break label390;
      paramString2 = null;
      List localList = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConfiguredNetworks();
      paramString3 = str;
      if (localList != null)
        paramString3 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.a(paramString1, i, localList);
      if (paramString2 == null)
        break label552;
      str = paramString2;
      if (paramString3 != null)
      {
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.bl(paramString1, i))
          break label572;
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.saveConfiguration();
      }
    }
    label390: label552: label572: for (int i = 1; ; i = 0)
    {
      str = paramString2;
      if (i == 0)
      {
        paramString2.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(paramString2);
        str = paramString2;
        if (paramString2.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.idD)
        {
          locala.idA = true;
          str = paramString3;
        }
      }
      if (str.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.idD)
        str.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(str);
      if ((str.networkId != com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.idD) && (locala.a(str)))
      {
        ab.i("MicroMsg.wifi_event", "CONNECTING");
        locala.oE(1);
        locala.idw = str;
        if (!locala.ide)
        {
          paramString1 = new IntentFilter();
          paramString1.addAction("android.net.wifi.supplicant.STATE_CHANGE");
          paramString1.addAction("android.net.wifi.STATE_CHANGE");
          paramString1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
          paramString1.setPriority(2147483647);
          locala.idf = new WiFiConnector.2(locala);
          locala.idt.registerReceiver(locala.idf, paramString1);
          locala.ide = true;
          ab.i("MicroMsg.WiFiConnector", "startMonitorWiFiEvent");
        }
        locala.mHandler.sendEmptyMessageDelayed(1, 13000L);
      }
      while (true)
      {
        idq = new WeakReference(locala);
        AppMethodBeat.o(94386);
        return;
        i = 2;
        break;
        paramString2 = new WifiConfiguration();
        paramString2.allowedAuthAlgorithms.clear();
        paramString2.allowedGroupCiphers.clear();
        paramString2.allowedKeyManagement.clear();
        paramString2.allowedPairwiseCiphers.clear();
        paramString2.allowedProtocols.clear();
        paramString2.SSID = ("\"" + paramString1 + "\"");
        paramString2.hiddenSSID = true;
        switch (i)
        {
        default:
          paramString2.allowedKeyManagement.set(0);
        case 2:
        }
        while (true)
        {
          paramString2.status = 2;
          break;
          if (paramString3.length() != 0)
            if (paramString3.matches("[0-9A-Fa-f]{64}"))
              paramString2.preSharedKey = paramString3;
            else
              paramString2.preSharedKey = ("\"" + paramString3 + '"');
        }
        locala.i(false, "fail to connect wifi:invalid network id");
        ab.i("MicroMsg.wifi_event", "connect args wrong FAIL.");
      }
    }
  }

  public static void a(a parama)
  {
    ids = parama;
  }

  public static b aGy()
  {
    AppMethodBeat.i(94384);
    WifiInfo localWifiInfo = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
    String str1 = "";
    String str2 = "";
    String str3 = str2;
    Object localObject = str1;
    if (localWifiInfo != null)
    {
      str3 = str2;
      localObject = str1;
      if (!TextUtils.isEmpty(localWifiInfo.getSSID()))
      {
        localObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.Cc(localWifiInfo.getSSID());
        str3 = bo.bc(localWifiInfo.getBSSID(), "");
      }
    }
    if ((idr != null) && (idr.idi.compareTo((String)localObject) == 0) && (idr.idj.compareTo(str3) == 0))
    {
      localObject = idr;
      AppMethodBeat.o(94384);
    }
    while (true)
    {
      return localObject;
      if (localWifiInfo != null)
      {
        aGz();
        localObject = idr;
        AppMethodBeat.o(94384);
      }
      else
      {
        localObject = null;
        AppMethodBeat.o(94384);
      }
    }
  }

  public static c aGz()
  {
    AppMethodBeat.i(94385);
    c localc = new c();
    idr = null;
    Object localObject1;
    Object localObject2;
    String str;
    if ((idp) && (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.startScan();
      localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getScanResults();
      localc.ido = new ArrayList();
      localc.hAa = "ok";
      if (localObject1 != null)
      {
        ab.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] ScanResult:%s, size:%d", new Object[] { localObject1, Integer.valueOf(((List)localObject1).size()) });
        localObject2 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
        ab.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] currentWiFiInfo:%s", new Object[] { localObject2 });
        if ((localObject2 == null) || (TextUtils.isEmpty(((WifiInfo)localObject2).getSSID())))
          break label369;
        str = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.Cc(((WifiInfo)localObject2).getSSID());
        localObject2 = bo.bc(((WifiInfo)localObject2).getBSSID(), "");
      }
    }
    while (true)
    {
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        ScanResult localScanResult = (ScanResult)localIterator.next();
        if (localScanResult != null)
        {
          int i = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.a(localScanResult);
          if ((i == 0) || (i == 2))
          {
            localObject1 = new b();
            ((b)localObject1).idi = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.Cc(localScanResult.SSID);
            ((b)localObject1).idj = bo.bc(localScanResult.BSSID, "");
            ((b)localObject1).idk = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.oI(localScanResult.level);
            boolean bool;
            if (i == 2)
            {
              bool = true;
              label252: ((b)localObject1).idl = bool;
              if ((str == null) || (localObject2 == null) || (((b)localObject1).idi.compareTo(str) != 0) || (((b)localObject1).idj.compareTo((String)localObject2) != 0))
                break label320;
            }
            label320: for (i = 1; ; i = 0)
            {
              if (i != 0)
                idr = (b)localObject1;
              localc.ido.add(localObject1);
              break;
              bool = false;
              break label252;
            }
            ab.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
          }
        }
      }
      while (true)
      {
        AppMethodBeat.o(94385);
        return localc;
        if (idp)
          localc.hAa = "wifi is disable";
        else
          localc.hAa = "sdk not init";
      }
      label369: localObject2 = null;
      str = null;
    }
  }

  public static void cP(Context paramContext)
  {
    AppMethodBeat.i(94383);
    if ((!idp) && (paramContext != null))
    {
      paramContext = ah.getContext();
      mContext = paramContext;
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.bCU = paramContext;
        idp = true;
      }
    }
    AppMethodBeat.o(94383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d
 * JD-Core Version:    0.6.2
 */