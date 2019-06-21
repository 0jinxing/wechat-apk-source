package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  boolean jiH = false;
  int jiL;
  int jiM;
  Context jiq;
  b uKF;
  WebViewSmileyPanel.a uKG;

  public final a ddb()
  {
    AppMethodBeat.i(10119);
    if (this.uKF == null)
    {
      this.uKF = new b();
      this.uKF.jiq = this.jiq;
      this.uKF.setPanelManager(this);
    }
    b localb = this.uKF;
    AppMethodBeat.o(10119);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.c
 * JD-Core Version:    0.6.2
 */