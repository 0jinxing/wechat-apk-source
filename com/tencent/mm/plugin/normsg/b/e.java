package com.tencent.mm.plugin.normsg.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.normsg.Normsg.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class e
{
  public static boolean oVb;

  static
  {
    AppMethodBeat.i(10438);
    oVb = false;
    long l = System.nanoTime();
    try
    {
      oVb = Normsg.b.bVK();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NormalMsgSource.DADH", localThrowable, "unexpected exception.", new Object[0]);
        oVb = false;
        ab.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", new Object[] { Boolean.valueOf(oVb), Long.valueOf(System.nanoTime() - l) });
        AppMethodBeat.o(10438);
      }
    }
    finally
    {
      ab.i("MicroMsg.NormalMsgSource.DADH", "CDA, result: %b, time: %d ns", new Object[] { Boolean.valueOf(oVb), Long.valueOf(System.nanoTime() - l) });
      AppMethodBeat.o(10438);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.normsg.b.e
 * JD-Core Version:    0.6.2
 */