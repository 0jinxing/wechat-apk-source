package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum j$e
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(35779);
    qFk = new e("Samll", 0, 1);
    qFl = new e("Full", 1, 2);
    qFm = new e("Complete", 2, 3);
    qFn = new e[] { qFk, qFl, qFm };
    AppMethodBeat.o(35779);
  }

  private j$e(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.j.e
 * JD-Core Version:    0.6.2
 */