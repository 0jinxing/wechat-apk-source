package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$b
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(30253);
    yFA = new b("Sight", 0, 1);
    yFB = new b("AdUrl", 1, 2);
    yFC = new b("Chat", 2, 3);
    yFD = new b("TalkChat", 3, 4);
    yFE = new b("Fav", 4, 5);
    yFF = new b[] { yFA, yFB, yFC, yFD, yFE };
    AppMethodBeat.o(30253);
  }

  private a$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.a.b
 * JD-Core Version:    0.6.2
 */