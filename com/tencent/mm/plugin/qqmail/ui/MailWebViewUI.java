package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;
import java.util.Map;

public class MailWebViewUI extends MMActivity
{
  private String cdu;
  private d ext;
  private ak handler;
  private long pvG;
  private MMWebView pzf;
  private v.a pzg;

  public MailWebViewUI()
  {
    AppMethodBeat.i(68401);
    this.pzg = new v.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        AppMethodBeat.i(68393);
        MailWebViewUI.a(MailWebViewUI.this).post(new MailWebViewUI.1.2(this, paramAnonymousString));
        AppMethodBeat.o(68393);
      }

      public final void onSuccess(String paramAnonymousString, Map paramAnonymousMap)
      {
        AppMethodBeat.i(68392);
        MailWebViewUI.a(MailWebViewUI.this).post(new MailWebViewUI.1.1(this, paramAnonymousString));
        AppMethodBeat.o(68392);
      }
    };
    this.ext = new d(this);
    AppMethodBeat.o(68401);
  }

  public final int getLayoutId()
  {
    return 2130970428;
  }

  public final void initView()
  {
    AppMethodBeat.i(68407);
    boolean bool = getIntent().getBooleanExtra("singleColumn", false);
    this.pzf = MMWebView.a.in(this.mController.ylL);
    this.pzf.setBackgroundDrawable(a.g(this, 2131690304));
    ((FrameLayout)findViewById(2131821064)).addView(this.pzf);
    this.pzf.getSettings().setJavaScriptEnabled(true);
    if (Boolean.valueOf(bool).booleanValue())
      this.pzf.dKI();
    this.pzf.getSettings().dUd();
    this.pzf.getSettings().setSupportZoom(true);
    this.pzf.getSettings().setBuiltInZoomControls(true);
    this.pzf.setWebViewClient(new MailWebViewUI.3(this));
    this.pzf.setWebChromeClient(new MailWebViewUI.4(this));
    this.pzf.dKH();
    setBackBtn(new MailWebViewUI.5(this));
    AppMethodBeat.o(68407);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68404);
    super.onCreate(paramBundle);
    this.handler = new ak();
    initView();
    paramBundle = getIntent().getStringExtra("title");
    if (paramBundle != null)
      setMMTitle(paramBundle);
    this.ext.connect(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(68394);
        MailWebViewUI.b(MailWebViewUI.this);
        AppMethodBeat.o(68394);
      }
    });
    AppMethodBeat.o(68404);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68406);
    this.pzf.setVisibility(8);
    this.pzf.destroy();
    this.pzf = null;
    this.ext.release();
    super.onDestroy();
    AppMethodBeat.o(68406);
  }

  public void onPause()
  {
    AppMethodBeat.i(68403);
    super.onPause();
    WebView.disablePlatformNotifications();
    AppMethodBeat.o(68403);
  }

  public void onResume()
  {
    AppMethodBeat.i(68402);
    super.onResume();
    WebView.enablePlatformNotifications();
    AppMethodBeat.o(68402);
  }

  public void onStop()
  {
    AppMethodBeat.i(68405);
    this.pzf.stopLoading();
    super.onStop();
    AppMethodBeat.o(68405);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.MailWebViewUI
 * JD-Core Version:    0.6.2
 */