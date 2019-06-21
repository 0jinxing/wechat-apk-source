package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.a;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

@Deprecated
public class FreeWifiAuthStateUI extends FreeWifiStateUI
{
  private boolean myf = true;

  public final void a(NetworkInfo.State paramState)
  {
    AppMethodBeat.i(20915);
    ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (com.tencent.mm.plugin.freewifi.model.d.MD(this.ssid)))
    {
      bzD();
      bzF();
    }
    AppMethodBeat.o(20915);
  }

  protected final void aqU()
  {
    AppMethodBeat.i(20916);
    j.bzb().a(this.ssid, new FreeWifiAuthStateUI.1(this), this.cdf, getIntent());
    AppMethodBeat.o(20916);
  }

  protected final void bzy()
  {
    AppMethodBeat.i(20918);
    bzC();
    com.tencent.mm.plugin.freewifi.model.d.ME(this.ssid);
    AppMethodBeat.o(20918);
  }

  protected final int bzz()
  {
    AppMethodBeat.i(20919);
    j.byV();
    int i = com.tencent.mm.plugin.freewifi.model.d.MC(this.ssid);
    AppMethodBeat.o(20919);
    return i;
  }

  public final void initView()
  {
    AppMethodBeat.i(20912);
    super.initView();
    setMMTitle(2131300078);
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
    AppMethodBeat.o(20912);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20911);
    super.onCreate(paramBundle);
    AppMethodBeat.o(20911);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(20914);
    super.onDestroy();
    AppMethodBeat.o(20914);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(20917);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(20917);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      if (paramArrayOfInt.length != 0)
        break;
      AppMethodBeat.o(20917);
    }
    switch (paramInt)
    {
    default:
    case 64:
    }
    while (true)
    {
      AppMethodBeat.o(20917);
      break;
      if (paramArrayOfInt[0] != 0)
        this.myf = false;
    }
  }

  public void onResume()
  {
    int i = 0;
    AppMethodBeat.i(20913);
    super.onResume();
    int j;
    if (this.myf)
    {
      boolean bool = b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 77, null, null);
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "summerper checkPermission checkLocation [%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        j = i;
    }
    while (true)
    {
      if (j == 0)
        ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "check permission not passed!");
      ab.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now it is from qrcode, try to auth");
      AppMethodBeat.o(20913);
      return;
      j = i;
      if (b.o(this, "android.permission.ACCESS_COARSE_LOCATION"))
        if (!com.tencent.mm.modelgeo.d.agA())
        {
          h.a(this, getString(2131300421), getString(2131297061), getString(2131300878), getString(2131296868), false, new FreeWifiAuthStateUI.2(this), null);
          j = i;
        }
        else
        {
          j = 1;
        }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiAuthStateUI
 * JD-Core Version:    0.6.2
 */