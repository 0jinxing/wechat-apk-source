package com.tencent.mm.plugin.appbrand.ui.recommend;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.f;

public final class d
  implements b.f
{
  public static final d iPZ;
  public int fsc = 0;
  public int iPY = 0;

  static
  {
    AppMethodBeat.i(133565);
    iPZ = new d();
    AppMethodBeat.o(133565);
  }

  public final String wP()
  {
    return "WxaRecommendIcon";
  }

  public final Bitmap y(Bitmap paramBitmap)
  {
    AppMethodBeat.i(133564);
    if ((paramBitmap.getWidth() <= 0) || (paramBitmap.getHeight() <= 0))
    {
      AppMethodBeat.o(133564);
      return paramBitmap;
    }
    float f1;
    float f2;
    if (paramBitmap.getWidth() == paramBitmap.getHeight())
    {
      f1 = this.iPY;
      f2 = f1;
      if (this.fsc > 0)
      {
        f2 = f1;
        if (this.iPY > 0)
          f2 = this.iPY * paramBitmap.getWidth() / this.fsc;
      }
    }
    for (paramBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, false, f2); ; paramBitmap = com.tencent.mm.sdk.platformtools.d.a(paramBitmap, false, f2))
    {
      AppMethodBeat.o(133564);
      break;
      int i = Math.min(paramBitmap.getWidth(), paramBitmap.getHeight());
      int j = i;
      if (i <= 0)
        j = Math.max(paramBitmap.getWidth(), paramBitmap.getHeight());
      paramBitmap = com.tencent.mm.sdk.platformtools.d.b(paramBitmap, j, j, true);
      f1 = this.iPY;
      f2 = f1;
      if (this.fsc > 0)
      {
        f2 = f1;
        if (this.iPY > 0)
          f2 = this.iPY * paramBitmap.getWidth() / this.fsc;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.d
 * JD-Core Version:    0.6.2
 */