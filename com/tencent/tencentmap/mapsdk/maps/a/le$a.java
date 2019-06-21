package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum le$a
{
  public int e;

  static
  {
    AppMethodBeat.i(100330);
    a = new a("LEFT", 0, 0);
    b = new a("RIGHT", 1, 1);
    c = new a("BOTTOM", 2, 2);
    d = new a("TOP", 3, 3);
    f = new a[] { a, b, c, d };
    AppMethodBeat.o(100330);
  }

  private le$a(int paramInt)
  {
    this.e = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.le.a
 * JD-Core Version:    0.6.2
 */