package com.tencent.mm.an;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;

final class c$c
  implements Serializable
{
  long fAF = 0L;
  long fAk = 0L;
  long fAp = 0L;
  long fAq = 0L;
  long fAr = 0L;
  int pid = 0;

  c$c(int paramInt, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    this.pid = paramInt;
    this.fAk = paramLong1;
    this.fAF = paramLong2;
    this.fAp = paramLong3;
    this.fAq = paramLong4;
    this.fAr = paramLong5;
  }

  public final String toString()
  {
    AppMethodBeat.i(58340);
    String str = String.format("pid:%s, server time:%s, client time:%s, msg server time:%s, intervalTime:%s, msg server id:%s", new Object[] { Integer.valueOf(this.pid), a.fF(this.fAk), a.fF(this.fAF), a.fF(this.fAp), Long.valueOf(this.fAq), Long.valueOf(this.fAr) });
    AppMethodBeat.o(58340);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.c.c
 * JD-Core Version:    0.6.2
 */