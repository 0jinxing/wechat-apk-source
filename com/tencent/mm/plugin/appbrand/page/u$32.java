package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.luggage.g.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class u$32
  implements View.OnClickListener
{
  u$32(u paramu)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(87191);
    boolean bool = f.az(this.ita.mContext);
    paramView = new u.32.1(this);
    if (bool);
    for (int i = 100; ; i = 0)
    {
      al.n(paramView, i);
      AppMethodBeat.o(87191);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.32
 * JD-Core Version:    0.6.2
 */