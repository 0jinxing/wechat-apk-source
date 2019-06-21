package com.tencent.mm.plugin.wallet_core.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class m$8
  implements View.OnClickListener
{
  m$8(Dialog paramDialog)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(47399);
    if ((this.qHc != null) && (this.qHc.isShowing()))
      this.qHc.dismiss();
    AppMethodBeat.o(47399);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.m.8
 * JD-Core Version:    0.6.2
 */