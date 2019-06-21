package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;

final class u$30
  implements View.OnClickListener
{
  u$30(u paramu)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(87188);
    g.a(this.ita.getAppId(), g.d.gNm);
    u.i(this.ita).close();
    AppMethodBeat.o(87188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.u.30
 * JD-Core Version:    0.6.2
 */