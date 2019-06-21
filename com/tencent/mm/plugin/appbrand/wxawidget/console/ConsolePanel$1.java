package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class ConsolePanel$1
  implements View.OnClickListener
{
  ConsolePanel$1(ConsolePanel paramConsolePanel)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(11139);
    this.jpR.jpE.clear();
    this.jpR.jpO.jpE.clear();
    this.jpR.jpO.aop.notifyChanged();
    AppMethodBeat.o(11139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ConsolePanel.1
 * JD-Core Version:    0.6.2
 */