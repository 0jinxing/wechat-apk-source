package com.tencent.mm.plugin.appbrand.widget.actionbar;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$2
  implements View.OnKeyListener
{
  g$2(g paramg)
  {
  }

  public final boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(133659);
    boolean bool;
    if (paramInt == 4)
    {
      this.iVj.dismiss();
      bool = true;
      AppMethodBeat.o(133659);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133659);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.actionbar.g.2
 * JD-Core Version:    0.6.2
 */