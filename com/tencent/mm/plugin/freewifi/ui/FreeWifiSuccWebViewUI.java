package com.tencent.mm.plugin.freewifi.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.w;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q.b;

public class FreeWifiSuccWebViewUI extends WebViewUI
  implements f
{
  private String cBb;
  private int cIb;
  private String csB;
  private String mAa;
  private boolean mAl = false;
  private String mwH;
  private int mzZ;
  private String signature;

  public final void aMh()
  {
    AppMethodBeat.i(21101);
    super.aMh();
    AppMethodBeat.o(21101);
  }

  public void finish()
  {
    AppMethodBeat.i(21102);
    super.finish();
    AppMethodBeat.o(21102);
  }

  public final void initView()
  {
    AppMethodBeat.i(21104);
    super.initView();
    pP(false);
    a(0, getString(2131300056), new FreeWifiSuccWebViewUI.1(this), q.b.ymz);
    AppMethodBeat.o(21104);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(21103);
    super.onBackPressed();
    AppMethodBeat.o(21103);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21099);
    com.tencent.mm.plugin.freewifi.j.userName = "";
    com.tencent.mm.plugin.freewifi.j.type = 0;
    String str = getIntent().getStringExtra("free_wifi_qinghuai_url");
    ab.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "qinghuaiUrl=%s", new Object[] { str });
    getIntent().putExtra("rawUrl", str);
    getIntent().putExtra("showShare", false);
    super.onCreate(paramBundle);
    this.csB = getIntent().getStringExtra("free_wifi_appid");
    this.mwH = getIntent().getStringExtra("free_wifi_app_nickname");
    this.cBb = getIntent().getStringExtra("free_wifi_app_username");
    this.mzZ = getIntent().getIntExtra("free_wifi_finish_actioncode", 0);
    this.mAa = getIntent().getStringExtra("free_wifi_finish_url");
    this.signature = getIntent().getStringExtra("free_wifi_signature");
    this.cIb = com.tencent.mm.plugin.freewifi.m.Y(getIntent());
    if (this.cIb == 10)
    {
      str = com.tencent.mm.compatible.e.q.eth.etR;
      paramBundle = com.tencent.mm.compatible.e.q.bB(this.mController.ylL);
      if ((!com.tencent.mm.plugin.freewifi.m.isEmpty(str)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramBundle)))
        this.mAa = Uri.parse(this.mAa).buildUpon().appendQueryParameter("manufacturer", paramBundle).appendQueryParameter("manufacturerUsername", str).toString();
    }
    ab.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "get from intent, appid = %s, appNickName = %s, appUserName = %s, finishActionCode = %d, finishUrl = %s, signature = %s", new Object[] { this.csB, this.mwH, this.cBb, Integer.valueOf(this.mzZ), this.mAa, this.signature });
    paramBundle = k.byo();
    str = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI");
    paramBundle.ssid = at.gE(ah.getContext());
    paramBundle.bssid = at.gF(ah.getContext());
    paramBundle.cuI = str;
    paramBundle.cuH = getIntent().getStringExtra("free_wifi_ap_key");
    paramBundle.mud = this.csB;
    paramBundle.kBq = com.tencent.mm.plugin.freewifi.m.V(getIntent());
    paramBundle.mue = com.tencent.mm.plugin.freewifi.m.X(getIntent());
    paramBundle.muf = k.b.mur.muQ;
    paramBundle.mug = k.b.mur.name;
    paramBundle.cIb = com.tencent.mm.plugin.freewifi.m.Y(getIntent());
    paramBundle.muh = this.cBb;
    paramBundle.byq().byp();
    AppMethodBeat.o(21099);
  }

  @TargetApi(11)
  public void onDestroy()
  {
    AppMethodBeat.i(21100);
    super.onDestroy();
    aw.Rg().b(1703, this);
    AppMethodBeat.o(21100);
  }

  public boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(21105);
    String str = (String)paramMenu.getItem(0).getTitle();
    if (!getString(2131300056).equals(str))
      a(0, getString(2131300056), new FreeWifiSuccWebViewUI.2(this), q.b.ymz);
    boolean bool = super.onPrepareOptionsMenu(paramMenu);
    AppMethodBeat.o(21105);
    return bool;
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21106);
    ab.i("MicroMsg.FreeWifi.FreeWifiSuccWebViewUI", "onSceneEnd, scnee type = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    aw.Rg().b(1703, this);
    AppMethodBeat.o(21106);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccWebViewUI
 * JD-Core Version:    0.6.2
 */