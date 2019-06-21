package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.d;
import java.util.List;

final class MallProductReceiptUI$3
  implements View.OnClickListener
{
  MallProductReceiptUI$3(MallProductReceiptUI paramMallProductReceiptUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44092);
    paramView = MallProductReceiptUI.c(this.pjd);
    paramView.phg.clear();
    paramView.bZX();
    MallProductReceiptUI.d(this.pjd).notifyDataSetChanged();
    AppMethodBeat.o(44092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductReceiptUI.3
 * JD-Core Version:    0.6.2
 */