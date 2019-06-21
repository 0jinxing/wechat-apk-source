package com.tencent.mm.plugin.appbrand.weishi;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;
import com.tencent.mm.sdk.platformtools.ab;

final class b$3
  implements b.i
{
  b$3(b paramb, String paramString)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
    AppMethodBeat.i(133626);
    ab.e("MicroMsg.AppBrandThumbLoadingSplash", "splash thumb loaded fail");
    if (this.iTP != null)
      b.a(this.iTR, this.iTP);
    AppMethodBeat.o(133626);
  }

  public final String wP()
  {
    return "AppBrandWeishiLoadingSplash#THUMB";
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(133625);
    ab.i("MicroMsg.AppBrandThumbLoadingSplash", "splash thumb loaded");
    b.a(this.iTR, paramBitmap);
    AppMethodBeat.o(133625);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b.3
 * JD-Core Version:    0.6.2
 */