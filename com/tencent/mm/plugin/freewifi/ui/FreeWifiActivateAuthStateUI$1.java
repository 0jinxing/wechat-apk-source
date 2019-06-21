package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class FreeWifiActivateAuthStateUI$1
  implements View.OnClickListener
{
  FreeWifiActivateAuthStateUI$1(FreeWifiActivateAuthStateUI paramFreeWifiActivateAuthStateUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20889);
    paramView = this.mxN.getString(2131300055);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    d.b(this.mxN, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(20889);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateAuthStateUI.1
 * JD-Core Version:    0.6.2
 */