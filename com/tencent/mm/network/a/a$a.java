package com.tencent.mm.network.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  public long bZI = 0L;
  public long beginTime = 0L;
  public String clientIp = "";
  public long endTime = 0L;
  public int errCode = 0;
  public int errType = 0;
  public long expand1 = 0L;
  public long expand2 = 0L;
  public c geA;
  public boolean geB = false;
  public long geC = 0L;
  public long geD = 0L;
  public long geE = 0L;
  public int geF = 0;
  public int geG = 0;
  public long geH = 0L;
  public long geI = 0L;
  public long geJ = 0L;
  public long netSignal = 0L;
  public int netType = 0;
  public int retryCount = 0;
  public long rtType = 0L;

  public final String toString()
  {
    AppMethodBeat.i(58712);
    long l1 = this.rtType;
    long l2 = this.beginTime;
    long l3 = this.endTime;
    long l4 = this.endTime;
    long l5 = this.beginTime;
    long l6 = this.bZI;
    long l7 = this.geE;
    if (this.geA == null);
    for (String str = "null"; ; str = this.geA.toString())
    {
      str = String.format("rtType:%d begin:%d, end:%d time:%d cost:%d count:%d ipInfo:%s socket:%b netType:%d err:(%d,%d) tx:%d rx:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4 - l5), Long.valueOf(l6), Long.valueOf(l7), str, Boolean.valueOf(this.geB), Integer.valueOf(this.netType), Integer.valueOf(this.errType), Integer.valueOf(this.errCode), Long.valueOf(this.geC), Long.valueOf(this.geD) });
      AppMethodBeat.o(58712);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.a.a.a
 * JD-Core Version:    0.6.2
 */