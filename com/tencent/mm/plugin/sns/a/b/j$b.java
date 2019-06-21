package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum j$b
{
  public int value = 0;

  static
  {
    AppMethodBeat.i(35770);
    qET = new b("Sight", 0, 1);
    qEU = new b("AdUrl", 1, 2);
    qEV = new b("Chat", 2, 3);
    qEW = new b("TalkChat", 3, 4);
    qEX = new b("Fav", 4, 5);
    qEY = new b[] { qET, qEU, qEV, qEW, qEX };
    AppMethodBeat.o(35770);
  }

  private j$b(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.j.b
 * JD-Core Version:    0.6.2
 */