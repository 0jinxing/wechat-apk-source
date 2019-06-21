package com.tencent.mm.pluginsdk.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$a
  implements i.a
{
  Bitmap jMX = null;
  private i.a pqK;

  public c$a(i.a parama)
  {
    this.pqK = parama;
  }

  public final Bitmap AZ()
  {
    AppMethodBeat.i(79672);
    Bitmap localBitmap;
    if ((this.jMX != null) && (!this.jMX.isRecycled()))
    {
      localBitmap = this.jMX;
      AppMethodBeat.o(79672);
    }
    while (true)
    {
      return localBitmap;
      if (this.pqK != null)
      {
        localBitmap = this.pqK.AZ();
        AppMethodBeat.o(79672);
      }
      else
      {
        localBitmap = null;
        AppMethodBeat.o(79672);
      }
    }
  }

  public final void a(i parami)
  {
    AppMethodBeat.i(79673);
    if (this.pqK != null)
      this.pqK.a(parami);
    AppMethodBeat.o(79673);
  }

  public final Bitmap b(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(79669);
    if (this.pqK != null)
    {
      paramString = this.pqK.b(paramString, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(79669);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(79669);
    }
  }

  public final Bitmap cQ(String paramString)
  {
    AppMethodBeat.i(79670);
    if (this.pqK != null)
    {
      paramString = this.pqK.cQ(paramString);
      AppMethodBeat.o(79670);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(79670);
    }
  }

  public final Bitmap cR(String paramString)
  {
    AppMethodBeat.i(79671);
    if (this.pqK != null)
    {
      paramString = this.pqK.cR(paramString);
      AppMethodBeat.o(79671);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(79671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.c.a
 * JD-Core Version:    0.6.2
 */