package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;

final class j$2
  implements View.OnClickListener
{
  j$2(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102324);
    g.a(j.e(this.iJj).mAppId, g.d.gNm);
    j.e(this.iJj).finish();
    AppMethodBeat.o(102324);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.j.2
 * JD-Core Version:    0.6.2
 */