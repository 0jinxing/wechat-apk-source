package com.tencent.mm.plugin.shake.ui;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$5
  implements View.OnClickListener
{
  ShakeReportUI$5(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24780);
    ShakeReportUI.s(this.qwj).cancel();
    AppMethodBeat.o(24780);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.5
 * JD-Core Version:    0.6.2
 */