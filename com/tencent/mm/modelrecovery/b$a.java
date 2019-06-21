package com.tencent.mm.modelrecovery;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a
{
  public int enb;
  public int fMJ;
  public int fMK;
  public int fML;
  public int fMM;
  public int fMN;

  public final String toString()
  {
    AppMethodBeat.i(16547);
    Object localObject = new StringBuffer();
    if (this.enb > 0)
      ((StringBuffer)localObject).append("totalCount:" + this.enb + " ");
    if (this.fMJ > 0)
      ((StringBuffer)localObject).append("enterRecoveryCount:" + this.fMJ + " ");
    if (this.fMK > 0)
      ((StringBuffer)localObject).append("existRecoveryProcessCount:" + this.fMK + " ");
    if (this.fML > 0)
      ((StringBuffer)localObject).append("foregroundExpCount:" + this.fML + " ");
    if (this.fMM > 0)
      ((StringBuffer)localObject).append("backgroundExpCount:" + this.fMM + " ");
    if (this.fMN > 0)
      ((StringBuffer)localObject).append("normalCount:" + this.fMN + " ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(16547);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.b.a
 * JD-Core Version:    0.6.2
 */