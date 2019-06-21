package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.b.d;
import com.tencent.mm.sdk.platformtools.ab;

final class w$10$1
  implements View.OnClickListener
{
  w$10$1(w.10 param10)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(132392);
    ab.i("MicroMsg.AppBrandPageViewWC", "CustomRightButton click");
    d.c(this.itF.itx);
    AppMethodBeat.o(132392);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.10.1
 * JD-Core Version:    0.6.2
 */