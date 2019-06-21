package com.tencent.mm.plugin.freewifi.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f
{
  private f.b mvM;

  public final boolean S(String paramString1, String paramString2, String paramString3)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(20722);
        if (bo.Q(new String[] { paramString1, paramString2, paramString3 }))
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "WifiInfo got Currently is null. Cannot compared with last WifiInfo.");
          AppMethodBeat.o(20722);
          return bool;
        }
        if (this.mvM != null)
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory : ssid=%s, bssid=%s ", new Object[] { this.mvM.mvO, this.mvM.mvP });
          if ((!m.Mv(paramString1).equals(this.mvM.mvO)) || (!paramString2.equalsIgnoreCase(this.mvM.mvP)))
            break label141;
          AppMethodBeat.o(20722);
          continue;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory is null.");
      label141: f.b localb = new com/tencent/mm/plugin/freewifi/model/f$b;
      localb.<init>(m.Mv(paramString1), paramString2, paramString3, System.currentTimeMillis(), (byte)0);
      this.mvM = localb;
      ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "new WifiInfo stored in memmory : ssid=%s, bssid=%s ", new Object[] { this.mvM.mvO, this.mvM.mvP });
      AppMethodBeat.o(20722);
      bool = true;
    }
  }

  public final void byP()
  {
    try
    {
      AppMethodBeat.i(20721);
      if (this.mvM != null)
        ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory : ssid=%s, bssid=%s ", new Object[] { this.mvM.mvO, this.mvM.mvP });
      while (true)
      {
        this.mvM = null;
        ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "new WifiInfo stored in memmory is null.");
        AppMethodBeat.o(20721);
        return;
        ab.i("MicroMsg.FreeWifi.FreeWifiNetChangeManager.onNetworkChangeFreeWifi", "last WifiInfo stored in memmory is null.");
      }
    }
    finally
    {
    }
  }

  public final f.b byQ()
  {
    try
    {
      f.b localb = this.mvM;
      return localb;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void byR()
  {
    try
    {
      AppMethodBeat.i(20723);
      f.b localb1;
      f.b localb2;
      if (this.mvM != null)
      {
        localb1 = this.mvM;
        if (!localb1.mvR)
          break label43;
        localb2 = localb1;
      }
      while (true)
      {
        this.mvM = localb2;
        AppMethodBeat.o(20723);
        return;
        label43: localb2 = new com/tencent/mm/plugin/freewifi/model/f$b;
        localb2.<init>(localb1.mvO, localb1.mvP, localb1.mvQ, localb1.mvE);
        localb2.mvR = true;
      }
    }
    finally
    {
    }
  }

  public static final class a
  {
    private static f mvN;

    static
    {
      AppMethodBeat.i(20719);
      mvN = new f((byte)0);
      AppMethodBeat.o(20719);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.f
 * JD-Core Version:    0.6.2
 */