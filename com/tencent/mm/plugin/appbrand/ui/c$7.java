package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.o;

final class c$7
  implements View.OnClickListener
{
  c$7(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(132942);
    g.a(c.e(this.iGs).mAppId, g.d.gNm);
    c.e(this.iGs).finish();
    AppMethodBeat.o(132942);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.7
 * JD-Core Version:    0.6.2
 */