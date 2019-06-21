package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum h$a
{
  public final int bTx;

  static
  {
    AppMethodBeat.i(42001);
    nRX = new a("RANDOM_LUCK", 0, 1);
    nRY = new a("FIX_NORMAL", 1, 0);
    nRZ = new a[] { nRX, nRY };
    AppMethodBeat.o(42001);
  }

  private h$a(int paramInt)
  {
    this.bTx = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.a.h.a
 * JD-Core Version:    0.6.2
 */