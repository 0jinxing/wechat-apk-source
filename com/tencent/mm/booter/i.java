package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

public final class i
{
  public static boolean Iv()
  {
    AppMethodBeat.i(15852);
    try
    {
      aw.ZK();
      ah.d((Long)c.Ry().get(66817, null));
      if (ah.fp(0L) * 1000L > 1800000L)
      {
        bool = true;
        AppMethodBeat.o(15852);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.PostTaskMediaNoteStat", localException, "", new Object[0]);
        continue;
        AppMethodBeat.o(15852);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.i
 * JD-Core Version:    0.6.2
 */