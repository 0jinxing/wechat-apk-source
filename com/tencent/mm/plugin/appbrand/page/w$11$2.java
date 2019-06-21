package com.tencent.mm.plugin.appbrand.page;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.weishi.e;
import com.tencent.mm.sdk.platformtools.ab;

final class w$11$2
  implements View.OnClickListener
{
  w$11$2(w.11 param11)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(132395);
    ab.i("MicroMsg.AppBrandPageViewWC", "pageview click close button");
    e.aOz();
    if (w.e(this.itG.itx) != null)
    {
      g.a(this.itG.itx.getAppId(), g.d.gNm);
      w.e(this.itG.itx).close();
    }
    AppMethodBeat.o(132395);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.11.2
 * JD-Core Version:    0.6.2
 */