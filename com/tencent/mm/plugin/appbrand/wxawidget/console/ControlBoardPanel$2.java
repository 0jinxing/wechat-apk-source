package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ControlBoardPanel$2
  implements View.OnClickListener
{
  ControlBoardPanel$2(ControlBoardPanel paramControlBoardPanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11159);
    if (this.jqe.jpW.getVisibility() == 0)
    {
      this.jqe.jpV.setVisibility(8);
      this.jqe.jpW.setVisibility(8);
      this.jqe.jpZ.setSelected(false);
      ControlBoardPanel.a(this.jqe);
      AppMethodBeat.o(11159);
    }
    while (true)
    {
      return;
      this.jqe.jpV.setVisibility(0);
      this.jqe.hoZ.setVisibility(8);
      this.jqe.jpW.setVisibility(0);
      this.jqe.jpX.setVisibility(8);
      this.jqe.jpY.setSelected(false);
      this.jqe.jpZ.setSelected(true);
      this.jqe.jqa.setSelected(false);
      ControlBoardPanel.b(this.jqe);
      AppMethodBeat.o(11159);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ControlBoardPanel.2
 * JD-Core Version:    0.6.2
 */