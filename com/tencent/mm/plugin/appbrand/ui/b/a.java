package com.tencent.mm.plugin.appbrand.ui.b;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.sdk.platformtools.d;

public final class a
  implements b.f
{
  private final int iLU;

  public a(int paramInt)
  {
    this.iLU = paramInt;
  }

  public final String wP()
  {
    return "AppBrandProfileLikeImageTransformation";
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(133324);
    if ((paramBitmap.getWidth() <= 0) || (paramBitmap.getHeight() <= 0))
      AppMethodBeat.o(133324);
    while (true)
    {
      return paramBitmap;
      Bitmap localBitmap = d.a(paramBitmap, false, this.iLU, false);
      if (localBitmap != null)
      {
        AppMethodBeat.o(133324);
        paramBitmap = localBitmap;
      }
      else
      {
        AppMethodBeat.o(133324);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.b.a
 * JD-Core Version:    0.6.2
 */