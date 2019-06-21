package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;

public final class w
{
  private static String AfQ = "";
  private static long kfQ;
  private static String tyv = "";

  static
  {
    kfQ = 0L;
  }

  public static boolean dNQ()
  {
    AppMethodBeat.i(49084);
    long l = bo.fp(kfQ);
    ab.d("MicroMsg.TimeStampHelper", "pass time ".concat(String.valueOf(l)));
    boolean bool;
    if (l > 300L)
    {
      bool = true;
      AppMethodBeat.o(49084);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49084);
    }
  }

  public static String dNR()
  {
    AppMethodBeat.i(49085);
    if ((bo.isNullOrNil(tyv)) || (b.dnO()))
      ab.i("MicroMsg.TimeStampHelper", "getTimeStamp is null from %s isOverdue %s update_time: %s", new Object[] { AfQ, Boolean.valueOf(dNQ()), Long.valueOf(kfQ) });
    String str = tyv;
    AppMethodBeat.o(49085);
    return str;
  }

  public static void setTimeStamp(String paramString)
  {
    AppMethodBeat.i(49083);
    tyv = paramString;
    kfQ = System.currentTimeMillis() / 1000L;
    AfQ = bo.dpG().toString();
    AppMethodBeat.o(49083);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.w
 * JD-Core Version:    0.6.2
 */