package com.tencent.mm.al;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$a
{
  boolean fzm = false;
  long fzn = 0L;
  long fzo = 0L;
  long fzp = 0L;

  public final String toString()
  {
    AppMethodBeat.i(78065);
    String str = String.format("LastGetResult(%x){isTimeOut=%b, lastGetCDNDns_TenSecond=%d, lastTime_Hour=%d, lastCount_Hour=%d}", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.fzm), Long.valueOf(this.fzn), Long.valueOf(this.fzo), Long.valueOf(this.fzp) });
    AppMethodBeat.o(78065);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.d.a
 * JD-Core Version:    0.6.2
 */