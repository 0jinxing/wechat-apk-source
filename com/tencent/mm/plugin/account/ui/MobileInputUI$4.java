package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class MobileInputUI$4
  implements View.OnFocusChangeListener
{
  MobileInputUI$4(MobileInputUI paramMobileInputUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(125163);
    if (paramBoolean)
    {
      this.gEa[0] = true;
      AppMethodBeat.o(125163);
    }
    while (true)
    {
      return;
      b.oTO.TK("ie_reg_eu");
      AppMethodBeat.o(125163);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileInputUI.4
 * JD-Core Version:    0.6.2
 */