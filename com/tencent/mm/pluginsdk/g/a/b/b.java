package com.tencent.mm.pluginsdk.g.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class b extends IOException
{
  private final long aHW;
  private final long veU;

  public b()
  {
    this(0L, 0L);
  }

  public b(long paramLong1, long paramLong2)
  {
    super(String.format("contentLength: %d, requestRange:%d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) }));
    AppMethodBeat.i(79564);
    this.aHW = paramLong1;
    this.veU = paramLong2;
    AppMethodBeat.o(79564);
  }

  public final String toString()
  {
    AppMethodBeat.i(79565);
    String str = "FileSizeOutOfRangeException{contentLength=" + this.aHW + ", requestRange=" + this.veU + '}';
    AppMethodBeat.o(79565);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.g.a.b.b
 * JD-Core Version:    0.6.2
 */