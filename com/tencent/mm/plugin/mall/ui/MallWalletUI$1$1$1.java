package com.tencent.mm.plugin.mall.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class MallWalletUI$1$1$1
  implements View.OnClickListener
{
  MallWalletUI$1$1$1(MallWalletUI.1.1 param1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43262);
    MallWalletUI.d(this.onV.onU.onS).dismiss();
    h.pYm.e(16500, new Object[] { Integer.valueOf(5) });
    AppMethodBeat.o(43262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallWalletUI.1.1.1
 * JD-Core Version:    0.6.2
 */