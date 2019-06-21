package com.tencent.mm.plugin.appbrand.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;

final class f$1
  implements View.OnClickListener
{
  f$1(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102311);
    g.a(f.a(this.iHb).mAppId, g.d.gNm);
    f.a(this.iHb).finish();
    AppMethodBeat.o(102311);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.f.1
 * JD-Core Version:    0.6.2
 */