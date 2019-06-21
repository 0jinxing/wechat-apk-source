package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

@Deprecated
public abstract class FreeWifiActivateStateUI extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected int cdf;
  protected int cvd;
  private int cxs = 1;
  protected String jUg;
  private FreeWifiStateView mxR;
  private TextView mxS;
  private TextView mxT;
  private Button mxU;
  protected Button mxV;
  protected String mxW;
  protected FreeWifiNetworkReceiver mxX;
  protected boolean mxY = false;
  private boolean mxZ = false;
  private ap mya = new ap(new FreeWifiActivateStateUI.1(this), false);
  private ap myb = new ap(new FreeWifiActivateStateUI.2(this), true);
  private k.a myc = new FreeWifiActivateStateUI.3(this);
  protected String ssid;

  private void bzE()
  {
    this.mxX = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.mxX, localIntentFilter);
  }

  private void bzG()
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.mxY) });
    if (this.mxY)
      ab.d("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now it is authing");
    while (true)
    {
      return;
      this.mya.ae(60000L, 60000L);
      this.myb.ae(1000L, 1000L);
      aqU();
      this.mxY = true;
    }
  }

  private void goBack()
  {
    finish();
    if (getIntent().getBooleanExtra("free_wifi_jump_to_main_ui", false))
    {
      Intent localIntent = new Intent();
      g.gkE.h(localIntent, this);
    }
  }

  protected abstract void aqU();

  protected final void bzB()
  {
    if (this.mxX != null)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister wifi state change receiver");
      this.mxX.mvX = null;
    }
  }

  protected final void bzC()
  {
    if (this.mxX == null)
      bzE();
    this.mxX.mvY = this;
  }

  protected final void bzD()
  {
    if (this.mxX != null)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now unregister network changed receiver");
      this.mxX.mvY = null;
    }
  }

  protected final void bzF()
  {
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.mya.ae(60000L, 60000L);
      this.myb.ae(1000L, 1000L);
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "wifi is not enable, enable it");
      j.byZ().byI().post(new FreeWifiActivateStateUI.7(this));
    }
    while (true)
    {
      return;
      this.cxs = bzz();
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.cxs) });
      if (this.cxs != 2)
      {
        this.mya.ae(60000L, 60000L);
        this.myb.ae(1000L, 1000L);
        if (com.tencent.mm.plugin.freewifi.model.d.MD(this.ssid))
          bzG();
        else
          j.byZ().byI().post(new FreeWifiActivateStateUI.8(this));
      }
      else
      {
        uQ(this.cxs);
      }
    }
  }

  protected abstract void bzy();

  protected abstract int bzz();

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969598;
  }

  public void initView()
  {
    setBackBtn(new FreeWifiActivateStateUI.4(this));
    this.mxR = ((FreeWifiStateView)findViewById(2131824153));
    this.mxS = ((TextView)findViewById(2131824154));
    this.mxT = ((TextView)findViewById(2131824155));
    if (this.cvd == 3)
      this.mxT.setText(getString(2131301435, new Object[] { this.ssid }));
    while (true)
    {
      this.mxU = ((Button)findViewById(2131824156));
      this.mxU.setOnClickListener(new FreeWifiActivateStateUI.5(this));
      this.mxV = ((Button)findViewById(2131824143));
      this.mxV.setOnClickListener(new FreeWifiActivateStateUI.6(this));
      return;
      this.mxT.setText(getString(2131298433, new Object[] { this.ssid }));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.mxW = getIntent().getStringExtra("free_wifi_mid");
    this.jUg = getIntent().getStringExtra("free_wifi_url");
    this.cvd = getIntent().getIntExtra("free_wifi_source", 1);
    this.cdf = getIntent().getIntExtra("free_wifi_channel_id", 0);
    switch (this.cvd)
    {
    default:
      if (bo.isNullOrNil(this.ssid))
        ab.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      break;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
      while (true)
      {
        label134: initView();
        j.byW().c(this.myc);
        return;
        paramBundle = j.byW().bzx();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.mxW = paramBundle.field_mid;
          this.jUg = paramBundle.field_url;
          ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.mxW, this.jUg });
          break;
        }
        ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bo.isNullOrNil(this.ssid))
          break label252;
        ab.e("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid is null");
      }
      label252: paramBundle = j.byW().ML(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = ag.ck(this.ssid);
        paramBundle.field_ssid = this.ssid;
        paramBundle.field_connectState = 1;
      }
      break;
    }
    for (int i = 1; ; i = 0)
    {
      paramBundle.field_url = this.jUg;
      paramBundle.field_mid = this.mxW;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      if (i != 0)
      {
        j.byW().b(paramBundle);
        break;
      }
      j.byW().c(paramBundle, new String[0]);
      break;
      ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.mxW, Integer.valueOf(this.cvd) });
      break label134;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    j.byW().d(this.myc);
    bzB();
    bzD();
    if (this.mxX != null)
      unregisterReceiver(this.mxX);
    this.mya.stopTimer();
    this.myb.stopTimer();
    j.byZ().release();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
      goBack();
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  public void onResume()
  {
    super.onResume();
    if (!bo.isNullOrNil(this.ssid))
      bzF();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void uQ(int paramInt)
  {
    this.mxR.setOnClickListener(null);
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      this.mxR.setImageResource(2130838849);
      this.mxS.setText(2131298430);
      if (this.cvd == 3)
        this.mxT.setText(getString(2131301435, new Object[] { this.ssid }));
      break;
    case 3:
    case 2:
    case 1:
    case -2014:
    }
    while (true)
    {
      this.mxU.setVisibility(8);
      while (true)
      {
        return;
        this.mxR.setImageResource(2130838849);
        this.mxR.setState(3);
        this.mxR.lAB = 2;
        this.mxS.setText(2131298434);
        this.mxU.setVisibility(0);
        this.mxU.setText(2131300074);
        this.mya.stopTimer();
        this.myb.stopTimer();
        continue;
        this.mxR.setImageResource(2130838847);
        this.mxR.setState(2);
        this.mxS.setText(2131298429);
        this.mxU.setVisibility(0);
        this.mxU.setText(2131300032);
        this.mya.stopTimer();
        this.myb.stopTimer();
        if ((this.cvd == 1) || (this.cvd == 5) || (this.cvd == 4))
        {
          this.mxU.setVisibility(4);
          com.tencent.mm.plugin.freewifi.g.c localc = j.byW().ML(this.ssid);
          if ((localc != null) && (!bo.isNullOrNil(localc.field_showUrl)) && (!this.mxZ))
          {
            this.mxZ = true;
            al.n(new FreeWifiActivateStateUI.9(this, localc), 1000L);
          }
        }
        d.IF();
      }
      this.mxR.setImageResource(2130838849);
      this.mxR.setState(1);
      this.mxS.setText(2131298430);
      continue;
      this.mya.stopTimer();
      this.myb.stopTimer();
      this.mxR.setImageResource(2130838848);
      this.mxR.setState(3);
      this.mxS.setText(2131300060);
      this.mxS.setVisibility(0);
      this.mxT.setText(2131300061);
      this.mxT.setVisibility(0);
      continue;
      this.mxT.setText(getString(2131298433, new Object[] { this.ssid }));
    }
  }

  public final void vS(int paramInt)
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiActivateStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    case 0:
    case 1:
    case 2:
    default:
    case 3:
    }
    while (true)
    {
      return;
      bzB();
      bzF();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI
 * JD-Core Version:    0.6.2
 */