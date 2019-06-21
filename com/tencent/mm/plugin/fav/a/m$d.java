package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum m$d
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(102696);
    mfK = new d("Samll", 0, 1);
    mfL = new d("Full", 1, 2);
    mfM = new d("Complete", 2, 3);
    mfN = new d[] { mfK, mfL, mfM };
    AppMethodBeat.o(102696);
  }

  private m$d(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.m.d
 * JD-Core Version:    0.6.2
 */