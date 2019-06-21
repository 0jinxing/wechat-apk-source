package com.tencent.pb.common.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.pb.common.c.c;
import com.tencent.pb.common.c.d;

public final class g
{
  private WifiInfo Amk = null;
  private int Aml = 1;
  private NetworkInfo ebY = null;

  public final boolean Il()
  {
    Object localObject1 = null;
    try
    {
      localObject3 = (ConnectivityManager)d.sZj.getSystemService("connectivity");
      if (localObject3 == null)
      {
        c.w("NetworkChangeMgr", new Object[] { "can't get ConnectivityManager" });
        this.Aml = 1;
        this.Amk = null;
        this.ebY = null;
        bool = true;
      }
      while (true)
      {
        return bool;
        localObject3 = ((ConnectivityManager)localObject3).getActiveNetworkInfo();
        if (localObject3 == null)
        {
          this.Aml = 1;
          this.Amk = null;
          this.ebY = null;
          bool = true;
        }
        else
        {
          c.d("NetworkChangeMgr", new Object[] { "NetworkChangeMgr ", localObject3 });
          if (((NetworkInfo)localObject3).isConnected())
            break;
          i = 1;
          if (i != this.Aml)
            break label431;
          if (i != 1)
            break label217;
          bool = false;
          this.Aml = i;
          this.Amk = localObject1;
          this.ebY = ((NetworkInfo)localObject3);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject3;
        int i;
        c.w("NetworkChangeMgr", new Object[] { localException });
        this.Aml = 1;
        this.Amk = null;
        this.ebY = null;
        boolean bool = true;
        continue;
        WifiInfo localWifiInfo;
        label431: if (((NetworkInfo)localObject3).getType() == 1)
        {
          localWifiInfo = ((WifiManager)d.sZj.getSystemService("wifi")).getConnectionInfo();
          i = 2;
        }
        else
        {
          i = 3;
          continue;
          label217: if (i == 2)
          {
            if ((localWifiInfo != null) && (this.Amk != null) && (this.Amk.getBSSID().equals(localWifiInfo.getBSSID())) && (this.Amk.getSSID().equals(localWifiInfo.getSSID())) && (this.Amk.getNetworkId() == localWifiInfo.getNetworkId()))
              bool = false;
            else
              bool = true;
          }
          else if ((this.ebY != null) && (this.ebY.getExtraInfo() != null) && (((NetworkInfo)localObject3).getExtraInfo() != null) && (this.ebY.getExtraInfo().equals(((NetworkInfo)localObject3).getExtraInfo())) && (this.ebY.getSubtype() == ((NetworkInfo)localObject3).getSubtype()) && (this.ebY.getType() == ((NetworkInfo)localObject3).getType()))
          {
            bool = false;
          }
          else if ((this.ebY != null) && (this.ebY.getExtraInfo() == null) && (((NetworkInfo)localObject3).getExtraInfo() == null) && (this.ebY.getSubtype() == ((NetworkInfo)localObject3).getSubtype()))
          {
            int j = this.ebY.getType();
            int k = ((NetworkInfo)localObject3).getType();
            if (j == k)
              bool = false;
          }
          else
          {
            bool = true;
          }
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.pb.common.b.g
 * JD-Core Version:    0.6.2
 */