package com.tencent.mm.plugin.webwx.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.aa;

final class ExtDeviceWXLoginUI$1
  implements View.OnClickListener
{
  ExtDeviceWXLoginUI$1(ExtDeviceWXLoginUI paramExtDeviceWXLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26521);
    paramView = new Intent();
    paramView.putExtra("title", this.uLu.getString(2131305605));
    paramView.putExtra("rawUrl", this.uLu.getString(2131305890, new Object[] { aa.dor() }));
    paramView.putExtra("showShare", false);
    paramView.putExtra("neverGetA8Key", true);
    d.b(this.uLu, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(26521);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI.1
 * JD-Core Version:    0.6.2
 */