package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.m;

final class c$28
  implements View.OnClickListener
{
  c$28(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85149);
    boolean bool;
    if (!m.dTZ().AMw)
    {
      bool = true;
      m.dTZ().rx(bool);
      if (!bool)
        break label56;
      this.ARk.dVB();
      this.ARk.ARg.setVisibility(0);
      AppMethodBeat.o(85149);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label56: if (this.ARk.ARg != null)
        this.ARk.ARg.setVisibility(8);
      AppMethodBeat.o(85149);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.28
 * JD-Core Version:    0.6.2
 */