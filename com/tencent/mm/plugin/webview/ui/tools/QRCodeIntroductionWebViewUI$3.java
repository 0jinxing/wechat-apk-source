package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.ui.base.h.c;

final class QRCodeIntroductionWebViewUI$3
  implements h.c
{
  QRCodeIntroductionWebViewUI$3(QRCodeIntroductionWebViewUI paramQRCodeIntroductionWebViewUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(7473);
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(7473);
      while (true)
      {
        return;
        this.usk.uhz.q(null);
        AppMethodBeat.o(7473);
      }
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(this.usk.cWL()));
      this.usk.startActivity(localIntent);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI.3
 * JD-Core Version:    0.6.2
 */