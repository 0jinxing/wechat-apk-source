package com.tencent.mm.modelsns;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class c
{
  public static int fQr;
  public static c fQs;

  static
  {
    AppMethodBeat.i(94482);
    fQr = 0;
    fQs = new c();
    AppMethodBeat.o(94482);
  }

  public static void ajL()
  {
    AppMethodBeat.i(94481);
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100024");
    ab.i("MicroMsg.StatisticsOplogAbTest", "test " + localc.field_rawXML + " " + localc.isValid());
    if (localc.isValid())
    {
      fQr = bo.ank((String)localc.dru().get("Switch"));
      ab.i("MicroMsg.StatisticsOplogAbTest", "switchVal " + fQr);
    }
    AppMethodBeat.o(94481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsns.c
 * JD-Core Version:    0.6.2
 */