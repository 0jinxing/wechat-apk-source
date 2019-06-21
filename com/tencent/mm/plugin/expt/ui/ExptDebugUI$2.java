package com.tencent.mm.plugin.expt.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class ExptDebugUI$2
  implements View.OnClickListener
{
  ExptDebugUI$2(ExptDebugUI paramExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73633);
    paramView = ExptDebugUI.a(this.lPd).getText().toString().trim();
    ExptDebugUI.a(this.lPd, bo.getInt(paramView, 0));
    AppMethodBeat.o(73633);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.ui.ExptDebugUI.2
 * JD-Core Version:    0.6.2
 */