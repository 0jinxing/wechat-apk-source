package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cs$e
{
  final int value;

  static
  {
    AppMethodBeat.i(51110);
    dic = new e("DEFAULT", 0, 0);
    did = new e("NOTSUBSCRIBE", 1, 1);
    die = new e("SUBSCRIBE", 2, 2);
    dif = new e[] { dic, did, die };
    AppMethodBeat.o(51110);
  }

  private cs$e(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs.e
 * JD-Core Version:    0.6.2
 */