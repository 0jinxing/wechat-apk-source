package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

@Deprecated
public abstract class FreeWifiActivateNoAuthStateUI extends FreeWifiActivateStateUI
{
  private String gDC;
  private int mxP;
  private boolean mxQ;

  public void a(NetworkInfo.State paramState)
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "now network state : %s", new Object[] { paramState.toString() });
    if ((paramState == NetworkInfo.State.CONNECTED) && (d.MD(this.ssid)))
    {
      bzD();
      this.mxY = false;
      d.a(this.ssid, 2, getIntent());
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
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "it is authing now");
    while (true)
    {
      return;
      this.mxY = true;
      bzC();
      d.c(this.ssid, this.gDC, this.mxP, this.mxQ);
    }
  }

  protected int bzz()
  {
    int i = 2;
    if (d.MD(this.ssid))
      d.a(this.ssid, 2, getIntent());
    while (true)
    {
      return i;
      i = 1;
    }
  }

  public final void initView()
  {
    super.initView();
    this.mxV.setVisibility(0);
    setMMTitle(bzA());
  }

  public void onCreate(Bundle paramBundle)
  {
    this.mxP = getIntent().getIntExtra("free_wifi_encrypt_type", 0);
    this.gDC = getIntent().getStringExtra("free_wifi_passowrd");
    this.mxQ = getIntent().getBooleanExtra("free_wifi_hide_ssid", false);
    super.onCreate(paramBundle);
    d.a(this.ssid, 1, getIntent());
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateNoAuthStateUI", "Comes from webview, do auth");
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateNoAuthStateUI
 * JD-Core Version:    0.6.2
 */