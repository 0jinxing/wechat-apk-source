package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$5
  implements Runnable
{
  u$5(u paramu)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101920);
    if (u.e(this.hkS).azb())
    {
      u.f(this.hkS).setImageResource(2130837768);
      u.g(this.hkS).setText(this.hkS.getContext().getString(2131296807));
    }
    while (true)
    {
      u.h(this.hkS);
      AppMethodBeat.o(101920);
      return;
      if (u.e(this.hkS).isReady())
      {
        u.f(this.hkS).setImageResource(2130837768);
        u.g(this.hkS).setText(this.hkS.getContext().getString(2131296808));
      }
      else
      {
        u.f(this.hkS).setImageResource(2130837767);
        u.g(this.hkS).setText(this.hkS.getContext().getString(2131296806));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.u.5
 * JD-Core Version:    0.6.2
 */