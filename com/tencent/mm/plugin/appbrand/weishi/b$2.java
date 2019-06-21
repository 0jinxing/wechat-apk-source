package com.tencent.mm.plugin.appbrand.weishi;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements View.OnClickListener
{
  b$2(b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133624);
    ab.i("MicroMsg.AppBrandThumbLoadingSplash", "thumb click close button");
    e.aOz();
    if (b.a(this.iTR) != null)
    {
      g.a(b.a(this.iTR).mAppId, g.d.gNm);
      b.a(this.iTR).close();
    }
    AppMethodBeat.o(133624);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b.2
 * JD-Core Version:    0.6.2
 */