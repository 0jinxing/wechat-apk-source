package com.tencent.mm.app;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.d.a;
import com.tencent.mm.ah.o;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.pluginsdk.ui.i;
import com.tencent.mm.pluginsdk.ui.i.a;
import com.tencent.mm.sdk.platformtools.ah;

final class c
  implements i.a
{
  private volatile Bitmap cdX = null;
  d cdY;

  public final Bitmap AZ()
  {
    AppMethodBeat.i(15370);
    if (this.cdX == null);
    try
    {
      if (this.cdX == null)
        this.cdX = a.decodeResource(ah.getContext().getResources(), 2131231172);
      Bitmap localBitmap = this.cdX;
      AppMethodBeat.o(15370);
      return localBitmap;
    }
    finally
    {
      AppMethodBeat.o(15370);
    }
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(15368);
    if ((parami instanceof d.a))
      o.acd().a((d.a)parami);
    AppMethodBeat.o(15368);
  }

  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(15372);
    paramString = b.d(paramString, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(15372);
    return paramString;
  }

  public final Bitmap cQ(String paramString)
  {
    AppMethodBeat.i(15369);
    paramString = b.a(paramString, false, -1);
    AppMethodBeat.o(15369);
    return paramString;
  }

  public final Bitmap cR(String paramString)
  {
    AppMethodBeat.i(15371);
    if (this.cdY == null)
      this.cdY = o.acd();
    paramString = d.qd(paramString);
    AppMethodBeat.o(15371);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.c
 * JD-Core Version:    0.6.2
 */