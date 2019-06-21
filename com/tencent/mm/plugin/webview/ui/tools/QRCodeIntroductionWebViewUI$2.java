package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class QRCodeIntroductionWebViewUI$2
  implements MenuItem.OnMenuItemClickListener
{
  QRCodeIntroductionWebViewUI$2(QRCodeIntroductionWebViewUI paramQRCodeIntroductionWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(7472);
    this.usk.finish();
    AppMethodBeat.o(7472);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.QRCodeIntroductionWebViewUI.2
 * JD-Core Version:    0.6.2
 */