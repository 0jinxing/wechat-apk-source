package com.tencent.mm.bi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;

public final class c
{
  public static void e(long paramLong, String paramString)
  {
    AppMethodBeat.i(16619);
    ab.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, rowId: %d, talker: %s", new Object[] { Long.valueOf(paramLong), paramString });
    ab.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fconversation, ret = ".concat(String.valueOf(d.akP().p(paramLong, paramString))));
    ab.i("MicroMsg.FMessageLogic", "clearFMsgAndFConvByTalker, delete fmsginfo, ret = ".concat(String.valueOf(d.akO().QS(paramString))));
    AppMethodBeat.o(16619);
  }

  public static long q(String paramString, long paramLong)
  {
    AppMethodBeat.i(16618);
    long l1 = 0L;
    long l2 = l1;
    if (paramString != null)
    {
      paramString = d.akO().apw(paramString);
      l2 = l1;
      if (paramString != null)
        l2 = paramString.field_createTime + 1L;
    }
    if (l2 > paramLong * 1000L)
      AppMethodBeat.o(16618);
    while (true)
    {
      return l2;
      l2 = paramLong * 1000L;
      AppMethodBeat.o(16618);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bi.c
 * JD-Core Version:    0.6.2
 */