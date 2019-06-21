package com.tencent.mm.chatroom.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import com.tencent.xweb.p;

@Deprecated
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public class RoomAnnouncementUI extends MMActivity
{
  private String ehq;
  private WebView ejN;
  private boolean ejO;

  public final int getLayoutId()
  {
    return 2130969005;
  }

  @SuppressLint({"SetJavaScriptEnabled"})
  public final void initView()
  {
    AppMethodBeat.i(104144);
    setMMTitle(2131302653);
    this.ejN = MMWebView.a.n(this, 2131822360);
    this.ejN.getSettings().setJavaScriptEnabled(true);
    this.ejN.getSettings().dUh();
    this.ejN.getSettings().setBuiltInZoomControls(true);
    this.ejN.getSettings().setUseWideViewPort(true);
    this.ejN.getSettings().setLoadWithOverviewMode(true);
    this.ejN.getSettings().dUc();
    this.ejN.getSettings().dUb();
    this.ejN.getSettings().setGeolocationEnabled(false);
    this.ejN.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
    this.ejN.setWebChromeClient(new RoomAnnouncementUI.1(this));
    this.ejN.setWebViewClient(new RoomAnnouncementUI.2(this));
    setBackBtn(new RoomAnnouncementUI.3(this));
    String str = getString(2131298065, new Object[] { aa.dor() });
    this.ejN.loadUrl(str);
    AppMethodBeat.o(104144);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104140);
    super.onCreate(paramBundle);
    this.ejO = getIntent().getBooleanExtra("need_bind_mobile", false);
    this.ehq = getIntent().getStringExtra("RoomInfo_Id");
    initView();
    AppMethodBeat.o(104140);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(104143);
    if (this.ejN != null)
    {
      this.ejN.setVisibility(8);
      ((ViewGroup)this.ejN.getParent()).removeView(this.ejN);
      this.ejN.removeAllViews();
      this.ejN.destroy();
      this.ejN = null;
      System.gc();
    }
    super.onDestroy();
    AppMethodBeat.o(104143);
  }

  public void onPause()
  {
    AppMethodBeat.i(104142);
    super.onPause();
    AppMethodBeat.o(104142);
  }

  public void onResume()
  {
    AppMethodBeat.i(104141);
    super.onResume();
    AppMethodBeat.o(104141);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomAnnouncementUI
 * JD-Core Version:    0.6.2
 */