package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class QRCodeIntroductionWebViewUI extends WebViewUI
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7474);
    super.onCreate(paramBundle);
    addIconOptionMenu(0, 2130839555, new QRCodeIntroductionWebViewUI.1(this));
    setBackBtn(new QRCodeIntroductionWebViewUI.2(this));
    AppMethodBeat.o(7474);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI
 * JD-Core Version:    0.6.2
 */