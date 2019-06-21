package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g.c;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d
{
  private static Map<Integer, String> mvJ;

  static
  {
    AppMethodBeat.i(20716);
    mvJ = new HashMap()
    {
    };
    AppMethodBeat.o(20716);
  }

  public static int MC(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(20699);
    if (bo.isNullOrNil(paramString))
    {
      ab.d("MicroMsg.FreeWifi.FreeWifiManager", "Illegal SSID");
      AppMethodBeat.o(20699);
    }
    while (true)
    {
      return i;
      c localc = j.byW().ML(paramString);
      if ((localc != null) && (paramString.equalsIgnoreCase(localc.field_ssid)))
      {
        if ((localc.field_connectState == 2) && (localc.field_expiredTime > 0L) && (localc.field_expiredTime - bo.anT() <= 0L))
        {
          localc.field_connectState = 1;
          boolean bool = j.byW().c(localc, new String[0]);
          ab.i("MicroMsg.FreeWifi.FreeWifiManager", "Expired, re-auth, expired time : %d, current time : %d, ret : %b", new Object[] { Long.valueOf(localc.field_expiredTime), Long.valueOf(bo.anT()), Boolean.valueOf(bool) });
        }
        i = localc.field_connectState;
        AppMethodBeat.o(20699);
      }
      else
      {
        AppMethodBeat.o(20699);
      }
    }
  }

  public static boolean MD(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(20700);
    ab.i("MicroMsg.FreeWifi.FreeWifiManager", "check is wechat free wifi, ssid : %s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "ssid is null or nil");
      AppMethodBeat.o(20700);
    }
    while (true)
    {
      return bool;
      String str = at.gE(ah.getContext());
      if ((!bo.isNullOrNil(str)) && (str.equals(paramString)))
      {
        AppMethodBeat.o(20700);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(20700);
      }
    }
  }

  public static int ME(String paramString)
  {
    AppMethodBeat.i(20701);
    WifiManager localWifiManager = (WifiManager)ah.getContext().getSystemService("wifi");
    int i;
    if (localWifiManager == null)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork, get wifi manager failed");
      i = -11;
      AppMethodBeat.o(20701);
    }
    while (true)
    {
      return i;
      i = MG(paramString);
      if (i > 0)
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork, the network has exsited, just enable it");
      while (true)
      {
        boolean bool = localWifiManager.enableNetwork(i, true);
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork netid : %d, result : %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) });
        if (!bool)
          break label224;
        AppMethodBeat.o(20701);
        i = 0;
        break;
        WifiConfiguration localWifiConfiguration = new WifiConfiguration();
        localWifiConfiguration.allowedAuthAlgorithms.clear();
        localWifiConfiguration.allowedGroupCiphers.clear();
        localWifiConfiguration.allowedKeyManagement.clear();
        localWifiConfiguration.allowedPairwiseCiphers.clear();
        localWifiConfiguration.allowedProtocols.clear();
        localWifiConfiguration.SSID = ("\"" + paramString + "\"");
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "check is the same ssid is exist, %b", new Object[] { Boolean.valueOf(MF(paramString)) });
        localWifiConfiguration.allowedKeyManagement.set(0);
        localWifiConfiguration.wepTxKeyIndex = 0;
        i = localWifiManager.addNetwork(localWifiConfiguration);
      }
      label224: i = -14;
      AppMethodBeat.o(20701);
    }
  }

  public static boolean MF(String paramString)
  {
    AppMethodBeat.i(20706);
    int i = MG(paramString);
    ab.i("MicroMsg.FreeWifi.FreeWifiManager", "get network id by ssid :%s, netid is %d", new Object[] { paramString, Integer.valueOf(i) });
    boolean bool;
    if (i == -1)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiManager", "ssid is not exist : %s", new Object[] { paramString });
      AppMethodBeat.o(20706);
      bool = false;
    }
    while (true)
    {
      return bool;
      WifiManager localWifiManager = (WifiManager)ah.getContext().getSystemService("wifi");
      bool = localWifiManager.removeNetwork(i);
      localWifiManager.saveConfiguration();
      ab.i("MicroMsg.FreeWifi.FreeWifiManager", "remove ssid : %s, ret = %b", new Object[] { paramString, Boolean.valueOf(bool) });
      AppMethodBeat.o(20706);
    }
  }

  private static int MG(String paramString)
  {
    AppMethodBeat.i(20707);
    int i;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "null or nill ssid");
      AppMethodBeat.o(20707);
      i = -1;
    }
    while (true)
    {
      return i;
      Object localObject = ((WifiManager)ah.getContext().getSystemService("wifi")).getConfiguredNetworks();
      if (localObject == null)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi list is null");
        AppMethodBeat.o(20707);
        i = -1;
      }
      else
      {
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "get wificonfiguration list size : %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
        Iterator localIterator = ((List)localObject).iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localObject = (WifiConfiguration)localIterator.next();
            if (((WifiConfiguration)localObject).SSID.equals("\"" + paramString + "\""))
            {
              i = ((WifiConfiguration)localObject).networkId;
              AppMethodBeat.o(20707);
              break;
            }
          }
        AppMethodBeat.o(20707);
        i = -1;
      }
    }
  }

  public static void a(String paramString, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(20709);
    ab.i("MicroMsg.FreeWifi.FreeWifiManager", "sessionKey=%s, step=%d, method=FreeWifiManager.updateConnectState, desc=it changes the connect state of the model to %s. state=%d", new Object[] { m.V(paramIntent), Integer.valueOf(m.W(paramIntent)), vR(paramInt), Integer.valueOf(paramInt) });
    paramIntent = j.byW().ML(paramString);
    if (paramIntent != null)
    {
      paramIntent.field_connectState = paramInt;
      ab.i("MicroMsg.FreeWifi.FreeWifiManager", "update %s, connect state : %d, return : %b", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(j.byW().c(paramIntent, new String[0])) });
    }
    AppMethodBeat.o(20709);
  }

  public static boolean byJ()
  {
    AppMethodBeat.i(20705);
    WifiManager localWifiManager = (WifiManager)ah.getContext().getSystemService("wifi");
    boolean bool;
    if (localWifiManager == null)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      bool = false;
      AppMethodBeat.o(20705);
    }
    while (true)
    {
      return bool;
      bool = localWifiManager.setWifiEnabled(true);
      AppMethodBeat.o(20705);
    }
  }

  public static String byK()
  {
    AppMethodBeat.i(20710);
    Object localObject;
    if (at.getNetType(ah.getContext()) == 0)
    {
      localObject = byM();
      if ((localObject != null) && (((WifiInfo)localObject).getBSSID() != null))
      {
        localObject = ((WifiInfo)localObject).getBSSID();
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiMacAddress, get bssid now : %s", new Object[] { localObject });
        AppMethodBeat.o(20710);
      }
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(20710);
    }
  }

  public static int byL()
  {
    AppMethodBeat.i(20711);
    int i;
    if (at.getNetType(ah.getContext()) == 0)
    {
      WifiInfo localWifiInfo = byM();
      if (localWifiInfo != null)
      {
        i = localWifiInfo.getRssi();
        ab.i("MicroMsg.FreeWifi.FreeWifiManager", "getConnectWifiSignal, get rssi now : %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(20711);
      }
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(20711);
      i = 0;
    }
  }

  public static WifiInfo byM()
  {
    AppMethodBeat.i(20712);
    Object localObject1 = (WifiManager)ah.getContext().getSystemService("wifi");
    if (localObject1 == null)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      AppMethodBeat.o(20712);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      try
      {
        localObject1 = ((WifiManager)localObject1).getConnectionInfo();
        AppMethodBeat.o(20712);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiManager", "getConnectionInfo failed : %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(20712);
        Object localObject2 = null;
      }
    }
  }

  public static String byN()
  {
    AppMethodBeat.i(20713);
    String str = at.gF(ah.getContext());
    AppMethodBeat.o(20713);
    return str;
  }

  public static String byO()
  {
    AppMethodBeat.i(138606);
    String str = at.gE(ah.getContext());
    AppMethodBeat.o(138606);
    return str;
  }

  public static int c(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(20702);
    ab.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt, ssid is : %s, password : %s, cryptType :%d, hideSSID = %b", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (bo.isNullOrNil(paramString1))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg failed, ssid is null");
      paramInt = -12;
      AppMethodBeat.o(20702);
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
      {
        paramInt = ME(paramString1);
        AppMethodBeat.o(20702);
      }
      else if (bo.isNullOrNil(paramString2))
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiManager", "encrypt type is not none, while password is null");
        paramInt = -15;
        AppMethodBeat.o(20702);
      }
      else
      {
        WifiManager localWifiManager = (WifiManager)ah.getContext().getSystemService("wifi");
        if (localWifiManager == null)
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg, get wifi manager failed");
          paramInt = -11;
          AppMethodBeat.o(20702);
        }
        else
        {
          label170: label171: Object localObject;
          if (com.tencent.mm.compatible.util.d.iW(21))
            if (bo.isNullOrNil(paramString1))
            {
              ab.e("MicroMsg.FreeWifi.FreeWifiManager", "null or nill ssid");
              break label317;
              localObject = null;
              label174: if (localObject != null)
                break label374;
              paramString1 = y(paramString1, paramString2, paramInt);
              paramString1.hiddenSSID = paramBoolean;
              paramInt = localWifiManager.addNetwork(paramString1);
              localWifiManager.saveConfiguration();
            }
          while (true)
          {
            paramBoolean = localWifiManager.enableNetwork(paramInt, true);
            ab.i("MicroMsg.FreeWifi.FreeWifiManager", "addWifiNetWork by encrypt alg, netid : %d, result : %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
            if (!paramBoolean)
              break label625;
            AppMethodBeat.o(20702);
            paramInt = 0;
            break;
            localObject = ((WifiManager)ah.getContext().getSystemService("wifi")).getConfiguredNetworks();
            if (localObject == null)
            {
              ab.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi list is null");
              break label171;
            }
            ab.i("MicroMsg.FreeWifi.FreeWifiManager", "get wificonfiguration list size : %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
            Iterator localIterator = ((List)localObject).iterator();
            label317: if (!localIterator.hasNext())
              break label171;
            localObject = (WifiConfiguration)localIterator.next();
            if (!((WifiConfiguration)localObject).SSID.equals("\"" + paramString1 + "\""))
              break label170;
            break label174;
            label374: if (localObject != null)
            {
              ((WifiConfiguration)localObject).SSID = ("\"" + paramString1 + "\"");
              ((WifiConfiguration)localObject).status = 2;
              switch (paramInt)
              {
              default:
                ab.e("MicroMsg.FreeWifi.FreeWifiManager", "unsupport encrypt type : %d", new Object[] { Integer.valueOf(paramInt) });
              case 1:
              case 2:
              case 3:
              }
            }
            while (true)
            {
              ((WifiConfiguration)localObject).hiddenSSID = paramBoolean;
              paramInt = ((WifiConfiguration)localObject).networkId;
              break;
              ((WifiConfiguration)localObject).wepKeys = new String[] { "\"" + paramString2 + "\"" };
              ((WifiConfiguration)localObject).allowedKeyManagement.set(0);
              continue;
              ((WifiConfiguration)localObject).preSharedKey = ("\"" + paramString2 + "\"");
              ((WifiConfiguration)localObject).allowedKeyManagement.set(1);
            }
            int i = MG(paramString1);
            if (i > 0)
              ab.i("MicroMsg.FreeWifi.FreeWifiManager", "this network has exist : %s, try to remove it : %b", new Object[] { paramString1, Boolean.valueOf(localWifiManager.removeNetwork(i)) });
            paramString1 = y(paramString1, paramString2, paramInt);
            paramString1.hiddenSSID = paramBoolean;
            paramInt = localWifiManager.addNetwork(paramString1);
            localWifiManager.saveConfiguration();
          }
          label625: paramInt = -14;
          AppMethodBeat.o(20702);
        }
      }
    }
  }

  public static int getNetworkType()
  {
    AppMethodBeat.i(138607);
    int i = at.getNetType(ah.getContext());
    AppMethodBeat.o(138607);
    return i;
  }

  public static boolean isWifiEnabled()
  {
    AppMethodBeat.i(20704);
    WifiManager localWifiManager = (WifiManager)ah.getContext().getSystemService("wifi");
    boolean bool;
    if (localWifiManager == null)
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "get wifi manager failed");
      AppMethodBeat.o(20704);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = localWifiManager.isWifiEnabled();
      ab.i("MicroMsg.FreeWifi.FreeWifiManager", "is wifi enalbe now : %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(20704);
    }
  }

  public static String vR(int paramInt)
  {
    AppMethodBeat.i(20708);
    String str = (String)mvJ.get(Integer.valueOf(paramInt));
    if (str == null)
    {
      str = "";
      AppMethodBeat.o(20708);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(20708);
    }
  }

  private static WifiConfiguration y(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(20703);
    WifiConfiguration localWifiConfiguration = new WifiConfiguration();
    localWifiConfiguration.SSID = ("\"" + paramString1 + "\"");
    localWifiConfiguration.status = 2;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.FreeWifi.FreeWifiManager", "unsupport encrypt type : %d", new Object[] { Integer.valueOf(paramInt) });
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(20703);
      return localWifiConfiguration;
      localWifiConfiguration.wepKeys = new String[] { "\"" + paramString2 + "\"" };
      localWifiConfiguration.allowedKeyManagement.set(0);
      continue;
      localWifiConfiguration.preSharedKey = ("\"" + paramString2 + "\"");
      localWifiConfiguration.allowedKeyManagement.set(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.d
 * JD-Core Version:    0.6.2
 */