package com.tencent.mm.plugin.product.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallProductSubmitUI$6
  implements View.OnClickListener
{
  MallProductSubmitUI$6(MallProductSubmitUI paramMallProductSubmitUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44144);
    f localf = MallProductSubmitUI.d(this.pjU);
    paramView = new Intent(localf.gNy, MallProductReceiptUI.class);
    localf.gNy.startActivityForResult(paramView, 4);
    AppMethodBeat.o(44144);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductSubmitUI.6
 * JD-Core Version:    0.6.2
 */