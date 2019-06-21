package com.tencent.mm.plugin.exdevice.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dx;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public class ExdeviceWCLanSDKUtil$LanStateChangeReceiver extends BroadcastReceiver
{
  public ExdeviceWCLanSDKUtil$LanStateChangeReceiver(ExdeviceWCLanSDKUtil paramExdeviceWCLanSDKUtil)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(19289);
    if ("android.net.wifi.STATE_CHANGE".equals(paramIntent.getAction()))
    {
      paramContext = paramIntent.getParcelableExtra("networkInfo");
      if (paramContext != null)
        if (((NetworkInfo)paramContext).getState() != NetworkInfo.State.CONNECTED)
          break label126;
    }
    label126: for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "isConnected =".concat(String.valueOf(bool)));
      if ((this.ltn.ltk) || (this.ltn.ltj != bool))
      {
        paramContext = new dx();
        paramContext.cxw.cxx = bool;
        a.xxA.m(paramContext);
        this.ltn.ltk = false;
        this.ltn.ltj = bool;
      }
      AppMethodBeat.o(19289);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil.LanStateChangeReceiver
 * JD-Core Version:    0.6.2
 */