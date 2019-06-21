package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.e.w;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.a;
import com.tencent.mm.plugin.freewifi.model.FreeWifiNetworkReceiver.b;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

@Deprecated
public abstract class FreeWifiStateUI extends MMActivity
  implements FreeWifiNetworkReceiver.a, FreeWifiNetworkReceiver.b
{
  protected String cBb;
  protected int cdf;
  protected String csB;
  protected String cuH;
  protected int cvd;
  private int cxs = 1;
  private final com.tencent.mm.at.a.a.c fGS;
  protected String jUg;
  protected String mAa;
  protected String mAb;
  protected String mwH;
  protected String mxW;
  protected FreeWifiNetworkReceiver mxX;
  protected boolean mxY = false;
  private TextView myB;
  private ImageView myQ;
  private TextView myR;
  private TextView myS;
  private Button myT;
  private Button myU;
  protected String myX;
  protected String myY;
  protected String myZ;
  private ap mya = new ap(new FreeWifiStateUI.1(this), false);
  private ap myb = new ap(new FreeWifiStateUI.2(this), true);
  private k.a myc;
  private p mzU = null;
  protected int mzZ;
  protected String mza;
  protected String signature;
  protected String ssid;

  public FreeWifiStateUI()
  {
    c.a locala = new c.a();
    locala.ePF = true;
    locala.ePG = true;
    locala.ePT = 2130838837;
    locala.eQf = true;
    locala.eQg = 0.0F;
    this.fGS = locala.ahG();
    this.myc = new FreeWifiStateUI.3(this);
  }

  private void bzE()
  {
    this.mxX = new FreeWifiNetworkReceiver();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    registerReceiver(this.mxX, localIntentFilter);
  }

  private void goBack()
  {
    l.x(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.gkE.h(localIntent, this);
    finish();
  }

  public abstract void a(NetworkInfo.State paramState);

  protected abstract void aqU();

  protected final void bzB()
  {
    if (this.mxX != null)
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister wifi state change receiver");
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
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now unregister network changed receiver");
      this.mxX.mvY = null;
    }
  }

  protected final void bzF()
  {
    if (!com.tencent.mm.plugin.freewifi.model.d.isWifiEnabled())
    {
      this.mya.ae(60000L, 60000L);
      this.myb.ae(1000L, 1000L);
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "wifi is not enable, enable it");
      j.byZ().byI().post(new FreeWifiStateUI.7(this));
    }
    while (true)
    {
      return;
      this.cxs = bzz();
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now before connect, the connect state : %d", new Object[] { Integer.valueOf(this.cxs) });
      if (this.cxs != 2)
      {
        if (m.X(getIntent()) == 4)
          this.mya.ae(30000L, 30000L);
        while (true)
        {
          this.myb.ae(1000L, 1000L);
          if (!com.tencent.mm.plugin.freewifi.model.d.MD(this.ssid))
            break label237;
          ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "start auth now, isAuting : %b", new Object[] { Boolean.valueOf(this.mxY) });
          if (!this.mxY)
            break label199;
          ab.d("MicroMsg.FreeWifi.FreeWifiStateUI", "now it is authing");
          break;
          this.mya.ae(60000L, 60000L);
        }
        label199: this.mya.ae(60000L, 60000L);
        this.myb.ae(1000L, 1000L);
        aqU();
        this.mxY = true;
        continue;
        label237: j.byZ().byI().post(new FreeWifiStateUI.8(this));
      }
      else
      {
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, this.cxs, getIntent());
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
    return 2130969591;
  }

  public void initView()
  {
    setBackBtn(new FreeWifiStateUI.4(this));
    if (getIntent().getIntExtra("free_wifi_protocol_type", 0) == 1)
      findViewById(2131824137).setVisibility(0);
    this.myQ = ((ImageView)findViewById(2131824129));
    this.myR = ((TextView)findViewById(2131824130));
    this.myS = ((TextView)findViewById(2131824131));
    this.myB = ((TextView)findViewById(2131824132));
    this.myT = ((Button)findViewById(2131824135));
    this.myT.setOnClickListener(new FreeWifiStateUI.5(this));
    this.myU = ((Button)findViewById(2131824136));
    this.myU.setOnClickListener(new FreeWifiStateUI.6(this));
    if (bo.isNullOrNil(this.ssid))
    {
      this.myS.setText(getString(2131300076));
      this.myT.setVisibility(4);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.cuH = getIntent().getStringExtra("free_wifi_ap_key");
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.mxW = getIntent().getStringExtra("free_wifi_mid");
    this.jUg = getIntent().getStringExtra("free_wifi_url");
    this.cvd = getIntent().getIntExtra("free_wifi_source", 1);
    this.cdf = getIntent().getIntExtra("free_wifi_channel_id", 0);
    this.csB = getIntent().getStringExtra("free_wifi_appid");
    this.myX = getIntent().getStringExtra("free_wifi_head_img_url");
    this.myY = getIntent().getStringExtra("free_wifi_welcome_msg");
    this.myZ = getIntent().getStringExtra("free_wifi_welcome_sub_title");
    this.mza = getIntent().getStringExtra("free_wifi_privacy_url");
    this.mwH = getIntent().getStringExtra("free_wifi_app_nickname");
    switch (this.cvd)
    {
    default:
      if (bo.isNullOrNil(this.ssid))
        ab.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      break;
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    case 6:
      while (true)
      {
        label234: initView();
        j.byW().c(this.myc);
        l.v(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
        return;
        paramBundle = j.byW().bzx();
        if (paramBundle != null)
        {
          this.ssid = paramBundle.field_ssid;
          this.mxW = paramBundle.field_mid;
          this.jUg = paramBundle.field_url;
          ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "source from mainui banner, ssid : %s, mid : %s, url : %s", new Object[] { this.ssid, this.mxW, this.jUg });
          break;
        }
        ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "there is no connect sucessfull wifi info");
        break;
        if (!bo.isNullOrNil(this.ssid))
          break label377;
        ab.e("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid is null");
      }
      label377: paramBundle = j.byW().ML(this.ssid);
      if (paramBundle == null)
      {
        paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
        paramBundle.field_ssidmd5 = ag.ck(this.ssid);
        paramBundle.field_ssid = this.ssid;
      }
      break;
    }
    for (int i = 1; ; i = 0)
    {
      paramBundle.field_url = this.jUg;
      paramBundle.field_mid = this.mxW;
      paramBundle.field_wifiType = getIntent().getIntExtra("free_wifi_auth_type", 2);
      paramBundle.field_connectState = 1;
      if (i != 0)
      {
        j.byW().b(paramBundle);
        break;
      }
      j.byW().c(paramBundle, new String[0]);
      break;
      ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.mxW, Integer.valueOf(this.cvd) });
      break label234;
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

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void uQ(int paramInt)
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "Current connection state : %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      if (this.mzU != null)
        this.mzU.dismiss();
      this.myB.setVisibility(4);
      this.myT.setText(2131298435);
      if (this.cvd == 3)
        this.myS.setText(getString(2131301435, new Object[] { this.ssid }));
      break;
    case -1:
    case 4:
    case 3:
    case 2:
    case 1:
    case -2014:
    }
    while (true)
    {
      if (!bo.isNullOrNil(this.csB))
      {
        if (!bo.isNullOrNil(this.myY))
          this.myR.setText(this.myY);
        if (!bo.isNullOrNil(this.myX))
          o.ahp().a(this.myX, this.myQ, this.fGS);
      }
      while (true)
      {
        return;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mya.stopTimer();
        this.myb.stopTimer();
        this.mxY = false;
        this.myB.setVisibility(4);
        this.myT.setText(2131298435);
        if ((m.Y(getIntent()) == 10) && (!m.isEmpty(com.tencent.mm.compatible.e.q.eth.etR)) && (!m.isEmpty(com.tencent.mm.compatible.e.q.bB(this.mController.ylL))))
          this.myT.setText(String.format(getString(2131300035), new Object[] { com.tencent.mm.compatible.e.q.bB(this.mController.ylL) }));
        if (this.cvd == 3)
          this.myS.setText(getString(2131301435, new Object[] { this.ssid }));
        while (true)
        {
          if (bo.isNullOrNil(this.csB))
            break label464;
          if (!bo.isNullOrNil(this.myY))
            this.myR.setText(this.myY);
          if (bo.isNullOrNil(this.myX))
            break;
          o.ahp().a(this.myX, this.myQ, this.fGS);
          break;
          if (bo.isNullOrNil(this.myZ))
            this.myS.setText(getString(2131298431));
          else
            this.myS.setText(this.myZ);
        }
        label464: continue;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mya.stopTimer();
        this.myb.stopTimer();
        this.myB.setVisibility(0);
        this.myT.setText(2131300074);
        continue;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mya.stopTimer();
        this.myb.stopTimer();
        this.myT.setText(2131298429);
        this.myT.setClickable(false);
        Intent localIntent = getIntent();
        localIntent.putExtra("free_wifi_appid", this.csB);
        localIntent.putExtra("free_wifi_app_nickname", this.mwH);
        localIntent.putExtra("free_wifi_app_username", this.cBb);
        localIntent.putExtra("free_wifi_signature", this.signature);
        localIntent.putExtra("free_wifi_finish_actioncode", this.mzZ);
        localIntent.putExtra("free_wifi_finish_url", this.mAa);
        if (bo.isNullOrNil(this.mAb))
          localIntent.setClass(this, FreeWifiSuccUI.class);
        while (true)
        {
          finish();
          startActivity(localIntent);
          d.IF();
          break;
          localIntent.putExtra("free_wifi_qinghuai_url", this.mAb);
          localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
        }
        this.myB.setVisibility(4);
        this.myT.setText(2131298432);
        this.mzU = h.b(this.mController.ylL, getString(2131298432), true, new FreeWifiStateUI.9(this));
        continue;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mya.stopTimer();
        this.myb.stopTimer();
        this.myB.setVisibility(0);
        this.myT.setText(2131300074);
      }
      if (bo.isNullOrNil(this.myZ))
        this.myS.setText(getString(2131298431));
      else
        this.myS.setText(this.myZ);
    }
  }

  public final void vS(int paramInt)
  {
    ab.i("MicroMsg.FreeWifi.FreeWifiStateUI", "now wifi state : %d", new Object[] { Integer.valueOf(paramInt) });
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
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI
 * JD-Core Version:    0.6.2
 */