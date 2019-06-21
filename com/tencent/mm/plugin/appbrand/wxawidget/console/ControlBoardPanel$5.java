package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ControlBoardPanel$5
  implements View.OnClickListener
{
  ControlBoardPanel$5(ControlBoardPanel paramControlBoardPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11162);
    paramView = this.jqe;
    if (paramView.jqd)
    {
      paramView.jqd = false;
      paramView.jqb.removeViewImmediate(paramView);
      d.b(paramView.hoZ);
      if (paramView.jpU != null)
        paramView.jpU.a(paramView, false);
    }
    AppMethodBeat.o(11162);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ControlBoardPanel.5
 * JD-Core Version:    0.6.2
 */