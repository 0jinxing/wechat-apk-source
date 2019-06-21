package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class FreeWifiIntroductionUI$5
  implements View.OnClickListener
{
  FreeWifiIntroductionUI$5(FreeWifiIntroductionUI paramFreeWifiIntroductionUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21002);
    paramView = this.mzw.getString(2131300055);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramView);
    localIntent.putExtra("showShare", false);
    localIntent.putExtra("show_bottom", false);
    d.b(this.mzw, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(21002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiIntroductionUI.5
 * JD-Core Version:    0.6.2
 */