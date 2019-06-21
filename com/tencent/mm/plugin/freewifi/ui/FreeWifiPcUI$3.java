package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FreeWifiPcUI$3
  implements View.OnClickListener
{
  FreeWifiPcUI$3(FreeWifiPcUI paramFreeWifiPcUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21065);
    paramView = new Intent();
    paramView.putExtra("rawUrl", FreeWifiPcUI.f(this.mzV));
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    d.b(this.mzV.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(21065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiPcUI.3
 * JD-Core Version:    0.6.2
 */