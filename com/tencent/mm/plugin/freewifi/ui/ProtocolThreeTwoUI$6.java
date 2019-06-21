package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ProtocolThreeTwoUI$6
  implements View.OnClickListener
{
  ProtocolThreeTwoUI$6(ProtocolThreeTwoUI paramProtocolThreeTwoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21178);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.mAD.mza);
    paramView.putExtra("showShare", false);
    paramView.putExtra("show_bottom", false);
    d.b(this.mAD.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(21178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.ProtocolThreeTwoUI.6
 * JD-Core Version:    0.6.2
 */