package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum m$c
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(102693);
    mfG = new c("Chat", 0, 2);
    mfH = new c("Chatroom", 1, 3);
    mfI = new c("Sns", 2, 4);
    mfJ = new c[] { mfG, mfH, mfI };
    AppMethodBeat.o(102693);
  }

  private m$c(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.m.c
 * JD-Core Version:    0.6.2
 */