package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WebviewMpUI extends WebViewUI
{
  protected final boolean aYc()
  {
    return true;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebviewMpUI
 * JD-Core Version:    0.6.2
 */