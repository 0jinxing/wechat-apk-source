package com.tencent.mm.plugin.mmsight.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$8
  implements View.OnClickListener
{
  b$8(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(55153);
    if (!b.o(this.oBV))
    {
      b.r(this.oBV);
      AppMethodBeat.o(55153);
    }
    while (true)
    {
      return;
      b.p(this.oBV);
      if ((b.s(this.oBV) >= 0) && (b.c(this.oBV) > 0))
        b.t(this.oBV);
      AppMethodBeat.o(55153);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.8
 * JD-Core Version:    0.6.2
 */