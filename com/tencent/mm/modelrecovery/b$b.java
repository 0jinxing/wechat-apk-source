package com.tencent.mm.modelrecovery;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$b
{
  public int fMO;
  public int fMP;
  public int fMQ;
  public int fMR;
  public int fMS;
  public int fMT;
  public int fMU;
  public int fMV;
  public int fMW;
  public int fMX;
  public int fMY;
  public int fMZ;

  public final String toString()
  {
    AppMethodBeat.i(16548);
    Object localObject = new StringBuffer();
    if (this.fMO > 0)
      ((StringBuffer)localObject).append("appForegroundExpCount:" + this.fMO + " ");
    if (this.fMP > 0)
      ((StringBuffer)localObject).append("appBackgroundExpCount:" + this.fMP + " ");
    if (this.fMQ > 0)
      ((StringBuffer)localObject).append("componentForegroundExpCount:" + this.fMQ + " ");
    if (this.fMR > 0)
      ((StringBuffer)localObject).append("componentBackgroundExpCount:" + this.fMR + " ");
    if (this.fMS > 0)
      ((StringBuffer)localObject).append("appForegroundCrashOrAnrExpCount:" + this.fMS + " ");
    if (this.fMT > 0)
      ((StringBuffer)localObject).append("appBackgroundCrashOrAnrExpCount:" + this.fMT + " ");
    if (this.fMU > 0)
      ((StringBuffer)localObject).append("componentForegroundCrashOrAnrExpCount:" + this.fMU + " ");
    if (this.fMV > 0)
      ((StringBuffer)localObject).append("componentBackgroundCrashOrAnrExpCount:" + this.fMV + " ");
    if (this.fMW > 0)
      ((StringBuffer)localObject).append("appForegroundTimeoutExpCount:" + this.fMW + " ");
    if (this.fMX > 0)
      ((StringBuffer)localObject).append("appBackgroundTimeoutExpCount:" + this.fMX + " ");
    if (this.fMY > 0)
      ((StringBuffer)localObject).append("componentForegroundTimeoutExpCount:" + this.fMY + " ");
    if (this.fMZ > 0)
      ((StringBuffer)localObject).append("componentBackgroundTimeoutExpCount:" + this.fMZ + " ");
    localObject = ((StringBuffer)localObject).toString();
    AppMethodBeat.o(16548);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelrecovery.b.b
 * JD-Core Version:    0.6.2
 */