package com.tencent.mm.model.gdpr.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.a.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.f;
import com.tencent.mm.plugin.webview.ui.tools.widget.f.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.xweb.p;
import java.io.File;
import java.util.Locale;

@com.tencent.mm.ui.base.a(1)
public class MPGdprPolicyUI extends MMActivity
{
  private MMFalseProgressBar fou;
  private MMWebView fow;
  private com.tencent.mm.model.gdpr.a fox;
  private ResultReceiver foy;
  private String mAppID;

  private void cz(boolean paramBoolean)
  {
    AppMethodBeat.i(1506);
    ResultReceiver localResultReceiver;
    if (this.foy != null)
    {
      localResultReceiver = this.foy;
      if (!paramBoolean)
        break label37;
    }
    label37: for (int i = 1; ; i = -1)
    {
      localResultReceiver.send(i, null);
      AppMethodBeat.o(1506);
      return;
    }
  }

  @SuppressLint({"SetJavaScriptEnabled", "InlinedApi"})
  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(1508);
    super.dealContentView(paramView);
    this.fow = f.a.uJi.du(this);
    this.fow.getSettings().dUh();
    this.fow.getSettings().setJavaScriptEnabled(true);
    this.fow.getSettings().setMediaPlaybackRequiresUserGesture(false);
    this.fow.getSettings().dUj();
    this.fow.getSettings().setUserAgentString(com.tencent.mm.plugin.appbrand.r.q.a(this.mController.ylL, this.fow.getSettings().getUserAgentString(), (q.a)com.tencent.luggage.a.e.B(q.a.class)));
    this.fow.getView().setHorizontalScrollBarEnabled(false);
    this.fow.getView().setVerticalScrollBarEnabled(false);
    this.fow.getSettings().setBuiltInZoomControls(true);
    this.fow.getSettings().setUseWideViewPort(true);
    this.fow.getSettings().setLoadWithOverviewMode(true);
    this.fow.getSettings().dUc();
    this.fow.getSettings().dUb();
    this.fow.getSettings().setGeolocationEnabled(true);
    this.fow.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    this.fow.getSettings().dUf();
    this.fow.getSettings().setAppCachePath(this.mController.ylL.getDir("webviewcache", 0).getAbsolutePath());
    this.fow.getSettings().dUe();
    this.fow.getSettings().dUg();
    this.fow.getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.eSi + "databases/");
    Bundle localBundle = new Bundle(1);
    localBundle.putBoolean("KInitialParam_Force_wcPrivacyPolicyResult_DoInService", true);
    this.fow.setWebViewClient(c.a.uJh.a(this.fow, new MPGdprPolicyUI.1(this), localBundle));
    this.fow.setWebChromeClient(a.a.uJg.a(this.fow, new MPGdprPolicyUI.2(this)));
    ((FrameLayout)paramView).addView(this.fow, -1, -1);
    this.fou = new MMFalseProgressBar(this);
    this.fou.setProgressDrawable(com.tencent.mm.bz.a.g(this, 2130839564));
    ((FrameLayout)paramView).addView(this.fou, -1, com.tencent.mm.bz.a.fromDPToPix(this, 3));
    AppMethodBeat.o(1508);
  }

  public void finish()
  {
    AppMethodBeat.i(1507);
    super.finish();
    if (this.foy != null)
    {
      cz(false);
      this.foy = null;
    }
    AppMethodBeat.o(1507);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1505);
    super.onCreate(paramBundle);
    try
    {
      if (getIntent() != null)
      {
        paramBundle = (ResultReceiver)getIntent().getParcelableExtra("MPGdprPolicyUI_KEY_RECEIVER");
        this.foy = paramBundle;
        if (paramBundle != null);
      }
      else
      {
        finish();
        AppMethodBeat.o(1505);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.e("MicroMsg.MPGdprPolicyUI", "onCreate get receiver ex = %s", new Object[] { paramBundle });
        finish();
        AppMethodBeat.o(1505);
        continue;
        this.fox = com.tencent.mm.model.gdpr.a.oY(getIntent().getStringExtra("MPGdprPolicyUI_KEY_BUSINESS"));
        if (this.fox == null)
        {
          ab.e("MicroMsg.MPGdprPolicyUI", "onCreate get empty business");
          cz(false);
          finish();
          AppMethodBeat.o(1505);
        }
        else
        {
          this.mAppID = getIntent().getStringExtra("MPGdprPolicyUI_KEY_APPID");
          AppMethodBeat.o(1505);
        }
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(1510);
    super.onDestroy();
    try
    {
      this.fow.destroy();
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MPGdprPolicyUI", "destroy WebView e = %s", new Object[] { localException });
        this.fow = null;
        AppMethodBeat.o(1510);
      }
    }
    finally
    {
      this.fow = null;
      AppMethodBeat.o(1510);
    }
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(1511);
    boolean bool;
    if ((paramInt == 4) && (this.fow.canGoBack()))
    {
      this.fow.goBack();
      bool = true;
      AppMethodBeat.o(1511);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(1511);
    }
  }

  public void onPostCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1509);
    super.onPostCreate(paramBundle);
    setBackBtn(new MPGdprPolicyUI.3(this), 2131230739);
    xE(-1);
    paramBundle = String.format(Locale.US, "https://weixin.qq.com/cgi-bin/newreadtemplate?t=gdpr/confirm&business=%s&lang=%s&cc=%s", new Object[] { this.fox.fon, aa.gw(this), (String)g.RP().Ry().get(274436, null) });
    this.fow.loadUrl(paramBundle);
    AppMethodBeat.o(1509);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI
 * JD-Core Version:    0.6.2
 */