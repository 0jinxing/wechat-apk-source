package com.tencent.mm.plugin.game.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r$c
{
  public int actionType;
  String appId;
  int cKG;
  String nmA;
  int nmu;
  int nmv;
  String nmz;
  int position;
  int type;

  public r$c()
  {
  }

  public r$c(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AppMethodBeat.i(112174);
    this.actionType = paramInt1;
    this.type = paramInt2;
    this.appId = paramString1;
    if (paramInt1 == 2)
      this.nmz = paramString2;
    AppMethodBeat.o(112174);
  }

  public r$c(String paramString)
  {
    this.actionType = 2;
    this.nmz = paramString;
  }

  public r$c(String paramString, byte paramByte)
  {
    this.actionType = 2;
    this.type = 3;
    this.nmz = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.r.c
 * JD-Core Version:    0.6.2
 */