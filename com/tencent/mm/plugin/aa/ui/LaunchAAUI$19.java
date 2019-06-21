package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LaunchAAUI$19
  implements View.OnClickListener
{
  LaunchAAUI$19(LaunchAAUI paramLaunchAAUI, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40840);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.val$url);
    d.b(this.gpj.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(40840);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.LaunchAAUI.19
 * JD-Core Version:    0.6.2
 */