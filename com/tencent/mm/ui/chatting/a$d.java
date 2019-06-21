package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$d
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(30259);
    yFL = new d("Samll", 0, 1);
    yFM = new d("Full", 1, 2);
    yFN = new d("Complete", 2, 3);
    yFO = new d[] { yFL, yFM, yFN };
    AppMethodBeat.o(30259);
  }

  private a$d(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.d
 * JD-Core Version:    0.6.2
 */