package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
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
import com.tencent.mm.plugin.freewifi.a.a.a;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import java.net.HttpURLConnection;

@Deprecated
public class ProtocolThreeOneUI extends MMActivity
{
  protected String cBb;
  protected int cdf;
  private boolean chh;
  protected String csB;
  private String cuH;
  protected int cvd;
  private String cxb;
  private int cxs;
  private final com.tencent.mm.at.a.a.c fGS;
  private Intent intent;
  protected String jUg;
  protected String mAa;
  protected String mAb;
  private ap mAw;
  protected String mwH;
  private String mwQ;
  private int mwR;
  protected String mxW;
  private TextView myB;
  private ImageView myQ;
  private TextView myR;
  private TextView myS;
  private Button myT;
  private Button myU;
  protected String myX;
  protected String myY;
  protected String myZ;
  private com.tencent.mm.sdk.e.k.a myc;
  private p mzU;
  protected int mzZ;
  protected String mza;
  protected String signature;
  protected String ssid;

  public ProtocolThreeOneUI()
  {
    AppMethodBeat.i(21134);
    this.cxs = 1;
    this.mwR = 0;
    this.chh = false;
    this.mAw = new ap(new ProtocolThreeOneUI.1(this), false);
    c.a locala = new c.a();
    locala.ePF = true;
    locala.ePG = true;
    locala.ePT = 2130838837;
    locala.eQf = true;
    locala.eQg = 0.0F;
    this.fGS = locala.ahG();
    AppMethodBeat.o(21134);
  }

  private void aH(int paramInt, String paramString)
  {
    AppMethodBeat.i(21142);
    com.tencent.mm.plugin.freewifi.k.a locala = k.byo();
    locala.ssid = this.ssid;
    locala.bssid = m.My("MicroMsg.FreeWifi.Protocol31UI");
    locala.cuI = m.Mz("MicroMsg.FreeWifi.Protocol31UI");
    locala.cuH = this.cuH;
    locala.mud = this.csB;
    locala.kBq = m.V(this.intent);
    locala.mue = m.X(this.intent);
    locala.muf = k.b.muG.muQ;
    locala.mug = k.b.muG.name;
    locala.result = paramInt;
    locala.ehr = paramString;
    locala.cIb = m.Y(this.intent);
    locala.muh = this.cBb;
    locala.byq().byp();
    AppMethodBeat.o(21142);
  }

