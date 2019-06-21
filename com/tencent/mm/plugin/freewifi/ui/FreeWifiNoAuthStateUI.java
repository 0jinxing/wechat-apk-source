package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

@Deprecated
public abstract class FreeWifiNoAuthStateUI extends FreeWifiStateUI
{
  private String gDC;
  private int mxP;
  private boolean mxQ;
  private boolean myf = true;

  public void a(NetworkInfo.State paramState)
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (com.tencent.mm.plugin.freewifi.model.d.MD(this.ssid)))
    {
      bzD();
      this.mxY = false;
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
    }
  }

  protected final void aqU()
  {
    bzy();
  }

  protected abstract String bzA();

  protected final void bzy()
  {
    if (this.mxY)
      ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "it is authing now");
    while (true)
    {
      return;
      this.mxY = true;
      bzC();
      int i = com.tencent.mm.plugin.freewifi.model.d.c(this.ssid, this.gDC, this.mxP, this.mxQ);
      k.a locala = k.byo();
      locala.ssid = this.ssid;
      locala.cuH = this.cuH;
      locala.kBq = m.V(getIntent());
      locala.mue = m.X(getIntent());
      locala.muf = k.b.muq.muQ;
      locala.mug = k.b.muq.name;
      locala.result = i;
      locala.cIb = m.Y(getIntent());
      locala.mud = this.csB;
      locala.muh = this.cBb;
      locala.byq().byp();
    }
  }

  protected int bzz()
  {
    int i = 2;
    if (com.tencent.mm.plugin.freewifi.model.d.MD(this.ssid))
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
    while (true)
    {
      return i;
      i = 1;
    }
  }

  public final void initView()
  {
    super.initView();
    setMMTitle(bzA());
  }

  public void onCreate(Bundle paramBundle)
  {
    this.mxP = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.gDC = getIntent().getStringExtra("free_wifi_passowrd");
    this.mxQ = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
    ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "Comes from webview, do auth");
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
      ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
    while (true)
    {
      return;
      ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default:
        break;
      case 77:
        if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
        {
          this.myf = false;
          h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new FreeWifiNoAuthStateUI.2(this), new FreeWifiNoAuthStateUI.3(this));
        }
        break;
      }
    }
  }

  public void onResume()
  {
    int i = 0;
    super.onResume();
    int j;
    if (this.myf)
    {
      boolean bool = b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 77, null, null);
      ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "summerper checkPermission checkLocation [%b]", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
        j = i;
    }
    while (true)
    {
      if (j == 0)
        ab.i("MicroMsg.FreeWifi.FreeWifiNoAuthStateUI", "check permission not passed!");
      return;
      j = i;
      if (b.o(this, "android.permission.ACCESS_COARSE_LOCATION"))
        if (!com.tencent.mm.modelgeo.d.agA())
        {
          h.a(this, getString(2131300421), getString(2131297061), getString(2131300878), getString(2131296868), false, new FreeWifiNoAuthStateUI.1(this), null);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiNoAuthStateUI
 * JD-Core Version:    0.6.2
 */