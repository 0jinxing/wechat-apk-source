package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class RemittanceHKUI$1
  implements View.OnClickListener
{
  RemittanceHKUI$1(RemittanceHKUI paramRemittanceHKUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(45073);
    ab.i("MicroMsg.RemittanceHKUI", "hy: on click banner");
    if (!bo.isNullOrNil(RemittanceHKUI.a(this.pWn)))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", RemittanceHKUI.a(this.pWn));
      paramView.putExtra("showShare", false);
      d.b(this.pWn.mController.ylL, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(45073);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceHKUI.1
 * JD-Core Version:    0.6.2
 */