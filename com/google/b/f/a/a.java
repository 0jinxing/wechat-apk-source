package com.google.b.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a
{
  private static final a[] bBj;
  public final int bBk;

  static
  {
    AppMethodBeat.i(57239);
    bBf = new a("L", 0, 1);
    bBg = new a("M", 1, 0);
    bBh = new a("Q", 2, 3);
    bBi = new a("H", 3, 2);
    bBl = new a[] { bBf, bBg, bBh, bBi };
    bBj = new a[] { bBg, bBf, bBi, bBh };
    AppMethodBeat.o(57239);
  }

  private a(int paramInt)
  {
    this.bBk = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.b.f.a.a
 * JD-Core Version:    0.6.2
 */