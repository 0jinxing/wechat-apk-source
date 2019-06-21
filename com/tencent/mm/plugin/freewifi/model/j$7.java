package com.tencent.mm.plugin.freewifi.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class j$7 extends n.a
{
  private byte[] ecf;

  j$7(j paramj)
  {
    AppMethodBeat.i(20743);
    this.ecf = new byte[0];
    AppMethodBeat.o(20743);
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(20744);
    synchronized (this.ecf)
    {
      if (!aw.RK())
      {
        ab.e("MicroMsg.FreeWifi.SubCoreFreeWifi", "account not ready");
        AppMethodBeat.o(20744);
      }
      while (true)
      {
        return;
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("onNetworkChange state=");
        ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", paramInt + ".(-1=NETWORK_UNKNOWN; 0=NETWORK_UNAVAILABLE; 1=NETWORK_CONNECTED; 2=GATEWAY_FAILED; 3=SERVER_FAILED; 4=CONNECTTING; 5=CONNECTED; 6=SERVER_DOWN)");
        Object localObject3 = (ConnectivityManager)ah.getContext().getSystemService("connectivity");
        if (localObject3 == null)
        {
          AppMethodBeat.o(20744);
        }
        else
        {
          localObject1 = ((ConnectivityManager)localObject3).getNetworkInfo(1);
          if (localObject1 != null)
          {
            ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "wifiNetwork:".concat(String.valueOf(localObject1)));
            ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " wifiNetwork.isAvailable()=%b,wifiNetwork.isConnected()=%b,wifiNetwork.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(((NetworkInfo)localObject1).isAvailable()), Boolean.valueOf(((NetworkInfo)localObject1).isConnected()), Boolean.valueOf(((NetworkInfo)localObject1).isConnectedOrConnecting()) });
          }
          localObject3 = ((ConnectivityManager)localObject3).getNetworkInfo(0);
          if (localObject3 != null)
          {
            ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", "mobileNetworkInfo", new Object[] { localObject3 });
            ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi.onNetworkChangeFreeWifi", " mobileNetworkInfo.isAvailable()=%b,mobileNetworkInfo.isConnected()=%b,mobileNetworkInfo.isConnectedOrConnecting()=%b", new Object[] { Boolean.valueOf(((NetworkInfo)localObject3).isAvailable()), Boolean.valueOf(((NetworkInfo)localObject3).isConnected()), Boolean.valueOf(((NetworkInfo)localObject3).isConnectedOrConnecting()) });
          }
          if ((6 != paramInt) && (4 != paramInt) && (paramInt != 0) && (-1 != paramInt) && (-9 != paramInt))
            break label334;
          if (((NetworkInfo)localObject1).isConnected())
            break;
          f.a.byS().byP();
          AppMethodBeat.o(20744);
        }
      }
      boolean bool = f.a.byS().S(m.Mx("MicroMsg.FreeWifi.SubCoreFreeWifi"), m.My("MicroMsg.FreeWifi.SubCoreFreeWifi"), m.Mz("MicroMsg.FreeWifi.SubCoreFreeWifi"));
      ab.i("MicroMsg.FreeWifi.SubCoreFreeWifi", "isWifiIndeedChanged=%b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        j.bzb().byF();
      label334: AppMethodBeat.o(20744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.j.7
 * JD-Core Version:    0.6.2
 */