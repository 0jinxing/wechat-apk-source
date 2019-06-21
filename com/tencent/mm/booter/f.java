package com.tencent.mm.booter;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public final class f
{
  NetworkInfo ebY = null;
  private String ebZ = "";
  private String eca = "";
  private int ecb = -1;

  final boolean Il()
  {
    AppMethodBeat.i(57779);
    try
    {
      Object localObject1 = (ConnectivityManager)aa.getContext().getSystemService("connectivity");
      boolean bool;
      if (localObject1 == null)
      {
        ab.w("MicroMsg.NetworkChangeMgr", "can't get ConnectivityManager");
        this.ebY = null;
        AppMethodBeat.o(57779);
        bool = false;
      }
      while (true)
      {
        return bool;
        Object localObject2;
        int i;
        try
        {
          localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
          if (localObject1 == null)
          {
            ab.w("MicroMsg.NetworkChangeMgr", "ActiveNetwork is null, has no network");
            this.ebY = null;
            AppMethodBeat.o(57779);
            bool = false;
          }
        }
        catch (Exception localException1)
        {
          while (true)
          {
            ab.e("MicroMsg.NetworkChangeMgr", "getActiveNetworkInfo failed.");
            localObject2 = null;
          }
          if (localObject2.getType() == 1);
          for (i = 1; ; i = 0)
          {
            if (i == 0)
              break label339;
            localWifiInfo = at.getWifiInfo(ah.getContext());
            if ((localWifiInfo == null) || (!this.eca.equals(localWifiInfo.getBSSID())) || (!this.ebZ.equals(at.gE(ah.getContext()))) || (this.ecb != localWifiInfo.getNetworkId()))
              break label178;
            ab.w("MicroMsg.NetworkChangeMgr", "Same Wifi, do not NetworkChanged");
            AppMethodBeat.o(57779);
            bool = false;
            break;
          }
          label178: ab.d("MicroMsg.NetworkChangeMgr", "New Wifi Info:%s %s %s", new Object[] { localWifiInfo.getBSSID(), at.gE(ah.getContext()), Integer.valueOf(localWifiInfo.getNetworkId()) });
          ab.d("MicroMsg.NetworkChangeMgr", "OldWifi Info:%s %s %s", new Object[] { this.eca, this.ebZ, Integer.valueOf(this.ecb) });
        }
        if (i == 0)
        {
          ab.d("MicroMsg.NetworkChangeMgr", "New NetworkInfo:%s", new Object[] { localObject2 });
          if (this.ebY != null)
            ab.d("MicroMsg.NetworkChangeMgr", "Old NetworkInfo:%s", new Object[] { this.ebY });
        }
        this.ebY = localObject2;
        this.eca = localWifiInfo.getBSSID();
        this.ebZ = at.gE(ah.getContext());
        this.ecb = localWifiInfo.getNetworkId();
        AppMethodBeat.o(57779);
        bool = true;
        continue;
        label339: if ((this.ebY != null) && (this.ebY.getExtraInfo() != null) && (localObject2.getExtraInfo() != null) && (this.ebY.getExtraInfo().equals(localObject2.getExtraInfo())) && (this.ebY.getSubtype() == localObject2.getSubtype()) && (this.ebY.getType() == localObject2.getType()))
        {
          ab.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
          AppMethodBeat.o(57779);
          bool = false;
        }
        else
        {
          if ((this.ebY == null) || (this.ebY.getExtraInfo() != null) || (localObject2.getExtraInfo() != null) || (this.ebY.getSubtype() != localObject2.getSubtype()) || (this.ebY.getType() != localObject2.getType()))
            break;
          ab.w("MicroMsg.NetworkChangeMgr", "Same Network, do not NetworkChanged");
          AppMethodBeat.o(57779);
          bool = false;
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetworkChangeMgr", localException2, "", new Object[0]);
        continue;
        WifiInfo localWifiInfo = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.f
 * JD-Core Version:    0.6.2
 */