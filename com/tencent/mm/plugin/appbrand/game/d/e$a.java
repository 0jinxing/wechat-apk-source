package com.tencent.mm.plugin.appbrand.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum e$a
{
  public int hsh;

  static
  {
    AppMethodBeat.i(130189);
    hrW = new a("FPS", 0, 1);
    hrX = new a("CPU", 1, 2);
    hrY = new a("MEM", 2, 3);
    hrZ = new a("DRAW_CALL", 3, 4);
    hsa = new a("TRIANGLE", 4, 5);
    hsb = new a("VERTEX", 5, 6);
    hsc = new a("NATIVE_MEM", 6, 101);
    hsd = new a("DALVIK_MEM", 7, 102);
    hse = new a("OTHER_MEM", 8, 103);
    hsf = new a("MEM_DELTA", 9, 104);
    hsg = new a("VARIANCE_FPS", 10, 105);
    hsi = new a[] { hrW, hrX, hrY, hrZ, hsa, hsb, hsc, hsd, hse, hsf, hsg };
    AppMethodBeat.o(130189);
  }

  private e$a(int paramInt)
  {
    this.hsh = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.e.a
 * JD-Core Version:    0.6.2
 */