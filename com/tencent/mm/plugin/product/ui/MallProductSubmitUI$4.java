package com.tencent.mm.plugin.product.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class MallProductSubmitUI$4
  implements View.OnClickListener
{
  MallProductSubmitUI$4(MallProductSubmitUI paramMallProductSubmitUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44142);
    paramView = MallProductSubmitUI.d(this.pjU);
    Intent localIntent = new Intent();
    localIntent.putExtra("launch_from_webview", true);
    d.a(paramView.gNy, "address", ".ui.WalletSelectAddrUI", localIntent, 1, false);
    AppMethodBeat.o(44142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.4
 * JD-Core Version:    0.6.2
 */