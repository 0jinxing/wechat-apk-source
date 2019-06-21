package com.tencent.liteav.basic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TXCTimeUtil
{
  static
  {
    AppMethodBeat.i(66040);
    b.e();
    AppMethodBeat.o(66040);
  }

  public static long getTimeTick()
  {
    AppMethodBeat.i(66038);
    long l = nativeGetTimeTick();
    AppMethodBeat.o(66038);
    return l;
  }

  public static long getUtcTimeTick()
  {
    AppMethodBeat.i(66039);
    long l = nativeGetUtcTimeTick();
    AppMethodBeat.o(66039);
    return l;
  }

  private static native long nativeGetTimeTick();

  private static native long nativeGetUtcTimeTick();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.util.TXCTimeUtil
 * JD-Core Version:    0.6.2
 */