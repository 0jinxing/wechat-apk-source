package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.l;
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
import com.tencent.mm.ui.q;

@Deprecated
public class ProtocolThreeThreeUI extends MMActivity
{
  protected String appId;
  protected String bssid;
  protected String cBb;
  protected int cdf;
  protected String cvO;
  protected int cvd;
  private int cxs;
  protected String mAa;
  protected String mAb;
  private ap mAw;
  protected String mwH;
  private int mwR;
  protected String mwU;
  protected String mwV;
  protected String mwW;
  private Uri mwX;
  private String mwY;
  private TextView myB;
  private ImageView myQ;
  private TextView myR;
  private TextView myS;
  private Button myT;
  private Button myU;
  private k.a myc;
  private p mzU;
  protected int mzZ;
  protected String sign;
  protected String signature;
  protected String ssid;

  public ProtocolThreeThreeUI()
  {
    AppMethodBeat.i(21160);
    this.cxs = 1;
    this.mwR = 0;
    this.mAw = new ap(new ProtocolThreeThreeUI.1(this), false);
    AppMethodBeat.o(21160);
  }

  private void goBack()
  {
    AppMethodBeat.i(21166);
    l.x(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.gkE.h(localIntent, this);
    finish();
    AppMethodBeat.o(21166);
  }

  protected final int bzz()
  {
    int i = 0;
    AppMethodBeat.i(21167);
    if (bo.isNullOrNil(this.ssid))
    {
      ab.d("MicroMsg.FreeWifi.Protocol33UI", "Illegal SSID");
      AppMethodBeat.o(21167);
    }
    while (true)
    {
      return i;
      com.tencent.mm.plugin.freewifi.g.c localc = j.byW().ML(this.ssid);
      if ((localc != null) && (localc.field_ssid.equalsIgnoreCase(this.ssid)))
      {
        i = localc.field_connectState;
        AppMethodBeat.o(21167);
      }
      else
      {
        AppMethodBeat.o(21167);
      }
    }
  }

  protected final void connect()
  {
    AppMethodBeat.i(21163);
    if (com.tencent.mm.plugin.freewifi.m.isEmpty(this.ssid))
    {
      ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=it cannot get ssid, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
      AppMethodBeat.o(21163);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.freewifi.m.isEmpty(this.mwV))
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, desc=authurl is empty, so it fails. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 3, getIntent());
        AppMethodBeat.o(21163);
      }
      else
      {
        this.cxs = bzz();
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())), com.tencent.mm.plugin.freewifi.model.d.vR(this.cxs) });
        if (this.cxs != 2)
        {
          this.mAw.ae(30000L, 30000L);
          ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())), Integer.valueOf(60) });
          com.tencent.mm.plugin.freewifi.m.isEmpty(this.mwV);
          Object localObject = new StringBuilder(this.mwV);
          if (this.mwV.indexOf("?") == -1)
            ((StringBuilder)localObject).append("?extend=").append(this.mwW);
          while (true)
          {
            localObject = ((StringBuilder)localObject).toString();
            j.byZ().byI().post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(21154);
                ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(ProtocolThreeThreeUI.this.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(ProtocolThreeThreeUI.this.getIntent())), this.val$url });
                a.byw();
                a.a(this.val$url, new ProtocolThreeThreeUI.6.1(this));
                AppMethodBeat.o(21154);
              }
            });
            AppMethodBeat.o(21163);
            break;
            ((StringBuilder)localObject).append("&extend=").append(this.mwW);
          }
        }
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
        AppMethodBeat.o(21163);
      }
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969591;
  }

  public final void initView()
  {
    AppMethodBeat.i(21162);
    this.ssid = com.tencent.mm.plugin.freewifi.m.Mx("MicroMsg.FreeWifi.Protocol33UI");
    this.bssid = com.tencent.mm.plugin.freewifi.m.My("MicroMsg.FreeWifi.Protocol33UI");
    this.cvd = getIntent().getIntExtra("free_wifi_source", 1);
    this.cdf = getIntent().getIntExtra("free_wifi_channel_id", 0);
    setBackBtn(new ProtocolThreeThreeUI.2(this));
    findViewById(2131824137).setVisibility(0);
    this.myQ = ((ImageView)findViewById(2131824129));
    this.myR = ((TextView)findViewById(2131824130));
    this.myS = ((TextView)findViewById(2131824131));
    this.myB = ((TextView)findViewById(2131824132));
    this.myT = ((Button)findViewById(2131824135));
    this.myT.setOnClickListener(new ProtocolThreeThreeUI.3(this));
    this.myU = ((Button)findViewById(2131824136));
    this.myU.setOnClickListener(new ProtocolThreeThreeUI.4(this));
    if (bo.isNullOrNil(this.ssid))
    {
      this.myS.setText(getString(2131300076));
      this.myT.setVisibility(4);
    }
    setMMTitle(getString(2131300078));
    AppMethodBeat.o(21162);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21161);
    super.onCreate(paramBundle);
    this.mwY = getIntent().getStringExtra("free_wifi_schema_uri");
    this.mwX = Uri.parse(this.mwY);
    this.appId = this.mwX.getQueryParameter("appId");
    this.mwU = this.mwX.getQueryParameter("shopId");
    this.mwV = this.mwX.getQueryParameter("authUrl");
    this.mwW = this.mwX.getQueryParameter("extend");
    this.cvO = this.mwX.getQueryParameter("timestamp");
    this.sign = this.mwX.getQueryParameter("sign");
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onCreate, desc=it goes into Protocol33 connect frontpage. uri = %s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())), this.mwY });
    initView();
    if (bo.isNullOrNil(this.ssid))
    {
      ab.e("MicroMsg.FreeWifi.Protocol33UI", "ssid is null");
      l.v(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      AppMethodBeat.o(21161);
      return;
    }
    paramBundle = j.byW().ML(this.ssid);
    if (paramBundle == null)
    {
      paramBundle = new com.tencent.mm.plugin.freewifi.g.c();
      paramBundle.field_ssidmd5 = ag.ck(this.ssid);
      paramBundle.field_ssid = this.ssid;
    }
    for (int i = 1; ; i = 0)
    {
      paramBundle.field_url = "";
      paramBundle.field_mid = "";
      paramBundle.field_wifiType = 33;
      paramBundle.field_connectState = 1;
      if (i != 0)
        j.byW().b(paramBundle);
      while (true)
      {
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, "", Integer.valueOf(this.cvd) });
        this.myc = new k.a()
        {
          private int mAd = -999999999;

          public final void a(String paramAnonymousString, com.tencent.mm.sdk.e.m paramAnonymousm)
          {
            AppMethodBeat.i(21151);
            ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this, ProtocolThreeThreeUI.this.bzz());
            if (this.mAd != ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this))
            {
              this.mAd = ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this);
              ProtocolThreeThreeUI.this.vT(ProtocolThreeThreeUI.a(ProtocolThreeThreeUI.this));
            }
            AppMethodBeat.o(21151);
          }
        };
        j.byW().c(this.myc);
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.initModel, desc=it initializes the front page. ", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.byW().c(paramBundle, new String[0]);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21168);
    super.onDestroy();
    if (this.myc != null)
      j.byW().d(this.myc);
    this.mAw.stopTimer();
    j.byZ().release();
    AppMethodBeat.o(21168);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21165);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(21165);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21165);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void vT(int paramInt)
  {
    AppMethodBeat.i(21164);
    ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(21164);
    case 4:
    case 1:
    case 3:
      while (true)
      {
        return;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mAw.stopTimer();
        this.myB.setVisibility(4);
        this.myT.setText(2131298435);
        if (this.cvd == 3)
          this.myS.setText(getString(2131301435, new Object[] { this.ssid }));
        while (true)
        {
          ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
          AppMethodBeat.o(21164);
          break;
          this.myS.setText(getString(2131298433, new Object[] { this.ssid }));
        }
        this.myB.setVisibility(4);
        this.myT.setText(2131298432);
        this.mzU = h.b(this.mController.ylL, getString(2131298432), true, new ProtocolThreeThreeUI.9(this));
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
        AppMethodBeat.o(21164);
        continue;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mAw.stopTimer();
        this.myB.setVisibility(0);
        this.myT.setText(2131300074);
        ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toFail, desc=connect failed.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
        AppMethodBeat.o(21164);
      }
    case 2:
    }
    if (this.mzU != null)
      this.mzU.dismiss();
    this.mAw.stopTimer();
    this.myT.setText(2131298429);
    this.myT.setClickable(false);
    Intent localIntent = getIntent();
    localIntent.putExtra("free_wifi_appid", this.appId);
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
      ab.i("MicroMsg.FreeWifi.Protocol33UI", "sessionKey=%s, step=%d, method=Protocol33UI.toSuccess, desc=connect succeeded.", new Object[] { com.tencent.mm.plugin.freewifi.m.V(getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(getIntent())) });
      break;
      localIntent.putExtra("free_wifi_qinghuai_url", this.mAb);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeThreeUI
 * JD-Core Version:    0.6.2
 */