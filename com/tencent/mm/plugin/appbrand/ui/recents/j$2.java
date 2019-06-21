package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.compat.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class j$2
  implements View.OnClickListener
{
  j$2(j paramj, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133471);
    ab.i("MicroMsg.AppBrandListRecentsListWAGameHeader", "Invoke H5 click listener, invoke h5");
    ((a)g.K(a.class)).U(this.iOB.gNy, this.iOC);
    AppMethodBeat.o(133471);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.j.2
 * JD-Core Version:    0.6.2
 */