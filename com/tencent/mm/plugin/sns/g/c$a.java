package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class c$a
{
  long mEndTime = -1L;
  long mStartTime = -1L;
  long qJo;
  d qPI;
  int qPJ = 0;
  int qPK = 0;
  String qPL = "";
  String qPM = "";
  String qPN;

  public c$a(long paramLong1, long paramLong2, String paramString, d paramd)
  {
    this.qPI = paramd;
    this.mStartTime = paramLong1;
    this.qJo = paramLong2;
    this.qPN = paramString;
  }

  private void addAction(String paramString)
  {
    AppMethodBeat.i(36782);
    if (!bo.isNullOrNil(this.qPM))
      this.qPM += "|";
    this.qPM += paramString;
    AppMethodBeat.o(36782);
  }

  public final void E(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(36781);
    if ((paramInt1 == -1) || (paramInt2 == -1))
      AppMethodBeat.o(36781);
    while (true)
    {
      return;
      String str1 = paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4;
      String str2 = paramInt1 + ":" + paramInt2;
      if ((str1.equals(this.qPL)) || ((this.qPL.startsWith(str2)) && (paramInt3 == 0) && (paramInt4 == 0)))
      {
        AppMethodBeat.o(36781);
      }
      else
      {
        this.qPL = str1;
        addAction(paramInt1 + ":" + paramInt2 + ":" + paramInt3 + ":" + paramInt4);
        AppMethodBeat.o(36781);
      }
    }
  }

  public final void fl(int paramInt1, int paramInt2)
  {
    this.qPJ = paramInt1;
    this.qPK = paramInt2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.c.a
 * JD-Core Version:    0.6.2
 */