package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

final class RegSetInfoUI$30
  implements View.OnFocusChangeListener
{
  RegSetInfoUI$30(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(125535);
    if (paramBoolean)
    {
      RegSetInfoUI.q(this.gHM);
      RegSetInfoUI.m(this.gHM).ae(200L, 200L);
    }
    AppMethodBeat.o(125535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.30
 * JD-Core Version:    0.6.2
 */