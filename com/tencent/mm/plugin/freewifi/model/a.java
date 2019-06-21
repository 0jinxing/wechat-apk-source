package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.d.b;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  SparseArray<Long> mvy;
  private g mvz;

  public a()
  {
    AppMethodBeat.i(20684);
    this.mvy = new SparseArray();
    this.mvz = new g();
    AppMethodBeat.o(20684);
  }

  public final void a(String paramString, g.b paramb, int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(20685);
    g localg = this.mvz;
    j.byZ().byI().post(new g.1(localg, paramString, paramIntent, paramb, paramInt));
    AppMethodBeat.o(20685);
  }

  public final void a(String paramString1, String paramString2, Intent paramIntent)
  {
    AppMethodBeat.i(20686);
    g localg = this.mvz;
    j.byZ().byI().post(new g.2(localg, paramString2, paramString1, paramIntent));
    AppMethodBeat.o(20686);
  }

  public final void byF()
  {
    Object localObject1;
    try
    {
      AppMethodBeat.i(20687);
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "ap check for bar.");
      localObject1 = d.byO();
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "autuApAuth, get ssid is %s ", new Object[] { localObject1 });
      if (bo.isNullOrNil((String)localObject1))
        AppMethodBeat.o(20687);
      while (true)
      {
        return;
        if (j.byW().MK((String)localObject1) == null)
          break;
        AppMethodBeat.o(20687);
      }
    }
    finally
    {
    }
    String str = d.byK();
    if (str == null);
    for (int i = 0; ; i = str.hashCode())
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi info is null, now try to check is the wechat wifi fromserver, ssid is : %s, mac is : %s, nowmac hashcode : %d", new Object[] { localObject1, str, Integer.valueOf(i) });
      if (!bo.isNullOrNil(str))
        break label137;
      AppMethodBeat.o(20687);
      break;
    }
    label137: com.tencent.mm.plugin.freewifi.g.c localc = j.byW().ML((String)localObject1);
    Object localObject3;
    label154: boolean bool;
    if (localc == null)
    {
      localObject3 = "null free wifiinfo";
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now mac is : %s, loacal mac is : %s", new Object[] { str, localObject3 });
      if (localc == null)
        break label472;
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "freewifi is not null, expired time = %d", new Object[] { Long.valueOf(localc.field_expiredTime) });
      if ((str.equalsIgnoreCase(localc.field_mac)) && (localc.field_expiredTime - bo.anT() >= 0L))
        break label566;
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has expierd time or mac has changed");
      bool = true;
    }
    while (true)
    {
      label236: ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "Should request bar from back end = %b", new Object[] { Boolean.valueOf(bool) });
      int j;
      if (bool)
      {
        j = d.byL();
        ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "now should do ap check, rssi is :  %d, mac : %s, mac hashcode : %d", new Object[] { Integer.valueOf(j), str, Integer.valueOf(str.hashCode()) });
        if (System.currentTimeMillis() - i.a.byn().lb("LOCAL_CONFIG_LAST_APCHECK_SAVE_DELAY_CRD_TIMEMILLIS") <= i.a.byn().getInt("LOCAL_CONFIG_APCHECK_DELAY_CRD_EXPIRED_DAYS", 7) * 24 * 60 * 60 * 1000)
          break label560;
      }
      label560: for (i = 1; ; i = 0)
      {
        int k = i;
        if (i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_BAR_APPEARED", 0) == 1)
          k = i | 0x2;
        i = k;
        if (i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0) == 1)
          i = k | 0x4;
        k = i;
        if (i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_RECV_FREEWIFI_SYSMSG", 0) == 1)
          k = i | 0x8;
        ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "features : ".concat(String.valueOf(k)));
        localObject3 = new com/tencent/mm/plugin/freewifi/d/b;
        ((b)localObject3).<init>(str, (String)localObject1, j, k);
        localObject1 = new com/tencent/mm/plugin/freewifi/model/a$1;
        ((a.1)localObject1).<init>(this);
        ((b)localObject3).c((f)localObject1);
        AppMethodBeat.o(20687);
        break;
        localObject3 = localc.field_mac;
        break label154;
        label472: if (this.mvy.indexOfKey(str.hashCode()) >= 0)
        {
          long l = ((Long)this.mvy.get(str.hashCode())).longValue();
          ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has checked this mac, now time - last check time = %d", new Object[] { Long.valueOf(bo.anU() - l) });
          if (bo.anU() - l <= 43200000L)
            break label566;
          bool = true;
          break label236;
        }
        ab.i("MicroMsg.FreeWifi.FreeWifiAuthManager", "has not checked this mac, try to check from server");
        bool = true;
        break label236;
      }
      label566: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.a
 * JD-Core Version:    0.6.2
 */