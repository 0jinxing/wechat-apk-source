package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class FreeWifiFrontPageUI$6
  implements View.OnClickListener
{
  FreeWifiFrontPageUI$6(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20964);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mze.mza);
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    d.b(this.mze.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(20964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.6
 * JD-Core Version:    0.6.2
 */