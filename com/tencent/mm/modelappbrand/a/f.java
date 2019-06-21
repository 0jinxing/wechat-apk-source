package com.tencent.mm.modelappbrand.a;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

public final class f
  implements b.f
{
  public static final f fqH;

  static
  {
    AppMethodBeat.i(77384);
    fqH = new f();
    AppMethodBeat.o(77384);
  }

  public final String wP()
  {
    return "WxaIcon";
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(77383);
    if ((paramBitmap.getWidth() <= 0) || (paramBitmap.getHeight() <= 0))
      AppMethodBeat.o(77383);
    while (true)
    {
      return paramBitmap;
      paramBitmap = d.a(paramBitmap, false, paramBitmap.getWidth() / 2, false);
      AppMethodBeat.o(77383);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a.f
 * JD-Core Version:    0.6.2
 */