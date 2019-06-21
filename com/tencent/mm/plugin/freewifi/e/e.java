package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.ab;

public class e
{
  protected String appId;
  protected int cdf;
  protected String cuH;
  protected int cvd;
  protected final Intent intent;
  protected String jUg;
  protected FreeWifiFrontPageUI mwF;
  protected int mwG;
  protected String mwH;
  protected String ssid;

  public e(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
    AppMethodBeat.i(20806);
    this.mwF = paramFreeWifiFrontPageUI;
    this.intent = paramFreeWifiFrontPageUI.getIntent();
    this.ssid = this.intent.getStringExtra("free_wifi_ssid");
    this.jUg = this.intent.getStringExtra("free_wifi_url");
    this.cuH = this.intent.getStringExtra("free_wifi_ap_key");
    this.cvd = this.intent.getIntExtra("free_wifi_source", 1);
    this.cdf = this.intent.getIntExtra("free_wifi_channel_id", 0);
    this.appId = this.intent.getStringExtra("free_wifi_appid");
    this.mwH = this.intent.getStringExtra("free_wifi_app_nickname");
    this.mwG = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    ab.i("MicroMsg.FreeWifi.ProtocolBase", "sessionKey=%s, step=%d, desc=Data retrieved. ssid=%s, fullUrl=%s, apKey=%s, source=%s, channelId=%d, appid=%s, appNickName=%s, protocolNumber=%d", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.ssid, this.jUg, this.cuH, Integer.valueOf(this.cvd), Integer.valueOf(this.cdf), this.appId, this.mwH, Integer.valueOf(this.mwG) });
    AppMethodBeat.o(20806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.e
 * JD-Core Version:    0.6.2
 */