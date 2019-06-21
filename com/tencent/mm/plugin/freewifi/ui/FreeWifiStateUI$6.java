package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FreeWifiStateUI$6
  implements View.OnClickListener
{
  FreeWifiStateUI$6(FreeWifiStateUI paramFreeWifiStateUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21076);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mAc.mza);
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    d.b(this.mAc.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(21076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiStateUI.6
 * JD-Core Version:    0.6.2
 */