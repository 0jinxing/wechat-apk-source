package com.tencent.mm.plugin.appbrand.page;

import android.support.v4.view.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class u$3
  implements Runnable
{
  u$3(u paramu, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87161);
    if (s.av(this.ita.getContentView()))
      this.ita.getContentView().post(new u.3.1(this));
    u.b(this.ita, this.val$url);
    AppMethodBeat.o(87161);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.3
 * JD-Core Version:    0.6.2
 */