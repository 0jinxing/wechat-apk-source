package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum j$a
{
  public final int bTx;

  static
  {
    AppMethodBeat.i(135548);
    kBe = new a("ReasonInterrupted", 0, 0);
    kBf = new a("ReasonManual", 1, 1);
    kBg = new a("ReasonDevice", 2, 2);
    kBh = new a("ReasonInCommingCall", 3, 3);
    kBi = new a("ReasonSessionUpdateFailed", 4, 4);
    kBj = new a("ReasonWeappEnterBackground", 5, 5);
    kBk = new a("ReasonUnknown", 6, 100);
    kBl = new a[] { kBe, kBf, kBg, kBh, kBi, kBj, kBk };
    AppMethodBeat.o(135548);
  }

  private j$a(int paramInt)
  {
    this.bTx = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.a
 * JD-Core Version:    0.6.2
 */