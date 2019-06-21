package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;

final class MobileInputUI$17
  implements View.OnClickListener
{
  MobileInputUI$17(MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125177);
    paramView = this.gDZ.getString(2131305899, new Object[] { aa.dor() });
    MobileInputUI.S(this.gDZ, paramView);
    AppMethodBeat.o(125177);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.17
 * JD-Core Version:    0.6.2
 */