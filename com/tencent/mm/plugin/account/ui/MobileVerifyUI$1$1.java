package com.tencent.mm.plugin.account.ui;

import android.content.res.Resources;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileVerifyUI$1$1
  implements Runnable
{
  MobileVerifyUI$1$1(MobileVerifyUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(125268);
    MobileVerifyUI.b(this.gFo.gFn);
    if (MobileVerifyUI.c(this.gFo.gFn) >= 0L)
    {
      this.gFo.gFn.gEX.setText(this.gFo.gFn.getResources().getQuantityString(2131361811, (int)MobileVerifyUI.c(this.gFo.gFn), new Object[] { Integer.valueOf((int)MobileVerifyUI.c(this.gFo.gFn)) }));
      AppMethodBeat.o(125268);
    }
    while (true)
    {
      return;
      this.gFo.gFn.gEX.setVisibility(8);
      this.gFo.gFn.gEW.setVisibility(0);
      MobileVerifyUI.d(this.gFo.gFn);
      this.gFo.gFn.gEW.setEnabled(true);
      this.gFo.gFn.gEW.setText(this.gFo.gFn.getString(2131301476));
      AppMethodBeat.o(125268);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.1.1
 * JD-Core Version:    0.6.2
 */