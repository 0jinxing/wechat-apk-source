package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SendFeedBackUI$1
  implements View.OnClickListener
{
  SendFeedBackUI$1(SendFeedBackUI paramSendFeedBackUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127043);
    paramView = new Intent();
    paramView.putExtra("showShare", false);
    paramView.putExtra("rawUrl", this.qlF.getString(2131305626));
    d.b(this.qlF.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(127043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SendFeedBackUI.1
 * JD-Core Version:    0.6.2
 */