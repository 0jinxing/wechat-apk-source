package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.xweb.s;

public class WebViewTestUI extends MMActivity
{
  private s iuo;
  MMWebViewWithJsApi uuU;

  public WebViewTestUI()
  {
    AppMethodBeat.i(7805);
    this.iuo = new WebViewTestUI.1(this);
    AppMethodBeat.o(7805);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7806);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("rawUrl");
    this.uuU = MMWebViewWithJsApi.a.fw(this);
    this.uuU.setWebViewClient(this.iuo);
    setContentView(this.uuU);
    this.uuU.loadUrl(paramBundle);
    AppMethodBeat.o(7806);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewTestUI
 * JD-Core Version:    0.6.2
 */