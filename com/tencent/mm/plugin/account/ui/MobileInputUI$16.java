package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.aa;

final class MobileInputUI$16
  implements View.OnClickListener
{
  MobileInputUI$16(MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125176);
    paramView = this.gDZ.getString(2131305914) + aa.dor();
    MobileInputUI.S(this.gDZ, paramView);
    AppMethodBeat.o(125176);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.16
 * JD-Core Version:    0.6.2
 */