package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cs$d
{
  final int value;

  static
  {
    AppMethodBeat.i(51107);
    dhY = new d("DEFAULT", 0, 0);
    dhZ = new d("DOING", 1, 1);
    dia = new d("DONE", 2, 2);
    dib = new d[] { dhY, dhZ, dia };
    AppMethodBeat.o(51107);
  }

  private cs$d(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cs.d
 * JD-Core Version:    0.6.2
 */