package com.tencent.mm.plugin.expt.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExptDebugUI$3
  implements View.OnClickListener
{
  ExptDebugUI$3(ExptDebugUI paramExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73634);
    ExptDebugUI.b(this.lPd);
    AppMethodBeat.o(73634);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI.3
 * JD-Core Version:    0.6.2
 */