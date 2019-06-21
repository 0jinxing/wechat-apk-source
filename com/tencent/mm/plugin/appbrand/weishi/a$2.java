package com.tencent.mm.plugin.appbrand.weishi;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2
  implements b.i
{
  a$2(a parama, String paramString)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
    AppMethodBeat.i(133612);
    ab.e("MicroMsg.AppBrandThumbFromMMProxyUI", "proxy thumb loaded fail");
    if (this.iTP != null)
      a.a(this.iTO, this.iTP);
    AppMethodBeat.o(133612);
  }

  public final String wP()
  {
    return "AppBrandThumbFromMMProxyUI#THUMB";
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(133611);
    ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "proxy thumb loaded");
    a.a(this.iTO, paramBitmap);
    AppMethodBeat.o(133611);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.a.2
 * JD-Core Version:    0.6.2
 */