package com.tencent.mm.plugin.appbrand.widget.picker;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m.b;

final class d$1
  implements View.OnClickListener
{
  d$1(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(126727);
    d locald = this.jkX;
    if (d.c(this.jkX) == null);
    for (paramView = null; ; paramView = d.c(this.jkX).aEG())
    {
      d.a(locald, true, paramView);
      AppMethodBeat.o(126727);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.picker.d.1
 * JD-Core Version:    0.6.2
 */