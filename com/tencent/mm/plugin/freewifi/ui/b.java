package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.a;
import com.tencent.mm.plugin.freewifi.d.c;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  Activity activity;
  int cIb;
  String cuH;
  Intent intent;

  public b(Activity paramActivity, String paramString, int paramInt)
  {
    AppMethodBeat.i(20933);
    if (bo.isNullOrNil(paramString))
    {
      paramActivity = new IllegalArgumentException("acitvity or apKey cannot be null.");
      AppMethodBeat.o(20933);
      throw paramActivity;
    }
    this.activity = paramActivity;
    this.intent = paramActivity.getIntent();
    this.cuH = paramString;
    this.cIb = paramInt;
    AppMethodBeat.o(20933);
  }

  final void MN(String paramString)
  {
    AppMethodBeat.i(20935);
    Intent localIntent = new Intent();
    localIntent.putExtra("free_wifi_error_ui_error_msg", paramString);
    localIntent.setClass(this.activity, FreeWifiErrorUI.class);
    this.activity.finish();
    this.activity.startActivity(localIntent);
    AppMethodBeat.o(20935);
  }

  public final void connect()
  {
    AppMethodBeat.i(20934);
    if (bo.isNullOrNil(this.cuH))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "get key failed");
      this.activity.finish();
    }
    this.activity.getIntent().putExtra("free_wifi_url", this.cuH);
    this.activity.getIntent().putExtra("free_wifi_ap_key", this.cuH);
    if (bo.isNullOrNil(this.cuH))
    {
      ab.e("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "ap key is null");
      this.activity.finish();
      AppMethodBeat.o(20934);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FreeWifi.FreeWifiNetCheckUI", "sessionKey=%s, step=%d, method=FreeWifiConnector.getApInfo, desc=it starts net request [getApInfo] for retrieving protocol type and frontpage info. apKey=%s, channel=%d", new Object[] { m.V(this.intent), Integer.valueOf(m.W(this.intent)), this.cuH, Integer.valueOf(this.cIb) });
      k.a locala = k.byo();
      locala.cuH = this.cuH;
      locala.kBq = m.V(this.intent);
      locala.muf = k.b.mun.muQ;
      locala.mug = k.b.mun.name;
      locala.cIb = this.cIb;
      locala.mue = m.X(this.intent);
      locala.byq().b(this.intent, false).byp();
      new a(this.cuH, this.cIb, m.V(this.intent)).O(this.activity).c(new b.1(this));
      AppMethodBeat.o(20934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.b
 * JD-Core Version:    0.6.2
 */