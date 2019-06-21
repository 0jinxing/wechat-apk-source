package com.tencent.mm.ca;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.g.a.a;
import com.tencent.mm.svg.a.a;

public final class d$a
  implements a.a
{
  a xuG;

  public d$a()
  {
    AppMethodBeat.i(105912);
    this.xuG = new a();
    AppMethodBeat.o(105912);
  }

  public final Bitmap decodeResource(Resources paramResources, int paramInt, BitmapFactory.Options paramOptions)
  {
    AppMethodBeat.i(105913);
    if (this.xuG.g(paramResources, paramInt))
    {
      float f = 0.0F;
      if (paramOptions != null)
        f = paramOptions.inDensity / 160.0F;
      paramResources = a.b(paramResources, paramInt, f);
      AppMethodBeat.o(105913);
    }
    while (true)
    {
      return paramResources;
      paramResources = null;
      AppMethodBeat.o(105913);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ca.d.a
 * JD-Core Version:    0.6.2
 */