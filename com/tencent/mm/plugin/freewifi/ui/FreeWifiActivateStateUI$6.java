package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FreeWifiActivateStateUI$6
  implements View.OnClickListener
{
  FreeWifiActivateStateUI$6(FreeWifiActivateStateUI paramFreeWifiActivateStateUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20904);
    paramView = this.myd.getString(2131300055);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    d.b(this.myd.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(20904);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiActivateStateUI.6
 * JD-Core Version:    0.6.2
 */