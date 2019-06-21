package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum m$b
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(102690);
    mfA = new b("Sight", 0, 1);
    mfB = new b("AdUrl", 1, 2);
    mfC = new b("Chat", 2, 3);
    mfD = new b("TalkChat", 3, 4);
    mfE = new b("Fav", 4, 5);
    mfF = new b[] { mfA, mfB, mfC, mfD, mfE };
    AppMethodBeat.o(102690);
  }

  private m$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.m.b
 * JD-Core Version:    0.6.2
 */