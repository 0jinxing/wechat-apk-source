package com.tencent.mm.plugin.card.d;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c
{
  public int action = 0;

  static
  {
    AppMethodBeat.i(88825);
    krB = new c("CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT", 0, 0);
    krC = new c("CARDCODEREFRESHACTION_SHOWING_TIMEOUT", 1, 1);
    krD = new c("CARDCODEREFRESHACTION_SNAPSHOT", 2, 2);
    krE = new c("CARDCODEREFRESHACTION_DOREFRESH", 3, 3);
    krF = new c("CARDCODEREFRESHACTION_ENTERFOREGROUND", 4, 4);
    krG = new c("CARDCODEREFRESHACTION_BANCODE", 5, 5);
    krH = new c("CARDCODEREFRESHACTION_UPDATECHANGE", 6, 6);
    krI = new c("CARDCODEREFRESHACTION_ENTERCHANGE", 7, 7);
    krJ = new c[] { krB, krC, krD, krE, krF, krG, krH, krI };
    AppMethodBeat.o(88825);
  }

  private c(int paramInt)
  {
    this.action = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.c
 * JD-Core Version:    0.6.2
 */