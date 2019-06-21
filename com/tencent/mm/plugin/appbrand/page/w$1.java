package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.sdk.platformtools.bo;

final class w$1
  implements View.OnClickListener
{
  w$1(w paramw)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(132375);
    c.a(this.itx.getAppId(), this.itx.getURL(), 22, "", bo.anT(), 1, 0);
    AppMethodBeat.o(132375);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.1
 * JD-Core Version:    0.6.2
 */