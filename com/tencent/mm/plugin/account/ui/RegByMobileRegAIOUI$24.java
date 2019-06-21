package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.a.b;

final class RegByMobileRegAIOUI$24
  implements View.OnFocusChangeListener
{
  RegByMobileRegAIOUI$24(RegByMobileRegAIOUI paramRegByMobileRegAIOUI, boolean[] paramArrayOfBoolean)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(125371);
    if (paramBoolean)
    {
      this.gGh[0] = true;
      AppMethodBeat.o(125371);
    }
    while (true)
    {
      return;
      b.oTO.TK("ie_reg");
      AppMethodBeat.o(125371);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI.24
 * JD-Core Version:    0.6.2
 */