  private void goBack()
  {
    AppMethodBeat.i(21140);
    l.x(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Intent localIntent = new Intent();
    g.gkE.h(localIntent, this);
    finish();
    AppMethodBeat.o(21140);
  }

  protected final int bzz()
  {
    int i = 0;
    AppMethodBeat.i(21141);
    if (bo.isNullOrNil(this.ssid))
    {
      ab.d("MicroMsg.FreeWifi.Protocol31UI", "Illegal SSID");
      AppMethodBeat.o(21141);
    }
    while (true)
    {
      return i;
      com.tencent.mm.plugin.freewifi.g.c localc = j.byW().ML(this.ssid);
      if ((localc != null) && (localc.field_ssid.equalsIgnoreCase(this.ssid)))
      {
        i = localc.field_connectState;
        AppMethodBeat.o(21141);
      }
      else
      {
        AppMethodBeat.o(21141);
      }
    }
  }

  protected final void connect()
  {
    AppMethodBeat.i(21137);
    this.cxs = bzz();
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connecting wifi by protocol 3.1. current connect state=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), com.tencent.mm.plugin.freewifi.model.d.vR(this.cxs) });
    if (this.cxs != 2)
    {
      this.mAw.ae(15000L, 15000L);
      ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.connect, desc=it starts connectTimeoutHandler. timeout=%d s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), Integer.valueOf(60) });
      String str = this.mwQ;
      j.byZ().byI().post(new ProtocolThreeOneUI.6(this, str));
      AppMethodBeat.o(21137);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 2, getIntent());
      AppMethodBeat.o(21137);
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
    AppMethodBeat.i(21136);
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
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initView, desc=Initializing the view. ssid=%s, mid=%s, fullUrl=%s, source=%d, channel=%d, appid=%s, headImgUrl=%s, welcomeMsg=%s, privacyUrl=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.ssid, this.mxW, this.jUg, Integer.valueOf(this.cvd), Integer.valueOf(this.cdf), this.csB, this.myX, this.myY, this.mza });
    setBackBtn(new ProtocolThreeOneUI.2(this));
    findViewById(2131824137).setVisibility(0);
    this.myQ = ((ImageView)findViewById(2131824129));
    this.myR = ((TextView)findViewById(2131824130));
    this.myS = ((TextView)findViewById(2131824131));
    this.myB = ((TextView)findViewById(2131824132));
    this.myT = ((Button)findViewById(2131824135));
    this.myT.setOnClickListener(new ProtocolThreeOneUI.3(this));
    this.myU = ((Button)findViewById(2131824136));
    this.myU.setOnClickListener(new ProtocolThreeOneUI.4(this));
    if (bo.isNullOrNil(this.ssid))
    {
      this.myS.setText(getString(2131300076));
      this.myT.setVisibility(4);
    }
    setMMTitle(getString(2131300078));
    AppMethodBeat.o(21136);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21135);
    super.onCreate(paramBundle);
    this.intent = getIntent();
    this.cuH = getIntent().getStringExtra("free_wifi_ap_key");
    this.cxb = getIntent().getStringExtra("free_wifi_schema_ticket");
    this.mwQ = getIntent().getStringExtra("free_wifi_portal_ap_info_authurl_with_params");
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onCreate, desc=it goes into Protocol31 connect frontpage. apKey=%s, ticket=%s", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), this.cuH, this.cxb });
    initView();
    if (bo.isNullOrNil(this.ssid))
    {
      ab.e("MicroMsg.FreeWifi.Protocol31UI", "ssid is null");
      l.v(com.tencent.mm.plugin.freewifi.model.d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
      AppMethodBeat.o(21135);
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
      paramBundle.field_url = this.jUg;
      paramBundle.field_mid = this.mxW;
      paramBundle.field_wifiType = 3;
      paramBundle.field_connectState = 1;
      if (i != 0)
        j.byW().b(paramBundle);
      while (true)
      {
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "ssid : %s, mid : %s, source : %d", new Object[] { this.ssid, this.mxW, Integer.valueOf(this.cvd) });
        this.myc = new ProtocolThreeOneUI.5(this);
        j.byW().c(this.myc);
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=Initializing the model behind the view, so anything that changes the model will notify the view. model : field_ssidmd5=%s, field_ssid=%s, field_url=%s, field_mid=%s, field_wifiType=%d, field_connectState=%d", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), paramBundle.field_ssidmd5, paramBundle.field_ssid, paramBundle.field_url, paramBundle.field_mid, Integer.valueOf(paramBundle.field_wifiType), Integer.valueOf(paramBundle.field_connectState) });
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.initModel, desc=it initializes the front page. ", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
        com.tencent.mm.plugin.freewifi.model.d.a(this.ssid, 4, getIntent());
        break;
        j.byW().c(paramBundle, new String[0]);
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(21143);
    super.onDestroy();
    if (this.myc != null)
      j.byW().d(this.myc);
    this.mAw.stopTimer();
    j.byZ().release();
    AppMethodBeat.o(21143);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(21139);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(21139);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(21139);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected final void vT(int paramInt)
  {
    AppMethodBeat.i(21138);
    ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.onConnectStateChange, desc=it receives notifications whenever the connect state of model changes and then updates the view accordingly. state=%d", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())), Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(21138);
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
        if ((m.Y(getIntent()) == 10) && (!m.isEmpty(com.tencent.mm.compatible.e.q.eth.etR)) && (!m.isEmpty(com.tencent.mm.compatible.e.q.bB(this.mController.ylL))))
          this.myT.setText(String.format(getString(2131300035), new Object[] { com.tencent.mm.compatible.e.q.bB(this.mController.ylL) }));
        if (this.cvd == 3)
          this.myS.setText(getString(2131301435, new Object[] { this.ssid }));
        while (true)
        {
          if (!bo.isNullOrNil(this.csB))
          {
            if (!bo.isNullOrNil(this.mwH))
              this.myR.setText(this.mwH);
            if (!bo.isNullOrNil(this.myX))
              o.ahp().a(this.myX, this.myQ, this.fGS);
          }
          ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnectStart, desc=it initializes the connect front page.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
          AppMethodBeat.o(21138);
          break;
          if (bo.isNullOrNil(this.myZ))
            this.myS.setText(getString(2131298431));
          else
            this.myS.setText(this.myZ);
        }
        this.myB.setVisibility(4);
        this.myT.setText(2131298432);
        this.mzU = h.b(this.mController.ylL, getString(2131298432), true, new ProtocolThreeOneUI.9(this));
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toConnecting, desc=it adds a loading ui on the connect front page.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
        AppMethodBeat.o(21138);
        continue;
        if (this.mzU != null)
          this.mzU.dismiss();
        this.mAw.stopTimer();
        this.myB.setVisibility(0);
        this.myT.setText(2131300074);
        ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toFail, desc=connect failed.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
        AppMethodBeat.o(21138);
      }
    case 2:
    }
    if (this.mzU != null)
      this.mzU.dismiss();
    this.mAw.stopTimer();
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
      ab.i("MicroMsg.FreeWifi.Protocol31UI", "sessionKey=%s, step=%d, method=Protocol31UI.toSuccess, desc=connect succeeded.", new Object[] { m.V(getIntent()), Integer.valueOf(m.W(getIntent())) });
      break;
      localIntent.putExtra("free_wifi_qinghuai_url", this.mAb);
      localIntent.setClass(this, FreeWifiSuccWebViewUI.class);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI
 * JD-Core Version:    0.6.2
 */