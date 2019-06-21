package com.github.henryye.nativeiv;

import com.github.henryye.nativeiv.bitmap.BitmapType;
import com.github.henryye.nativeiv.bitmap.IBitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  private static final Object aLS;
  public BitmapType aLT;
  public IBitmap aLU;
  public com.github.henryye.nativeiv.a.a aLV;
  public a aLW;

  static
  {
    AppMethodBeat.i(115749);
    aLS = new Object();
    AppMethodBeat.o(115749);
  }

  public b(a parama)
  {
    AppMethodBeat.i(115747);
    this.aLT = null;
    this.aLU = new b.a();
    this.aLW = parama;
    AppMethodBeat.o(115747);
  }

  final BitmapType pA()
  {
    AppMethodBeat.i(115748);
    BitmapType localBitmapType;
    if (this.aLU != null)
    {
      localBitmapType = this.aLU.getType();
      AppMethodBeat.o(115748);
    }
    while (true)
    {
      return localBitmapType;
      localBitmapType = BitmapType.Undefined;
      AppMethodBeat.o(115748);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.github.henryye.nativeiv.b
 * JD-Core Version:    0.6.2
 */