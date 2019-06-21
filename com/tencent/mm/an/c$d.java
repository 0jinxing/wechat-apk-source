package com.tencent.mm.an;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import java.io.Serializable;

public final class c$d
  implements Serializable
{
  long endTime = 0L;
  long fAG = 0L;
  int fAl = 0;
  boolean fAm = true;
  boolean fAn = false;
  int pid = 0;
  long startTime = 0L;

  static d b(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(58342);
    d locald = new d();
    locald.pid = paramInt1;
    locald.startTime = paramLong1;
    locald.endTime = paramLong2;
    locald.fAl = paramInt2;
    AppMethodBeat.o(58342);
    return locald;
  }

  final void a(int paramInt1, long paramLong1, long paramLong2, int paramInt2)
  {
    AppMethodBeat.i(58341);
    this.pid = paramInt1;
    if (this.startTime <= 0L)
    {
      this.startTime = paramLong1;
      this.fAG = cb.aaD();
    }
    this.endTime = paramLong2;
    this.fAl = paramInt2;
    AppMethodBeat.o(58341);
  }

  public final String toString()
  {
    AppMethodBeat.i(58343);
    String str = String.format("pid:%s,startServerTime:%s,startTime:%s,endTime:%s,normalExecute:%s,changedNetworkStatus:%s,networkStatus:%s", new Object[] { Integer.valueOf(this.pid), a.fF(this.fAG), a.fF(this.startTime), a.fF(this.endTime), Boolean.valueOf(this.fAm), Boolean.valueOf(this.fAn), Integer.valueOf(this.fAl) });
    AppMethodBeat.o(58343);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.c.d
 * JD-Core Version:    0.6.2
 */