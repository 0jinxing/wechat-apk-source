package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ProtocolThreeOneUI$4
  implements View.OnClickListener
{
  ProtocolThreeOneUI$4(ProtocolThreeOneUI paramProtocolThreeOneUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21124);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mAx.mza);
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    d.b(this.mAx.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(21124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeOneUI.4
 * JD-Core Version:    0.6.2
 */