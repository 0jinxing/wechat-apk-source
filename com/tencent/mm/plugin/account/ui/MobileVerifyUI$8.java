package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.j;

final class MobileVerifyUI$8
  implements View.OnClickListener
{
  private final int gFp = 0;
  private final int gFq = 1;
  private final int gFr = 2;

  MobileVerifyUI$8(MobileVerifyUI paramMobileVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125275);
    paramView = new j(this.gFn);
    paramView.rBl = new MobileVerifyUI.8.1(this);
    paramView.rBm = new MobileVerifyUI.8.2(this);
    paramView.cuu();
    AppMethodBeat.o(125275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.8
 * JD-Core Version:    0.6.2
 */