package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.g;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.f.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiCopyPwdUI extends MMActivity
{
  public static int myy = 111;
  private String appId;
  private int cdf;
  private String cuH;
  private ak fbD;
  private Intent intent;
  private int mwG;
  private int myA;
  protected TextView myB;
  protected TextView myC;
  protected TextView myD;
  private int myz;
  private String ssid;

  public FreeWifiCopyPwdUI()
  {
    AppMethodBeat.i(20942);
    this.myz = 1;
    this.myA = 2;
    this.fbD = new FreeWifiCopyPwdUI.4(this);
    AppMethodBeat.o(20942);
  }

  private void goBack()
  {
    AppMethodBeat.i(20946);
    l.x(d.byN(), getIntent().getStringExtra("free_wifi_ap_key"), getIntent().getIntExtra("free_wifi_protocol_type", 0));
    Object localObject = k.byo();
    ((k.a)localObject).cuH = this.cuH;
    ((k.a)localObject).kBq = m.V(this.intent);
    ((k.a)localObject).muf = k.b.muP.muQ;
    ((k.a)localObject).mug = k.b.muP.name;
    ((k.a)localObject).cIb = m.Y(this.intent);
    ((k.a)localObject).mue = m.X(this.intent);
    ((k.a)localObject).result = 0;
    ((k.a)localObject).ehr = "";
    ((k.a)localObject).byq().b(this.intent, true).byp();
    localObject = new Intent();
    g.gkE.h((Intent)localObject, this);
    finish();
    AppMethodBeat.o(20946);
  }

  public final int getLayoutId()
  {
    return 2130969589;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(20944);
    if ((paramInt1 == myy) && (m.byu()) && (!bo.isNullOrNil(this.ssid)) && (this.ssid.equals(d.byO())))
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiCopyPwdUI", "sessionKey=%s, step=%d, desc=connect ssid succeeded. ", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)) });
      paramIntent = k.byo();
      paramIntent.ssid = this.ssid;
      paramIntent.bssid = m.My("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.cuI = m.Mz("MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
      paramIntent.cuH = this.cuH;
      paramIntent.mud = this.appId;
      paramIntent.kBq = m.V(this.intent);
      paramIntent.mue = m.X(this.intent);
      paramIntent.muf = k.b.muq.muQ;
      paramIntent.mug = k.b.muq.name;
      paramIntent.result = 0;
      paramIntent.cIb = m.Y(this.intent);
      paramIntent.byq().byp();
      m.a(this.intent, this.cuH, this.mwG, this.cdf, new FreeWifiCopyPwdUI.3(this), "MicroMsg.FreeWifi.FreeWifiCopyPwdUI");
    }
    AppMethodBeat.o(20944);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20943);
    super.onCreate(paramBundle);
    setBackBtn(new FreeWifiCopyPwdUI.1(this));
    this.intent = getIntent();
    this.ssid = getIntent().getStringExtra("free_wifi_ssid");
    this.cuH = this.intent.getStringExtra("free_wifi_ap_key");
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.cdf = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.mwG = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    ((TextView)findViewById(2131824120)).setText(this.ssid);
    a.b("wifi password", getIntent().getStringExtra("free_wifi_passowrd"));
    ((Button)findViewById(2131824124)).setOnClickListener(new FreeWifiCopyPwdUI.2(this));
    this.myB = ((TextView)findViewById(2131824121));
    this.myC = ((TextView)findViewById(2131824122));
    this.myD = ((TextView)findViewById(2131824123));
    String str = d.byN();
    paramBundle = getIntent().getStringExtra("free_wifi_ap_key");
    int i = getIntent().getIntExtra("free_wifi_protocol_type", 0);
    h.pYm.e(12651, new Object[] { Integer.valueOf(6), str, Integer.valueOf(0), paramBundle, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i) });
    AppMethodBeat.o(20943);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(20945);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      bool = true;
      AppMethodBeat.o(20945);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(20945);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiCopyPwdUI
 * JD-Core Version:    0.6.2
 */